/*
 * Decompiled by CFR-JS 0.4.0.
 */
class md {
    static int field_l;
    private boolean field_a;
    static boolean field_q;
    private long field_t;
    private static vi field_e;
    private int field_i;
    int[] field_j;
    private nm field_c;
    private static int field_s;
    private int field_g;
    private nm[] field_n;
    private long field_h;
    private int field_u;
    private int field_d;
    private int field_b;
    private long field_r;
    private int field_m;
    private nm[] field_f;
    private int field_k;
    private int field_p;
    private boolean field_o;

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
                field_l = param0;
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
              field_q = stackIn_7_0 != 0;
              field_s = param2;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    final static md a(jk param0, java.awt.Component param1, int param2, int param3) {
        try {
            nf var4 = null;
            Throwable var4_ref = null;
            nf var5 = null;
            nf stackIn_9_0 = null;
            int stackIn_9_1 = 0;
            nf stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            nf stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            int stackIn_11_2 = 0;
            nf stackIn_21_0 = null;
            Throwable decompiledCaughtException = null;
            nf stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            nf stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int stackOut_10_2 = 0;
            nf stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            int stackOut_9_2 = 0;
            nf stackOut_20_0 = null;
            if (field_l != 0) {
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
                          var5 = new nf();
                          var4 = var5;
                          stackOut_8_0 = (nf) var4;
                          stackOut_8_1 = 256;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (!field_q) {
                            stackOut_10_0 = (nf) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L3;
                          } else {
                            stackOut_9_0 = (nf) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L3;
                          }
                        }
                        L4: {
                          ((md) (Object) stackIn_11_0).field_j = new int[stackIn_11_1 * stackIn_11_2];
                          ((md) (Object) var4).field_m = param3;
                          ((md) (Object) var4).a(param1);
                          ((md) (Object) var4).field_g = (param3 & -1024) + 1024;
                          if (((md) (Object) var4).field_g <= 16384) {
                            break L4;
                          } else {
                            ((md) (Object) var4).field_g = 16384;
                            break L4;
                          }
                        }
                        L5: {
                          ((md) (Object) var4).b(((md) (Object) var4).field_g);
                          if (field_s <= 0) {
                            break L5;
                          } else {
                            if (field_e != null) {
                              break L5;
                            } else {
                              field_e = new vi();
                              field_e.field_b = param0;
                              nl discarded$2 = param0.a(field_s, true, (Runnable) (Object) field_e);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (field_e == null) {
                            break L6;
                          } else {
                            if (field_e.field_c[param2] == null) {
                              field_e.field_c[param2] = (md) (Object) var5;
                              break L6;
                            } else {
                              throw new IllegalArgumentException();
                            }
                          }
                        }
                        stackOut_20_0 = (nf) var4;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4_ref = decompiledCaughtException;
                      return new md();
                    }
                    return (md) (Object) stackIn_21_0;
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

    public static void d() {
        field_e = null;
    }

    private final void a(nm param0, int param1) {
        int var3 = param1 >> 5;
        nm var4 = ((md) this).field_n[var3];
        if (var4 == null) {
            ((md) this).field_f[var3] = param0;
        } else {
            var4.field_j = param0;
        }
        ((md) this).field_n[var3] = param0;
        param0.field_m = param1;
    }

    private final void a(int param0) {
        ((md) this).field_p = ((md) this).field_p - param0;
        if (((md) this).field_p < 0) {
            ((md) this).field_p = 0;
        }
        if (((md) this).field_c != null) {
            ((md) this).field_c.a(param0);
            return;
        }
    }

    void b(int param0) throws Exception {
    }

    final synchronized void b() {
        try {
            long var1 = 0L;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            if (!((md) this).field_a) {
              var1 = ud.a(2);
              try {
                L0: {
                  L1: {
                    if (var1 <= ((md) this).field_t + 6000L) {
                      break L1;
                    } else {
                      ((md) this).field_t = var1 - 6000L;
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var1 <= ((md) this).field_t + 5000L) {
                      break L0;
                    } else {
                      this.a(256);
                      ((md) this).field_t = ((md) this).field_t + (long)(256000 / field_l);
                      var1 = ud.a(2);
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  ((md) this).field_t = var1;
                  break L3;
                }
              }
              if (((md) this).field_j != null) {
                try {
                  L4: {
                    L5: {
                      if (((md) this).field_r == 0L) {
                        break L5;
                      } else {
                        if (var1 >= ((md) this).field_r) {
                          ((md) this).b(((md) this).field_g);
                          ((md) this).field_r = 0L;
                          ((md) this).field_o = true;
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                    L6: {
                      var3_int = ((md) this).f();
                      if (((md) this).field_d - var3_int <= ((md) this).field_k) {
                        break L6;
                      } else {
                        ((md) this).field_k = ((md) this).field_d - var3_int;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = ((md) this).field_m + ((md) this).field_u;
                      if (var4 + 256 <= 16384) {
                        break L7;
                      } else {
                        var4 = 16128;
                        break L7;
                      }
                    }
                    L8: {
                      if (var4 + 256 <= ((md) this).field_g) {
                        break L8;
                      } else {
                        L9: {
                          ((md) this).field_g = ((md) this).field_g + 1024;
                          if (((md) this).field_g <= 16384) {
                            break L9;
                          } else {
                            ((md) this).field_g = 16384;
                            break L9;
                          }
                        }
                        ((md) this).a();
                        ((md) this).b(((md) this).field_g);
                        var3_int = 0;
                        ((md) this).field_o = true;
                        if (var4 + 256 <= ((md) this).field_g) {
                          break L8;
                        } else {
                          var4 = ((md) this).field_g - 256;
                          ((md) this).field_u = var4 - ((md) this).field_m;
                          break L8;
                        }
                      }
                    }
                    L10: while (true) {
                      if (var3_int >= var4) {
                        L11: {
                          if (var1 <= ((md) this).field_h) {
                            break L11;
                          } else {
                            L12: {
                              if (((md) this).field_o) {
                                ((md) this).field_o = false;
                                break L12;
                              } else {
                                L13: {
                                  if (((md) this).field_k != 0) {
                                    break L13;
                                  } else {
                                    if (((md) this).field_b != 0) {
                                      break L13;
                                    } else {
                                      ((md) this).a();
                                      ((md) this).field_r = var1 + 2000L;
                                      return;
                                    }
                                  }
                                }
                                ((md) this).field_u = Math.min(((md) this).field_b, ((md) this).field_k);
                                ((md) this).field_b = ((md) this).field_k;
                                break L12;
                              }
                            }
                            ((md) this).field_k = 0;
                            ((md) this).field_h = var1 + 2000L;
                            break L11;
                          }
                        }
                        ((md) this).field_d = var3_int;
                        break L4;
                      } else {
                        this.a(((md) this).field_j, 256);
                        ((md) this).e();
                        var3_int += 256;
                        continue L10;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L14: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    ((md) this).a();
                    ((md) this).field_r = var1 + 2000L;
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

    int f() throws Exception {
        return ((md) this).field_g;
    }

    private final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        nm var7 = null;
        int var8_int = 0;
        nm[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        nm var11 = null;
        pb var12 = null;
        int var13 = 0;
        nm var14 = null;
        nm var15 = null;
        int var15_int = 0;
        L0: {
          var3 = param1;
          if (!field_q) {
            break L0;
          } else {
            var3 = var3 << 1;
            break L0;
          }
        }
        L1: {
          ne.a(param0, 0, var3);
          ((md) this).field_p = ((md) this).field_p - param1;
          if (((md) this).field_c == null) {
            break L1;
          } else {
            if (((md) this).field_p > 0) {
              break L1;
            } else {
              ((md) this).field_p = ((md) this).field_p + (field_l >> 4);
              md.a(((md) this).field_c);
              this.a(((md) this).field_c, ((md) this).field_c.c());
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
                            var5 = var5 & (1 << var7_int ^ -1);
                            var10 = null;
                            var11 = ((md) this).field_f[var7_int];
                            var14 = var11;
                            var14 = var11;
                            L7: while (true) {
                              if (var11 == null) {
                                break L6;
                              } else {
                                L8: {
                                  var12 = var11.field_l;
                                  if (var12 == null) {
                                    break L8;
                                  } else {
                                    if (var12.field_j <= var8_int) {
                                      break L8;
                                    } else {
                                      var5 = var5 | 1 << var7_int;
                                      var10 = (Object) (Object) var11;
                                      var11 = var11.field_j;
                                      continue L7;
                                    }
                                  }
                                }
                                L9: {
                                  var11.field_k = true;
                                  var13 = var11.d();
                                  var4 = var4 + var13;
                                  if (var12 == null) {
                                    break L9;
                                  } else {
                                    var12.field_j = var12.field_j + var13;
                                    break L9;
                                  }
                                }
                                if (var4 < ((md) this).field_i) {
                                  L10: {
                                    var14 = var11.a();
                                    if (var14 == null) {
                                      break L10;
                                    } else {
                                      var15_int = var11.field_m;
                                      L11: while (true) {
                                        if (var14 == null) {
                                          break L10;
                                        } else {
                                          this.a(var14, var15_int * var14.c() >> 8);
                                          var14 = var11.b();
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var15 = var11.field_j;
                                    var11.field_j = null;
                                    if (var10 != null) {
                                      ((nm) var10).field_j = var15;
                                      break L12;
                                    } else {
                                      ((md) this).field_f[var7_int] = var15;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (var15 != null) {
                                      break L13;
                                    } else {
                                      ((md) this).field_n[var7_int] = (nm) var10;
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
                    var7 = ((md) this).field_f[var6];
                    var8 = ((md) this).field_f;
                    var9 = var6;
                    ((md) this).field_n[var6] = null;
                    var8[var9] = null;
                    L15: while (true) {
                      if (var7 == null) {
                        var6++;
                        continue L14;
                      } else {
                        var10 = (Object) (Object) var7.field_j;
                        var7.field_j = null;
                        var7 = (nm) var10;
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
          if (((md) this).field_p >= 0) {
            break L16;
          } else {
            ((md) this).field_p = 0;
            break L16;
          }
        }
        L17: {
          if (((md) this).field_c == null) {
            break L17;
          } else {
            ((md) this).field_c.a(param0, 0, param1);
            break L17;
          }
        }
        ((md) this).field_t = ud.a(2);
    }

    final synchronized void g() {
        try {
            ((md) this).field_o = true;
            try {
                ((md) this).h();
            } catch (Exception exception) {
                ((md) this).a();
                ((md) this).field_r = ud.a(2) + 2000L;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void e() throws Exception {
    }

    final synchronized void b(nm param0) {
        ((md) this).field_c = param0;
    }

    void h() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a() {
    }

    final synchronized void c() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          if (field_e == null) {
            break L0;
          } else {
            var1 = 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 2) {
                if (var1 == 0) {
                  break L0;
                } else {
                  field_e.field_f = true;
                  L2: while (true) {
                    if (!field_e.field_e) {
                      field_e = null;
                      break L0;
                    } else {
                      bc.a(50L, (byte) 87);
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if ((Object) (Object) field_e.field_c[var2] != this) {
                    break L3;
                  } else {
                    field_e.field_c[var2] = null;
                    break L3;
                  }
                }
                if (field_e.field_c[var2] != null) {
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
        ((md) this).a();
        ((md) this).field_j = null;
        ((md) this).field_a = true;
    }

    private final static void a(nm param0) {
        param0.field_k = false;
        if (param0.field_l != null) {
            param0.field_l.field_j = 0;
        }
        nm var1 = param0.a();
        while (var1 != null) {
            md.a(var1);
            var1 = param0.b();
        }
    }

    md() {
        ((md) this).field_i = 32;
        ((md) this).field_a = false;
        ((md) this).field_t = ud.a(2);
        ((md) this).field_h = 0L;
        ((md) this).field_n = new nm[8];
        ((md) this).field_d = 0;
        ((md) this).field_b = 0;
        ((md) this).field_k = 0;
        ((md) this).field_p = 0;
        ((md) this).field_r = 0L;
        ((md) this).field_f = new nm[8];
        ((md) this).field_o = true;
    }
}
