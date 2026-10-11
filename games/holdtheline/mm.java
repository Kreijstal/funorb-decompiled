/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mm {
    int field_f;
    int field_c;
    static ji[] field_a;
    static float field_d;
    static ah field_e;
    int[] field_h;
    java.awt.Image field_b;
    static String field_g;

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    public static void b(boolean param0) {
        field_e = null;
        if (param0) {
          field_e = (ah) null;
        }
        field_g = null;
        field_a = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static boolean a(vk param0, int param1) {
        vk stackIn_95_0 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var3 = null;
        wm var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ei var6 = null;
        wm var3_refLifetime1;
        int var4Lifetime1;
        int var4Lifetime1Lifetime1;
        var3 = null;
        var5 = HoldTheLine.field_D;
        if (param1 != -65) {
          return false;
        }
        try {
          if (param0.field_r) {
            return false;
          }
          if (param0.field_j == null) {
            var6 = new ei();
            var3_ref = (wm) (param0.field_m.b((byte) 85));
            while (var3_ref != null) {
              var4 = 0;
              while (true) {
                if (!(var4 >= var6.field_e)) {
                  if (var6.field_b[var4] != var3_ref.field_E) {
                    var4++;
                    continue;
                  }
                  break;
                }
                var6.a(var3_ref.field_E, (byte) 6);
                break;
              }
              var3_ref = (wm) (param0.field_m.c((byte) -70));
            }
            var3_refLifetime1 = (wm) (param0.field_k.b((byte) 101));
            while (true) {
              if (var3_refLifetime1 == null) {
                param0.field_j = new om[var6.field_e];
                for (var4Lifetime1 = 0; var6.field_e > var4Lifetime1; var4Lifetime1++) {
                  param0.field_j[var4Lifetime1] = (om) (var6.field_b[var4Lifetime1]);
                }
                param0.field_n = 0;
                break;
              }
              var4Lifetime1Lifetime1 = 0;
              while (true) {
                if (!(var4Lifetime1Lifetime1 >= var6.field_e)) {
                  if (var6.field_b[var4Lifetime1Lifetime1] != var3_refLifetime1.field_E) {
                    var4Lifetime1Lifetime1++;
                    continue;
                  }
                  break;
                }
                var6.a(var3_refLifetime1.field_E, (byte) 6);
                break;
              }
              var3_refLifetime1 = (wm) (param0.field_k.c((byte) 105));
            }
          }
          L8: {
            if (param0.field_o != 0) {
              if (param0.field_o != 1) {
                if (2 != param0.field_o) {
                  if (param0.field_o != 3) {
                    boolean decompiledFrameRemainder0 = true;
                    if (param0.field_o != 4) {
                      if (param0.field_o == 5) {
                        if (null == ha.field_i.a(8192)) {
                          return false;
                        }
                        if (null == kc.field_b.a(8192)) {
                          return false;
                        }
                      } else {
                        decompiledFrameRemainder0 = (param0.field_o == 6);
                        if (decompiledFrameRemainder0) {
                          if (hg.field_Q.a(param1 ^ -8257) == null) {
                            return false;
                          }
                          if (null == fd.field_e.a(8192)) {
                            return false;
                          }
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        stackIn_95_0 = (vk) (param0);
                        break L8;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      if (ug.field_b.a(8192) == null) {
                        return false;
                      }
                      if (ha.field_i.a(8192) == null) {
                        return false;
                      }
                    }
                    stackIn_95_0 = (vk) (param0);
                    break L8;
                  }
                  if (null == kc.field_b.a(8192)) {
                    return false;
                  }
                  if (null == ug.field_b.a(8192)) {
                    return false;
                  }
                } else {
                  if (a.field_F.a(8192) == null) {
                    return false;
                  }
                  if (lk.field_a.a(8192) == null) {
                    return false;
                  }
                }
                stackIn_95_0 = (vk) (param0);
                break L8;
              }
              if (a.field_F.a(param1 + 8257) == null) {
                return false;
              }
              if (hf.field_h.a(8192) == null) {
                return false;
              }
            } else {
              if (null == ol.field_h.a(param1 ^ -8257)) {
                return false;
              }
              if (fd.field_e.a(param1 ^ -8257) == null) {
                return false;
              }
            }
            stackIn_95_0 = (vk) (param0);
          }
          while (stackIn_95_0.field_j.length > param0.field_n) {
            if (!param0.field_j[param0.field_n].b((byte) 48)) {
              return false;
            }
            param0.field_n = param0.field_n + 1;
            stackIn_95_0 = (vk) (param0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_105_0 = var2;
          stackIn_105_1 = new StringBuilder().append("mm.F(");
          if (param0 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param1).append(')').toString());
        }
    }

    final static sh a(String param0, int param1) {
        sh stackIn_3_0 = null;
        sh stackIn_7_0 = null;
        sh stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        sh stackIn_26_0 = null;
        sh stackIn_39_0 = null;
        sh stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = HoldTheLine.field_D;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = fo.field_k;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = wb.field_h;
            return stackIn_7_0;
          }
          if ((char)param1 == param0.charAt(0)) {
            if (34 != param0.charAt(-1 + var2_int)) {
              stackIn_13_0 = qj.field_F;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (var5 != 92) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = qj.field_F;
                  return stackIn_26_0;
                }
                var3 = 0;
              } else {
                stackIn_21_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_21_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_39_0 = qj.field_F;
                return stackIn_39_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == qk.field_I.indexOf(var5Lifetime1)) {
                stackIn_43_0 = qj.field_F;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("mm.B(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (param0) {
          field_d = -1.6866915225982666f;
        }
        tc.a(this.field_h, this.field_f, this.field_c);
    }

    static {
        field_e = new ah();
        field_g = "Unpacking graphics";
    }
}
