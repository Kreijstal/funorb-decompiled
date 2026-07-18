/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ow {
    private qh field_q;
    static ut[] field_m;
    static int field_E;
    private int field_D;
    private kc field_v;
    private bi field_l;
    static String field_p;
    private int field_h;
    static ae field_u;
    private byte[] field_x;
    private eb field_w;
    private byte[] field_r;
    static int field_s;
    static double field_C;
    private qh field_k;
    private vv field_B;
    private int field_j;
    static String[] field_o;
    private kl field_z;
    private tf field_t;
    private boolean field_g;
    private boolean field_n;
    private int field_i;
    private tf field_F;
    private long field_y;
    private boolean field_A;

    final int a(int param0, int param1) {
        vv var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (vv) (Object) ((wm) this).field_v.a(true, (long)param1);
            if (var3 == null) {
              L1: {
                if (param0 == 6999) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((wm) this).b(-39, 41);
                  break L1;
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = var3.a(0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3_ref, "wm.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        gn var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 18137) {
              if (null != ((wm) this).field_t) {
                if (((wm) this).a(param0 + -42991) != null) {
                  var2_ref = ((wm) this).field_F.g(24009);
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var2_ref == null) {
                          break L3;
                        } else {
                          var3 = (int)var2_ref.field_a;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  if (var3 < 0) {
                                    break L6;
                                  } else {
                                    if (~((wm) this).field_z.field_d >= ~var3) {
                                      break L6;
                                    } else {
                                      if (((wm) this).field_z.field_i[var3] != 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                var2_ref.c((byte) -109);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                if (((wm) this).field_r[var3] == 0) {
                                  vv discarded$2 = this.a(1, var3, (byte) -30);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (-1 != ((wm) this).field_r[var3]) {
                                  break L8;
                                } else {
                                  vv discarded$3 = this.a(2, var3, (byte) -30);
                                  break L8;
                                }
                              }
                              if (((wm) this).field_r[var3] == 1) {
                                var2_ref.c((byte) -109);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var2_ref = ((wm) this).field_F.c(33);
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      break L2;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wm.F(" + param0 + ')');
        }
    }

    final static boolean c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (vg.field_Wb) {
              var1_int = -4 / ((-84 - param0) / 34);
              if (0 != ov.field_b) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "wm.L(" + param0 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static void c(int param0) {
        try {
            if (param0 != 1) {
                field_u = null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wm.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((wm) this).field_k == null) {
              return;
            } else {
              L1: {
                ((wm) this).field_g = true;
                if (((wm) this).field_t == null) {
                  ((wm) this).field_t = new tf();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 >= 28) {
                  break L2;
                } else {
                  ((wm) this).field_n = true;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wm.G(" + param0 + ')');
        }
    }

    final kl a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kl stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_48_0 = null;
        kl stackIn_57_0 = null;
        RuntimeException decompiledCaughtException = null;
        kl stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_47_0 = null;
        kl stackOut_56_0 = null;
        Object stackOut_14_0 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (((wm) this).field_z != null) {
              stackOut_4_0 = ((wm) this).field_z;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (null == ((wm) this).field_B) {
                  if (!((wm) this).field_l.a(25533)) {
                    ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (kl) (Object) stackIn_11_0;
                  }
                } else {
                  break L1;
                }
              }
              if (!((wm) this).field_B.field_p) {
                L2: {
                  L3: {
                    var2_array = ((wm) this).field_B.b(12802);
                    if (((wm) this).field_B instanceof hi) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (null != var2_array) {
                            ((wm) this).field_z = new kl(var2_array, ((wm) this).field_D, ((wm) this).field_x);
                            break L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var3 = decompiledCaughtException;
                            ((wm) this).field_l.c(-65);
                            ((wm) this).field_z = null;
                            if (!((wm) this).field_l.a(param0 + 50387)) {
                              break L6;
                            } else {
                              ((wm) this).field_B = null;
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                          break L5;
                        }
                        stackOut_28_0 = null;
                        stackIn_29_0 = stackOut_28_0;
                        return (kl) (Object) stackIn_29_0;
                      }
                      if (((wm) this).field_q != null) {
                        hi discarded$1 = ((wm) this).field_w.a(((wm) this).field_h, ((wm) this).field_q, var2_array, (byte) 11);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L7: {
                      if (null != var2_array) {
                        ((wm) this).field_z = new kl(var2_array, ((wm) this).field_D, ((wm) this).field_x);
                        if (~((wm) this).field_z.field_p == ~((wm) this).field_j) {
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var3 = decompiledCaughtException;
                        ((wm) this).field_z = null;
                        if (((wm) this).field_l.a(param0 + 50387)) {
                          break L9;
                        } else {
                          ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((wm) this).field_B = null;
                      break L8;
                    }
                    stackOut_47_0 = null;
                    stackIn_48_0 = stackOut_47_0;
                    return (kl) (Object) stackIn_48_0;
                  }
                  break L2;
                }
                L10: {
                  if (param0 == -24854) {
                    break L10;
                  } else {
                    ((wm) this).b(113);
                    break L10;
                  }
                }
                L11: {
                  if (null != ((wm) this).field_k) {
                    ((wm) this).field_r = new byte[((wm) this).field_z.field_d];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((wm) this).field_B = null;
                stackOut_56_0 = ((wm) this).field_z;
                stackIn_57_0 = stackOut_56_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (kl) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wm.B(" + param0 + ')');
        }
        return stackIn_57_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gn var3 = null;
        vv var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_9_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((wm) this).field_t != null) {
                  if (null != ((wm) this).a(-24854)) {
                    L3: {
                      if (!((wm) this).field_n) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((wm) this).field_t.g(24009);
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (null == var3) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_a;
                                  stackOut_9_0 = ((wm) this).field_r[var4];
                                  stackIn_22_0 = stackOut_9_0;
                                  stackIn_10_0 = stackOut_9_0;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_22_0 <= ((wm) this).field_i) {
                                        break L6;
                                      } else {
                                        stackOut_23_0 = ((wm) this).field_z.field_i[((wm) this).field_i];
                                        stackIn_47_0 = stackOut_23_0;
                                        stackIn_24_0 = stackOut_23_0;
                                        if (var5 != 0) {
                                          break L5;
                                        } else {
                                          stackOut_24_0 = stackIn_24_0;
                                          stackIn_26_0 = stackOut_24_0;
                                          L9: {
                                            L10: {
                                              if (stackIn_26_0 != 0) {
                                                break L10;
                                              } else {
                                                ((wm) this).field_i = ((wm) this).field_i + 1;
                                                if (var5 == 0) {
                                                  break L9;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            L11: {
                                              if (((wm) this).field_w.field_e >= 250) {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L6;
                                                } else {
                                                  break L11;
                                                }
                                              } else {
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              if (0 != ((wm) this).field_r[((wm) this).field_i]) {
                                                break L12;
                                              } else {
                                                vv discarded$4 = this.a(1, ((wm) this).field_i, (byte) -30);
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (0 == ((wm) this).field_r[((wm) this).field_i]) {
                                                var3 = new gn();
                                                var3.field_a = (long)((wm) this).field_i;
                                                var2_int = 0;
                                                ((wm) this).field_t.a(var3, 3);
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            ((wm) this).field_i = ((wm) this).field_i + 1;
                                            if (var5 == 0) {
                                              break L9;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          stackOut_21_0 = ((wm) this).field_z.field_i.length;
                                          stackIn_22_0 = stackOut_21_0;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (stackIn_10_0 != 0) {
                                        break L14;
                                      } else {
                                        vv discarded$5 = this.a(1, var4, (byte) -30);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (((wm) this).field_r[var4] == 0) {
                                          break L16;
                                        } else {
                                          var3.c((byte) -109);
                                          if (var5 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var2_int = 0;
                                      break L15;
                                    }
                                    var3 = ((wm) this).field_t.c(33);
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L17: while (true) {
                                stackOut_21_0 = ((wm) this).field_z.field_i.length;
                                stackIn_22_0 = stackOut_21_0;
                                if (stackIn_22_0 <= ((wm) this).field_i) {
                                  break L6;
                                } else {
                                  stackOut_23_0 = ((wm) this).field_z.field_i[((wm) this).field_i];
                                  stackIn_47_0 = stackOut_23_0;
                                  stackIn_24_0 = stackOut_23_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    stackOut_24_0 = stackIn_24_0;
                                    stackIn_26_0 = stackOut_24_0;
                                    L18: {
                                      if (stackIn_26_0 != 0) {
                                        break L18;
                                      } else {
                                        ((wm) this).field_i = ((wm) this).field_i + 1;
                                        if (var5 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (((wm) this).field_w.field_e >= 250) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (0 != ((wm) this).field_r[((wm) this).field_i]) {
                                        break L20;
                                      } else {
                                        vv discarded$4 = this.a(1, ((wm) this).field_i, (byte) -30);
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (0 == ((wm) this).field_r[((wm) this).field_i]) {
                                        var3 = new gn();
                                        var3.field_a = (long)((wm) this).field_i;
                                        var2_int = 0;
                                        ((wm) this).field_t.a(var3, 3);
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    ((wm) this).field_i = ((wm) this).field_i + 1;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_46_0 = var2_int;
                            stackIn_47_0 = stackOut_46_0;
                            break L5;
                          }
                          L22: {
                            if (stackIn_47_0 == 0) {
                              break L22;
                            } else {
                              ((wm) this).field_i = 0;
                              ((wm) this).field_n = false;
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L23: {
                      if (!((wm) this).field_g) {
                        break L23;
                      } else {
                        var2_int = 1;
                        var3 = ((wm) this).field_t.g(24009);
                        L24: while (true) {
                          L25: {
                            L26: {
                              if (var3 == null) {
                                break L26;
                              } else {
                                var4 = (int)var3.field_a;
                                stackOut_56_0 = -2;
                                stackOut_56_1 = ~((wm) this).field_r[var4];
                                stackIn_69_0 = stackOut_56_0;
                                stackIn_69_1 = stackOut_56_1;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                if (var5 != 0) {
                                  L27: while (true) {
                                    if (stackIn_69_0 >= stackIn_69_1) {
                                      break L25;
                                    } else {
                                      stackOut_70_0 = -1;
                                      stackOut_70_1 = ~((wm) this).field_z.field_i[((wm) this).field_i];
                                      stackIn_101_0 = stackOut_70_0;
                                      stackIn_101_1 = stackOut_70_1;
                                      stackIn_71_0 = stackOut_70_0;
                                      stackIn_71_1 = stackOut_70_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_71_0 = stackIn_71_0;
                                        stackOut_71_1 = stackIn_71_1;
                                        stackIn_73_0 = stackOut_71_0;
                                        stackIn_73_1 = stackOut_71_1;
                                        L28: {
                                          L29: {
                                            if (stackIn_73_0 != stackIn_73_1) {
                                              break L29;
                                            } else {
                                              ((wm) this).field_i = ((wm) this).field_i + 1;
                                              if (var5 == 0) {
                                                break L28;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          L30: {
                                            if (((wm) this).field_l.d(10770)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L25;
                                              } else {
                                                break L30;
                                              }
                                            } else {
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            if (((wm) this).field_r[((wm) this).field_i] == 1) {
                                              break L31;
                                            } else {
                                              vv discarded$6 = this.a(2, ((wm) this).field_i, (byte) -30);
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((wm) this).field_r[((wm) this).field_i] != 1) {
                                              var3 = new gn();
                                              var3.field_a = (long)((wm) this).field_i;
                                              var2_int = 0;
                                              ((wm) this).field_t.a(var3, 3);
                                              break L32;
                                            } else {
                                              break L32;
                                            }
                                          }
                                          ((wm) this).field_i = ((wm) this).field_i + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        stackOut_68_0 = ((wm) this).field_i;
                                        stackOut_68_1 = ((wm) this).field_z.field_i.length;
                                        stackIn_69_0 = stackOut_68_0;
                                        stackIn_69_1 = stackOut_68_1;
                                        continue L27;
                                      }
                                    }
                                  }
                                } else {
                                  L33: {
                                    if (stackIn_57_0 == stackIn_57_1) {
                                      break L33;
                                    } else {
                                      vv discarded$7 = this.a(2, var4, (byte) -30);
                                      break L33;
                                    }
                                  }
                                  L34: {
                                    L35: {
                                      if (1 != ((wm) this).field_r[var4]) {
                                        break L35;
                                      } else {
                                        var3.c((byte) -109);
                                        if (var5 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L34;
                                  }
                                  var3 = ((wm) this).field_t.c(33);
                                  if (var5 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            L36: while (true) {
                              stackOut_68_0 = ((wm) this).field_i;
                              stackOut_68_1 = ((wm) this).field_z.field_i.length;
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              if (stackIn_69_0 >= stackIn_69_1) {
                                break L25;
                              } else {
                                stackOut_70_0 = -1;
                                stackOut_70_1 = ~((wm) this).field_z.field_i[((wm) this).field_i];
                                stackIn_101_0 = stackOut_70_0;
                                stackIn_101_1 = stackOut_70_1;
                                stackIn_71_0 = stackOut_70_0;
                                stackIn_71_1 = stackOut_70_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_71_0 = stackIn_71_0;
                                  stackOut_71_1 = stackIn_71_1;
                                  stackIn_73_0 = stackOut_71_0;
                                  stackIn_73_1 = stackOut_71_1;
                                  L37: {
                                    if (stackIn_73_0 != stackIn_73_1) {
                                      break L37;
                                    } else {
                                      ((wm) this).field_i = ((wm) this).field_i + 1;
                                      if (var5 == 0) {
                                        continue L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  L38: {
                                    if (((wm) this).field_l.d(10770)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L38;
                                      }
                                    } else {
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    if (((wm) this).field_r[((wm) this).field_i] == 1) {
                                      break L39;
                                    } else {
                                      vv discarded$6 = this.a(2, ((wm) this).field_i, (byte) -30);
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (((wm) this).field_r[((wm) this).field_i] != 1) {
                                      var3 = new gn();
                                      var3.field_a = (long)((wm) this).field_i;
                                      var2_int = 0;
                                      ((wm) this).field_t.a(var3, 3);
                                      break L40;
                                    } else {
                                      break L40;
                                    }
                                  }
                                  ((wm) this).field_i = ((wm) this).field_i + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            if (var2_int != 0) {
                              ((wm) this).field_g = false;
                              ((wm) this).field_i = 0;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    ((wm) this).field_t = null;
                    break L2;
                  } else {
                    return;
                  }
                } else {
                  break L2;
                }
              }
              stackOut_100_0 = 15;
              stackOut_100_1 = (-84 - param0) / 37;
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              break L1;
            }
            L42: {
              var2_int = stackIn_101_0 % stackIn_101_1;
              if (!((wm) this).field_A) {
                break L42;
              } else {
                if (~nj.a(-58) <= ~((wm) this).field_y) {
                  var3_ref = (vv) (Object) ((wm) this).field_v.b(0);
                  L43: while (true) {
                    L44: {
                      if (var3_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var3_ref.field_p) {
                              break L45;
                            } else {
                              L46: {
                                if (!var3_ref.field_n) {
                                  break L46;
                                } else {
                                  if (!var3_ref.field_q) {
                                    throw new RuntimeException();
                                  } else {
                                    var3_ref.c((byte) -109);
                                    if (var5 == 0) {
                                      break L45;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              var3_ref.field_n = true;
                              break L45;
                            }
                          }
                          var3_ref = (vv) (Object) ((wm) this).field_v.a(-1);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((wm) this).field_y = 1000L + nj.a(116);
                    break L42;
                  }
                } else {
                  break L42;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wm.I(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 > -114) {
            return;
        }
        try {
            field_m = null;
            field_u = null;
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wm.M(" + param0 + ')');
        }
    }

    private final vv a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_60_0 = null;
        byte stackIn_78_0 = 0;
        byte stackIn_78_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        Object stackIn_97_0 = null;
        Object stackIn_104_0 = null;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        Object stackIn_136_0 = null;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        Object stackIn_148_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_34_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        Object stackOut_135_0 = null;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        Object stackOut_147_0 = null;
        byte stackOut_77_0 = 0;
        byte stackOut_77_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        Object stackOut_96_0 = null;
        Object stackOut_103_0 = null;
        Object stackOut_59_0 = null;
        Object stackOut_56_0 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (vv) (Object) ((wm) this).field_v.a(true, (long)param1);
              if (null == var4) {
                break L1;
              } else {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (((vv) var4).field_q) {
                    break L1;
                  } else {
                    if (!((vv) var4).field_p) {
                      break L1;
                    } else {
                      ((vv) var4).c((byte) -109);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4) {
                L3: {
                  L4: {
                    if (param0 == 0) {
                      break L4;
                    } else {
                      if (param0 == 1) {
                        if (null != ((wm) this).field_k) {
                          var4 = (Object) (Object) ((wm) this).field_w.a(param2 + 8977, param1, ((wm) this).field_k);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        if (param0 != 2) {
                          throw new RuntimeException();
                        } else {
                          if (((wm) this).field_k == null) {
                            throw new RuntimeException();
                          } else {
                            if (((wm) this).field_r[param1] != -1) {
                              throw new RuntimeException();
                            } else {
                              L5: {
                                if (((wm) this).field_l.d(10770)) {
                                  break L5;
                                } else {
                                  var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, false);
                                  if (var10 == 0) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              stackOut_34_0 = null;
                              stackIn_35_0 = stackOut_34_0;
                              return (vv) (Object) stackIn_35_0;
                            }
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (null == ((wm) this).field_k) {
                        break L7;
                      } else {
                        if (-1 != ((wm) this).field_r[param1]) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (!((wm) this).field_l.a(25533)) {
                      var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    } else {
                      stackOut_50_0 = null;
                      stackIn_51_0 = stackOut_50_0;
                      return (vv) (Object) stackIn_51_0;
                    }
                  }
                  var4 = (Object) (Object) ((wm) this).field_w.a(-913, ((wm) this).field_k, param1);
                  break L3;
                }
                ((wm) this).field_v.a((gn) var4, -73, (long)param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (!((vv) var4).field_p) {
              if (param2 == -30) {
                var5 = ((vv) var4).b(12802);
                if (!(var4 instanceof hi)) {
                  try {
                    L8: {
                      L9: {
                        if (var5 == null) {
                          break L9;
                        } else {
                          if (var5.length <= 2) {
                            break L9;
                          } else {
                            dg.field_b.reset();
                            dg.field_b.update(var5, 0, var5.length - 2);
                            var6_int = (int)dg.field_b.getValue();
                            if (~var6_int == ~((wm) this).field_z.field_c[param1]) {
                              L10: {
                                if (null == ((wm) this).field_z.field_k) {
                                  break L10;
                                } else {
                                  if (null == ((wm) this).field_z.field_k[param1]) {
                                    break L10;
                                  } else {
                                    var7 = ((wm) this).field_z.field_k[param1];
                                    var8 = jj.a(-2 + var5.length, var5, (byte) 80, 0);
                                    var9 = 0;
                                    L11: while (true) {
                                      if (var9 >= 64) {
                                        break L10;
                                      } else {
                                        stackOut_121_0 = ~var7[var9];
                                        stackOut_121_1 = ~var8[var9];
                                        stackIn_140_0 = stackOut_121_0;
                                        stackIn_140_1 = stackOut_121_1;
                                        stackIn_122_0 = stackOut_121_0;
                                        stackIn_122_1 = stackOut_121_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L8;
                                        } else {
                                          if (stackIn_122_0 != stackIn_122_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L11;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              ((wm) this).field_l.field_o = 0;
                              ((wm) this).field_l.field_l = 0;
                              decompiledRegionSelector0 = 1;
                              break L8;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                      ((wm) this).field_l.c(5);
                      ((vv) var4).c((byte) -109);
                      if (!((vv) var4).field_q) {
                        break L12;
                      } else {
                        if (((wm) this).field_l.a(25533)) {
                          break L12;
                        } else {
                          var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                          ((wm) this).field_v.a((gn) var4, param2 + 128, (long)param1);
                          break L12;
                        }
                      }
                    }
                    stackOut_135_0 = null;
                    stackIn_136_0 = stackOut_135_0;
                    return (vv) (Object) stackIn_136_0;
                  }
                  L13: {
                    L14: {
                      if (decompiledRegionSelector0 == 0) {
                        break L14;
                      } else {
                        var5[-2 + var5.length] = (byte)(((wm) this).field_z.field_f[param1] >>> -1666623448);
                        var5[-1 + var5.length] = (byte)((wm) this).field_z.field_f[param1];
                        if (null == ((wm) this).field_k) {
                          break L13;
                        } else {
                          hi discarded$1 = ((wm) this).field_w.a(param1, ((wm) this).field_k, var5, (byte) 66);
                          stackOut_138_0 = ~((wm) this).field_r[param1];
                          stackOut_138_1 = -2;
                          stackIn_140_0 = stackOut_138_0;
                          stackIn_140_1 = stackOut_138_1;
                          break L14;
                        }
                      }
                    }
                    if (stackIn_140_0 != stackIn_140_1) {
                      ((wm) this).field_r[param1] = (byte) 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L15: {
                    if (!((vv) var4).field_q) {
                      ((vv) var4).c((byte) -109);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  stackOut_147_0 = var4;
                  stackIn_148_0 = stackOut_147_0;
                  break L0;
                } else {
                  try {
                    L16: {
                      L17: {
                        if (null == var5) {
                          break L17;
                        } else {
                          if (var5.length > 2) {
                            dg.field_b.reset();
                            dg.field_b.update(var5, 0, -2 + var5.length);
                            var6_int = (int)dg.field_b.getValue();
                            if (((wm) this).field_z.field_c[param1] == var6_int) {
                              L18: {
                                L19: {
                                  if (null == ((wm) this).field_z.field_k) {
                                    break L19;
                                  } else {
                                    if (((wm) this).field_z.field_k[param1] == null) {
                                      break L19;
                                    } else {
                                      var7 = ((wm) this).field_z.field_k[param1];
                                      var8 = jj.a(var5.length - 2, var5, (byte) 69, 0);
                                      var9 = 0;
                                      L20: while (true) {
                                        if (var9 >= 64) {
                                          break L19;
                                        } else {
                                          stackOut_77_0 = var8[var9];
                                          stackOut_77_1 = var7[var9];
                                          stackIn_85_0 = stackOut_77_0;
                                          stackIn_85_1 = stackOut_77_1;
                                          stackIn_78_0 = stackOut_77_0;
                                          stackIn_78_1 = stackOut_77_1;
                                          if (var10 != 0) {
                                            break L18;
                                          } else {
                                            if (stackIn_78_0 != stackIn_78_1) {
                                              throw new RuntimeException();
                                            } else {
                                              var9++;
                                              if (var10 == 0) {
                                                continue L20;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_84_0 = var5[var5.length - 1] & 255;
                                stackOut_84_1 = (var5[var5.length - 2] & 255) << 922689160;
                                stackIn_85_0 = stackOut_84_0;
                                stackIn_85_1 = stackOut_84_1;
                                break L18;
                              }
                              var7_int = stackIn_85_0 + stackIn_85_1;
                              if (~var7_int == ~(((wm) this).field_z.field_f[param1] & 65535)) {
                                L21: {
                                  if (((wm) this).field_r[param1] != 1) {
                                    L22: {
                                      if (((wm) this).field_r[param1] == 0) {
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    ((wm) this).field_r[param1] = (byte) 1;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                L23: {
                                  if (((vv) var4).field_q) {
                                    break L23;
                                  } else {
                                    ((vv) var4).c((byte) -109);
                                    break L23;
                                  }
                                }
                                stackOut_96_0 = var4;
                                stackIn_97_0 = stackOut_96_0;
                                break L16;
                              } else {
                                throw new RuntimeException();
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            break L17;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L24: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      ((wm) this).field_r[param1] = (byte) -1;
                      ((vv) var4).c((byte) -109);
                      if (((vv) var4).field_q) {
                        if (((wm) this).field_l.a(25533)) {
                          break L24;
                        } else {
                          var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                          ((wm) this).field_v.a((gn) var4, -50, (long)param1);
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    stackOut_103_0 = null;
                    stackIn_104_0 = stackOut_103_0;
                    return (vv) (Object) stackIn_104_0;
                  }
                  return (vv) (Object) stackIn_97_0;
                }
              } else {
                stackOut_59_0 = null;
                stackIn_60_0 = stackOut_59_0;
                return (vv) (Object) stackIn_60_0;
              }
            } else {
              stackOut_56_0 = null;
              stackIn_57_0 = stackOut_56_0;
              return (vv) (Object) stackIn_57_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw nb.a((Throwable) var4, "wm.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (vv) (Object) stackIn_148_0;
    }

    final static ut a(byte param0, ut param1, int param2) {
        ut var3 = null;
        RuntimeException var3_ref = null;
        ut stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = new ut(param2, param1.field_v);
              iw.a(-59, var3);
              param1.c(0, 0);
              pt.a(on.field_g, -22914, on.field_g >> -472384991, on.field_f, 0);
              if (param0 < -20) {
                break L1;
              } else {
                boolean discarded$2 = wm.c((byte) 52);
                break L1;
              }
            }
            param1.c(-param1.field_o + on.field_g, 0);
            ta.e(122);
            ta.e(125);
            stackOut_3_0 = (ut) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("wm.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final byte[] b(int param0, int param1) {
        vv var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            var3 = this.a(0, param0, (byte) -30);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                var4 = var3.b(12802);
                if (param1 == 4) {
                  break L1;
                } else {
                  kl discarded$2 = ((wm) this).a(21);
                  break L1;
                }
              }
              var3.c((byte) -109);
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3_ref, "wm.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    wm(int param0, qh param1, qh param2, bi param3, eb param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((wm) this).field_v = new kc(16);
        ((wm) this).field_i = 0;
        ((wm) this).field_F = new tf();
        ((wm) this).field_y = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((wm) this).field_h = param0;
                ((wm) this).field_k = param1;
                if (((wm) this).field_k == null) {
                  break L2;
                } else {
                  ((wm) this).field_n = true;
                  ((wm) this).field_t = new tf();
                  if (Kickabout.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((wm) this).field_n = false;
              break L1;
            }
            L3: {
              ((wm) this).field_A = param8;
              ((wm) this).field_j = param7;
              ((wm) this).field_D = param5;
              ((wm) this).field_w = param4;
              ((wm) this).field_x = param6;
              ((wm) this).field_l = param3;
              ((wm) this).field_q = param2;
              if (null != ((wm) this).field_q) {
                ((wm) this).field_B = (vv) (Object) ((wm) this).field_w.a(-913, ((wm) this).field_q, ((wm) this).field_h);
                break L3;
              } else {
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
            stackOut_10_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Rating";
        field_s = 1;
    }
}
