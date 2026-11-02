/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static boolean field_d;
    IntrusiveNode next;
    long key;
    static kc field_c;
    static sd field_f;
    IntrusiveNode previous;

    final boolean isLinked(byte obfuscationGuard) {
        if (null == this.previous) {
          return false;
        }
        if (obfuscationGuard > -31) {
          IntrusiveNode.b(-104);
        }
        return true;
    }

    final void unlink(boolean obfuscationGuard) {
        if (this.previous == null) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        if (!obfuscationGuard) {
          this.isLinked((byte) 71);
        }
        this.previous = null;
        this.next = null;
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != -115) {
          IntrusiveNode.b(117);
        }
        field_c = null;
    }

    final static void b(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        nk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        CipherPacketBuffer var13 = null;
        int var14 = 0;
        CipherPacketBuffer var15 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var13 = df.field_z;
          var15 = var13;
          if (param0 > -37) {
            IntrusiveNode.c((byte) -12);
          }
          var2 = var15.readUnsignedByte((byte) -118);
          var3 = (nk) (pe.field_Lb.first(12623));
          while (var3 != null) {
            if (var2 != var3.field_p) {
              var3 = (nk) (pe.field_Lb.next(0));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ka.b(false);
            return;
          }
          var4 = var15.readUnsignedByte((byte) -97);
          if (var4 != 0) {
            var5 = var3.field_t;
            bb.field_i[0] = ah.field_b;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              bb.field_i[var6_int] = var13.readString(-1);
            }
            se.a((byte) -33, var4, var5);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              je.a(123, var15);
              if (0 == var6_intLifetime1) {
                var3.field_h = fo.field_a;
                var3.field_k = kj.field_c;
                var3.field_i = qj.field_g;
                var3.field_s = oc.field_j;
                PacketBuffer.a(-1, kj.field_c, var6_intLifetime1, fo.field_a, qj.field_g, oc.field_j);
              } else {
                PacketBuffer.a(-1, kj.field_c, var6_intLifetime1, fo.field_a, qj.field_g, oc.field_j);
              }
            }
            bi.a((byte) -113, var5);
            dupTemp$0 = new String[2][var5];
            var3.field_r = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_l = dupTemp$1;
            var7 = dupTemp$1;
            var8 = je.field_b;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = ki.field_r[var9];
              var6[0][var10] = bb.field_i[var11];
              var7[0][4 * var10] = nf.field_z[var11];
              var7[0][var10 * 4 + 1] = hc.field_e[var11];
              var7[0][4 * var10 + 2] = tj.field_u[var11];
              var7[0][3 + var10 * 4] = ba.field_o[var11];
              if (je.a(16, bb.field_i[var11]) &&
                tj.field_u[var11] + hc.field_e[var11] + ba.field_o[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = ki.field_r[var9Lifetime1 + var5];
              var6[1][var14] = bb.field_i[var11Lifetime1];
              var7[1][4 * var14] = nf.field_z[var11Lifetime1];
              var7[1][1 + var14 * 4] = hc.field_e[var11Lifetime1];
              var7[1][var14 * 4 + 2] = tj.field_u[var11Lifetime1];
              var7[1][4 * var14 + 3] = ba.field_o[var11Lifetime1];
              if (je.a(16, bb.field_i[var11Lifetime1]) &&
                hc.field_e[var11Lifetime1] + tj.field_u[var11Lifetime1] + ba.field_o[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
          }
          var3.field_g = true;
          var3.unlink(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pg.OC(" + param0 + ')');
        }
    }

    static {
    }
}
