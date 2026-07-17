/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static int[] field_d;
    static bb field_a;
    static String[] field_c;
    static ak[] field_b;

    final static void a(byte param0, boolean param1) {
        if (oo.field_b > 0) {
          if (uj.field_Wb) {
            t.a(0, 0, t.field_j, ui.field_i.field_gb);
            nc.field_e.a(param1, 0);
            if (0 >= vn.field_g) {
              if (h.field_W > 0) {
                if (bm.field_o) {
                  t.a(0, 0, t.field_j, ui.field_i.field_gb);
                  ra.field_e.a(param1, 0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!bm.field_o) {
                return;
              } else {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                ra.field_e.a(param1, 0);
                return;
              }
            }
          } else {
            if (0 >= vn.field_g) {
              if (h.field_W > 0) {
                if (!bm.field_o) {
                  return;
                } else {
                  t.a(0, 0, t.field_j, ui.field_i.field_gb);
                  ra.field_e.a(param1, 0);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (!bm.field_o) {
                return;
              } else {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                ra.field_e.a(param1, 0);
                return;
              }
            }
          }
        } else {
          if (0 >= vn.field_g) {
            if (h.field_W > 0) {
              if (!bm.field_o) {
                return;
              } else {
                t.a(0, 0, t.field_j, ui.field_i.field_gb);
                ra.field_e.a(param1, 0);
                return;
              }
            } else {
              return;
            }
          } else {
            if (!bm.field_o) {
              return;
            } else {
              t.a(0, 0, t.field_j, ui.field_i.field_gb);
              ra.field_e.a(param1, 0);
              return;
            }
          }
        }
    }

    final static void a() {
        hb.field_jb = null;
        uk.field_r = null;
        df.field_r = null;
        sm.field_l = false;
        jk.field_d = null;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != null) {
            var2_int = 0;
            var3 = param0.length();
            L0: while (true) {
              L1: {
                if (var3 <= var2_int) {
                  break L1;
                } else {
                  if (!ii.a((byte) 116, param0.charAt(var2_int))) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!ii.a((byte) 121, param0.charAt(var3 - 1))) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = var3 + -var2_int;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (var3 <= var6) {
                        L5: {
                          if (param1 >= 24) {
                            break L5;
                          } else {
                            field_c = null;
                            break L5;
                          }
                        }
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        var7 = param0.charAt(var6);
                        if (vf.a((byte) -3, (char) var7)) {
                          var8 = ae.a(124, (char) var7);
                          if (0 != var8) {
                            StringBuilder discarded$1 = var5.append(var8);
                            var6++;
                            var6++;
                            continue L4;
                          } else {
                            var6++;
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (String) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("dh.A(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bb();
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
