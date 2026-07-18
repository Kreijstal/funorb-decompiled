/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb extends gn {
    private int field_k;
    static String field_h;
    private int field_p;
    static String field_f;
    private ko field_j;
    private int field_q;
    private int field_r;
    private int field_e;
    hd[] field_i;
    private ut field_l;
    int field_n;
    static java.security.SecureRandom field_g;
    private String[] field_o;
    private int field_m;

    abstract void a(byte param0, int param1, int param2);

    final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_39_0 = 0;
        hd stackIn_40_0 = null;
        hd stackIn_41_0 = null;
        hd stackIn_43_0 = null;
        hd stackIn_45_0 = null;
        hd stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        hd stackOut_39_0 = null;
        hd stackOut_40_0 = null;
        hd stackOut_41_0 = null;
        hd stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        hd stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == -16536) {
              L1: {
                ((jb) this).a(3, param1);
                ((jb) this).field_j.a(param0 ^ 4642, this.a(true, us.field_j, wt.field_x), this.a(true, kf.field_Eb, dn.field_yb));
                if (((jb) this).field_n != 0) {
                  break L1;
                } else {
                  if (0 != ((jb) this).field_m) {
                    break L1;
                  } else {
                    wh discarded$2 = sp.c(((jb) this).a(false), -104);
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (((jb) this).field_n != 0) {
                    break L3;
                  } else {
                    L4: {
                      int fieldTemp$3 = ((jb) this).field_m + 1;
                      ((jb) this).field_m = ((jb) this).field_m + 1;
                      if (~fieldTemp$3 <= ~(kh.field_q.length + -1)) {
                        ((jb) this).field_n = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((jb) this).field_q = kh.field_q[((jb) this).field_m];
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (((jb) this).field_n == 1) {
                    break L5;
                  } else {
                    if (2 == ((jb) this).field_n) {
                      L6: {
                        ((jb) this).field_j.field_e = -1;
                        if (((jb) this).field_m > 0) {
                          ((jb) this).field_m = ((jb) this).field_m - 2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((jb) this).field_q = (((jb) this).field_m << 1827437548) / kh.field_q.length;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var3_int = 0;
                L7: while (true) {
                  L8: {
                    if (~((jb) this).field_i.length >= ~var3_int) {
                      break L8;
                    } else {
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L9: {
                          if (~var3_int != ~((jb) this).field_j.field_e) {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            break L9;
                          } else {
                            stackOut_36_0 = 1;
                            stackIn_39_0 = stackOut_36_0;
                            break L9;
                          }
                        }
                        L10: {
                          L11: {
                            var4 = stackIn_39_0;
                            ((jb) this).field_i[var3_int].b(0, param1);
                            stackOut_39_0 = ((jb) this).field_i[var3_int];
                            stackIn_45_0 = stackOut_39_0;
                            stackIn_40_0 = stackOut_39_0;
                            if (!((jb) this).field_i[var3_int].field_lb) {
                              break L11;
                            } else {
                              stackOut_40_0 = (hd) (Object) stackIn_40_0;
                              stackIn_45_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (var4 == 0) {
                                break L11;
                              } else {
                                stackOut_41_0 = (hd) (Object) stackIn_41_0;
                                stackIn_43_0 = stackOut_41_0;
                                stackOut_43_0 = (hd) (Object) stackIn_43_0;
                                stackOut_43_1 = 1;
                                stackIn_46_0 = stackOut_43_0;
                                stackIn_46_1 = stackOut_43_1;
                                break L10;
                              }
                            }
                          }
                          stackOut_45_0 = (hd) (Object) stackIn_45_0;
                          stackOut_45_1 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          break L10;
                        }
                        L12: {
                          stackIn_46_0.field_gb = stackIn_46_1 != 0;
                          if (1 != ((jb) this).field_i[var3_int].field_sb) {
                            break L12;
                          } else {
                            ((jb) this).a(118, var3_int);
                            ((jb) this).e(param0 ^ -3410);
                            break L12;
                          }
                        }
                        L13: {
                          if (null == ((jb) this).field_o) {
                            break L13;
                          } else {
                            if (null == ((jb) this).field_o[var3_int]) {
                              break L13;
                            } else {
                              if (!((jb) this).field_i[var3_int].field_gb) {
                                break L13;
                              } else {
                                qd.a((byte) -67, ((jb) this).field_o[var3_int]);
                                break L13;
                              }
                            }
                          }
                        }
                        var3_int++;
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ((jb) this).field_q = 4096;
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "jb.FA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0, int param1);

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_f = null;
            field_h = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "jb.DA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        hd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = ((jb) this).field_m << -1379118556;
              if (var2_int > 100) {
                var2_int = 100;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((jb) this).field_r = 11;
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  on.a(0, 0, 640, 480, 0, var2_int);
                  if (((jb) this).field_q == 4096) {
                    break L5;
                  } else {
                    var3 = ((jb) this).field_e * ((jb) this).field_q >> -495378324;
                    var4_int = ((jb) this).field_r * ((jb) this).field_q >> 1054928844;
                    var5 = -var3 + 640 >> 263412481;
                    iw.a(73, ((jb) this).field_l);
                    var6 = -var4_int + 480 >> -102734239;
                    this.a(32, 0, 0);
                    var7 = 0;
                    L6: while (true) {
                      L7: {
                        L8: {
                          if (~var7 <= ~((jb) this).field_i.length) {
                            break L8;
                          } else {
                            var8 = ((jb) this).field_i[var7];
                            var9 = var8.field_s;
                            var8.field_s = var8.field_s - ((jb) this).field_p;
                            var10 = var8.field_J;
                            var8.field_J = var8.field_J - ((jb) this).field_k;
                            var8.b(0, false);
                            var8.a(74, false);
                            var8.field_J = var10;
                            var8.field_s = var9;
                            var7++;
                            if (var11 != 0) {
                              break L7;
                            } else {
                              if (var11 == 0) {
                                continue L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        ta.e(119);
                        var7 = (((jb) this).field_m << 1665782282) / kh.field_q.length;
                        break L7;
                      }
                      L9: {
                        if (var7 > 256) {
                          var7 = 256;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ((jb) this).field_l.d(var5, var6, var3, var4_int, var7);
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.a(32, ((jb) this).field_p, ((jb) this).field_k);
                var3 = 0;
                L10: while (true) {
                  if (~((jb) this).field_i.length >= ~var3) {
                    break L4;
                  } else {
                    var4 = ((jb) this).field_i[var3];
                    var4.a(100, false);
                    var3++;
                    if (var11 != 0) {
                      break L3;
                    } else {
                      if (var11 == 0) {
                        continue L10;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "jb.AA(" + param0 + ')');
        }
    }

    abstract void a(int param0, boolean param1);

    abstract int a(byte param0);

    final void a(String[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((jb) this).field_o = param0;
              if (param1 == 90) {
                break L1;
              } else {
                ((jb) this).field_p = -12;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jb.IA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    boolean a(int param0, byte param1, char param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (1 == ((jb) this).field_n) {
              L1: {
                L2: {
                  if (param0 == 13) {
                    break L2;
                  } else {
                    L3: {
                      ((jb) this).field_j.a(0, true);
                      if (((jb) this).field_j.field_e != -1) {
                        L4: while (true) {
                          if (((jb) this).field_i[((jb) this).field_j.field_e].field_lb) {
                            break L3;
                          } else {
                            ((jb) this).field_j.field_e = (((jb) this).field_j.field_e + 1) % ((jb) this).field_j.field_a;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (((jb) this).field_j.field_e < 0) {
                      break L1;
                    } else {
                      if (((jb) this).field_j.c(-1)) {
                        ((jb) this).a(114, ((jb) this).field_j.field_e);
                        ((jb) this).e(19910);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                ((jb) this).e(19910);
                break L1;
              }
              L5: {
                if (param1 == -21) {
                  break L5;
                } else {
                  ((jb) this).b(45, true);
                  break L5;
                }
              }
              stackOut_27_0 = 1;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "jb.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_28_0 != 0;
    }

    abstract int a(boolean param0);

    private final int a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_2_0 = 0;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 0;
            if (param0) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (((jb) this).field_i.length <= var4_int) {
                      break L3;
                    } else {
                      var5 = ((jb) this).field_i[var4_int].field_q;
                      var6 = ((jb) this).field_i[var4_int].field_mb;
                      var7 = ((jb) this).field_i[var4_int].field_F;
                      var8 = ((jb) this).field_i[var4_int].field_T;
                      stackOut_5_0 = ~param2;
                      stackIn_24_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_6_0 > ~var7) {
                            break L4;
                          } else {
                            if (var7 - -var5 <= param2) {
                              break L4;
                            } else {
                              if (~param1 > ~var8) {
                                break L4;
                              } else {
                                if (param1 < var8 + var6) {
                                  stackOut_20_0 = var4_int;
                                  stackIn_21_0 = stackOut_20_0;
                                  return stackIn_21_0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = -1;
                  stackIn_24_0 = stackOut_23_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = -67;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "jb.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_24_0;
    }

    abstract int b(int param0);

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -31268) {
                break L1;
              } else {
                ((jb) this).field_q = 38;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((jb) this).field_n != 2) {
                  break L3;
                } else {
                  if (((jb) this).field_m > 0) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "jb.BA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void e(int param0) {
        try {
            ((jb) this).field_n = 2;
            if (param0 != 19910) {
                ((jb) this).field_m = 118;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "jb.HA(" + param0 + ')');
        }
    }

    final void a(int param0, String[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ((jb) this).field_n = 0;
              if (param2 == 1054928844) {
                break L1;
              } else {
                ((jb) this).a(46, true);
                break L1;
              }
            }
            ((jb) this).field_q = 0;
            ((jb) this).field_e = ((jb) this).b(-1379118556);
            ((jb) this).field_r = ((jb) this).a((byte) 115);
            ((jb) this).field_k = 480 + -((jb) this).field_r >> 1655863937;
            ((jb) this).field_p = -((jb) this).field_e + 640 >> 5157505;
            ((jb) this).field_l = new ut(((jb) this).field_e, ((jb) this).field_r);
            ((jb) this).field_i = new hd[param1.length];
            var4_int = ((jb) this).field_i.length;
            var5 = -(95 * var4_int) - 5 * (var4_int + -1) + 640 >> -926467135;
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~((jb) this).field_i.length >= ~var6) {
                    break L4;
                  } else {
                    param1[var6] = param1[var6].toLowerCase();
                    ((jb) this).field_i[var6] = eo.a(param1[var6], 7126504, (hu) (Object) un.field_d, 90, false);
                    var7 = ((jb) this).field_k + ((jb) this).field_r + (-((jb) this).field_i[var6].field_mb + -10);
                    ((jb) this).field_i[var6].field_s = 100 * var6 + var5;
                    ((jb) this).field_i[var6].field_J = var7;
                    var6++;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((jb) this).field_j = new ko(((jb) this).field_i.length);
                ((jb) this).field_j.field_e = param0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("jb.GA(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            pt.a(param1 + ((jb) this).field_e, param0 + -22946, param1, param2 + ((jb) this).field_r, param2);
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((jb) this).field_e <= var4_int) {
                    break L3;
                  } else {
                    mk.field_a.d(var4_int + param1, param2 - -((jb) this).field_r - 480);
                    var4_int++;
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
                cq.field_j.e(param1 - 10, 15 + param2, cq.field_j.field_o * 2 / 3, 2 * cq.field_j.field_v / 3, param0);
                ((jb) this).a((byte) -29, param1, param2);
                on.c(param1, param2, ((jb) this).field_e, ((jb) this).field_r, 2, 65793);
                ta.e(124);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "jb.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    jb() {
        ((jb) this).field_q = 0;
        ((jb) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "(<%0> players want to join)";
        field_h = "Kickabout is also availible as an application on <col=ffff00>Facebook</col>.";
    }
}
