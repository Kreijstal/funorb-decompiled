/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ge {
    static String[] field_v;
    static int[] field_t;
    static String field_u;
    private cb field_q;
    static int field_r;
    static int[] field_s;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            cd var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
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
            cd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_24_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_88_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_87_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_23_0 = 0;
            L0: {
              var16 = OrbDefence.field_D ? 1 : 0;
              if (null != ((a) this).field_q) {
                L1: {
                  var2_long = ji.b(param0 + -278);
                  var4 = (int)(var2_long + -((a) this).field_j);
                  ((a) this).field_j = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((a) this).field_e = ((a) this).field_e + var4;
                if (((a) this).field_e > 30000) {
                  try {
                    L2: {
                      ((a) this).field_q.a(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((a) this).field_q = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (((a) this).field_q == null) {
              L4: {
                if (((a) this).g(-128) != 0) {
                  break L4;
                } else {
                  if (((a) this).b(84) != 0) {
                    break L4;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              try {
                L5: {
                  ((a) this).field_q.b(-120);
                  var2_ref = (cd) (Object) ((a) this).field_d.b((byte) 46);
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (cd) (Object) ((a) this).field_k.b((byte) 46);
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          if (param0 == 255) {
                            L8: while (true) {
                              if (var2_int >= 100) {
                                stackOut_87_0 = 1;
                                stackIn_88_0 = stackOut_87_0;
                                break L5;
                              } else {
                                var3_int = ((a) this).field_q.b((byte) 101);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L9: {
                                      ((a) this).field_e = 0;
                                      var4 = 0;
                                      if (null == ((a) this).field_a) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (((a) this).field_a.field_v != 0) {
                                          break L9;
                                        } else {
                                          var4 = 1;
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var4 > 0) {
                                        L11: {
                                          var5 = -((a) this).field_m.field_i + var4;
                                          if (~var5 < ~var3_int) {
                                            var5 = var3_int;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          ((a) this).field_q.a(((a) this).field_m.field_i, var5, -117, ((a) this).field_m.field_j);
                                          if (((a) this).field_h == 0) {
                                            break L12;
                                          } else {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var6 >= var5) {
                                                break L12;
                                              } else {
                                                ((a) this).field_m.field_j[((a) this).field_m.field_i - -var6] = (byte)gi.a((int) ((a) this).field_m.field_j[((a) this).field_m.field_i + var6], (int) ((a) this).field_h);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                        ((a) this).field_m.field_i = ((a) this).field_m.field_i + var5;
                                        if (~((a) this).field_m.field_i <= ~var4) {
                                          if (((a) this).field_a == null) {
                                            L14: {
                                              ((a) this).field_m.field_i = 0;
                                              var6 = ((a) this).field_m.b((byte) 90);
                                              var7 = ((a) this).field_m.l(0);
                                              var8 = ((a) this).field_m.b((byte) 90);
                                              var9 = ((a) this).field_m.l(param0 + -255);
                                              var10 = 127 & var8;
                                              if (0 == (128 & var8)) {
                                                stackOut_61_0 = 0;
                                                stackIn_62_0 = stackOut_61_0;
                                                break L14;
                                              } else {
                                                stackOut_60_0 = 1;
                                                stackIn_62_0 = stackOut_60_0;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_62_0;
                                              var12 = ((long)var6 << 32) - -(long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (cd) (Object) ((a) this).field_p.b((byte) 46);
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (~var14_ref.field_h != ~var12) {
                                                      var14_ref = (cd) (Object) ((a) this).field_p.b(0);
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (cd) (Object) ((a) this).field_f.b((byte) 46);
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (~var14_ref.field_h != ~var12) {
                                                      var14_ref = (cd) (Object) ((a) this).field_f.b(0);
                                                      continue L17;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L18: {
                                                ((a) this).field_a = var14_ref;
                                                if (var10 == 0) {
                                                  stackOut_78_0 = 5;
                                                  stackIn_79_0 = stackOut_78_0;
                                                  break L18;
                                                } else {
                                                  stackOut_77_0 = 9;
                                                  stackIn_79_0 = stackOut_77_0;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_79_0;
                                              ((a) this).field_a.field_u = new mg(((a) this).field_a.field_s + var9 + var15);
                                              ((a) this).field_a.field_u.a(var10, -99);
                                              ((a) this).field_a.field_u.b(var9, -1);
                                              ((a) this).field_a.field_v = 10;
                                              ((a) this).field_m.field_i = 0;
                                              break L10;
                                            }
                                          } else {
                                            if (0 == ((a) this).field_a.field_v) {
                                              if (((a) this).field_m.field_j[0] == -1) {
                                                ((a) this).field_m.field_i = 0;
                                                ((a) this).field_a.field_v = 1;
                                                break L10;
                                              } else {
                                                ((a) this).field_a = null;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        L19: {
                                          var5 = ((a) this).field_a.field_u.field_j.length + -((a) this).field_a.field_s;
                                          var6 = 512 - ((a) this).field_a.field_v;
                                          if (~(var5 - ((a) this).field_a.field_u.field_i) <= ~var6) {
                                            break L19;
                                          } else {
                                            var6 = var5 - ((a) this).field_a.field_u.field_i;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var6 <= var3_int) {
                                            break L20;
                                          } else {
                                            var6 = var3_int;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          ((a) this).field_q.a(((a) this).field_a.field_u.field_i, var6, 87, ((a) this).field_a.field_u.field_j);
                                          if (((a) this).field_h == 0) {
                                            break L21;
                                          } else {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var6 <= var7) {
                                                break L21;
                                              } else {
                                                ((a) this).field_a.field_u.field_j[((a) this).field_a.field_u.field_i - -var7] = (byte)gi.a((int) ((a) this).field_a.field_u.field_j[((a) this).field_a.field_u.field_i + var7], (int) ((a) this).field_h);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          }
                                        }
                                        ((a) this).field_a.field_v = ((a) this).field_a.field_v + var6;
                                        ((a) this).field_a.field_u.field_i = ((a) this).field_a.field_u.field_i + var6;
                                        if (((a) this).field_a.field_u.field_i == var5) {
                                          ((a) this).field_a.c(-1);
                                          ((a) this).field_a.field_l = false;
                                          ((a) this).field_a = null;
                                          break L10;
                                        } else {
                                          if (((a) this).field_a.field_v != 512) {
                                            break L10;
                                          } else {
                                            ((a) this).field_a.field_v = 0;
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0 != 0;
                          }
                        } else {
                          ((a) this).field_l.field_i = 0;
                          ((a) this).field_l.a(0, -74);
                          ((a) this).field_l.b(115, var2_ref.field_h);
                          ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                          ((a) this).field_f.a(-90, (o) (Object) var2_ref);
                          var2_ref = (cd) (Object) ((a) this).field_k.b(0);
                          continue L7;
                        }
                      }
                    } else {
                      ((a) this).field_l.field_i = 0;
                      ((a) this).field_l.a(1, -41);
                      ((a) this).field_l.b(123, var2_ref.field_h);
                      ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                      ((a) this).field_p.a(param0 ^ -143, (o) (Object) var2_ref);
                      var2_ref = (cd) (Object) ((a) this).field_d.b(0);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((a) this).field_q.a(1);
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
                  ((a) this).field_q = null;
                  ((a) this).field_b = ((a) this).field_b + 1;
                  ((a) this).field_n = -2;
                  if (((a) this).g(-113) != 0) {
                    break L25;
                  } else {
                    if (((a) this).b(param0 + -207) != 0) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_88_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((a) this).field_q.a(1);
              if (param0 <= -5) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((a) this).field_n = -1;
        ((a) this).field_b = ((a) this).field_b + 1;
        ((a) this).field_q = null;
        ((a) this).field_h = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static rg a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        md var4 = null;
        md stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        md stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -1;
            var4 = new md();
            ((rg) (Object) var4).field_b = param0;
            ((rg) (Object) var4).field_a = param1;
            stackOut_0_0 = (md) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("a.A(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -115 + 41);
        }
        return (rg) (Object) stackIn_1_0;
    }

    private final void b(byte param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((a) this).field_q) {
              {
                L0: {
                  ((a) this).field_l.field_i = 0;
                  ((a) this).field_l.a(6, -32);
                  ((a) this).field_l.c(3, 127);
                  ((a) this).field_l.b((byte) -60, 0);
                  ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                  break L0;
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

    public static void a(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        int var1 = -22;
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            mg stackIn_5_0 = null;
            mg stackIn_6_0 = null;
            mg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            mg stackOut_4_0 = null;
            mg stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            mg stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            if (param0 <= -49) {
              if (null != ((a) this).field_q) {
                try {
                  L0: {
                    L1: {
                      ((a) this).field_l.field_i = 0;
                      stackOut_4_0 = ((a) this).field_l;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (param1) {
                        stackOut_6_0 = (mg) (Object) stackIn_6_0;
                        stackOut_6_1 = 2;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_5_0 = (mg) (Object) stackIn_5_0;
                        stackOut_5_1 = 3;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        break L1;
                      }
                    }
                    ((mg) (Object) stackIn_7_0).a(stackIn_7_1, -105);
                    ((a) this).field_l.b(106, 0L);
                    ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        ((a) this).field_q.a(1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    ((a) this).field_n = -2;
                    ((a) this).field_q = null;
                    ((a) this).field_b = ((a) this).field_b + 1;
                    break L2;
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

    final static db[] a(be param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        db[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        db var7 = null;
        int var8 = 0;
        eb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        db[] stackIn_3_0 = null;
        db[] stackIn_9_0 = null;
        db[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        db[] stackOut_13_0 = null;
        db[] stackOut_8_0 = null;
        db[] stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0.b((byte) -120)) {
              var9 = param0.a((byte) 31);
              L1: while (true) {
                if (0 != var9.field_a) {
                  if (var9.field_a != 2) {
                    var13 = (int[]) var9.field_g;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var3 = var10;
                    var4 = new db[var13.length >> 2];
                    var5 = -8;
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var4.length) {
                        stackOut_13_0 = (db[]) var4;
                        stackIn_14_0 = stackOut_13_0;
                        break L0;
                      } else {
                        var7 = new db();
                        var4[var6] = var7;
                        var7.field_d = var3[var6 << 2];
                        var7.field_b = var3[1 + (var6 << 2)];
                        var7.field_e = var3[(var6 << 2) + 2];
                        var7.field_a = var3[3 + (var6 << 2)];
                        var6++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_8_0 = new db[]{};
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  hb.a(10L, 103);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new db[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("a.E(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -119 + 41);
        }
        return stackIn_14_0;
    }

    final void c(int param0) {
        if (param0 != 1) {
            return;
        }
        if (!(((a) this).field_q == null)) {
            ((a) this).field_q.a(1);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            cd var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ((a) this).field_q) {
                    try {
                      L2: {
                        ((a) this).field_q.a(param1 + -19);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((a) this).field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((a) this).field_q = (cb) param0;
                this.b((byte) -103);
                this.a(-54, param2);
                ((a) this).field_a = null;
                ((a) this).field_m.field_i = 0;
                L4: while (true) {
                  var4_ref3 = (cd) (Object) ((a) this).field_p.c(30664);
                  if (var4_ref3 != null) {
                    ((a) this).field_d.a(-79, (o) (Object) var4_ref3);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (cd) (Object) ((a) this).field_f.c(30664);
                      if (var4_ref3 != null) {
                        ((a) this).field_k.a(-63, (o) (Object) var4_ref3);
                        continue L5;
                      } else {
                        L6: {
                          if (((a) this).field_h != 0) {
                            {
                              L7: {
                                ((a) this).field_l.field_i = 0;
                                ((a) this).field_l.a(4, -80);
                                ((a) this).field_l.a((int) ((a) this).field_h, -85);
                                ((a) this).field_l.b(0, -1);
                                ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L11: {
                          ((a) this).field_e = 0;
                          ((a) this).field_j = ji.b(107);
                          if (param1 == 20) {
                            break L11;
                          } else {
                            field_s = null;
                            break L11;
                          }
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_26_0 = (RuntimeException) var4_ref2;
                stackOut_26_1 = new StringBuilder().append("a.G(");
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (param0 == null) {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "null";
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  break L12;
                } else {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "{...}";
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  break L12;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param1 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public a() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        kk.field_U[rc.field_d] = param0;
        bc.field_o[rc.field_d] = rc.field_d;
        tl.field_d[rc.field_d] = param3;
        if (!(param3 <= hc.field_j)) {
            jl.field_d = param3;
        }
        if (am.field_e > param3) {
            qh.field_a = param3;
        }
        vl.field_g[rc.field_d] = param5;
        th.field_f[rc.field_d] = param1;
        ld.field_b[rc.field_d] = param4;
        int var6 = param4 + (param5 - -param1);
        int var7 = var6 == 0 ? 0 : 1000 * param5 / var6;
        rh.field_c[rc.field_d] = var7;
        if (param2 != 9664) {
            field_t = null;
        }
        if (!(var7 <= jl.field_d)) {
            jl.field_d = var7;
        }
        rc.field_d = rc.field_d + 1;
        if (qh.field_a > var7) {
            qh.field_a = var7;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new int[8192];
        field_u = "Confirm Email:";
        field_s = new int[8192];
    }
}
