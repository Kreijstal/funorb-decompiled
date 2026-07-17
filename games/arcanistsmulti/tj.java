/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tl {
    static lg field_t;
    static String field_y;
    private byte[] field_E;
    private int field_i;
    static qb[] field_A;
    private di field_n;
    private byte[] field_w;
    private int field_q;
    static int field_C;
    private pa field_s;
    static int[] field_u;
    private int field_v;
    static kc field_o;
    private be field_D;
    private be field_F;
    private jk field_k;
    private ve field_x;
    private lk field_B;
    private vn field_h;
    private int field_p;
    private vn field_m;
    private boolean field_l;
    private boolean field_j;
    private boolean field_z;
    private long field_r;

    final static fe a(int param0, int param1) {
        fe var2 = new fe();
        tj.b(68);
        i.field_e.b((pg) (Object) var2, -1);
        gb.a(param0, true);
        return var2;
    }

    final void g(byte param0) {
        if (!(null != ((tj) this).field_F)) {
            return;
        }
        ((tj) this).field_l = true;
        if (param0 != 53) {
            ((tj) this).field_x = null;
        }
        if (!(null != ((tj) this).field_h)) {
            ((tj) this).field_h = new vn();
        }
    }

    final void a(boolean param0) {
        pg var2 = null;
        int var3 = 0;
        int var4 = 0;
        pg stackIn_15_0 = null;
        pg stackIn_16_0 = null;
        pg stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        pg stackOut_14_0 = null;
        pg stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        pg stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (((tj) this).field_h != null) {
          if (((tj) this).d((byte) 122) == null) {
            return;
          } else {
            if (!param0) {
              var2 = ((tj) this).field_m.b(12623);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_e;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (var3 < 0) {
                              break L4;
                            } else {
                              if (((tj) this).field_k.field_f <= var3) {
                                break L4;
                              } else {
                                if (((tj) this).field_k.field_b[var3] != 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L5: {
                            stackOut_14_0 = (pg) var2;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (param0) {
                              stackOut_16_0 = (pg) (Object) stackIn_16_0;
                              stackOut_16_1 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L5;
                            } else {
                              stackOut_15_0 = (pg) (Object) stackIn_15_0;
                              stackOut_15_1 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_17_1 = stackOut_15_1;
                              break L5;
                            }
                          }
                          ((pg) (Object) stackIn_17_0).a(stackIn_17_1 != 0);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L6: {
                          if (0 == ((tj) this).field_E[var3]) {
                            ve discarded$4 = this.a(1, -103, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (((tj) this).field_E[var3] != -1) {
                            break L7;
                          } else {
                            ve discarded$5 = this.a(2, 62, var3);
                            break L7;
                          }
                        }
                        if (((tj) this).field_E[var3] != 1) {
                          break L2;
                        } else {
                          var2.a(true);
                          break L2;
                        }
                      }
                      var2 = ((tj) this).field_m.a(0);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0, String[] param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var14 = null;
        String var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_26_0 = false;
        String stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_25_0 = false;
        String stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6 = param2.indexOf("<%", var5);
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= ~var6) {
                      break L4;
                    } else {
                      if (var12 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_5_0 = var6 + 2;
                  stackIn_7_0 = stackOut_5_0;
                  L5: while (true) {
                    var5 = stackIn_7_0;
                    L6: while (true) {
                      L7: {
                        if (~var3_int >= ~var5) {
                          break L7;
                        } else {
                          stackOut_9_0 = e.a(30, param2.charAt(var5));
                          stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var12 != 0) {
                            continue L2;
                          } else {
                            if (!stackIn_10_0) {
                              break L7;
                            } else {
                              var5++;
                              if (var12 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      var15 = param2.substring(var6 + 2, var5);
                      var15 = var15;
                      if (!fi.a((CharSequence) (Object) var15, 10)) {
                        continue L1;
                      } else {
                        stackOut_14_0 = ~var5;
                        stackOut_14_1 = ~var3_int;
                        stackIn_6_0 = stackOut_14_0;
                        stackIn_6_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var12 != 0) {
                          stackOut_6_0 = stackIn_6_0 + stackIn_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          continue L5;
                        } else {
                          L8: {
                            if (stackIn_15_0 <= stackIn_15_1) {
                              break L8;
                            } else {
                              if (param2.charAt(var5) != 62) {
                                break L8;
                              } else {
                                var5++;
                                var8 = dc.a((CharSequence) (Object) var15, 126);
                                var4 = var4 + (param1[var8].length() + -var5 - -var6);
                                break L8;
                              }
                            }
                          }
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = -96 % ((param0 - 51) / 62);
                var14 = new StringBuilder(var4);
                var7 = var14;
                var8 = 0;
                var5 = 0;
                L9: while (true) {
                  var9 = param2.indexOf("<%", var5);
                  stackOut_20_0 = -1;
                  stackIn_21_0 = stackOut_20_0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (stackIn_21_0 < ~var9) {
                          break L12;
                        } else {
                          if (var12 != 0) {
                            break L11;
                          } else {
                            var5 = var9 - -2;
                            L13: while (true) {
                              L14: {
                                if (~var3_int >= ~var5) {
                                  break L14;
                                } else {
                                  stackOut_25_0 = e.a(30, param2.charAt(var5));
                                  stackIn_21_0 = stackOut_25_0 ? 1 : 0;
                                  stackIn_26_0 = stackOut_25_0;
                                  if (var12 != 0) {
                                    continue L10;
                                  } else {
                                    if (!stackIn_26_0) {
                                      break L14;
                                    } else {
                                      var5++;
                                      if (var12 == 0) {
                                        continue L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              L15: {
                                var10 = param2.substring(2 + var9, var5);
                                if (fi.a((CharSequence) (Object) var10, 10)) {
                                  break L15;
                                } else {
                                  if (var12 == 0) {
                                    continue L9;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var5 >= var3_int) {
                                  break L16;
                                } else {
                                  if (param2.charAt(var5) == 62) {
                                    var5++;
                                    var11 = dc.a((CharSequence) (Object) var10, 127);
                                    StringBuilder discarded$3 = var7.append(param2.substring(var8, var9));
                                    var8 = var5;
                                    StringBuilder discarded$4 = var14.append(param1[var11]);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (var12 == 0) {
                                continue L9;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      StringBuilder discarded$5 = var7.append(param2.substring(var8));
                      break L11;
                    }
                    stackOut_38_0 = var7.toString();
                    stackIn_39_0 = stackOut_38_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("tj.K(").append(param0).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L17;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L17;
            }
          }
          L18: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L18;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L18;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
        }
        return stackIn_39_0;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                fe discarded$2 = tj.a(118, 80);
                break L1;
              }
            }
            stackOut_2_0 = gn.field_e.a(param0, "", -1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("tj.Q(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, byte param1) {
        sc.a(false, false, param0);
        field_t = null;
    }

    final void f(byte param0) {
        ve var2 = null;
        int var2_int = 0;
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_42_0 = 0;
        byte stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_41_0 = 0;
        byte stackOut_41_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        boolean stackOut_71_0 = false;
        byte stackOut_83_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        L0: {
          L1: {
            var5 = ArcanistsMulti.field_G ? 1 : 0;
            if (null == ((tj) this).field_h) {
              break L1;
            } else {
              if (null == ((tj) this).d((byte) 119)) {
                return;
              } else {
                L2: {
                  if (!((tj) this).field_j) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((tj) this).field_h.b(12623);
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var3 == null) {
                            break L5;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_7_0 = -1;
                            stackOut_7_1 = ~((tj) this).field_E[var4];
                            stackIn_17_0 = stackOut_7_0;
                            stackIn_17_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (var5 != 0) {
                              L6: while (true) {
                                if (stackIn_17_0 >= stackIn_17_1) {
                                  break L4;
                                } else {
                                  stackOut_18_0 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                                  stackOut_18_1 = -1;
                                  stackIn_85_0 = stackOut_18_0;
                                  stackIn_85_1 = stackOut_18_1;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L7: {
                                      L8: {
                                        if (stackIn_19_0 != stackIn_19_1) {
                                          break L8;
                                        } else {
                                          ((tj) this).field_p = ((tj) this).field_p + 1;
                                          if (var5 == 0) {
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (250 <= ((tj) this).field_s.field_d) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (((tj) this).field_E[((tj) this).field_p] == 0) {
                                          ve discarded$7 = this.a(1, 85, ((tj) this).field_p);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (0 == ((tj) this).field_E[((tj) this).field_p]) {
                                          var3 = new pg();
                                          var3.field_e = (long)((tj) this).field_p;
                                          ((tj) this).field_h.b(var3, -1);
                                          var2_int = 0;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      ((tj) this).field_p = ((tj) this).field_p + 1;
                                      if (var5 == 0) {
                                        break L7;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    stackOut_16_0 = ((tj) this).field_p;
                                    stackOut_16_1 = ((tj) this).field_k.field_b.length;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L12: {
                                if (stackIn_8_0 == stackIn_8_1) {
                                  ve discarded$8 = this.a(1, 96, var4);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  if (((tj) this).field_E[var4] != 0) {
                                    break L14;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var3.a(true);
                                break L13;
                              }
                              var3 = ((tj) this).field_h.a(0);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L15: while (true) {
                          stackOut_135_0 = ((tj) this).field_p;
                          stackOut_135_1 = ((tj) this).field_k.field_b.length;
                          stackIn_133_0 = stackOut_135_0;
                          stackIn_133_1 = stackOut_135_1;
                          if (stackIn_133_0 >= stackIn_133_1) {
                            break L4;
                          } else {
                            stackOut_131_0 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                            stackOut_131_1 = -1;
                            stackIn_85_0 = stackOut_131_0;
                            stackIn_85_1 = stackOut_131_1;
                            stackIn_132_0 = stackOut_131_0;
                            stackIn_132_1 = stackOut_131_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_132_0 = stackIn_132_0;
                              stackOut_132_1 = stackIn_132_1;
                              stackIn_129_0 = stackOut_132_0;
                              stackIn_129_1 = stackOut_132_1;
                              L16: {
                                if (stackIn_129_0 != stackIn_129_1) {
                                  break L16;
                                } else {
                                  ((tj) this).field_p = ((tj) this).field_p + 1;
                                  if (var5 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (250 <= ((tj) this).field_s.field_d) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (((tj) this).field_E[((tj) this).field_p] == 0) {
                                  ve discarded$9 = this.a(1, 85, ((tj) this).field_p);
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (0 == ((tj) this).field_E[((tj) this).field_p]) {
                                  var3 = new pg();
                                  var3.field_e = (long)((tj) this).field_p;
                                  ((tj) this).field_h.b(var3, -1);
                                  var2_int = 0;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((tj) this).field_p = ((tj) this).field_p + 1;
                              if (var5 == 0) {
                                continue L15;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (var2_int != 0) {
                          ((tj) this).field_p = 0;
                          ((tj) this).field_j = false;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L21: {
                  if (((tj) this).field_l) {
                    break L21;
                  } else {
                    ((tj) this).field_h = null;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L21;
                    }
                  }
                }
                var2_int = 1;
                var3 = ((tj) this).field_h.b(12623);
                L22: while (true) {
                  L23: {
                    L24: {
                      if (var3 == null) {
                        break L24;
                      } else {
                        var4 = (int)var3.field_e;
                        stackOut_41_0 = 1;
                        stackOut_41_1 = ((tj) this).field_E[var4];
                        stackIn_51_0 = stackOut_41_0;
                        stackIn_51_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var5 != 0) {
                          L25: while (true) {
                            if (stackIn_51_0 >= stackIn_51_1) {
                              break L23;
                            } else {
                              stackOut_52_0 = -1;
                              stackOut_52_1 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                              stackIn_85_0 = stackOut_52_0;
                              stackIn_85_1 = stackOut_52_1;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                L26: {
                                  L27: {
                                    if (stackIn_53_0 != stackIn_53_1) {
                                      break L27;
                                    } else {
                                      ((tj) this).field_p = ((tj) this).field_p + 1;
                                      if (var5 == 0) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L28: {
                                    if (!((tj) this).field_B.b(-21)) {
                                      break L28;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L23;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if (1 != ((tj) this).field_E[((tj) this).field_p]) {
                                      ve discarded$10 = this.a(2, 61, ((tj) this).field_p);
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (((tj) this).field_E[((tj) this).field_p] == 1) {
                                      break L30;
                                    } else {
                                      var3 = new pg();
                                      var3.field_e = (long)((tj) this).field_p;
                                      ((tj) this).field_h.b(var3, -1);
                                      var2_int = 0;
                                      break L30;
                                    }
                                  }
                                  ((tj) this).field_p = ((tj) this).field_p + 1;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L23;
                                  }
                                }
                                stackOut_50_0 = ~((tj) this).field_k.field_b.length;
                                stackOut_50_1 = ~((tj) this).field_p;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                continue L25;
                              }
                            }
                          }
                        } else {
                          L31: {
                            if (stackIn_42_0 == stackIn_42_1) {
                              break L31;
                            } else {
                              ve discarded$11 = this.a(2, -114, var4);
                              break L31;
                            }
                          }
                          L32: {
                            L33: {
                              if (((tj) this).field_E[var4] != 1) {
                                break L33;
                              } else {
                                var3.a(true);
                                if (var5 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var2_int = 0;
                            break L32;
                          }
                          var3 = ((tj) this).field_h.a(0);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    L34: while (true) {
                      stackOut_110_0 = ~((tj) this).field_k.field_b.length;
                      stackOut_110_1 = ~((tj) this).field_p;
                      stackIn_108_0 = stackOut_110_0;
                      stackIn_108_1 = stackOut_110_1;
                      if (stackIn_108_0 >= stackIn_108_1) {
                        break L23;
                      } else {
                        stackOut_106_0 = -1;
                        stackOut_106_1 = ~((tj) this).field_k.field_b[((tj) this).field_p];
                        stackIn_85_0 = stackOut_106_0;
                        stackIn_85_1 = stackOut_106_1;
                        stackIn_107_0 = stackOut_106_0;
                        stackIn_107_1 = stackOut_106_1;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          stackOut_107_0 = stackIn_107_0;
                          stackOut_107_1 = stackIn_107_1;
                          stackIn_104_0 = stackOut_107_0;
                          stackIn_104_1 = stackOut_107_1;
                          L35: {
                            if (stackIn_104_0 != stackIn_104_1) {
                              break L35;
                            } else {
                              ((tj) this).field_p = ((tj) this).field_p + 1;
                              if (var5 == 0) {
                                continue L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L36: {
                            if (!((tj) this).field_B.b(-21)) {
                              break L36;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L23;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (1 != ((tj) this).field_E[((tj) this).field_p]) {
                              ve discarded$12 = this.a(2, 61, ((tj) this).field_p);
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (((tj) this).field_E[((tj) this).field_p] == 1) {
                              break L38;
                            } else {
                              var3 = new pg();
                              var3.field_e = (long)((tj) this).field_p;
                              ((tj) this).field_h.b(var3, -1);
                              var2_int = 0;
                              break L38;
                            }
                          }
                          ((tj) this).field_p = ((tj) this).field_p + 1;
                          if (var5 == 0) {
                            continue L34;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  if (var2_int == 0) {
                    break L1;
                  } else {
                    ((tj) this).field_p = 0;
                    ((tj) this).field_l = false;
                    break L1;
                  }
                }
              }
            }
          }
          L39: {
            L40: {
              if (!((tj) this).field_z) {
                break L40;
              } else {
                if (~((tj) this).field_r >= ~qj.b(-26572)) {
                  var2 = (ve) (Object) ((tj) this).field_n.a(10);
                  L41: while (true) {
                    L42: {
                      if (var2 == null) {
                        break L42;
                      } else {
                        stackOut_71_0 = var2.field_p;
                        stackIn_84_0 = stackOut_71_0 ? 1 : 0;
                        stackIn_72_0 = stackOut_71_0;
                        if (var5 != 0) {
                          break L39;
                        } else {
                          L43: {
                            L44: {
                              if (!stackIn_72_0) {
                                break L44;
                              } else {
                                if (var5 == 0) {
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L45: {
                              if (!var2.field_n) {
                                break L45;
                              } else {
                                if (!var2.field_q) {
                                  throw new RuntimeException();
                                } else {
                                  var2.a(true);
                                  if (var5 == 0) {
                                    break L43;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                            var2.field_n = true;
                            break L43;
                          }
                          var2 = (ve) (Object) ((tj) this).field_n.c(-87);
                          if (var5 == 0) {
                            continue L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                    }
                    ((tj) this).field_r = qj.b(-26572) - -1000L;
                    break L40;
                  }
                } else {
                  break L40;
                }
              }
            }
            stackOut_83_0 = param0;
            stackIn_84_0 = stackOut_83_0;
            break L39;
          }
          stackOut_84_0 = stackIn_84_0;
          stackOut_84_1 = 54;
          stackIn_85_0 = stackOut_84_0;
          stackIn_85_1 = stackOut_84_1;
          break L0;
        }
        L46: {
          if (stackIn_85_0 >= stackIn_85_1) {
            break L46;
          } else {
            int discarded$13 = ((tj) this).a(15, (byte) -128);
            break L46;
          }
        }
    }

    final jk d(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((tj) this).field_k) {
          return ((tj) this).field_k;
        } else {
          L0: {
            if (((tj) this).field_x == null) {
              if (!((tj) this).field_B.c((byte) -66)) {
                ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((tj) this).field_x.field_p) {
            var5 = ((tj) this).field_x.c(-42);
            var2 = var5;
            if (param0 > 74) {
              L1: {
                L2: {
                  if (((tj) this).field_x instanceof ea) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          ((tj) this).field_k = new jk(var5, ((tj) this).field_q, ((tj) this).field_w);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = decompiledCaughtException;
                        ((tj) this).field_B.a((byte) 0);
                        ((tj) this).field_k = null;
                        if (((tj) this).field_B.c((byte) -71)) {
                          break L4;
                        } else {
                          ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                          if (var4 != 0) {
                            break L4;
                          } else {
                            return null;
                          }
                        }
                      }
                      ((tj) this).field_x = null;
                      return null;
                    }
                    if (null != ((tj) this).field_D) {
                      ea discarded$1 = ((tj) this).field_s.a(((tj) this).field_i, 93, var5, ((tj) this).field_D);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((tj) this).field_k = new jk(var5, ((tj) this).field_q, ((tj) this).field_w);
                      if (((tj) this).field_v != ((tj) this).field_k.field_g) {
                        throw new RuntimeException();
                      } else {
                        break L5;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((tj) this).field_k = null;
                    if (((tj) this).field_B.c((byte) 52)) {
                      break L6;
                    } else {
                      ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                      if (var4 != 0) {
                        break L6;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((tj) this).field_x = null;
                  return null;
                }
                break L1;
              }
              L7: {
                ((tj) this).field_x = null;
                if (((tj) this).field_F == null) {
                  break L7;
                } else {
                  ((tj) this).field_E = new byte[((tj) this).field_k.field_f];
                  break L7;
                }
              }
              return ((tj) this).field_k;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static void c(int param0) {
        rk.field_O = null;
        qn.field_ob = null;
        mj.field_p = -1;
    }

    private final ve a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        RuntimeException var7 = null;
        Exception var7_ref = null;
        int var7_int = 0;
        byte[] var8_ref_byte__ = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        byte stackIn_45_0 = 0;
        byte stackIn_45_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        byte stackIn_77_0 = 0;
        byte stackIn_77_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        Object stackIn_92_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_76_0 = 0;
        byte stackOut_76_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        Object stackOut_91_0 = null;
        byte stackOut_44_0 = 0;
        byte stackOut_44_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          var4 = (Object) (Object) (ve) (Object) ((tj) this).field_n.a((long)param2, -77);
          if (var4 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (((ve) var4).field_q) {
                break L0;
              } else {
                if (!((ve) var4).field_p) {
                  break L0;
                } else {
                  ((ve) var4).a(true);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (0 != param0) {
                L3: {
                  if (param0 != 1) {
                    break L3;
                  } else {
                    if (null == ((tj) this).field_F) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((tj) this).field_s.a(param2, true, ((tj) this).field_F);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 2) {
                  if (null != ((tj) this).field_F) {
                    if (((tj) this).field_E[param2] == -1) {
                      if (!((tj) this).field_B.b(-21)) {
                        var4 = (Object) (Object) ((tj) this).field_B.a(param2, false, ((tj) this).field_i, (byte) -80, (byte) 2);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L4: {
                  if (((tj) this).field_F == null) {
                    break L4;
                  } else {
                    if (((tj) this).field_E[param2] == -1) {
                      break L4;
                    } else {
                      var4 = (Object) (Object) ((tj) this).field_s.a(((tj) this).field_F, param2, -6833);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (!((tj) this).field_B.c((byte) -91)) {
                  var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                  if (var11 == 0) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            ((tj) this).field_n.a((pg) var4, true, (long)param2);
            break L1;
          }
        }
        if (!((ve) var4).field_p) {
          var6 = 103 / ((param1 - -54) / 43);
          var5 = ((ve) var4).c(-74);
          if (var4 instanceof ea) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var5.length <= 2) {
                      break L6;
                    } else {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, var5.length + -2);
                      var7_int = (int)co.field_g.getValue();
                      if (var7_int != ((tj) this).field_k.field_h[param2]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          L8: {
                            if (((tj) this).field_k.field_k == null) {
                              break L8;
                            } else {
                              if (null == ((tj) this).field_k.field_k[param2]) {
                                break L8;
                              } else {
                                var8_ref_byte__ = ((tj) this).field_k.field_k[param2];
                                var9 = nn.a(-2 + var5.length, (byte) -93, var5, 0);
                                var10 = 0;
                                L9: while (true) {
                                  if (64 <= var10) {
                                    break L8;
                                  } else {
                                    stackOut_76_0 = var9[var10];
                                    stackOut_76_1 = var8_ref_byte__[var10];
                                    stackIn_82_0 = stackOut_76_0;
                                    stackIn_82_1 = stackOut_76_1;
                                    stackIn_77_0 = stackOut_76_0;
                                    stackIn_77_1 = stackOut_76_1;
                                    if (var11 != 0) {
                                      break L7;
                                    } else {
                                      if (stackIn_77_0 != stackIn_77_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var10++;
                                        if (var11 == 0) {
                                          continue L9;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_81_0 = (var5[var5.length + -2] & 255) << 8;
                          stackOut_81_1 = 255 & var5[-1 + var5.length];
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          break L7;
                        }
                        var8 = stackIn_82_0 + stackIn_82_1;
                        if (~var8 == ~(((tj) this).field_k.field_y[param2] & 65535)) {
                          L10: {
                            if (((tj) this).field_E[param2] == 1) {
                              break L10;
                            } else {
                              L11: {
                                if (((tj) this).field_E[param2] != 0) {
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              ((tj) this).field_E[param2] = (byte) 1;
                              break L10;
                            }
                          }
                          L12: {
                            if (!((ve) var4).field_q) {
                              ((ve) var4).a(true);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          stackOut_91_0 = var4;
                          stackIn_92_0 = stackOut_91_0;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L13: {
                var7_ref = (Exception) (Object) decompiledCaughtException;
                ((tj) this).field_E[param2] = (byte) -1;
                ((ve) var4).a(true);
                if (((ve) var4).field_q) {
                  if (!((tj) this).field_B.c((byte) 67)) {
                    var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                    ((tj) this).field_n.a((pg) var4, true, (long)param2);
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              return null;
            }
            return (ve) (Object) stackIn_92_0;
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (var5.length > 2) {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, -2 + var5.length);
                      var7_int = (int)co.field_g.getValue();
                      if (((tj) this).field_k.field_h[param2] != var7_int) {
                        throw new RuntimeException();
                      } else {
                        L16: {
                          if (((tj) this).field_k.field_k == null) {
                            break L16;
                          } else {
                            if (((tj) this).field_k.field_k[param2] == null) {
                              break L16;
                            } else {
                              var8_ref_byte__ = ((tj) this).field_k.field_k[param2];
                              var9 = nn.a(var5.length - 2, (byte) -93, var5, 0);
                              var10 = 0;
                              L17: while (true) {
                                if (var10 >= 64) {
                                  break L16;
                                } else {
                                  stackOut_44_0 = var9[var10];
                                  stackOut_44_1 = var8_ref_byte__[var10];
                                  stackIn_59_0 = stackOut_44_0;
                                  stackIn_59_1 = stackOut_44_1;
                                  stackIn_45_0 = stackOut_44_0;
                                  stackIn_45_1 = stackOut_44_1;
                                  if (var11 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L14;
                                  } else {
                                    if (stackIn_45_0 != stackIn_45_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var10++;
                                      if (var11 == 0) {
                                        continue L17;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((tj) this).field_B.field_i = 0;
                        ((tj) this).field_B.field_o = 0;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var7 = (RuntimeException) (Object) decompiledCaughtException;
              ((tj) this).field_B.a((byte) 0);
              ((ve) var4).a(true);
              if (((ve) var4).field_q) {
                L18: {
                  if (!((tj) this).field_B.c((byte) 16)) {
                    var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                    ((tj) this).field_n.a((pg) var4, true, (long)param2);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L19: {
              L20: {
                if (decompiledRegionSelector0 == 0) {
                  break L20;
                } else {
                  var5[var5.length - 2] = (byte)(((tj) this).field_k.field_y[param2] >>> 8);
                  var5[-1 + var5.length] = (byte)((tj) this).field_k.field_y[param2];
                  if (((tj) this).field_F == null) {
                    break L19;
                  } else {
                    ea discarded$1 = ((tj) this).field_s.a(param2, 115, var5, ((tj) this).field_F);
                    stackOut_58_0 = -2;
                    stackOut_58_1 = ~((tj) this).field_E[param2];
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    break L20;
                  }
                }
              }
              if (stackIn_59_0 != stackIn_59_1) {
                ((tj) this).field_E[param2] = (byte) 1;
                break L19;
              } else {
                break L19;
              }
            }
            L21: {
              if (((ve) var4).field_q) {
                break L21;
              } else {
                ((ve) var4).a(true);
                break L21;
              }
            }
            return (ve) var4;
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, boolean param1) {
        ve var3 = this.a(0, 55, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c(-108);
        var3.a(param1);
        return var4;
    }

    public static void b(int param0) {
        field_A = null;
        field_u = null;
        field_o = null;
        field_t = null;
        field_y = null;
    }

    final int a(int param0, byte param1) {
        ve var3 = (ve) (Object) ((tj) this).field_n.a((long)param0, -43);
        if (param1 < 119) {
            ((tj) this).f((byte) -99);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.e((byte) -121);
    }

    tj(int param0, be param1, be param2, lk param3, pa param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
        ((tj) this).field_n = new di(16);
        ((tj) this).field_p = 0;
        ((tj) this).field_m = new vn();
        ((tj) this).field_r = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((tj) this).field_F = param1;
                ((tj) this).field_i = param0;
                if (((tj) this).field_F != null) {
                  break L2;
                } else {
                  ((tj) this).field_j = false;
                  if (!ArcanistsMulti.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((tj) this).field_j = true;
              ((tj) this).field_h = new vn();
              break L1;
            }
            L3: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((tj) this).field_z = stackIn_7_1 != 0;
              ((tj) this).field_D = param2;
              ((tj) this).field_v = param7;
              ((tj) this).field_s = param4;
              ((tj) this).field_w = param6;
              ((tj) this).field_q = param5;
              ((tj) this).field_B = param3;
              if (((tj) this).field_D == null) {
                break L4;
              } else {
                ((tj) this).field_x = (ve) (Object) ((tj) this).field_s.a(((tj) this).field_D, ((tj) this).field_i, -6833);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("tj.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> is offering a rematch.";
        field_C = 9;
    }
}
