/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static double field_c;
    static int field_b;
    static boolean field_a;

    final static void a(int param0) {
        mi var1 = (mi) (Object) k.field_d.b(-8980);
        if (var1 == null) {
            var1 = new mi();
        }
        var1.a(em.field_j, (byte) 29, em.field_k, em.field_b, em.field_a, em.field_d, em.field_i, em.field_l);
        int var2 = 28 % ((param0 - -72) / 49);
        re.field_q.a(-12328, (hg) (Object) var1);
    }

    final static String b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        String var1 = "(" + g.field_q + " " + f.field_t + " " + jj.field_b + ") " + cd.field_v;
        if (hi.field_r > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < hi.field_r; var2++) {
                var1 = var1 + 32;
                var3 = 255 & om.field_g.field_g[var2];
                var4 = var3 >> 4;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        var2 = 96 / ((-24 - param0) / 38);
        return var1;
    }

    final boolean a(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 62) {
          L0: {
            L1: {
              if (this == (Object) (Object) mc.field_b) {
                break L1;
              } else {
                if ((Object) (Object) rn.field_c == this) {
                  break L1;
                } else {
                  if (this != (Object) (Object) ck.field_t) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final static byte[] a(mf param0, int[] param1, int param2, int param3, mf param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        mf var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_4_0 = null;
        mf stackIn_8_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_7_0 = null;
        mf stackOut_6_0 = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var6_int = je.a(false, param3);
            if (param2 >= 0) {
              if (var6_int > param2) {
                L1: {
                  var7 = dh.field_e[param3];
                  if (var7 != 2) {
                    stackOut_7_0 = (mf) param0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = (mf) param4;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                var8 = stackIn_8_0;
                if (var8 != null) {
                  var9 = ja.field_e[param3].toLowerCase();
                  var10 = fh.field_c[param3][param2].toLowerCase() + ".lvl";
                  var10 = rd.a((byte) 72, var10);
                  var10 = var9 + "_" + var10;
                  var9 = "";
                  if (param1 == null) {
                    stackOut_14_0 = var8.a(-4, var10, var9);
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = var8.a((byte) -73, var9, var10, param1);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  return null;
                }
              } else {
                stackOut_3_0 = null;
                stackIn_4_0 = stackOut_3_0;
                return (byte[]) (Object) stackIn_4_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("hf.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          L4: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 97 + 41);
        }
        return stackIn_15_0;
    }

    final static ed[] b() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        ed[] var1 = new ed[qk.field_j];
        for (var2 = 0; var2 < qk.field_j; var2++) {
            var3 = bc.field_a[var2] * qh.field_k[var2];
            var4 = qe.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = qk.field_f[ae.a((int) var4[var6], 255)];
            }
            var1[var2] = new ed(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var5);
        }
        of.a(false);
        return var1;
    }

    final static byte a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        if (param0 > 22) {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (8364 == param1) {
                var2 = -128;
                break L0;
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                  break L0;
                } else {
                  if (param1 == 402) {
                    var2 = -125;
                    break L0;
                  } else {
                    if (8222 == param1) {
                      var2 = -124;
                      break L0;
                    } else {
                      if (param1 == 8230) {
                        var2 = -123;
                        break L0;
                      } else {
                        if (param1 != 8224) {
                          if (8225 == param1) {
                            var2 = -121;
                            break L0;
                          } else {
                            if (710 != param1) {
                              if (param1 == 8240) {
                                var2 = -119;
                                break L0;
                              } else {
                                if (param1 == 352) {
                                  var2 = -118;
                                  break L0;
                                } else {
                                  if (param1 == 8249) {
                                    var2 = -117;
                                    break L0;
                                  } else {
                                    if (param1 == 338) {
                                      var2 = -116;
                                      break L0;
                                    } else {
                                      if (param1 != 381) {
                                        if (8216 != param1) {
                                          if (param1 == 8217) {
                                            var2 = -110;
                                            break L0;
                                          } else {
                                            if (param1 != 8220) {
                                              if (8221 != param1) {
                                                if (param1 == 8226) {
                                                  var2 = -107;
                                                  break L0;
                                                } else {
                                                  if (8211 != param1) {
                                                    if (8212 != param1) {
                                                      if (param1 != 732) {
                                                        if (param1 != 8482) {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                            break L0;
                                                          } else {
                                                            if (8250 == param1) {
                                                              var2 = -101;
                                                              break L0;
                                                            } else {
                                                              if (339 != param1) {
                                                                if (param1 != 382) {
                                                                  if (param1 != 376) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                        break L0;
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                      break L0;
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var2 = -108;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -109;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          var2 = -111;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -114;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = -120;
                              break L0;
                            }
                          }
                        } else {
                          var2 = -122;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            var2 = (byte)param1;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) -88;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = Math.atan2(1.0, 0.0);
    }
}
