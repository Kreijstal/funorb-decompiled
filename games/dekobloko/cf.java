/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cf {
    static int field_f;
    static w field_d;
    static String field_c;
    nf[] field_a;
    static String field_b;
    static w field_h;
    static String field_e;
    static String field_j;
    static boolean field_i;
    static String field_g;

    final static String a(int param0, long param1) {
        StringBuilder discarded$1 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        var11 = client.field_A ? 1 : 0;
        if (param1 > (long)param0) {
          if (6582952005840035281L > param1) {
            if (0L == param1 % 37L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                L1: {
                  if (0L == var4) {
                    break L1;
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = new StringBuilder(var3);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (-1L == (param1 ^ -1L)) {
                        break L4;
                      } else {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = db.field_g[(int)(var7 + -(37L * param1))];
                        if (var11 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (var9 == 95) {
                              var10 = -1 + var6.length();
                              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                              var9 = 160;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          discarded$1 = var6.append((char) var9);
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    break L3;
                  }
                  return var6.toString();
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

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        mk var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (!param0) {
                  stackIn_9_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_7_0 = jd.a(0, var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (!(param2 instanceof mk)) {
                  L1: {
                    if (param1 > 18) {
                      break L1;
                    } else {
                      cf.a(52, 9L);
                      break L1;
                    }
                  }
                  throw new IllegalArgumentException();
                } else {
                  var4 = (mk) (param2);
                  stackIn_12_0 = var4.a(256);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("cf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final int a(boolean param0) {
        int var2;
        nf[] var3;
        int var4;
        nf var5;
        int var6;
        int var7;
        var7 = client.field_A ? 1 : 0;
        var2 = -1;
        if (!param0) {
          if (this.field_a == null) {
            return var2;
          } else {
            var3 = this.field_a;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var3.length <= var4) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.b(-6375);
                      if (var2 >= var6) {
                        break L2;
                      } else {
                        var2 = var6;
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return 85;
        }
    }

    final int b(int param0) {
        if (param0 == -1) {
          if (this.field_a != null) {
            if ((this.field_a.length ^ -1) >= -1) {
              return 0;
            } else {
              return this.field_a[this.field_a.length + -1].field_i - this.field_a[0].field_c;
            }
          } else {
            return 0;
          }
        } else {
          return -39;
        }
    }

    public static void a(byte param0) {
        if (param0 != 126) {
          field_g = (String) null;
          field_c = null;
          field_d = null;
          field_h = null;
          field_g = null;
          field_e = null;
          field_j = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_h = null;
          field_g = null;
          field_e = null;
          field_j = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0) {
        if (ca.field_vb < 2) {
          return ef.field_U;
        } else {
          if (null != vj.field_a) {
            if (!vj.field_a.a((byte) 121)) {
              return fe.field_a;
            } else {
              return eb.field_n;
            }
          } else {
            if (sk.field_f.a((byte) 121)) {
              if (!sk.field_f.a("commonui", (byte) 118)) {
                return bn.field_d + " - " + sk.field_f.a(-128, "commonui") + "%";
              } else {
                if (!rc.field_k.a((byte) 121)) {
                  return ne.field_d;
                } else {
                  if (param0 == -11777) {
                    if (rc.field_k.a("commonui", (byte) 124)) {
                      if (ph.field_Fb.a((byte) 121)) {
                        if (!ph.field_Fb.a(false)) {
                          return bg.field_c + " - " + ph.field_Fb.b((byte) -61) + "%";
                        } else {
                          return wm.field_k;
                        }
                      } else {
                        return bk.field_Ob;
                      }
                    } else {
                      return un.field_a + " - " + rc.field_k.a(-125, "commonui") + "%";
                    }
                  } else {
                    cf.a(-68);
                    if (rc.field_k.a("commonui", (byte) 124)) {
                      if (ph.field_Fb.a((byte) 121)) {
                        if (!ph.field_Fb.a(false)) {
                          return bg.field_c + " - " + ph.field_Fb.b((byte) -61) + "%";
                        } else {
                          return wm.field_k;
                        }
                      } else {
                        return bk.field_Ob;
                      }
                    } else {
                      return un.field_a + " - " + rc.field_k.a(-125, "commonui") + "%";
                    }
                  }
                }
              }
            } else {
              return ng.field_l;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        nf[] var3;
        int var4;
        nf var5;
        int var6;
        nf[] var7;
        int stackIn_7_0 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var7 = this.field_a;
          var3 = var7;
          if (param0 == -94) {
            break L0;
          } else {
            cf.a(102);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 < var7.length) {
            var5 = var7[var4];
            stackIn_7_0 = param1;

            if (var6 == 0) {
              if (stackIn_7_0 >= var5.field_a.length) {
                param1 = param1 - (var5.field_a.length - 1);
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  return 0;
                }
              } else {
                return var5.field_a[param1];
              }
            } else {
              return stackIn_7_0;
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        int stackIn_16_0 = 0;
        int var4;
        int var5;
        nf var6;
        int var7;
        int var8;
        L0: {
          var8 = client.field_A ? 1 : 0;
          if (param2 == -31917) {
            break L0;
          } else {
            cf.a(-31, -100L);
            break L0;
          }
        }
        L1: {
          if (null == this.field_a) {
            break L1;
          } else {
            if (this.field_a.length == 0) {
              break L1;
            } else {
              if (param1 >= this.field_a[0].field_c) {
                if (param1 <= this.field_a[this.field_a.length - 1].field_i) {
                  if (1 != this.field_a.length) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (this.field_a.length > var5) {
                        var6 = this.field_a[var5];
                        stackIn_16_0 = var6.field_c ^ -1;

                        if (var8 == 0) {
                          L3: {
                            if (stackIn_16_0 < (param1 ^ -1)) {
                              break L3;
                            } else {
                              if (param1 <= var6.field_i) {
                                var7 = var6.a(param0, 109);
                                if (-1 == var7) {
                                  return -1;
                                } else {
                                  return var4 + var7;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_a.length);
                          var5++;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            return -1;
                          }
                        } else {
                          return stackIn_16_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return this.field_a[0].a(param0, 109);
                  }
                } else {
                  return -1;
                }
              } else {
                break L1;
              }
            }
          }
        }
        return -1;
    }

    final int a(boolean param0, int param1) {
        int var3;
        nf var4;
        int var5;
        int stackIn_7_0 = 0;
        var5 = client.field_A ? 1 : 0;
        if (!param0) {
          var3 = 0;
          L0: while (true) {
            if (var3 < this.field_a.length) {
              var4 = this.field_a[var3];
              stackIn_7_0 = var4.field_a.length ^ -1;

              if (var5 == 0) {
                if (stackIn_7_0 >= (param1 ^ -1)) {
                  param1 = param1 - (-1 + var4.field_a.length);
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return this.field_a.length;
                  }
                } else {
                  return var3;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return this.field_a.length;
            }
          }
        } else {
          return -107;
        }
    }

    final int a(byte param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        if (param0 == 64) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -43;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6 = 0;
                        var7 = param2.length();
                        var8 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 <= var8) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = param2.charAt(var8);
                        stackIn_18_0 = -61;
                        stackIn_7_0 = stackIn_18_0;
                        stackIn_18_1 = var9 ^ -1;
                        stackIn_7_1 = stackIn_18_1;
                        if (var10 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 != stackIn_7_1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = 1;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 != 62) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 != 32) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var5_int > 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        return 0;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = param3 - param1 << -139770712;
                        stackIn_18_1 = var5_int;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = stackIn_18_0 / stackIn_18_1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var5);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("cf.I(").append(param0).append(',').append(param1).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param2 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4) {
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 57) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = (int[]) null;
                        cf.a(-62, (byte) 71, (int[]) null, 113, -87);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param4--;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param4--;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4 < 0) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = param2;
                        var5 = var10;
                        var6 = param0;
                        var7 = param3;
                        var10[var6] = var7 - -(lb.a(16711422, var10[var6]) >> -59233087);
                        param0++;
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var5_ref);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("cf.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param2 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = 640;
        field_e = "FIGHT!";
        field_j = "Quit";
        field_b = "Game options changed (<%0>)";
        field_g = "Honour";
    }
}
