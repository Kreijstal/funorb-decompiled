/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static ura field_h;
    static int field_i;
    DualLinkNode secondaryPrevious;
    DualLinkNode secondaryNext;
    long secondaryKey;

    public static void b(int param0) {
        if (param0 != 0) {
          field_i = 103;
          field_h = null;
          return;
        }
        field_h = null;
    }

    final boolean isSecondaryLinked(int param0) {
        if (this.secondaryPrevious == null) {
          return false;
        }
        if (param0 != 0) {
          PacketBuffer var3 = (PacketBuffer) null;
          DualLinkNode.a(-117, (PacketBuffer) null);
          return true;
        }
        return true;
    }

    final void setSecondaryKey(boolean param0, long param1) {
        if (param0) {
          DualLinkNode.b(-57);
          if (this.secondaryPrevious == null) {
            this.secondaryKey = param1;
            return;
          }
          throw new RuntimeException();
        }
        if (this.secondaryPrevious == null) {
          this.secondaryKey = param1;
          return;
        }
        throw new RuntimeException();
    }

    final void unlinkSecondary(int param0) {
        if (this.secondaryPrevious == null) {
          return;
        }
        if (param0 == -7975) {
          this.secondaryPrevious.secondaryNext = this.secondaryNext;
          this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
          this.secondaryPrevious = null;
          this.secondaryNext = null;
          return;
        }
    }

    final static hc a(int param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        hc stackIn_2_0 = null;
        hc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = new hc(param1.readShort(false), param1.readShort(false), param1.readShort(false), param1.readShort(false), param1.readUnsignedMedium(-32768), param1.readUnsignedByte(255));
            return stackIn_4_0;
          }
          stackIn_2_0 = (hc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("od.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    protected DualLinkNode() {
    }

    final long getSecondaryKey(int param0) {
        if (param0 != 0) {
          return -21L;
        }
        return this.secondaryKey;
    }

    static {
        field_h = new ura();
        field_i = 0;
    }
}
