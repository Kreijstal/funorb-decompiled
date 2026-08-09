/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static double field_c;
    static int field_b;
    static boolean field_a;

    final static void a(int param0) {
        mi var1 = (mi) ((Object) k.field_d.b(-8980));
        if (var1 == null) {
            var1 = new mi();
        }
        var1.a(em.field_j, (byte) 29, em.field_k, em.field_b, em.field_a, em.field_d, em.field_i, em.field_l);
        int var2 = 28 % ((param0 - -72) / 49);
        re.field_q.a(-12328, var1);
    }

    final static String b(byte param0) {
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var2 = 0;
        int var5 = EscapeVector.field_A;
        String var6 = "(" + g.field_q + " " + f.field_t + " " + jj.field_b + ") " + cd.field_v;
        String var1 = var6;
        if (-1 > (hi.field_r ^ -1)) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < hi.field_r; var2++) {
                var7 = var1 + ' ';
                var1 = var7;
                var3 = 255 & om.field_g.field_g[var2];
                var4 = var3 >> -1780804028;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                var8 = var7 + (char)var4;
                if ((var3 ^ -1) > -11) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        var2 = 96 / ((-24 - param0) / 38);
        return var1;
    }

    final boolean a(byte param0) {
        int stackIn_8_0 = 0;
        if (param0 >= 62) {
          L0: {
            L1: {
              if (this == mc.field_b) {
                break L1;
              } else {
                if (rn.field_c == this) {
                  break L1;
                } else {
                  if (this != ck.field_t) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final static byte[] a(mf param0, int[] param1, int param2, int param3, mf param4, byte param5) {
        Object stackIn_6_0 = null;
        mf stackIn_10_0 = null;
        byte[] stackIn_15_0 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        mf var8 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        try {
          L0: {
            L1: {
              if (param5 >= 92) {
                break L1;
              } else {
                field_b = -32;
                break L1;
              }
            }
            var6_int = je.a(false, param3);
            if (param2 >= 0) {
              if (var6_int > param2) {
                L2: {
                  var7 = dh.field_e[param3];
                  if ((var7 ^ -1) != -3) {
                    stackIn_10_0 = (mf) (param0);
                    break L2;
                  } else {
                    stackIn_10_0 = (mf) (param4);
                    break L2;
                  }
                }
                var8 = stackIn_10_0;
                if (var8 != null) {
                  var12 = ja.field_e[param3].toLowerCase();
                  var11 = fh.field_c[param3][param2].toLowerCase() + ".lvl";
                  var13 = rd.a((byte) 72, var11);
                  var15 = var12 + "_" + var13;
                  var14 = "";
                  if (param1 == null) {
                    stackIn_17_0 = var8.a(-4, var15, var14);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_15_0 = var8.a((byte) -73, var14, var15, param1);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("hf.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final static ed[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        if (param0 < 63) {
            field_c = -0.8853374871854307;
        }
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
        int var2;
        int var3;
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
        field_c = Math.atan2(1.0, 0.0);
    }
}
