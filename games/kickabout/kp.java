/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    int field_j;
    int[][][] field_e;
    static String[] field_g;
    int field_k;
    int field_b;
    static ut field_m;
    static String field_i;
    boolean field_d;
    int[] field_c;
    int field_o;
    int field_n;
    static String field_a;
    int field_l;
    int field_f;
    int field_h;

    final static void a(int param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var2 = (Object) (Object) (ii) (Object) il.field_a.g(24009);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    te.a(param0, (ii) var2, (byte) -112);
                    var2 = (Object) (Object) (ii) (Object) il.field_a.c(33);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2 = (Object) (Object) ap.field_j.g(24009);
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2 == null) {
                      break L6;
                    } else {
                      lb.a((byte) -105, param0);
                      var2 = (Object) (Object) ap.field_j.c(33);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param1 <= -36) {
                    break L5;
                  } else {
                    field_g = null;
                    return;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw nb.a((Throwable) var2, "kp.C(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        he var1_ref = null;
        qb var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var1_ref = (he) (Object) rp.field_B.g(24009);
            L1: while (true) {
              L2: {
                L3: {
                  if (var1_ref == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var1_ref.field_Jb;
                    stackIn_29_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > 0) {
                          var1_ref.field_Jb = var1_ref.field_Jb - 1;
                          if (var1_ref.field_Jb != 0) {
                            break L4;
                          } else {
                            var1_ref.field_Mb = 0;
                            if (var1_ref.h(-13356)) {
                              var1_ref.c((byte) -109);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      var1_ref = (he) (Object) rp.field_B.c(33);
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_ref2 = (qb) (Object) kq.field_yb.g(24009);
                L5: while (true) {
                  L6: {
                    if (var1_ref2 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (0 >= var1_ref2.field_Db) {
                          break L7;
                        } else {
                          var1_ref2.field_Db = var1_ref2.field_Db - 1;
                          if (var1_ref2.field_Db == 0) {
                            var1_ref2.field_Ab = 0;
                            if (!var1_ref2.b(-7)) {
                              break L7;
                            } else {
                              var1_ref2.c((byte) -109);
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var1_ref2 = (qb) (Object) kq.field_yb.c(33);
                      if (var3 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var1_ref = (he) (Object) lw.field_d.g(24009);
                  L8: while (true) {
                    L9: {
                      if (var1_ref == null) {
                        break L9;
                      } else {
                        stackOut_21_0 = var1_ref.field_Jb;
                        stackIn_29_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var3 != 0) {
                          break L2;
                        } else {
                          L10: {
                            if (stackIn_22_0 <= 0) {
                              break L10;
                            } else {
                              var1_ref.field_Jb = var1_ref.field_Jb - 1;
                              if (var1_ref.field_Jb != 0) {
                                break L10;
                              } else {
                                var1_ref.field_Mb = 0;
                                if (var1_ref.h(-13356)) {
                                  var1_ref.c((byte) -109);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          var1_ref = (he) (Object) lw.field_d.c(33);
                          if (var3 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = -15;
                    stackIn_29_0 = stackOut_28_0;
                    break L2;
                  }
                }
              }
              var2 = stackIn_29_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "kp.D(" + -121 + 41);
        }
    }

    final void a(byte param0, ml param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -96) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            ((kp) this).field_c = new int[2];
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int >= 2) {
                    break L4;
                  } else {
                    ((kp) this).field_c[var3_int] = param1.j((byte) -94);
                    var3_int++;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  stackOut_8_0 = this;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (param1.h((byte) -111) != 1) {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L5;
                  } else {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L5;
                  }
                }
                ((kp) this).field_d = stackIn_11_1 != 0;
                ((kp) this).field_f = param1.j((byte) -123);
                ((kp) this).field_j = param1.h((byte) -126);
                ((kp) this).field_b = param1.h((byte) -125);
                break L3;
              }
              L6: {
                if (5 != ((kp) this).field_f) {
                  break L6;
                } else {
                  ((kp) this).field_o = param1.j((byte) -96);
                  ((kp) this).field_k = param1.j((byte) -104);
                  break L6;
                }
              }
              L7: {
                if (((kp) this).field_f != 4) {
                  break L7;
                } else {
                  ((kp) this).field_h = param1.a((byte) 81) - 1;
                  ((kp) this).field_n = param1.h((byte) -112);
                  ((kp) this).field_l = param1.h((byte) -111);
                  var3_int = 0;
                  L8: while (true) {
                    if (var3_int >= 2) {
                      break L7;
                    } else {
                      if (var5 == 0) {
                        var4 = 0;
                        L9: while (true) {
                          L10: {
                            if (var4 >= 5) {
                              var3_int++;
                              break L10;
                            } else {
                              ((kp) this).field_e[var3_int][var4][0] = param1.h((byte) -110);
                              ((kp) this).field_e[var3_int][var4][1] = param1.h((byte) -121);
                              var4++;
                              if (var5 != 0) {
                                break L10;
                              } else {
                                continue L9;
                              }
                            }
                          }
                          continue L8;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("kp.B(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
    }

    final void a(boolean param0, kp param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        boolean stackOut_34_0 = false;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            ((kp) this).field_k = param1.field_k;
            ((kp) this).field_o = param1.field_o;
            ((kp) this).field_b = param1.field_b;
            ((kp) this).field_f = param1.field_f;
            ((kp) this).field_h = param1.field_h;
            ((kp) this).field_j = param1.field_j;
            ((kp) this).field_c = new int[param1.field_c.length];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((kp) this).field_c.length <= var3_int) {
                    break L3;
                  } else {
                    ((kp) this).field_c[var3_int] = param1.field_c[var3_int];
                    var3_int++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((kp) this).field_d = param1.field_d;
                var3_int = param1.field_n << 16;
                break L2;
              }
              L4: {
                var4 = param1.field_l << 16;
                var5 = -((kp) this).field_n + var3_int;
                var6 = -((kp) this).field_l + var4;
                var7 = var5 >> 4;
                if (Math.abs(var5 >> 16) >= 50) {
                  ((kp) this).field_n = var3_int;
                  break L4;
                } else {
                  ((kp) this).field_n = ((kp) this).field_n + var7;
                  if (var11 == 0) {
                    break L4;
                  } else {
                    ((kp) this).field_n = var3_int;
                    break L4;
                  }
                }
              }
              L5: {
                var8 = var6 >> 4;
                if (Math.abs(var6 >> 16) >= 50) {
                  ((kp) this).field_l = var4;
                  break L5;
                } else {
                  ((kp) this).field_l = ((kp) this).field_l + var8;
                  if (var11 == 0) {
                    break L5;
                  } else {
                    ((kp) this).field_l = var4;
                    break L5;
                  }
                }
              }
              var9 = 0;
              L6: while (true) {
                stackOut_18_0 = ~var9;
                stackOut_18_1 = -3;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (stackIn_19_0 <= stackIn_19_1) {
                        break L9;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_35_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var11 != 0) {
                          break L8;
                        } else {
                          var10 = stackIn_21_0;
                          L10: while (true) {
                            if (var10 >= 5) {
                              var9++;
                              if (var11 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            } else {
                              var4 = param1.field_e[var9][var10][1] << 16;
                              var3_int = param1.field_e[var9][var10][0] << 16;
                              var5 = var3_int + -((kp) this).field_e[var9][var10][0];
                              var6 = -((kp) this).field_e[var9][var10][1] + var4;
                              var8 = var6 >> 4;
                              var7 = var5 >> 4;
                              stackOut_23_0 = 20;
                              stackOut_23_1 = Math.abs(var5 >> 16);
                              stackIn_19_0 = stackOut_23_0;
                              stackIn_19_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var11 != 0) {
                                continue L7;
                              } else {
                                L11: {
                                  L12: {
                                    if (stackIn_24_0 > stackIn_24_1) {
                                      break L12;
                                    } else {
                                      ((kp) this).field_e[var9][var10][0] = var3_int;
                                      if (var11 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  ((kp) this).field_e[var9][var10][0] = ((kp) this).field_e[var9][var10][0] + var7;
                                  break L11;
                                }
                                L13: {
                                  L14: {
                                    if (Math.abs(var6 >> 16) >= 20) {
                                      break L14;
                                    } else {
                                      ((kp) this).field_e[var9][var10][1] = ((kp) this).field_e[var9][var10][1] + var8;
                                      if (var11 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  ((kp) this).field_e[var9][var10][1] = var4;
                                  break L13;
                                }
                                var10++;
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_34_0 = param0;
                    stackIn_35_0 = stackOut_34_0 ? 1 : 0;
                    break L8;
                  }
                  if (stackIn_35_0 == 0) {
                    break L0;
                  } else {
                    ((kp) this).field_e = null;
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("kp.F(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L15;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L15;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          field_m = null;
          field_a = null;
          field_g = null;
          field_m = null;
          field_i = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_m = null;
          field_i = null;
          return;
        }
    }

    final void b(boolean param0, kp param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_17_0 = false;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            ((kp) this).field_o = param1.field_o;
            ((kp) this).field_k = param1.field_k;
            ((kp) this).field_h = param1.field_h;
            ((kp) this).field_f = param1.field_f;
            ((kp) this).field_c = new int[param1.field_c.length];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((kp) this).field_c.length <= var3_int) {
                    break L3;
                  } else {
                    ((kp) this).field_c[var3_int] = param1.field_c[var3_int];
                    var3_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((kp) this).field_l = param1.field_l << 16;
                ((kp) this).field_n = param1.field_n << 16;
                ((kp) this).field_d = param1.field_d;
                break L2;
              }
              var3_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (2 <= var3_int) {
                      break L6;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_18_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        var4 = stackIn_10_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var4 >= 5) {
                                break L9;
                              } else {
                                ((kp) this).field_e[var3_int][var4][0] = param1.field_e[var3_int][var4][0] << 16;
                                ((kp) this).field_e[var3_int][var4][1] = param1.field_e[var3_int][var4][1] << 16;
                                var4++;
                                if (var5 != 0) {
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var3_int++;
                            break L8;
                          }
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  ((kp) this).field_b = param1.field_b;
                  stackOut_17_0 = param0;
                  stackIn_18_0 = stackOut_17_0 ? 1 : 0;
                  break L5;
                }
                if (stackIn_18_0 == 0) {
                  ((kp) this).field_j = param1.field_j;
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("kp.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    public kp() {
        ((kp) this).field_e = new int[2][5][2];
        ((kp) this).field_c = new int[]{-1, -1};
        ((kp) this).field_j = 0;
        ((kp) this).field_o = -2;
        ((kp) this).field_k = -1;
        ((kp) this).field_b = 0;
        ((kp) this).field_n = lj.a(448, false);
        ((kp) this).field_l = lj.a(672, false);
        ((kp) this).field_f = -1;
        ((kp) this).field_h = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for other players.";
        field_i = "(1 player wants to join)";
    }
}
