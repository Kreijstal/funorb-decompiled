/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static mh field_a;
    static hj field_c;

    final static void a(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        eg var4_ref_eg = null;
        int var5 = 0;
        sp var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        BitPacketBuffer var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != 7) {
            f.a(-30);
          }
          var27 = jl.field_e;
          var2 = var27.readUnsignedByte(255);
          if (0 == var2) {
            var3 = var27.readUnsignedShort(65280);
            var4_ref_eg = (eg) (qc.field_n.first(-105));
            while (var4_ref_eg != null) {
              if (var4_ref_eg.field_l != var3) {
                var4_ref_eg = (eg) (qc.field_n.next((byte) 116));
                continue;
              }
              break;
            }
            if (var4_ref_eg == null) {
              hn.a((byte) 127);
              return;
            }
            var5 = var27.readUnsignedByte(param0 ^ 248);
            if (var5 != 0) {
              var6_int = var4_ref_eg.field_q;
              nb.field_b[0].field_b = null;
              nb.field_b[0].field_c = tb.field_cb;
              var7 = var4_ref_eg.field_p;
              nb.field_b[0].field_d = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                nb.field_b[var8_int].field_c = var27.readCp1252String(-1);
                nb.field_b[var8_int].field_d = false;
                if (var27.readUnsignedByte(param0 ^ 248) == 1) {
                  nb.field_b[var8_int].field_b = var27.readCp1252String(-1);
                } else {
                  nb.field_b[var8_int].field_b = null;
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_eg.field_i = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_eg.field_r = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6_int * var7];
              var4_ref_eg.field_n = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.readUnsignedByte(param0 ^ 248);
              if (0 < var18) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.readUnsignedByte(255);
                  var21 = nb.field_b[var20].field_c;
                  var22 = var27.readLong(-32768);
                  var24 = var27.position;
                  if (var6_int > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = nb.field_b[var20].field_b;
                    var10[0][var12] = var22;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.readInt(255);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    ci.a(var21, param0 ^ -88)) {
                    var8[1][var13] = tb.field_cb;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var27.position = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.readInt(255);
                    }
                  }
                  if (var14 < var6_int &&
                    !nb.field_b[var20].field_d) {
                    nb.field_b[var20].field_d = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = nb.field_b[var20].field_b;
                    var10[2][var14] = var22;
                    var14++;
                    var27.position = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.readInt(255);
                    }
                  }
                }
              }
            }
            var4_ref_eg.field_o = true;
            var4_ref_eg.unlink((byte) 111);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.readUnsignedShort(param0 + 65273);
            var4 = var27.readLong(-32768);
            var6 = (sp) (tm.field_f.first(-60));
            while (var6 != null) {
              if (var6.field_m != var3Lifetime1) {
                var6 = (sp) (tm.field_f.next((byte) 116));
                continue;
              }
              break;
            }
            if (var6 == null) {
              hn.a((byte) 53);
              return;
            }
            var6.field_p = var4;
            var6.unlink((byte) 111);
            return;
          }
          rk.a("HS1: " + eq.c((byte) -96), (Throwable) null, param0 ^ 102);
          hn.a((byte) 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "f.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          f.a((byte) 116);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Level Select";
    }
}
