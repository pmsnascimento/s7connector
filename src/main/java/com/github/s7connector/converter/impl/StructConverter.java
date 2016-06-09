/*
Copyright 2016 S7connector members (github.com/s7connector)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.github.s7connector.converter.impl;

import com.github.s7connector.bean.S7Serializer;
import com.github.s7connector.converter.base.S7Serializable;
import com.github.s7connector.impl.utils.S7Type;

public final class StructConverter implements S7Serializable {

	/** {@inheritDoc} */
	@Override
	public <T> T extract(final Class<T> targetClass, final byte[] buffer, final int byteOffset, final int bitOffset) {
		return S7Serializer.extractBytes(targetClass, buffer, byteOffset);
	}

	/** {@inheritDoc} */
	@Override
	public S7Type getS7Type() {
		return null;
	}

	/** {@inheritDoc} */
	@Override
	public int getSizeInBits() {
		return 0;
	}

	/** {@inheritDoc} */
	@Override
	public int getSizeInBytes() {
		return 0;
	}

	/** {@inheritDoc} */
	@Override
	public void insert(final Object javaType, final byte[] buffer, final int byteOffset, final int bitOffset,
			final int size) {
		S7Serializer.insertBytes(javaType, buffer, byteOffset);
	}

}
