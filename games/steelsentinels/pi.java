/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends java.awt.Canvas {
    private java.awt.Component field_d;
    static dk field_a;
    static char[] field_b;
    static int[] field_e;
    static int field_c;
    static String[] field_f;

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 61) {
          gh var2 = (gh) null;
          pi.a((byte) 56, (gh) null, -94, true);
        }
        field_e = null;
    }

    pi(java.awt.Component param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, gh param1, int param2, boolean param3) {
        int var7 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        String stackIn_35_0 = null;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        String var11 = null;
        gh var12 = null;
        int var13 = 0;
        gh var14 = null;
        gh var15 = null;
        gh var16 = null;
        var13 = SteelSentinels.field_G;
        try {
          if (!he.a((byte) 116)) {
            stackIn_4_0 = param2;
            return stackIn_4_0;
          }
          if (param0 > -17) {
            field_a = (dk) null;
          }
          var4_int = qa.field_O;
          var6 = 1;
          for (var7 = 0; var7 < 8; var7++) {
            var8 = 0;
            for (var9 = 0; 35 > var9; var9++) {
              boolean decompiledFrameRemainder0 = true;
              if (var7 == pe.field_O[var9]) {
                var5 = 2;
                if (t.a(fe.field_D, var9, -20370)) {
                  var5 = 0;
                }
                if (!param3) {
                  decompiledFrameRemainder0 = (var5 != 0);
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder0 = !(!ad.a(var9, nk.f((byte) -28), fe.field_D, (byte) 84, ge.field_m, rn.field_D));
                  }
                } else {
                  decompiledFrameRemainder0 = (var5 == 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5 != 0 &&
                    qf.field_h[var9] <= li.field_v) {
                    var5 = 1;
                  }
                  if (var6 != 0) {
                    var6 = 0;
                    var14 = new gh(-1L, (gh) null);
                    var14.field_Pb = gj.field_a;
                    var14.field_Kb = 2;
                    var14.a(0, param2, 18, 0, var4_int);
                    param1.a(var14, 126);
                    if (!param3) {
                      stackIn_35_0 = he.field_h;
                    } else {
                      stackIn_35_0 = qj.field_c;
                    }
                    var11 = stackIn_35_0;
                    var12 = new gh(-1L, kh.field_s, var11);
                    var12.field_nb = 0;
                    var12.field_L = (mi) ((Object) pl.field_U);
                    var12.a(0, param2, 18, 0, var4_int);
                    var12.field_Fb = 1;
                    var12.field_sb = 1;
                    var12.field_I = null;
                    var12.field_Kb = 1;
                    param1.a(var12, 125);
                    param2 = param2 + var12.field_Lb;
                  }
                  if (var8 == 0) {
                    var8 = 1;
                    var15 = new gh(-1L, kh.field_s, si.field_D[var7]);
                    var15.field_Kb = 1;
                    var15.field_nb = 11119017;
                    param2 += 2;
                    var15.field_I = lj.field_b;
                    var15.a(0, param2, 15, 0, var4_int);
                    param2 += 15;
                    param1.a(var15, 121);
                  }
                  param2 += 2;
                  var16 = lj.a(var4_int, var9, true, param3, var5, 49);
                  var16.a(0, param2, 49, 0, var4_int);
                  param2 += 49;
                  param1.a(var16, 126);
                }
              }
            }
          }
          stackIn_42_0 = param2;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("pi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pi.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static a a(byte param0) {
        try {
          Throwable var1 = null;
          a stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 <= 14) {
              field_e = (int[]) null;
            }
            stackIn_3_0 = (a) (Class.forName("mk").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_d.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "pi.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[8192];
        field_b = new char[128];
        field_f = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_c = 0;
    }
}
