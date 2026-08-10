/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
            return;
        }
        field_b = null;
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 55 % ((-79 - param1) / 36);
            var3 = param0.length();
            var4 = new StringBuilder(var3);
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                stackIn_25_0 = var4.toString();
                break L0;
              } else {
                L2: {
                  L3: {
                    var6 = param0.charAt(var5);
                    if (var6 < 97) {
                      break L3;
                    } else {
                      if (var6 <= 122) {
                        discarded$0 = var4.append((char) var6);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        discarded$1 = var4.append((char) var6);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var6 < 65) {
                      break L5;
                    } else {
                      if (90 < var6) {
                        break L5;
                      } else {
                        discarded$2 = var4.append((char)(32 + var6));
                        break L2;
                      }
                    }
                  }
                  if (var6 == 43) {
                    discarded$3 = var4.append('+');
                    break L2;
                  } else {
                    if (var6 != 38) {
                      var7 = var4.length();
                      if (0 >= var7) {
                        break L2;
                      } else {
                        if (-96 == (var4.charAt(-1 + var7) ^ -1)) {
                          break L2;
                        } else {
                          discarded$4 = var4.append('_');
                          break L2;
                        }
                      }
                    } else {
                      discarded$5 = var4.append('+');
                      break L2;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("dj.E(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if ((wj.field_o ^ -1) < -1) {
          if (vg.field_b == null) {
            L0: {
              ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
              if (null != ub.field_c) {
                var2 = 2;
                cj.a(ub.field_c, 13861);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (null != vg.field_b) {
                break L1;
              } else {
                if (!wc.field_b) {
                  break L1;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (!param0) {
                    dj.b(1);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (!param0) {
              dj.b(1);
              return;
            } else {
              return;
            }
          } else {
            L2: {
              ub.field_c = vg.field_b.d((byte) -18);
              kc.a(-14226, 2);
              if (null != ub.field_c) {
                var2 = 2;
                cj.a(ub.field_c, 13861);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                if (!param0) {
                  dj.b(1);
                  return;
                } else {
                  return;
                }
              } else {
                if (!param0) {
                  dj.b(1);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!param0) {
                dj.b(1);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (qj.b((byte) 73)) {
            var2 = 0;
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                if (!param0) {
                  dj.b(1);
                  return;
                } else {
                  return;
                }
              } else {
                if (!param0) {
                  dj.b(1);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!param0) {
                dj.b(1);
                return;
              } else {
                return;
              }
            }
          } else {
            var2 = 1;
            L3: {
              if (null != vg.field_b) {
                break L3;
              } else {
                if (!wc.field_b) {
                  break L3;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    dj.b(1);
                    return;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              dj.b(1);
              return;
            }
          }
        }
    }

    final static byte[] a(int param0, hj param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.k(param3, 1522829539);
            if (param0 == -39) {
              if (var4_int != 0) {
                L1: {
                  L2: {
                    if (param2 == null) {
                      break L2;
                    } else {
                      if (var4_int != param2.length) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param2 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param1.k(3, 1522829539);
                  var6 = (byte)param1.k(8, 1522829539);
                  if ((var5 ^ -1) < -1) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param2[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param2[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (byte[]) (param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("dj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_6_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
            return false;
        }
        if (param0 < 48) {
            return false;
        }
        if (57 < param0) {
            return false;
        }
        return true;
    }

    abstract void a(byte[] param0, byte param1);

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if ((param1 ^ -1) >= -1) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_b = (StringBuilder) null;
                    break L2;
                  }
                }
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = var3_int << 1782217825 | 1 & param2;
                param1--;
                param2 = param2 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "dj.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (ta.field_f != null) {
                ta.field_f.field_D.a(param1, 17036);
                break L2;
              } else {
                break L2;
              }
            }
            if (null != ca.field_g) {
              ca.field_g.field_B.a(param1, 17036);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("dj.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        pd.field_b = true;
        if (param0 != -1) {
          return false;
        } else {
          L0: {
            qf.field_b = lk.a(param0 + 1) - -15000L;
            if (11 != gl.field_y) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_a = "Waiting for fonts";
        field_b = new StringBuilder(12);
    }
}
