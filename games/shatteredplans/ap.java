/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ap {
    int[] field_d;
    static boolean field_h;
    private boolean field_i;
    static int field_j;
    private int field_c;
    private long field_m;
    private tn field_k;
    private static int field_t;
    private static jg field_f;
    private int field_r;
    private int field_l;
    private boolean field_n;
    private int field_e;
    private tn[] field_o;
    private int field_a;
    private long field_p;
    private int field_g;
    private int field_u;
    private long field_q;
    private tn[] field_s;
    private int field_b;

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        tn var7 = null;
        int var8_int = 0;
        tn[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        tn var11 = null;
        pq var12 = null;
        int var13 = 0;
        tn var14 = null;
        tn var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_h) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          ps.a(param0, 0, var3);
          ((ap) this).field_a = ((ap) this).field_a - 256;
          if (((ap) this).field_k == null) {
            break L1;
          } else {
            if (((ap) this).field_a > 0) {
              break L1;
            } else {
              ((ap) this).field_a = ((ap) this).field_a + (field_j >> 4);
              ap.b(((ap) this).field_k);
              this.a(((ap) this).field_k, ((ap) this).field_k.c());
              var4 = 0;
              var5 = 255;
              var6 = 7;
              L2: while (true) {
                L3: {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (var6 >= 0) {
                        var7_int = var6;
                        var8_int = 0;
                        break L4;
                      } else {
                        var7_int = var6 & 3;
                        var8_int = -(var6 >> 2);
                        break L4;
                      }
                    }
                    var9 = var5 >>> var7_int & 286331153;
                    L5: while (true) {
                      if (var9 != 0) {
                        L6: {
                          if ((var9 & 1) != 0) {
                            var5 = var5 & ~(1 << var7_int);
                            var10 = null;
                            var11 = ((ap) this).field_o[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_k;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_h <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_h;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_j = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_h = var12.field_h + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((ap) this).field_c) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_i;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.d();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_h;
                                    var11.field_h = null;
                                    if (var10 != null) {
                                      ((tn) var10).field_h = var15;
                                      break L12;
                                    } else {
                                      ((ap) this).field_o[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((ap) this).field_s[var7_int] = (tn) var10;
                                      break L13;
                                    }
                                  }
                                  var11 = var15;
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        var7_int += 4;
                        var8_int++;
                        var9 = var9 >>> 4;
                        continue L5;
                      } else {
                        var6--;
                        continue L2;
                      }
                    }
                  }
                }
                var6 = 0;
                L14: while (true) {
                  if (var6 >= 8) {
                    break L1;
                  } else {
                    var7 = ((ap) this).field_o[var6];
                    var8 = ((ap) this).field_o;
                    var9 = var6;
                    ((ap) this).field_s[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_h;
                        var7.field_h = null;
                        var7 = (tn) var10;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L16: {
          if (((ap) this).field_a >= 0) {
            break L16;
          } else {
            ((ap) this).field_a = 0;
            break L16;
          }
        }
        L17: {
          if (((ap) this).field_k == null) {
            break L17;
          } else {
            ((ap) this).field_k.b(param0, 0, 256);
            break L17;
          }
        }
        ((ap) this).field_m = pr.a(14274);
    }

    private final void b(int param0) {
        ((ap) this).field_a = ((ap) this).field_a - 256;
        if (((ap) this).field_a < 0) {
            ((ap) this).field_a = 0;
        }
        if (((ap) this).field_k != null) {
            ((ap) this).field_k.a(256);
            return;
        }
    }

    private final void a(tn param0, int param1) {
        int var3 = param1 >> 5;
        tn var4 = ((ap) this).field_s[var3];
        if (var4 == null) {
            ((ap) this).field_o[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((ap) this).field_s[var3] = param0;
        param0.field_i = param1;
    }

    final synchronized void e() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((ap) this).field_i) {
              var1 = pr.a(14274);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((ap) this).field_m + 6000L) {
                      break L1;
                    } else {
                      ((ap) this).field_m = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((ap) this).field_m + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((ap) this).field_m = ((ap) this).field_m + (long)(256000 / field_j);
                      var1 = pr.a(14274);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((ap) this).field_m = var1;
                  break L3;
                }
              }
              if (((ap) this).field_d != null) {
                try {
                  L4: {
                    L5: {
                      if (((ap) this).field_p == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((ap) this).field_p) {
                          ((ap) this).a(((ap) this).field_g);
                          ((ap) this).field_p = 0L;
                          ((ap) this).field_n = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((ap) this).a();
                      if (((ap) this).field_r - var3_int <= ((ap) this).field_l) {
                        break L6;
                      } else {
                        ((ap) this).field_l = ((ap) this).field_r - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((ap) this).field_b + ((ap) this).field_u;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((ap) this).field_g) {
                        break L8;
                      } else {
                        L9: {
                          ((ap) this).field_g = ((ap) this).field_g + 1024;
                          if (((ap) this).field_g <= 16384) {
                            break L9;
                          } else {
                            ((ap) this).field_g = 16384;
                            break L9;
                          }
                        }
                        ((ap) this).d();
                        ((ap) this).a(((ap) this).field_g);
                        var3_int = 0;
                        ((ap) this).field_n = true;
                        if (var4 + 256 <= ((ap) this).field_g) {
                          break L8;
                        } else {
                          var4 = ((ap) this).field_g - 256;
                          ((ap) this).field_u = var4 - ((ap) this).field_b;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((ap) this).field_q) {
                            break L11;
                          } else {
                            L12: {
                              if (((ap) this).field_n) {
                                ((ap) this).field_n = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((ap) this).field_l != 0) {
                                    break L13;
                                  } else {
                                    if (((ap) this).field_e != 0) {
                                      break L13;
                                    } else {
                                      ((ap) this).d();
                                      ((ap) this).field_p = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((ap) this).field_u = Math.min(((ap) this).field_e, ((ap) this).field_l);
                                ((ap) this).field_e = ((ap) this).field_l;
                                break L12;
                              }
                            }
                            ((ap) this).field_l = 0;
                            ((ap) this).field_q = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((ap) this).field_r = var3_int;
                        break L4;
                      } else {
                        this.a(((ap) this).field_d, 256);
                        ((ap) this).b();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((ap) this).d();
                    ((ap) this).field_p = var1 + 2000L;
                    break L14;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void a(tn param0) {
        ((ap) this).field_k = param0;
    }

    final static ap a(qb param0, java.awt.Component param1, int param2, int param3) {
        try {
            oc var4 = null;
            Throwable var4_ref = null;
            oc var5 = null;
            oc stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            oc stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            oc stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            oc stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            oc stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            oc stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            oc stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            oc stackOut_20_0 = null;
            if (field_j != 0) {
              L0: {
                if (param2 < 0) {
                  break L0;
                } else {
                  if (param2 < 2) {
                    L1: {
                      if (param3 >= 256) {
                        break L1;
                      } else {
                        param3 = 256;
                        break L1;
                      }
                    }
                    try {
                      L2: {
                        L3: {
                          var5 = new oc();
                          var4 = var5;
                          stackOut_8_0 = (oc) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_h) {
                            stackOut_10_0 = (oc) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (oc) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((ap) (Object) stackIn_11_0).field_d = new int[stackIn_11_1 * stackIn_11_2];
                          ((ap) (Object) var4).field_b = param3;
                          ((ap) (Object) var4).a(param1);
                          ((ap) (Object) var4).field_g = (param3 & -1024) + 1024;
                          if (((ap) (Object) var4).field_g <= 16384) {
                            break L4;
                          } else {
                            ((ap) (Object) var4).field_g = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((ap) (Object) var4).a(((ap) (Object) var4).field_g);
                          if (field_t <= 0) {
                            break L5;
                          } else {
                            if (field_f != null) {
                              break L5;
                            } else {
                              field_f = new jg();
                              field_f.field_c = param0;
                              pb discarded$2 = param0.a(true, field_t, (Runnable) (Object) field_f);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_f == null) {
                            break L6;
                          } else {
                            if (field_f.field_d[param2] == null) {
                              field_f.field_d[param2] = (ap) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (oc) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new ap();
                    }
                    return (ap) (Object) stackIn_21_0;
                  } else {
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    int a() throws Exception {
        return ((ap) this).field_g;
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_f == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_f.field_b = true;
                  L2: while (true) {
                    if (!field_f.field_a) {
                      field_f = null;
                      break L0;
                    } else {
                      jb.a((byte) -100, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_f.field_d[var2] != this) {
                    break L3;
                  } else {
                    field_f.field_d[var2] = null;
                    break L3;
                  }
                }
                if (field_f.field_d[var2] != null) {
                  var1 = 0;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
        ((ap) this).d();
        ((ap) this).field_d = null;
        ((ap) this).field_i = true;
    }

    private final static void b(tn param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
            param0.field_k.field_h = 0;
        }
        tn var1 = param0.b();
        while (var1 != null) {
            ap.b(var1);
            var1 = param0.d();
        }
    }

    void d() {
    }

    public static void f() {
        field_f = null;
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < 8000) {
            break L0;
          } else {
            if (param0 <= 48000) {
              L1: {
                field_j = param0;
                if (!param1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              field_h = stackIn_7_0 != 0;
              field_t = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void a(int param0) throws Exception {
    }

    void b() throws Exception {
    }

    ap() {
        ((ap) this).field_i = false;
        ((ap) this).field_c = 32;
        ((ap) this).field_m = pr.a(14274);
        ((ap) this).field_r = 0;
        ((ap) this).field_a = 0;
        ((ap) this).field_l = 0;
        ((ap) this).field_o = new tn[8];
        ((ap) this).field_p = 0L;
        ((ap) this).field_e = 0;
        ((ap) this).field_n = true;
        ((ap) this).field_s = new tn[8];
        ((ap) this).field_q = 0L;
    }
}
