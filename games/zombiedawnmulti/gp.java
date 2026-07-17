/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gp {
    private static int field_b;
    static boolean field_j;
    private boolean field_r;
    private int field_e;
    private gq field_s;
    static int field_p;
    private static tg field_q;
    private long field_i;
    int[] field_l;
    private int field_a;
    private int field_f;
    private int field_h;
    private long field_d;
    private int field_u;
    private long field_o;
    private int field_n;
    private int field_m;
    private gq[] field_t;
    private gq[] field_k;
    private boolean field_g;
    private int field_c;

    private final static void b(gq param0) {
        param0.field_f = false;
        if (param0.field_i != null) {
            param0.field_i.field_f = 0;
        }
        gq var1 = param0.b();
        while (var1 != null) {
            gp.b(var1);
            var1 = param0.d();
        }
    }

    final synchronized void e() {
        try {
            ((gp) this).field_g = true;
            try {
                ((gp) this).f();
            } catch (Exception exception) {
                ((gp) this).d();
                ((gp) this).field_o = bl.a((byte) 103) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void d() {
    }

    private final void a(gq param0, int param1) {
        int var3 = param1 >> 5;
        gq var4 = ((gp) this).field_k[var3];
        if (var4 == null) {
            ((gp) this).field_t[var3] = param0;
        } else {
            var4.field_h = param0;
        }
        ((gp) this).field_k[var3] = param0;
        param0.field_g = param1;
    }

    final static gp a(go param0, java.awt.Component param1, int param2, int param3) {
        try {
            fp var4 = null;
            Throwable var4_ref = null;
            fp var5 = null;
            fp stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            fp stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            fp stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            fp stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            fp stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            fp stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            fp stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            fp stackOut_20_0 = null;
            if (field_p != 0) {
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
                          var5 = new fp();
                          var4 = var5;
                          stackOut_8_0 = (fp) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_j) {
                            stackOut_10_0 = (fp) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (fp) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((gp) (Object) stackIn_11_0).field_l = new int[stackIn_11_1 * stackIn_11_2];
                          ((gp) (Object) var4).field_m = param3;
                          ((gp) (Object) var4).a(param1);
                          ((gp) (Object) var4).field_a = (param3 & -1024) + 1024;
                          if (((gp) (Object) var4).field_a <= 16384) {
                            break L4;
                          } else {
                            ((gp) (Object) var4).field_a = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((gp) (Object) var4).a(((gp) (Object) var4).field_a);
                          if (field_b <= 0) {
                            break L5;
                          } else {
                            if (field_q != null) {
                              break L5;
                            } else {
                              field_q = new tg();
                              field_q.field_b = param0;
                              di discarded$2 = param0.a(22, (Runnable) (Object) field_q, field_b);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_q == null) {
                            break L6;
                          } else {
                            if (field_q.field_f[param2] == null) {
                              field_q.field_f[param2] = (gp) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (fp) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new gp();
                    }
                    return (gp) (Object) stackIn_21_0;
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

    private final void b(int param0) {
        ((gp) this).field_h = ((gp) this).field_h - 256;
        if (((gp) this).field_h < 0) {
            ((gp) this).field_h = 0;
        }
        if (((gp) this).field_s != null) {
            ((gp) this).field_s.a(256);
            return;
        }
    }

    void a(int param0) throws Exception {
    }

    final synchronized void a() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((gp) this).field_r) {
              var1 = bl.a((byte) 79);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((gp) this).field_i + 6000L) {
                      break L1;
                    } else {
                      ((gp) this).field_i = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((gp) this).field_i + 5000L) {
                      break L0;
                    } else {
                      this.b(256);
                      ((gp) this).field_i = ((gp) this).field_i + (long)(256000 / field_p);
                      var1 = bl.a((byte) 66);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((gp) this).field_i = var1;
                  break L3;
                }
              }
              if (((gp) this).field_l != null) {
                try {
                  L4: {
                    L5: {
                      if (((gp) this).field_o == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((gp) this).field_o) {
                          ((gp) this).a(((gp) this).field_a);
                          ((gp) this).field_o = 0L;
                          ((gp) this).field_g = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((gp) this).c();
                      if (((gp) this).field_f - var3_int <= ((gp) this).field_c) {
                        break L6;
                      } else {
                        ((gp) this).field_c = ((gp) this).field_f - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((gp) this).field_m + ((gp) this).field_n;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((gp) this).field_a) {
                        break L8;
                      } else {
                        L9: {
                          ((gp) this).field_a = ((gp) this).field_a + 1024;
                          if (((gp) this).field_a <= 16384) {
                            break L9;
                          } else {
                            ((gp) this).field_a = 16384;
                            break L9;
                          }
                        }
                        ((gp) this).d();
                        ((gp) this).a(((gp) this).field_a);
                        var3_int = 0;
                        ((gp) this).field_g = true;
                        if (var4 + 256 <= ((gp) this).field_a) {
                          break L8;
                        } else {
                          var4 = ((gp) this).field_a - 256;
                          ((gp) this).field_n = var4 - ((gp) this).field_m;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((gp) this).field_d) {
                            break L11;
                          } else {
                            L12: {
                              if (((gp) this).field_g) {
                                ((gp) this).field_g = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((gp) this).field_c != 0) {
                                    break L13;
                                  } else {
                                    if (((gp) this).field_u != 0) {
                                      break L13;
                                    } else {
                                      ((gp) this).d();
                                      ((gp) this).field_o = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((gp) this).field_n = Math.min(((gp) this).field_u, ((gp) this).field_c);
                                ((gp) this).field_u = ((gp) this).field_c;
                                break L12;
                              }
                            }
                            ((gp) this).field_c = 0;
                            ((gp) this).field_d = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((gp) this).field_f = var3_int;
                        break L4;
                      } else {
                        this.a(((gp) this).field_l, 256);
                        ((gp) this).g();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((gp) this).d();
                    ((gp) this).field_o = var1 + 2000L;
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

    int c() throws Exception {
        return ((gp) this).field_a;
    }

    final synchronized void h() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_q == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_q.field_h = true;
                  L2: while (true) {
                    if (!field_q.field_c) {
                      field_q = null;
                      break L0;
                    } else {
                      vd.a(false, 50L);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_q.field_f[var2] != this) {
                    break L3;
                  } else {
                    field_q.field_f[var2] = null;
                    break L3;
                  }
                }
                if (field_q.field_f[var2] != null) {
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
        ((gp) this).d();
        ((gp) this).field_l = null;
        ((gp) this).field_r = true;
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
                field_p = param0;
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
              field_j = stackIn_7_0 != 0;
              field_b = 10;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    void f() throws Exception {
    }

    public static void b() {
        field_q = null;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        gq var7 = null;
        int var8_int = 0;
        gq[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        gq var11 = null;
        lg var12 = null;
        int var13 = 0;
        gq var14 = null;
        gq var15 = null;
        int var15_int = 0;
        L0: {
          var3 = 256;
          if (!field_j) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          d.a(param0, 0, var3);
          ((gp) this).field_h = ((gp) this).field_h - 256;
          if (((gp) this).field_s == null) {
            break L1;
          } else {
            if (((gp) this).field_h > 0) {
              break L1;
            } else {
              ((gp) this).field_h = ((gp) this).field_h + (field_p >> 4);
              gp.b(((gp) this).field_s);
              this.a(((gp) this).field_s, ((gp) this).field_s.c());
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
                            var11 = ((gp) this).field_t[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_i;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_f <= var8_int) {
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
                                  var11.field_f = true;
                                  var13 = var11.a();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_f = var12.field_f + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((gp) this).field_e) {
                                  L10: {
                                    var14 = var11.b();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_g;
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
                                      ((gq) var10).field_h = var15;
                                      break L12;
                                    } else {
                                      ((gp) this).field_t[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((gp) this).field_k[var7_int] = (gq) var10;
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
                    var7 = ((gp) this).field_t[var6];
                    var8 = ((gp) this).field_t;
                    var9 = var6;
                    ((gp) this).field_k[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_h;
                        var7.field_h = null;
                        var7 = (gq) var10;
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
          if (((gp) this).field_h >= 0) {
            break L16;
          } else {
            ((gp) this).field_h = 0;
            break L16;
          }
        }
        L17: {
          if (((gp) this).field_s == null) {
            break L17;
          } else {
            ((gp) this).field_s.b(param0, 0, 256);
            break L17;
          }
        }
        ((gp) this).field_i = bl.a((byte) 108);
    }

    void g() throws Exception {
    }

    final synchronized void a(gq param0) {
        ((gp) this).field_s = param0;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    gp() {
        ((gp) this).field_r = false;
        ((gp) this).field_e = 32;
        ((gp) this).field_i = bl.a((byte) 98);
        ((gp) this).field_o = 0L;
        ((gp) this).field_d = 0L;
        ((gp) this).field_h = 0;
        ((gp) this).field_u = 0;
        ((gp) this).field_k = new gq[8];
        ((gp) this).field_f = 0;
        ((gp) this).field_t = new gq[8];
        ((gp) this).field_g = true;
        ((gp) this).field_c = 0;
    }
}
