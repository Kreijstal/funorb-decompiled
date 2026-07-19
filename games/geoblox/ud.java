/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static String field_b;
    static String field_a;

    final static void a(byte param0, int param1) {
        hf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        p var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var4 = (p) ((Object) rh.field_a.g(0));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var2 = k.field_e.g(0);
                  if (param0 <= -123) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    re.b(-101, param1);
                    var2 = k.field_e.d(1);
                    continue L3;
                  }
                }
              } else {
                ol.a(param1, var4, 30175);
                var4 = (p) ((Object) rh.field_a.d(1));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ud.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static j a(int param0, String param1) {
        j discarded$2 = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        j stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        j stackOut_15_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            if (null != ug.field_a) {
              L1: {
                var7 = (CharSequence) ((Object) param1);
                var2 = oe.a(var7, 12);
                if (var2 == null) {
                  var2 = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var3 = (j) ((Object) ug.field_a.a((long)var2.hashCode(), -1));
                if (param0 == 0) {
                  break L2;
                } else {
                  var6 = (String) null;
                  discarded$2 = ud.a(55, (String) null);
                  break L2;
                }
              }
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var8 = (CharSequence) ((Object) var3.field_hb);
                    var4 = oe.a(var8, 12);
                    if (var4 != null) {
                      break L4;
                    } else {
                      var4 = var3.field_hb;
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackOut_15_0 = (j) (var3);
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    var3 = (j) ((Object) ug.field_a.a(param0 ^ -29925));
                    continue L3;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2_ref);
            stackOut_19_1 = new StringBuilder().append("ud.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_a = (String) null;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        p var11 = null;
        pk var12 = null;
        int[] var13 = null;
        qi var14 = null;
        qi var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var12 = eh.field_d;
              var2 = var12.c((byte) 34);
              if (0 != var2) {
                if (var2 == 1) {
                  var11 = (p) ((Object) rh.field_a.g(0));
                  if (var11 == null) {
                    jl.a((byte) -120);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var11.a(false);
                    break L1;
                  }
                } else {
                  if ((var2 ^ -1) == -3) {
                    var15 = (qi) ((Object) k.field_e.g(0));
                    if (var15 == null) {
                      jl.a((byte) -115);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var15.field_g = wf.j(86);
                      var15.field_j = var15.field_g[0];
                      var15.field_f = true;
                      var15.a(false);
                      break L1;
                    }
                  } else {
                    gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
                    jl.a((byte) -116);
                    break L1;
                  }
                }
              } else {
                var10 = wf.j(89);
                var16 = var10;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((qc) ((Object) var5)).c((byte) 34);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (qi) ((Object) k.field_e.g(0));
                    if (var14 == null) {
                      jl.a((byte) -117);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var14.field_g = var3;
                      var14.field_f = true;
                      var14.field_j = var16[0];
                      var14.a(false);
                      break L1;
                    }
                  } else {
                    var9[var7] = ((qc) ((Object) var5)).a((byte) -97);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0 > 85) {
                break L3;
              } else {
                ud.a(-63);
                break L3;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ud.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "Loading sound effects";
    }
}
