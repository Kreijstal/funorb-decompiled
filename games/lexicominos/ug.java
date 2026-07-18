/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hf {
    private wb field_i;
    private int field_p;
    private byte[] field_w;
    private byte[] field_g;
    static String[] field_r;
    private int field_n;
    static double field_u;
    private e field_z;
    private int field_j;
    static dg field_q;
    private dl field_B;
    private kl field_C;
    private si field_t;
    static eg field_A;
    private dl field_f;
    private na field_k;
    static java.awt.Canvas field_y;
    private ng field_l;
    private int field_o;
    static int field_m;
    private boolean field_D;
    private boolean field_d;
    static String field_s;
    static long field_x;
    private ng field_v;
    private boolean field_e;
    private long field_h;

    final void b(int param0) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!(null != ((ug) this).field_v)) {
            return;
        }
        if (!(((ug) this).a(false) != null)) {
            return;
        }
        if (param0 > -68) {
            e discarded$0 = ((ug) this).a(true);
        }
        kd var2 = ((ug) this).field_l.a(true);
        while (var2 != null) {
            var3 = (int)var2.field_d;
            if (var3 < 0) {
                var2.b((byte) -122);
            } else {
                if (var3 >= ((ug) this).field_z.field_d) {
                    var2.b((byte) -122);
                } else {
                    if (((ug) this).field_z.field_m[var3] == -1) {
                        var2.b((byte) -122);
                    } else {
                        if (!(-1 != ((ug) this).field_w[var3])) {
                            si discarded$1 = this.a((byte) -128, 1, var3);
                        }
                        if (((ug) this).field_w[var3] == -1) {
                            si discarded$2 = this.a((byte) -91, 2, var3);
                        }
                        if (1 == ((ug) this).field_w[var3]) {
                            var2.b((byte) -118);
                        }
                    }
                }
            }
            var2 = ((ug) this).field_l.f(2);
        }
    }

    final void b(boolean param0) {
        si var2 = null;
        int var2_int = 0;
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (null == ((ug) this).field_v) {
            break L0;
          } else {
            if (null != ((ug) this).a(false)) {
              if (((ug) this).field_D) {
                var2_int = 1;
                var3 = ((ug) this).field_v.a(true);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (((ug) this).field_o >= ((ug) this).field_z.field_m.length) {
                          break L3;
                        } else {
                          if (((ug) this).field_z.field_m[((ug) this).field_o] != 0) {
                            if (((ug) this).field_C.field_c >= 250) {
                              var2_int = 0;
                              break L3;
                            } else {
                              L4: {
                                if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                  break L4;
                                } else {
                                  si discarded$5 = this.a((byte) -88, 1, ((ug) this).field_o);
                                  break L4;
                                }
                              }
                              L5: {
                                if (((ug) this).field_w[((ug) this).field_o] != 0) {
                                  break L5;
                                } else {
                                  var3 = new kd();
                                  var3.field_d = (long)((ug) this).field_o;
                                  var2_int = 0;
                                  ((ug) this).field_v.b(123, var3);
                                  break L5;
                                }
                              }
                              ((ug) this).field_o = ((ug) this).field_o + 1;
                              continue L2;
                            }
                          } else {
                            ((ug) this).field_o = ((ug) this).field_o + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((ug) this).field_o = 0;
                        ((ug) this).field_D = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_d;
                      if (((ug) this).field_w[var4] == 0) {
                        si discarded$6 = this.a((byte) -93, 1, var4);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((ug) this).field_w[var4] == 0) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.b((byte) -116);
                        break L7;
                      }
                    }
                    var3 = ((ug) this).field_v.f(2);
                    continue L1;
                  }
                }
              } else {
                if (((ug) this).field_d) {
                  var2_int = 1;
                  var3 = ((ug) this).field_v.a(true);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((ug) this).field_z.field_m.length <= ((ug) this).field_o) {
                            break L10;
                          } else {
                            if (0 != ((ug) this).field_z.field_m[((ug) this).field_o]) {
                              if (((ug) this).field_i.a(9172)) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L11: {
                                  if (((ug) this).field_w[((ug) this).field_o] != 1) {
                                    si discarded$7 = this.a((byte) -25, 2, ((ug) this).field_o);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (((ug) this).field_w[((ug) this).field_o] == 1) {
                                    break L12;
                                  } else {
                                    var3 = new kd();
                                    var3.field_d = (long)((ug) this).field_o;
                                    ((ug) this).field_v.b(105, var3);
                                    var2_int = 0;
                                    break L12;
                                  }
                                }
                                ((ug) this).field_o = ((ug) this).field_o + 1;
                                continue L9;
                              }
                            } else {
                              ((ug) this).field_o = ((ug) this).field_o + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((ug) this).field_o = 0;
                          ((ug) this).field_d = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_d;
                        if (((ug) this).field_w[var4] != 1) {
                          si discarded$8 = this.a((byte) -56, 2, var4);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (((ug) this).field_w[var4] == 1) {
                          var3.b((byte) -128);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = ((ug) this).field_v.f(2);
                      continue L8;
                    }
                  }
                } else {
                  ((ug) this).field_v = null;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        }
        L15: {
          if (!((ug) this).field_e) {
            break L15;
          } else {
            if (((ug) this).field_h > rf.c(0)) {
              break L15;
            } else {
              var2 = (si) (Object) ((ug) this).field_k.c((byte) -120);
              L16: while (true) {
                if (var2 == null) {
                  ((ug) this).field_h = 1000L + rf.c(0);
                  break L15;
                } else {
                  L17: {
                    if (var2.field_v) {
                      break L17;
                    } else {
                      if (var2.field_r) {
                        if (!var2.field_p) {
                          throw new RuntimeException();
                        } else {
                          var2.b((byte) -122);
                          break L17;
                        }
                      } else {
                        var2.field_r = true;
                        break L17;
                      }
                    }
                  }
                  var2 = (si) (Object) ((ug) this).field_k.a((byte) -91);
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          if (!param0) {
            break L18;
          } else {
            int discarded$9 = ((ug) this).a(15, 40);
            break L18;
          }
        }
    }

    final int a(int param0, int param1) {
        si var3 = (si) (Object) ((ug) this).field_k.a((long)param0, (byte) 96);
        if (!(var3 == null)) {
            return var3.c((byte) 16);
        }
        if (param1 != 1215) {
            return -35;
        }
        return 0;
    }

    final void c(int param0) {
        if (!(null != ((ug) this).field_B)) {
            return;
        }
        if (param0 != 11002) {
            ((ug) this).field_v = null;
        }
        ((ug) this).field_d = true;
        if (!(((ug) this).field_v != null)) {
            ((ug) this).field_v = new ng();
        }
    }

    final e a(boolean param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (((ug) this).field_z == null) {
          L0: {
            if (null != ((ug) this).field_t) {
              break L0;
            } else {
              if (!((ug) this).field_i.e(20)) {
                ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((ug) this).field_t.field_v) {
            L1: {
              var5 = ((ug) this).field_t.d((byte) -125);
              var2 = var5;
              if (((ug) this).field_t instanceof fj) {
                try {
                  L2: {
                    if (var5 != null) {
                      ((ug) this).field_z = new e(var5, ((ug) this).field_p, ((ug) this).field_g);
                      if (((ug) this).field_z.field_s == ((ug) this).field_n) {
                        break L2;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    ((ug) this).field_z = null;
                    if (((ug) this).field_i.e(20)) {
                      ((ug) this).field_t = null;
                      break L3;
                    } else {
                      ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      ((ug) this).field_z = new e(var5, ((ug) this).field_p, ((ug) this).field_g);
                      break L4;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    ((ug) this).field_i.c(-28488);
                    ((ug) this).field_z = null;
                    if (((ug) this).field_i.e(20)) {
                      ((ug) this).field_t = null;
                      break L5;
                    } else {
                      ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                      break L5;
                    }
                  }
                  return null;
                }
                if (null != ((ug) this).field_f) {
                  fj discarded$1 = ((ug) this).field_C.a(var5, ((ug) this).field_j, 1, ((ug) this).field_f);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (null == ((ug) this).field_B) {
                break L6;
              } else {
                ((ug) this).field_w = new byte[((ug) this).field_z.field_d];
                break L6;
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                field_m = 43;
                break L7;
              }
            }
            ((ug) this).field_t = null;
            return ((ug) this).field_z;
          } else {
            return null;
          }
        } else {
          return ((ug) this).field_z;
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 121) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            var5 = bd.field_l;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1_ref, "ug.L(" + param0 + ')');
        }
    }

    final static wj a(sh param0, int param1) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        wj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = param0.a(param1, -117);
            var3 = var4;
            if (var4 != null) {
              stackOut_3_0 = new wj(var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ug.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + true + ')');
        }
        return stackIn_4_0;
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = this.a((byte) -3, 0, param0);
        if (var3 == null) {
            return null;
        }
        if (!param1) {
            ((ug) this).field_e = true;
        }
        byte[] var4 = var3.d((byte) -106);
        var3.b((byte) -116);
        return var4;
    }

    private final si a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var4 = (Object) (Object) (si) (Object) ((ug) this).field_k.a((long)param2, (byte) 107);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (((si) var4).field_p) {
                break L0;
              } else {
                if (!((si) var4).field_v) {
                  break L0;
                } else {
                  ((si) var4).b((byte) -116);
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
              if (param1 == 0) {
                L3: {
                  if (null == ((ug) this).field_B) {
                    break L3;
                  } else {
                    if (((ug) this).field_w[param2] != -1) {
                      var4 = (Object) (Object) ((ug) this).field_C.a(((ug) this).field_B, (byte) -6, param2);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((ug) this).field_i.e(20)) {
                  var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (param1 != 1) {
                  if (param1 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (((ug) this).field_B == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == ((ug) this).field_w[param2]) {
                        if (!((ug) this).field_i.a(9172)) {
                          var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, false);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } else {
                  if (null == ((ug) this).field_B) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((ug) this).field_C.a(param2, ((ug) this).field_B, 3);
                    break L2;
                  }
                }
              }
            }
            ((ug) this).field_k.a((kd) var4, (byte) -114, (long)param2);
            break L1;
          }
        }
        L4: {
          if (param0 < 0) {
            break L4;
          } else {
            ug.a((byte) -68);
            break L4;
          }
        }
        if (!((si) var4).field_v) {
          var5 = ((si) var4).d((byte) 123);
          if (!(var4 instanceof fj)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var5.length <= 2) {
                      break L6;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, -2 + var5.length);
                      var6_int = (int)uh.field_v.getValue();
                      if (var6_int == ((ug) this).field_z.field_r[param2]) {
                        L7: {
                          if (null == ((ug) this).field_z.field_o) {
                            break L7;
                          } else {
                            if (null == ((ug) this).field_z.field_o[param2]) {
                              break L7;
                            } else {
                              var7 = ((ug) this).field_z.field_o[param2];
                              var8 = si.a(0, var5, -121, var5.length - 2);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
                                  break L7;
                                } else {
                                  if (var8[var11] == var7[var11]) {
                                    var11++;
                                    continue L8;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((ug) this).field_i.field_p = 0;
                        ((ug) this).field_i.field_j = 0;
                        break L5;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((ug) this).field_i.c(-28488);
              ((si) var4).b((byte) -121);
              if (((si) var4).field_p) {
                L9: {
                  if (!((ug) this).field_i.e(20)) {
                    var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                    ((ug) this).field_k.a((kd) var4, (byte) -75, (long)param2);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L10: {
              var5[-2 + var5.length] = (byte)(((ug) this).field_z.field_t[param2] >>> 8);
              var5[var5.length + -1] = (byte)((ug) this).field_z.field_t[param2];
              if (((ug) this).field_B != null) {
                fj discarded$1 = ((ug) this).field_C.a(var5, param2, 1, ((ug) this).field_B);
                if (((ug) this).field_w[param2] != 1) {
                  ((ug) this).field_w[param2] = (byte) 1;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (!((si) var4).field_p) {
                ((si) var4).b((byte) -128);
                break L11;
              } else {
                break L11;
              }
            }
            return (si) var4;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (var5.length <= 2) {
                      break L13;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, var5.length + -2);
                      var6_int = (int)uh.field_v.getValue();
                      if (var6_int != ((ug) this).field_z.field_r[param2]) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (((ug) this).field_z.field_o == null) {
                            break L14;
                          } else {
                            if (null != ((ug) this).field_z.field_o[param2]) {
                              var7 = ((ug) this).field_z.field_o[param2];
                              var8 = si.a(0, var5, -99, var5.length - 2);
                              var9 = 0;
                              L15: while (true) {
                                if (64 <= var9) {
                                  break L14;
                                } else {
                                  if (var7[var9] == var8[var9]) {
                                    var9++;
                                    continue L15;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        var7_int = ((var5[var5.length - 2] & 255) << 8) + (255 & var5[-1 + var5.length]);
                        if (var7_int != (((ug) this).field_z.field_t[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            if (1 != ((ug) this).field_w[param2]) {
                              L17: {
                                if (((ug) this).field_w[param2] == 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((ug) this).field_w[param2] = (byte) 1;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L18: {
                            if (((si) var4).field_p) {
                              break L18;
                            } else {
                              ((si) var4).b((byte) -128);
                              break L18;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L12;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((ug) this).field_w[param2] = (byte) -1;
              ((si) var4).b((byte) -117);
              if (((si) var4).field_p) {
                if (!((ug) this).field_i.e(20)) {
                  var4 = (Object) (Object) ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                  ((ug) this).field_k.a((kd) var4, (byte) -92, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (si) (Object) stackIn_60_0;
          }
        } else {
          return null;
        }
    }

    public static void d() {
        field_s = null;
        field_r = null;
        field_A = null;
        field_y = null;
        field_q = null;
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ug) this).field_k = new na(16);
        ((ug) this).field_o = 0;
        ((ug) this).field_l = new ng();
        ((ug) this).field_h = 0L;
        try {
          L0: {
            L1: {
              ((ug) this).field_j = param0;
              ((ug) this).field_B = param1;
              if (((ug) this).field_B == null) {
                ((ug) this).field_D = false;
                break L1;
              } else {
                ((ug) this).field_D = true;
                ((ug) this).field_v = new ng();
                break L1;
              }
            }
            L2: {
              ((ug) this).field_i = param3;
              ((ug) this).field_n = param7;
              ((ug) this).field_f = param2;
              ((ug) this).field_g = param6;
              ((ug) this).field_p = param5;
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
              ((ug) this).field_e = stackIn_7_1 != 0;
              ((ug) this).field_C = param4;
              if (null == ((ug) this).field_f) {
                break L3;
              } else {
                ((ug) this).field_t = (si) (Object) ((ug) this).field_C.a(((ug) this).field_f, (byte) -6, ((ug) this).field_j);
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
            stackOut_10_1 = new StringBuilder().append("ug.<init>(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[16];
        field_u = 0.0;
        field_q = new dg();
        field_m = 0;
        field_s = "en-gb";
    }
}
