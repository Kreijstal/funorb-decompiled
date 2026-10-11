/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class he {
    static String field_f;
    static String field_g;
    int[] field_a;
    static ub field_e;
    int field_i;
    static String field_j;
    static int field_k;
    java.awt.Image field_b;
    static String field_h;
    static String field_d;
    int field_c;

    final void b(byte param0) {
        if (param0 <= 120) {
          return;
        }
        SoftwareRaster.a(this.field_a, this.field_c, this.field_i);
    }

    abstract void a(int param0, byte param1, java.awt.Component param2, int param3);

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        ih.field_r = param3;
        rn.field_q = param4;
        ia.field_l = param2;
        if (param0) {
          return;
        }
        ag.field_s = param1;
    }

    final static boolean a(int param0, CipherPacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1766) {
            stackIn_6_0 = (param1.readBits(param0 + 1815, 1) == 1);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("he.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        Object var22;
        CharSequence var23;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        var21 = null;
        var22 = null;
        var11 = SteelSentinels.obfuscationControl;
        var3 = 1;
        if (!rg.field_f &&
          hh.field_a == null) {
          var3 = 0;
        }
        if (ib.field_b == 0 &&
          null != ni.field_a) {
          var3 = 0;
        }
        if (param0 > -119) {
          field_j = (String) null;
        }
        if (ib.field_b == 2 &&
          !wa.b((byte) -62)) {
          var3 = 0;
        }
        if (ei.field_q == 84) {
          if (var3 == 0) {
            if (ib.field_b != 0) {
              pg.d(97);
            }
          } else {
            if (tf.field_g.length() > 0) {
              var4_ref_String = tf.field_g.toString();
              if (bi.a(var4_ref_String, true)) {
                var13 = (String) null;
                var12 = (String) null;
                sj.a((String) null, il.field_e, 0, (byte) 21, (String) null, 2);
                var15 = (String) null;
                var14 = (String) null;
                sj.a((String) null, a.field_e, 0, (byte) 21, (String) null, 2);
                pg.d(81);
              } else {
                var5 = ib.field_b;
                if (0 == var5 &&
                  nf.field_b != null) {
                  var5 = 1;
                }
                if (ei.a(var5, 1) == 2) {
                  il.a(1, var5, param2, -18853);
                }
                oe.a(param1, en.field_e, -6988, ib.field_b, -1, var4_ref_String);
                pg.d(81);
              }
            } else {
              pg.d(81);
            }
          }
          return true;
        }
        if (ei.field_q == 85) {
          if (var3 == 0) {
            return true;
          }
          if (0 >= tf.field_g.length()) {
            return true;
          }
          dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
          return true;
        }
        var4 = de.field_c;
        if (!tf.a(2459, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (tf.field_g.length() >= 80) {
          return true;
        }
        discarded$0 = tf.field_g.append((char) var4);
        var5Lifetime1 = 485;
        var17 = g.field_l;
        var7 = var17;
        var7Lifetime1 = var17;
        var16 = dh.a(-27905, var17);
        var7Lifetime2 = var16;
        var7Lifetime3 = var16;
        var19 = var16;
        var7Lifetime4 = var19;
        var7Lifetime5 = var19;
        if (ib.field_b != 2) {
          var7Lifetime6 = "";
          if (ib.field_b == 0) {
            if (nf.field_b == null &&
              cd.field_g) {
              var7Lifetime6 = "[" + kh.field_p + "] ";
            }
            if (null != nf.field_b) {
              if (!cc.field_lc) {
                var7Lifetime6 = "[" + db.a(pd.field_ab, -98, new String[]{nf.field_b.field_Xb}) + "] ";
              } else {
                if (null == PartInstruction.field_a) {
                  var7Lifetime6 = "[" + db.a(pd.field_ab, -98, new String[]{nf.field_b.field_Xb}) + "] ";
                } else {
                  var7Lifetime6 = "[" + PartInstruction.field_a + "] ";
                }
              }
            }
            var20 = var7Lifetime6 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - pl.field_X.c(var20);
          } else {
            var20 = var7Lifetime6 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - pl.field_X.c(var20);
          }
        } else {
          var23 = (CharSequence) ((Object) en.field_e);
          var18 = db.a(hh.field_d, -19, new String[]{cn.a((byte) 116, var23)});
          var7Lifetime6 = var18;
          var7Lifetime6 = var18;
          var8 = db.a(ak.field_e, -87, new String[]{var16});
          var7Lifetime6 = var8;
          var7Lifetime6 = var8;
          var9 = pl.field_X.c(var18);
          var10 = pl.field_X.c(var8);
          if (var10 >= var9) {
            var5Lifetime1 = var5Lifetime1 - var10;
          } else {
            var5Lifetime1 = var5Lifetime1 - var9;
          }
        }
        if (var5Lifetime1 >= pl.field_X.c(tf.field_g.toString())) {
          return true;
        }
        dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
        return true;
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_g = null;
        field_f = null;
        field_d = null;
        if (param0 == 690) {
          field_h = null;
          return;
        }
        field_e = (ub) null;
        field_h = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (param0 == 1) {
          if (param2 % 2 != 0) {
            return false;
          }
        } else {
          if (4 == param0 &&
            param2 % 2 != 0) {
            return false;
          }
        }
        if (param0 == 5) {
          return (param2 == 2);
        }
        if (!param1) {
          return !(param2 < 2);
        }
        field_h = (String) null;
        return !(param2 < 2);
    }

    final static boolean a(byte param0) {
        if (param0 <= 115) {
          he.a(false, 31, -36, -44, -98);
          return vb.b(-124);
        }
        return vb.b(-124);
    }

    static {
        field_g = "Rated game";
        field_k = 0;
        field_h = "NOT ENGINEERED";
        field_j = "Invite players";
        field_f = "Hide private chat and appear offline to friends";
        field_d = "ALT+<img=26> drops target lock: Off";
    }
}
