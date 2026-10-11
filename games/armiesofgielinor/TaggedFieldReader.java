/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TaggedFieldReader {
    public abstract void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard);
}
