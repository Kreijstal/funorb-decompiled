/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private int field_e;
    private kd field_c;
    private kd[] field_b;
    private long field_g;
    static String field_i;
    static fh field_h;
    private int field_f;
    static int field_a;
    private kd field_d;

    final kd c(byte param0) {
        kd var3 = null;
        int var4 = SteelSentinels.field_G;
        if (((dk) this).field_d == null) {
            return null;
        }
        if (param0 <= 85) {
            return null;
        }
        kd var2 = ((dk) this).field_b[(int)((long)(((dk) this).field_e + -1) & ((dk) this).field_g)];
        while (((dk) this).field_d != var2) {
            if (!(~((dk) this).field_g != ~((dk) this).field_d.field_w)) {
                var3 = ((dk) this).field_d;
                ((dk) this).field_d = ((dk) this).field_d.field_o;
                return var3;
            }
            ((dk) this).field_d = ((dk) this).field_d.field_o;
        }
        ((dk) this).field_d = null;
        return null;
    }

    public static void b(byte param0) {
        field_i = null;
        field_h = null;
    }

    final kd a(int param0) {
        ((dk) this).field_f = 0;
        if (param0 <= 87) {
            ((dk) this).field_c = null;
        }
        return ((dk) this).a((byte) 95);
    }

    final kd a(byte param0) {
        kd var2_ref_kd = null;
        int var2 = 0;
        kd var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (((dk) this).field_f <= 0) {
            break L0;
          } else {
            if (((dk) this).field_b[-1 + ((dk) this).field_f] != ((dk) this).field_c) {
              var2_ref_kd = ((dk) this).field_c;
              ((dk) this).field_c = var2_ref_kd.field_o;
              return var2_ref_kd;
            } else {
              break L0;
            }
          }
        }
        var2 = 52 % ((4 - param0) / 46);
        L1: while (true) {
          if (((dk) this).field_e > ((dk) this).field_f) {
            int fieldTemp$2 = ((dk) this).field_f;
            ((dk) this).field_f = ((dk) this).field_f + 1;
            var3 = ((dk) this).field_b[fieldTemp$2].field_o;
            if (((dk) this).field_b[-1 + ((dk) this).field_f] != var3) {
              ((dk) this).field_c = var3.field_o;
              return var3;
            } else {
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ak var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        ak stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        ak stackOut_43_0 = null;
        ak stackOut_42_0 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var1_int = ug.field_Q;
              var2 = 0;
              if (in.field_a != 2) {
                break L1;
              } else {
                var3_long = -rb.field_c + mm.a(117);
                var2 = (int)((10999L - var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~r.field_j.length) {
                L3: {
                  if (param0 == -6561) {
                    break L3;
                  } else {
                    field_h = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = bl.field_m[var3];
                  if (var4 < 0) {
                    var5 = se.field_e;
                    break L4;
                  } else {
                    if (~ra.field_f.field_e == ~var4) {
                      var5 = km.field_i;
                      break L4;
                    } else {
                      var5 = kj.field_I;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = r.field_j[var3];
                  if (2 != in.field_a) {
                    break L5;
                  } else {
                    if (var2 == 1) {
                      L6: {
                        if (~oc.field_d.length < ~nm.field_n.length) {
                          stackOut_17_0 = oc.field_d.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = nm.field_n.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_18_0;
                        if (a.field_g.length <= dj.field_j.length) {
                          stackOut_20_0 = dj.field_j.length;
                          stackIn_21_0 = stackOut_20_0;
                          break L7;
                        } else {
                          stackOut_19_0 = a.field_g.length;
                          stackIn_21_0 = stackOut_19_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_21_0;
                        if (var3 < 6) {
                          break L8;
                        } else {
                          if (var3 >= var7 + 6) {
                            break L8;
                          } else {
                            L9: {
                              if (-var7 + (-6 + var3 + nm.field_n.length) >= 0) {
                                stackOut_25_0 = nm.field_n[-var7 + (var3 - 6 + nm.field_n.length)];
                                stackIn_26_0 = stackOut_25_0;
                                break L9;
                              } else {
                                stackOut_24_0 = "";
                                stackIn_26_0 = stackOut_24_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L8;
                          }
                        }
                      }
                      if (~var3 > ~(7 + var7)) {
                        break L5;
                      } else {
                        if (var7 + (7 - -var8) <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (~dj.field_j.length < ~(-7 + var3 + -var7)) {
                              stackOut_31_0 = dj.field_j[-var7 + -7 + var3];
                              stackIn_32_0 = stackOut_31_0;
                              break L10;
                            } else {
                              stackOut_30_0 = "";
                              stackIn_32_0 = stackOut_30_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_32_0;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackOut_36_0 = (String) var6;
                  stackOut_36_1 = 52;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (0 > var4) {
                    stackOut_38_0 = (String) (Object) stackIn_38_0;
                    stackOut_38_1 = stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L12;
                  } else {
                    stackOut_37_0 = (String) (Object) stackIn_37_0;
                    stackOut_37_1 = stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L12;
                  }
                }
                L13: {
                  var7 = wd.a(stackIn_39_0, (byte) stackIn_39_1, stackIn_39_2 != 0);
                  var8 = mg.field_kc - (var7 >> 1);
                  if (var4 >= 0) {
                    L14: {
                      if (~ra.field_f.field_e != ~var4) {
                        stackOut_43_0 = vd.field_f;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_42_0 = kk.field_c;
                        stackIn_44_0 = stackOut_42_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + ng.field_m;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(var7 - -(ud.field_y << 1), -15203, var8 + -ud.field_y, (rc.field_j << 1) + rn.field_q, var1_int);
                        break L15;
                      }
                    }
                    var1_int = var1_int + rc.field_j;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (var4 < 0) {
                    pa.field_k.b(var6, var8, var1_int + ag.field_s, var5, -1);
                    var1_int = var1_int + ih.field_r;
                    break L16;
                  } else {
                    wb.field_a.b(var6, var8, var1_int + ia.field_l, var5, -1);
                    var1_int = var1_int + (rc.field_j + (ng.field_m + rn.field_q));
                    break L16;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "dk.F(" + param0 + ')');
        }
    }

    final static byte[] a(boolean param0, Object param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        gb var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_13_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param1 != null) {
            if (param1 instanceof byte[]) {
              var3 = (byte[]) param1;
              if (!param0) {
                stackOut_10_0 = (byte[]) var3;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_8_0 = ff.a((byte) 89, var3);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              if (!(param1 instanceof gb)) {
                throw new IllegalArgumentException();
              } else {
                var4 = (gb) param1;
                stackOut_13_0 = var4.a(-21109);
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              }
            }
          } else {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("dk.G(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L0;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L0;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 0 + ')');
        }
    }

    final void a(kd param0, int param1, long param2) {
        kd var5 = null;
        try {
            if (param0.field_v != null) {
                param0.e(480);
            }
            var5 = ((dk) this).field_b[(int)(param2 & (long)(((dk) this).field_e - param1))];
            param0.field_o = var5;
            param0.field_v = var5.field_v;
            param0.field_v.field_o = param0;
            param0.field_o.field_v = param0;
            param0.field_w = param2;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "dk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final kd a(long param0, byte param1) {
        kd var5_ref_kd = null;
        int var6 = SteelSentinels.field_G;
        ((dk) this).field_g = param0;
        kd var4 = ((dk) this).field_b[(int)((long)(((dk) this).field_e - 1) & param0)];
        ((dk) this).field_d = var4.field_o;
        while (((dk) this).field_d != var4) {
            if (~param0 == ~((dk) this).field_d.field_w) {
                var5_ref_kd = ((dk) this).field_d;
                ((dk) this).field_d = ((dk) this).field_d.field_o;
                return var5_ref_kd;
            }
            ((dk) this).field_d = ((dk) this).field_d.field_o;
        }
        int var5 = -63 / ((param1 - 11) / 47);
        ((dk) this).field_d = null;
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bf.field_Fb = 1146810;
        o.field_b = 0;
        vg.field_c = 16777215;
    }

    dk(int param0) {
        int var2 = 0;
        kd var3 = null;
        ((dk) this).field_f = 0;
        ((dk) this).field_b = new kd[param0];
        ((dk) this).field_e = param0;
        for (var2 = 0; var2 < param0; var2++) {
            kd dupTemp$0 = new kd();
            var3 = dupTemp$0;
            ((dk) this).field_b[var2] = dupTemp$0;
            var3.field_o = var3;
            var3.field_v = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "modules:</col>";
    }
}
