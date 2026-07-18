/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ch {
    static int field_o;
    private jd field_m;
    static sg field_n;

    final static jk e(int param0) {
        return new jk(ja.a(-7705), oj.a(104));
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != -14282) {
            field_o = -16;
        }
    }

    final void c(byte param0) {
        try {
            ((a) this).field_m.a(true);
        } catch (Exception exception) {
        }
        if (param0 != 0) {
            a.d((byte) 104);
        }
        ((a) this).field_b = ((a) this).field_b + 1;
        ((a) this).field_m = null;
        ((a) this).field_l = -1;
        ((a) this).field_f = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final void a(int param0) {
        if (!(((a) this).field_m == null)) {
            ((a) this).field_m.a(true);
        }
        if (param0 <= 22) {
            a.a(124, 36, 81, 117, -47, 33);
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            na var2_ref = null;
            Exception var3 = null;
            na var3_ref = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            na var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_46_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_82_0 = 0;
            L0: {
              var16 = Main.field_T;
              if (null == ((a) this).field_m) {
                break L0;
              } else {
                L1: {
                  var2_long = id.a(25);
                  var4 = (int)(-((a) this).field_d + var2_long);
                  ((a) this).field_d = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((a) this).field_k = ((a) this).field_k + var4;
                if (((a) this).field_k > 30000) {
                  try {
                    L2: {
                      ((a) this).field_m.a(true);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((a) this).field_m = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null != ((a) this).field_m) {
              try {
                L4: {
                  ((a) this).field_m.b((byte) -44);
                  var2_int = -9 / ((-82 - param0) / 34);
                  var3_ref = (na) (Object) ((a) this).field_g.c((byte) -112);
                  L5: while (true) {
                    if (var3_ref == null) {
                      var2_ref = (na) (Object) ((a) this).field_a.c((byte) -107);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((a) this).field_m.b(-125);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((a) this).field_k = 0;
                                      var4 = 0;
                                      if (((a) this).field_j != null) {
                                        if (((a) this).field_j.field_t == 0) {
                                          var4 = 1;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (0 >= var4) {
                                        L11: {
                                          var5 = -((a) this).field_j.field_u + ((a) this).field_j.field_s.field_g.length;
                                          var6 = -((a) this).field_j.field_t + 512;
                                          if (var6 <= -((a) this).field_j.field_s.field_i + var5) {
                                            break L11;
                                          } else {
                                            var6 = var5 - ((a) this).field_j.field_s.field_i;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var3_int >= var6) {
                                            break L12;
                                          } else {
                                            var6 = var3_int;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((a) this).field_m.a((byte) 66, ((a) this).field_j.field_s.field_g, var6, ((a) this).field_j.field_s.field_i);
                                          if (((a) this).field_f == 0) {
                                            break L13;
                                          } else {
                                            var7 = 0;
                                            L14: while (true) {
                                              if (~var6 >= ~var7) {
                                                break L13;
                                              } else {
                                                ((a) this).field_j.field_s.field_g[var7 + ((a) this).field_j.field_s.field_i] = (byte)hi.a((int) ((a) this).field_j.field_s.field_g[var7 + ((a) this).field_j.field_s.field_i], (int) ((a) this).field_f);
                                                var7++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        ((a) this).field_j.field_t = ((a) this).field_j.field_t + var6;
                                        ((a) this).field_j.field_s.field_i = ((a) this).field_j.field_s.field_i + var6;
                                        if (((a) this).field_j.field_s.field_i == var5) {
                                          ((a) this).field_j.d(12);
                                          ((a) this).field_j.field_n = false;
                                          ((a) this).field_j = null;
                                          break L10;
                                        } else {
                                          if (((a) this).field_j.field_t == 512) {
                                            ((a) this).field_j.field_t = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      } else {
                                        L15: {
                                          var5 = -((a) this).field_i.field_i + var4;
                                          if (var5 <= var3_int) {
                                            break L15;
                                          } else {
                                            var5 = var3_int;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((a) this).field_m.a((byte) 66, ((a) this).field_i.field_g, var5, ((a) this).field_i.field_i);
                                          if (((a) this).field_f != 0) {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var6 >= var5) {
                                                break L16;
                                              } else {
                                                ((a) this).field_i.field_g[var6 + ((a) this).field_i.field_i] = (byte)hi.a((int) ((a) this).field_i.field_g[var6 + ((a) this).field_i.field_i], (int) ((a) this).field_f);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                        ((a) this).field_i.field_i = ((a) this).field_i.field_i + var5;
                                        if (~var4 >= ~((a) this).field_i.field_i) {
                                          if (((a) this).field_j != null) {
                                            if (((a) this).field_j.field_t == 0) {
                                              if (((a) this).field_i.field_g[0] != -1) {
                                                ((a) this).field_j = null;
                                                break L10;
                                              } else {
                                                ((a) this).field_j.field_t = 1;
                                                ((a) this).field_i.field_i = 0;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L18: {
                                              ((a) this).field_i.field_i = 0;
                                              var6 = ((a) this).field_i.f(64);
                                              var7 = ((a) this).field_i.e((byte) 125);
                                              var8 = ((a) this).field_i.f(16);
                                              var9 = ((a) this).field_i.e((byte) 126);
                                              var10 = var8 & 127;
                                              if ((var8 & 128) == 0) {
                                                stackOut_45_0 = 0;
                                                stackIn_46_0 = stackOut_45_0;
                                                break L18;
                                              } else {
                                                stackOut_44_0 = 1;
                                                stackIn_46_0 = stackOut_44_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_46_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (na) (Object) ((a) this).field_e.c((byte) -109);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (~var12 == ~var14_ref.field_j) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (na) (Object) ((a) this).field_e.b((byte) -122);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (na) (Object) ((a) this).field_h.c((byte) -128);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (~var14_ref.field_j == ~var12) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (na) (Object) ((a) this).field_h.b((byte) -122);
                                                      continue L21;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L22: {
                                                if (var10 != 0) {
                                                  stackOut_60_0 = 9;
                                                  stackIn_61_0 = stackOut_60_0;
                                                  break L22;
                                                } else {
                                                  stackOut_59_0 = 5;
                                                  stackIn_61_0 = stackOut_59_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_61_0;
                                              ((a) this).field_j = var14_ref;
                                              ((a) this).field_j.field_s = new pb(((a) this).field_j.field_u + (var15 + var9));
                                              ((a) this).field_j.field_s.b(-9469, var10);
                                              ((a) this).field_j.field_s.a(-246, var9);
                                              ((a) this).field_i.field_i = 0;
                                              ((a) this).field_j.field_t = 10;
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                            stackOut_82_0 = 1;
                            stackIn_83_0 = stackOut_82_0;
                            break L4;
                          }
                        } else {
                          ((a) this).field_c.field_i = 0;
                          ((a) this).field_c.b(-9469, 0);
                          ((a) this).field_c.a(var2_ref.field_j, 100);
                          ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                          ((a) this).field_e.a((byte) -96, (he) (Object) var2_ref);
                          var2_ref = (na) (Object) ((a) this).field_a.b((byte) -122);
                          continue L6;
                        }
                      }
                    } else {
                      ((a) this).field_c.field_i = 0;
                      ((a) this).field_c.b(-9469, 1);
                      ((a) this).field_c.a(var3_ref.field_j, 101);
                      ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                      ((a) this).field_h.a((byte) -90, (he) (Object) var3_ref);
                      var3_ref = (na) (Object) ((a) this).field_g.b((byte) -122);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((a) this).field_m.a(true);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  ((a) this).field_m = null;
                  ((a) this).field_b = ((a) this).field_b + 1;
                  ((a) this).field_l = -2;
                  if (((a) this).a((byte) 74) != 0) {
                    break L25;
                  } else {
                    if (0 == ((a) this).b(-21040)) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_83_0 != 0;
            } else {
              if (0 != ((a) this).a((byte) -35)) {
                return false;
              } else {
                if (((a) this).b(-21040) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ah.field_c[ei.field_f] = param4;
        if (param3 != -23576) {
            field_o = 23;
        }
        re.field_c[ei.field_f] = ei.field_f;
        p.field_n[ei.field_f] = param1;
        if (bd.field_F < param1) {
            ah.field_d = param1;
        }
        if (param1 < fk.field_h) {
            mf.field_g = param1;
        }
        q.field_h[ei.field_f] = param2;
        mj.field_b[ei.field_f] = param0;
        ij.field_c[ei.field_f] = param5;
        int var6 = param5 + (param2 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param2 / var6;
        db.field_l[ei.field_f] = var7;
        if (!(mf.field_g <= var7)) {
            mf.field_g = var7;
        }
        if (!(var7 <= ah.field_d)) {
            ah.field_d = var7;
        }
        ei.field_f = ei.field_f + 1;
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            na var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var6 = Main.field_T;
            try {
              L0: {
                L1: {
                  if (!param2) {
                    break L1;
                  } else {
                    field_o = 20;
                    break L1;
                  }
                }
                L2: {
                  if (((a) this).field_m != null) {
                    try {
                      L3: {
                        ((a) this).field_m.a(true);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    ((a) this).field_m = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((a) this).field_m = (jd) param0;
                this.f(29034);
                this.a((byte) 85, param1);
                ((a) this).field_i.field_i = 0;
                ((a) this).field_j = null;
                L5: while (true) {
                  var4_ref3 = (na) (Object) ((a) this).field_h.a(-99);
                  if (var4_ref3 == null) {
                    L6: while (true) {
                      var4_ref3 = (na) (Object) ((a) this).field_e.a(121);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((a) this).field_f == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((a) this).field_c.field_i = 0;
                                ((a) this).field_c.b(-9469, 4);
                                ((a) this).field_c.b(-9469, (int) ((a) this).field_f);
                                ((a) this).field_c.a(-246, 0);
                                ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((a) this).field_k = 0;
                        ((a) this).field_d = id.a(114);
                        break L0;
                      } else {
                        ((a) this).field_a.a((byte) -120, (he) (Object) var4_ref3);
                        continue L6;
                      }
                    }
                  } else {
                    ((a) this).field_g.a((byte) -124, (he) (Object) var4_ref3);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("a.C(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L12;
                } else {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L12;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            L1: while (true) {
              param2--;
              if (param2 < 0) {
                break L0;
              } else {
                var9 = param3;
                var5 = var9;
                var6 = param0;
                var7 = param1;
                var9[var6] = bc.a(8355711, var9[var6] >> 1) + var7;
                param0++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("a.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -1483723263 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            int var3 = 0;
            Exception var5 = null;
            pb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            pb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            pb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            pb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            pb stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            pb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (null != ((a) this).field_m) {
              var3 = -57;
              try {
                L0: {
                  L1: {
                    ((a) this).field_c.field_i = 0;
                    stackOut_3_0 = ((a) this).field_c;
                    stackOut_3_1 = -9469;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (!param1) {
                      stackOut_5_0 = (pb) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (pb) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((pb) (Object) stackIn_6_0).b(stackIn_6_1, stackIn_6_2);
                  ((a) this).field_c.a(0L, 121);
                  ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((a) this).field_m.a(true);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((a) this).field_l = -2;
                  ((a) this).field_m = null;
                  ((a) this).field_b = ((a) this).field_b + 1;
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static wb a(wb param0, int[] param1, int param2) {
        wb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3 = new wb(0, 0, 0);
            var3.field_c = param0.field_c;
            var3.field_j = param1;
            var3.field_b = param0.field_b;
            var3.field_i = param0.field_i;
            var3.field_g = param0.field_g;
            var3.field_h = param0.field_h;
            var3.field_e = param0.field_e;
            var3.field_f = param0.field_f;
            var4 = 0;
            stackOut_0_0 = (wb) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("a.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -88 + ')');
        }
        return stackIn_1_0;
    }

    private final void f(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((a) this).field_m == null) {
              return;
            } else {
              {
                L0: {
                  ((a) this).field_c.field_i = 0;
                  ((a) this).field_c.b(-9469, 6);
                  ((a) this).field_c.a(3, (byte) 60);
                  ((a) this).field_c.e(0, 26040);
                  ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        if (param0 <= 28) {
            field_n = null;
        }
        vb.field_h.c((lk) (Object) new tj(), (byte) 35);
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Main.field_T;
        try {
            for (var6_int = -3; var6_int <= 3; var6_int++) {
                for (var7 = -3; var7 <= 3; var7++) {
                    var8 = (var6_int >= 0 ? var6_int : -var6_int) + (var7 >= 0 ? var7 : -var7);
                    if (!(4 < var8)) {
                        qa.field_b.a(param1, var6_int + param3, var7 + param5, param0, -1, 256 - var8 * 48);
                    }
                }
            }
            qa.field_b.b(param1, param3, param5, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "a.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + -1 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public a() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new sg();
    }
}
