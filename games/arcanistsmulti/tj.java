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
        if (param1 != -21402) {
            tj.b(68);
        }
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
        pg stackIn_14_0 = null;
        pg stackIn_15_0 = null;
        pg stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pg stackOut_13_0 = null;
        pg stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        pg stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (((tj) this).field_h != null) {
          if (((tj) this).d((byte) 122) == null) {
            return;
          } else {
            if (!param0) {
              var2 = ((tj) this).field_m.b(12623);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var3 = (int)var2.field_e;
                      if (var3 < 0) {
                        break L2;
                      } else {
                        if (((tj) this).field_k.field_f <= var3) {
                          break L2;
                        } else {
                          if (((tj) this).field_k.field_b[var3] != 0) {
                            L3: {
                              if (0 == ((tj) this).field_E[var3]) {
                                ve discarded$2 = this.a(1, -103, var3);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            L4: {
                              if (((tj) this).field_E[var3] != -1) {
                                break L4;
                              } else {
                                ve discarded$3 = this.a(2, 62, var3);
                                break L4;
                              }
                            }
                            if (((tj) this).field_E[var3] != 1) {
                              break L1;
                            } else {
                              var2.a(true);
                              break L1;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L5: {
                      stackOut_13_0 = (pg) var2;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (param0) {
                        stackOut_15_0 = (pg) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L5;
                      } else {
                        stackOut_14_0 = (pg) (Object) stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L5;
                      }
                    }
                    ((pg) (Object) stackIn_16_0).a(stackIn_16_1 != 0);
                    break L1;
                  }
                  var2 = ((tj) this).field_m.a(0);
                  continue L0;
                }
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
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6 = param2.indexOf("<%", var5);
              if (var6 >= 0) {
                var5 = var6 + 2;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!e.a(30, param2.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var13 = param2.substring(var6 + 2, var5);
                  var7_ref = var13;
                  int discarded$5 = 10;
                  if (!fi.a((CharSequence) (Object) var7_ref)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = dc.a((CharSequence) (Object) var13, 126);
                        var4 = var4 + (param1[var8].length() + -var5 - -var6);
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = -96 % ((param0 - 51) / 62);
                var7 = new StringBuilder(var4);
                var8 = 0;
                var5 = 0;
                L4: while (true) {
                  var9 = param2.indexOf("<%", var5);
                  if (var9 < 0) {
                    StringBuilder discarded$6 = var7.append(param2.substring(var8));
                    stackOut_24_0 = var7.toString();
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    var5 = var9 - -2;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
                          break L6;
                        } else {
                          if (!e.a(30, param2.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var10 = param2.substring(2 + var9, var5);
                      int discarded$7 = 10;
                      if (fi.a((CharSequence) (Object) var10)) {
                        if (var5 >= var3_int) {
                          continue L4;
                        } else {
                          if (param2.charAt(var5) == 62) {
                            var5++;
                            var11 = dc.a((CharSequence) (Object) var10, 127);
                            StringBuilder discarded$8 = var7.append(param2.substring(var8, var9));
                            var8 = var5;
                            StringBuilder discarded$9 = var7.append(param1[var11]);
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      } else {
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("tj.K(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_25_0;
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, byte param1) {
        sc.a(false, false, param0);
        if (param1 >= -93) {
            field_t = null;
        }
    }

    final void f(byte param0) {
        ve var2 = null;
        int var2_int = 0;
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = ArcanistsMulti.field_G ? 1 : 0;
              if (null == ((tj) this).field_h) {
                break L2;
              } else {
                if (null == ((tj) this).d((byte) 119)) {
                  return;
                } else {
                  if (!((tj) this).field_j) {
                    if (((tj) this).field_l) {
                      var2_int = 1;
                      var3 = ((tj) this).field_h.b(12623);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (((tj) this).field_k.field_b.length <= ((tj) this).field_p) {
                                break L5;
                              } else {
                                if (((tj) this).field_k.field_b[((tj) this).field_p] != 0) {
                                  if (!((tj) this).field_B.b(-21)) {
                                    L6: {
                                      if (1 != ((tj) this).field_E[((tj) this).field_p]) {
                                        ve discarded$5 = this.a(2, 61, ((tj) this).field_p);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (((tj) this).field_E[((tj) this).field_p] == 1) {
                                        break L7;
                                      } else {
                                        var3 = new pg();
                                        var3.field_e = (long)((tj) this).field_p;
                                        ((tj) this).field_h.b(var3, -1);
                                        var2_int = 0;
                                        break L7;
                                      }
                                    }
                                    ((tj) this).field_p = ((tj) this).field_p + 1;
                                    continue L4;
                                  } else {
                                    var2_int = 0;
                                    break L5;
                                  }
                                } else {
                                  ((tj) this).field_p = ((tj) this).field_p + 1;
                                  continue L4;
                                }
                              }
                            }
                            if (var2_int == 0) {
                              break L2;
                            } else {
                              ((tj) this).field_p = 0;
                              ((tj) this).field_l = false;
                              break L2;
                            }
                          }
                        } else {
                          L8: {
                            var4 = (int)var3.field_e;
                            if (1 == ((tj) this).field_E[var4]) {
                              break L8;
                            } else {
                              ve discarded$6 = this.a(2, -114, var4);
                              break L8;
                            }
                          }
                          L9: {
                            if (((tj) this).field_E[var4] != 1) {
                              var2_int = 0;
                              break L9;
                            } else {
                              var3.a(true);
                              break L9;
                            }
                          }
                          var3 = ((tj) this).field_h.a(0);
                          continue L3;
                        }
                      }
                    } else {
                      ((tj) this).field_h = null;
                      break L2;
                    }
                  } else {
                    var2_int = 1;
                    var3 = ((tj) this).field_h.b(12623);
                    L10: while (true) {
                      if (var3 == null) {
                        L11: while (true) {
                          L12: {
                            if (((tj) this).field_p >= ((tj) this).field_k.field_b.length) {
                              break L12;
                            } else {
                              if (((tj) this).field_k.field_b[((tj) this).field_p] != 0) {
                                if (250 <= ((tj) this).field_s.field_d) {
                                  var2_int = 0;
                                  break L12;
                                } else {
                                  L13: {
                                    if (((tj) this).field_E[((tj) this).field_p] == 0) {
                                      ve discarded$7 = this.a(1, 85, ((tj) this).field_p);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (0 == ((tj) this).field_E[((tj) this).field_p]) {
                                      var3 = new pg();
                                      var3.field_e = (long)((tj) this).field_p;
                                      ((tj) this).field_h.b(var3, -1);
                                      var2_int = 0;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  ((tj) this).field_p = ((tj) this).field_p + 1;
                                  continue L11;
                                }
                              } else {
                                ((tj) this).field_p = ((tj) this).field_p + 1;
                                continue L11;
                              }
                            }
                          }
                          if (var2_int != 0) {
                            ((tj) this).field_p = 0;
                            ((tj) this).field_j = false;
                            break L2;
                          } else {
                            if (!((tj) this).field_z) {
                              break L0;
                            } else {
                              if (~((tj) this).field_r >= ~qj.b(-26572)) {
                                var2 = (ve) (Object) ((tj) this).field_n.a(10);
                                L15: while (true) {
                                  if (var2 == null) {
                                    break L1;
                                  } else {
                                    L16: {
                                      if (!var2.field_p) {
                                        if (!var2.field_n) {
                                          var2.field_n = true;
                                          break L16;
                                        } else {
                                          if (!var2.field_q) {
                                            throw new RuntimeException();
                                          } else {
                                            var2.a(true);
                                            break L16;
                                          }
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var2 = (ve) (Object) ((tj) this).field_n.c(-87);
                                    continue L15;
                                  }
                                }
                              } else {
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        L17: {
                          var4 = (int)var3.field_e;
                          if (((tj) this).field_E[var4] == 0) {
                            ve discarded$8 = this.a(1, 96, var4);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (((tj) this).field_E[var4] != 0) {
                            var3.a(true);
                            break L18;
                          } else {
                            var2_int = 0;
                            break L18;
                          }
                        }
                        var3 = ((tj) this).field_h.a(0);
                        continue L10;
                      }
                    }
                  }
                }
              }
            }
            if (!((tj) this).field_z) {
              break L0;
            } else {
              if (~((tj) this).field_r >= ~qj.b(-26572)) {
                var2 = (ve) (Object) ((tj) this).field_n.a(10);
                L19: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L20: {
                      if (!var2.field_p) {
                        if (!var2.field_n) {
                          var2.field_n = true;
                          break L20;
                        } else {
                          if (!var2.field_q) {
                            throw new RuntimeException();
                          } else {
                            var2.a(true);
                            break L20;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                    var2 = (ve) (Object) ((tj) this).field_n.c(-87);
                    continue L19;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          ((tj) this).field_r = qj.b(-26572) - -1000L;
          break L0;
        }
        L21: {
          if (param0 >= 54) {
            break L21;
          } else {
            int discarded$9 = ((tj) this).a(15, (byte) -128);
            break L21;
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
                if (((tj) this).field_x instanceof ea) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((tj) this).field_k = new jk(var5, ((tj) this).field_q, ((tj) this).field_w);
                        if (((tj) this).field_v != ((tj) this).field_k.field_g) {
                          throw new RuntimeException();
                        } else {
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      ((tj) this).field_k = null;
                      if (((tj) this).field_B.c((byte) 52)) {
                        ((tj) this).field_x = null;
                        break L3;
                      } else {
                        ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                        break L3;
                      }
                    }
                    return null;
                  }
                  break L1;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((tj) this).field_k = new jk(var5, ((tj) this).field_q, ((tj) this).field_w);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((tj) this).field_B.a((byte) 0);
                      ((tj) this).field_k = null;
                      if (((tj) this).field_B.c((byte) -71)) {
                        ((tj) this).field_x = null;
                        break L5;
                      } else {
                        ((tj) this).field_x = (ve) (Object) ((tj) this).field_B.a(((tj) this).field_i, true, 255, (byte) -80, (byte) 0);
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (null != ((tj) this).field_D) {
                    ea discarded$1 = ((tj) this).field_s.a(((tj) this).field_i, 93, var5, ((tj) this).field_D);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                ((tj) this).field_x = null;
                if (((tj) this).field_F == null) {
                  break L6;
                } else {
                  ((tj) this).field_E = new byte[((tj) this).field_k.field_f];
                  break L6;
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

    final static void c() {
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
        int var8 = 0;
        byte[] var8_ref_byte__ = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_86_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_85_0 = null;
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
                if (param0 != 1) {
                  if (param0 == 2) {
                    if (null != ((tj) this).field_F) {
                      if (((tj) this).field_E[param2] == -1) {
                        if (!((tj) this).field_B.b(-21)) {
                          var4 = (Object) (Object) ((tj) this).field_B.a(param2, false, ((tj) this).field_i, (byte) -80, (byte) 2);
                          break L2;
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
                  if (null == ((tj) this).field_F) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((tj) this).field_s.a(param2, true, ((tj) this).field_F);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (((tj) this).field_F == null) {
                    break L3;
                  } else {
                    if (((tj) this).field_E[param2] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((tj) this).field_s.a(((tj) this).field_F, param2, -6833);
                      break L2;
                    }
                  }
                }
                if (!((tj) this).field_B.c((byte) -91)) {
                  var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                  break L2;
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
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, var5.length + -2);
                      var7_int = (int)co.field_g.getValue();
                      if (var7_int != ((tj) this).field_k.field_h[param2]) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((tj) this).field_k.field_k == null) {
                            break L6;
                          } else {
                            if (null == ((tj) this).field_k.field_k[param2]) {
                              break L6;
                            } else {
                              var8_ref_byte__ = ((tj) this).field_k.field_k[param2];
                              var9 = nn.a(-2 + var5.length, (byte) -93, var5, 0);
                              var12 = 0;
                              var10 = var12;
                              L7: while (true) {
                                if (64 <= var12) {
                                  break L6;
                                } else {
                                  if (var9[var12] != var8_ref_byte__[var12]) {
                                    throw new RuntimeException();
                                  } else {
                                    var12++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var8 = ((var5[var5.length + -2] & 255) << 8) + (255 & var5[-1 + var5.length]);
                        if (var8 == (((tj) this).field_k.field_y[param2] & 65535)) {
                          L8: {
                            if (((tj) this).field_E[param2] == 1) {
                              break L8;
                            } else {
                              L9: {
                                if (((tj) this).field_E[param2] != 0) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((tj) this).field_E[param2] = (byte) 1;
                              break L8;
                            }
                          }
                          L10: {
                            if (!((ve) var4).field_q) {
                              ((ve) var4).a(true);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          stackOut_85_0 = var4;
                          stackIn_86_0 = stackOut_85_0;
                          break L4;
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
              L11: {
                var7_ref = (Exception) (Object) decompiledCaughtException;
                ((tj) this).field_E[param2] = (byte) -1;
                ((ve) var4).a(true);
                if (((ve) var4).field_q) {
                  if (!((tj) this).field_B.c((byte) 67)) {
                    var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                    ((tj) this).field_n.a((pg) var4, true, (long)param2);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (ve) (Object) stackIn_86_0;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (var5.length > 2) {
                      co.field_g.reset();
                      co.field_g.update(var5, 0, -2 + var5.length);
                      var7_int = (int)co.field_g.getValue();
                      if (((tj) this).field_k.field_h[param2] != var7_int) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (((tj) this).field_k.field_k == null) {
                            break L14;
                          } else {
                            if (((tj) this).field_k.field_k[param2] == null) {
                              break L14;
                            } else {
                              var8_ref_byte__ = ((tj) this).field_k.field_k[param2];
                              var9 = nn.a(var5.length - 2, (byte) -93, var5, 0);
                              var10 = 0;
                              L15: while (true) {
                                if (var10 >= 64) {
                                  break L14;
                                } else {
                                  if (var9[var10] != var8_ref_byte__[var10]) {
                                    throw new RuntimeException();
                                  } else {
                                    var10++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((tj) this).field_B.field_i = 0;
                        ((tj) this).field_B.field_o = 0;
                        break L12;
                      }
                    } else {
                      break L13;
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
                L16: {
                  if (!((tj) this).field_B.c((byte) 16)) {
                    var4 = (Object) (Object) ((tj) this).field_B.a(param2, true, ((tj) this).field_i, (byte) -80, (byte) 2);
                    ((tj) this).field_n.a((pg) var4, true, (long)param2);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L17: {
              var5[var5.length - 2] = (byte)(((tj) this).field_k.field_y[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((tj) this).field_k.field_y[param2];
              if (((tj) this).field_F == null) {
                break L17;
              } else {
                ea discarded$1 = ((tj) this).field_s.a(param2, 115, var5, ((tj) this).field_F);
                if (((tj) this).field_E[param2] != 1) {
                  ((tj) this).field_E[param2] = (byte) 1;
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            L18: {
              if (((ve) var4).field_q) {
                break L18;
              } else {
                ((ve) var4).a(true);
                break L18;
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
        if (param0 < 65) {
            tj.a(true, (byte) -36);
        }
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
              ((tj) this).field_F = param1;
              ((tj) this).field_i = param0;
              if (((tj) this).field_F != null) {
                ((tj) this).field_j = true;
                ((tj) this).field_h = new vn();
                break L1;
              } else {
                ((tj) this).field_j = false;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((tj) this).field_z = stackIn_7_1 != 0;
              ((tj) this).field_D = param2;
              ((tj) this).field_v = param7;
              ((tj) this).field_s = param4;
              ((tj) this).field_w = param6;
              ((tj) this).field_q = param5;
              ((tj) this).field_B = param3;
              if (((tj) this).field_D == null) {
                break L3;
              } else {
                ((tj) this).field_x = (ve) (Object) ((tj) this).field_s.a(((tj) this).field_D, ((tj) this).field_i, -6833);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
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
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
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
