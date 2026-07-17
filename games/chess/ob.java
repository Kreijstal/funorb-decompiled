/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ob extends wm {
    static int field_t;
    static hg field_v;
    static String field_r;
    static int field_C;
    static String field_y;
    static boolean field_w;
    static String field_z;
    static int[] field_u;
    private hn field_s;
    static rk field_B;
    static String field_x;
    static String field_A;

    public static void b(boolean param0) {
        field_B = null;
        field_x = null;
        field_r = null;
        field_y = null;
        field_z = null;
        field_u = null;
        field_v = null;
        field_A = null;
    }

    final static void f(int param0) {
        int var1_int = 0;
        int var2 = Chess.field_G;
        try {
            v.field_e.b((byte) 40);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                vj.field_f[var1_int] = 0L;
            }
            for (var1_int = param0; var1_int < 32; var1_int++) {
                fi.field_d[var1_int] = 0L;
            }
            hk.field_M = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ob.P(" + param0 + 41);
        }
    }

    final void a(byte param0) {
        if (param0 != -103) {
            field_t = -117;
        }
        if (!(null == ((ob) this).field_s)) {
            ((ob) this).field_s.a(-1);
        }
    }

    final void a(byte param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            cc var4_ref3 = null;
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
            var6 = Chess.field_G;
            try {
              L0: {
                L1: {
                  if (null == ((ob) this).field_s) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((ob) this).field_s.a(-1);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ob) this).field_s = null;
                    break L1;
                  }
                }
                ((ob) this).field_s = (hn) param1;
                this.c((byte) 67);
                this.a(param2, true);
                ((ob) this).field_h = null;
                ((ob) this).field_a.field_l = 0;
                L4: while (true) {
                  var4_ref3 = (cc) (Object) ((ob) this).field_e.a((byte) -75);
                  if (var4_ref3 != null) {
                    ((ob) this).field_o.a(0, (l) (Object) var4_ref3);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (cc) (Object) ((ob) this).field_p.a((byte) -75);
                      if (var4_ref3 != null) {
                        ((ob) this).field_f.a(0, (l) (Object) var4_ref3);
                        continue L5;
                      } else {
                        L6: {
                          if (((ob) this).field_k != 0) {
                            {
                              L7: {
                                ((ob) this).field_l.field_l = 0;
                                ((ob) this).field_l.c(4, (byte) 83);
                                ((ob) this).field_l.c((int) ((ob) this).field_k, (byte) 57);
                                ((ob) this).field_l.d(0, (byte) -81);
                                ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((ob) this).field_m = 0;
                        if (param0 == 45) {
                          ((ob) this).field_d = ud.a(2);
                          break L0;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_26_0 = (RuntimeException) var4_ref2;
                stackOut_26_1 = new StringBuilder().append("ob.B(").append(param0).append(44);
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
                  break L11;
                } else {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "{...}";
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  break L11;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        try {
            if (param0 != 0) {
                this.c((byte) -61);
            }
            ((ob) this).field_s.a(~param0);
        } catch (Exception exception) {
        }
        ((ob) this).field_c = -1;
        ((ob) this).field_s = null;
        ((ob) this).field_g = ((ob) this).field_g + 1;
        ((ob) this).field_k = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    private final void c(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((ob) this).field_s) {
              try {
                L0: {
                  ((ob) this).field_l.field_l = 0;
                  ((ob) this).field_l.c(6, (byte) 51);
                  ((ob) this).field_l.c(param0 ^ -68, 3);
                  ((ob) this).field_l.b(0, 93);
                  if (param0 == 67) {
                    ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      ((ob) this).field_s.a(-1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ob) this).field_s = null;
                  ((ob) this).field_g = ((ob) this).field_g + 1;
                  ((ob) this).field_c = -2;
                  break L1;
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

    final static String d(byte param0) {
        if (!(ci.field_ub != g.field_a)) {
            return jd.field_d;
        }
        if (!(ci.field_ub != vl.field_A)) {
            return lc.field_e;
        }
        if (param0 > -98) {
            String discarded$0 = ob.d((byte) 73);
        }
        if (!pi.field_c.b((byte) 107)) {
            return lc.field_e;
        }
        return pi.field_a;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            p stackIn_4_0 = null;
            p stackIn_5_0 = null;
            p stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            p stackOut_3_0 = null;
            p stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            p stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (((ob) this).field_s == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((ob) this).field_l.field_l = 0;
                    stackOut_3_0 = ((ob) this).field_l;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param0) {
                      stackOut_5_0 = (p) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (p) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((p) (Object) stackIn_6_0).c(stackIn_6_1, (byte) -65);
                  ((ob) this).field_l.a(0L, 1392038664);
                  ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((ob) this).field_s.a(-1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((ob) this).field_c = -2;
                  ((ob) this).field_g = ((ob) this).field_g + 1;
                  ((ob) this).field_s = null;
                  break L2;
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

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            cc var2_ref = null;
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
            cc var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_18_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_86_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_85_0 = 0;
            int stackOut_17_0 = 0;
            L0: {
              var16 = Chess.field_G;
              if (((ob) this).field_s != null) {
                L1: {
                  var2_long = ud.a(2);
                  var4 = (int)(var2_long + -((ob) this).field_d);
                  ((ob) this).field_d = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((ob) this).field_m = ((ob) this).field_m + var4;
                if (((ob) this).field_m > 30000) {
                  try {
                    L2: {
                      ((ob) this).field_s.a(-1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ob) this).field_s = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != ((ob) this).field_s) {
              try {
                L4: {
                  ((ob) this).field_s.a((byte) -41);
                  var2_ref = (cc) (Object) ((ob) this).field_o.b(-22585);
                  if (param0 == -31259) {
                    L5: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (cc) (Object) ((ob) this).field_f.b(-22585);
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (var2_int >= 100) {
                                  break L8;
                                } else {
                                  var3_int = ((ob) this).field_s.c(0);
                                  if (var3_int < 0) {
                                    throw new IOException();
                                  } else {
                                    if (var3_int != 0) {
                                      L9: {
                                        ((ob) this).field_m = 0;
                                        var4 = 0;
                                        if (((ob) this).field_h == null) {
                                          var4 = 10;
                                          break L9;
                                        } else {
                                          if (((ob) this).field_h.field_w == 0) {
                                            var4 = 1;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (0 >= var4) {
                                          L11: {
                                            var5 = -((ob) this).field_h.field_x + ((ob) this).field_h.field_y.field_o.length;
                                            var6 = 512 + -((ob) this).field_h.field_w;
                                            if (~var6 >= ~(-((ob) this).field_h.field_y.field_l + var5)) {
                                              break L11;
                                            } else {
                                              var6 = var5 + -((ob) this).field_h.field_y.field_l;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (~var3_int <= ~var6) {
                                              break L12;
                                            } else {
                                              var6 = var3_int;
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            ((ob) this).field_s.a(((ob) this).field_h.field_y.field_o, var6, (byte) -87, ((ob) this).field_h.field_y.field_l);
                                            if (((ob) this).field_k == 0) {
                                              break L13;
                                            } else {
                                              var7 = 0;
                                              L14: while (true) {
                                                if (~var7 <= ~var6) {
                                                  break L13;
                                                } else {
                                                  ((ob) this).field_h.field_y.field_o[var7 + ((ob) this).field_h.field_y.field_l] = (byte)dm.a((int) ((ob) this).field_h.field_y.field_o[var7 + ((ob) this).field_h.field_y.field_l], (int) ((ob) this).field_k);
                                                  var7++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          }
                                          ((ob) this).field_h.field_y.field_l = ((ob) this).field_h.field_y.field_l + var6;
                                          ((ob) this).field_h.field_w = ((ob) this).field_h.field_w + var6;
                                          if (((ob) this).field_h.field_y.field_l == var5) {
                                            ((ob) this).field_h.d(-1);
                                            ((ob) this).field_h.field_s = false;
                                            ((ob) this).field_h = null;
                                            break L10;
                                          } else {
                                            if (((ob) this).field_h.field_w != 512) {
                                              break L10;
                                            } else {
                                              ((ob) this).field_h.field_w = 0;
                                              break L10;
                                            }
                                          }
                                        } else {
                                          L15: {
                                            var5 = -((ob) this).field_a.field_l + var4;
                                            if (~var5 < ~var3_int) {
                                              var5 = var3_int;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            ((ob) this).field_s.a(((ob) this).field_a.field_o, var5, (byte) -87, ((ob) this).field_a.field_l);
                                            if (((ob) this).field_k != 0) {
                                              var6 = 0;
                                              L17: while (true) {
                                                if (var5 <= var6) {
                                                  break L16;
                                                } else {
                                                  ((ob) this).field_a.field_o[var6 + ((ob) this).field_a.field_l] = (byte)dm.a((int) ((ob) this).field_a.field_o[var6 + ((ob) this).field_a.field_l], (int) ((ob) this).field_k);
                                                  var6++;
                                                  continue L17;
                                                }
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                          ((ob) this).field_a.field_l = ((ob) this).field_a.field_l + var5;
                                          if (var4 > ((ob) this).field_a.field_l) {
                                            break L10;
                                          } else {
                                            if (((ob) this).field_h == null) {
                                              L18: {
                                                ((ob) this).field_a.field_l = 0;
                                                var6 = ((ob) this).field_a.i(-102);
                                                var7 = ((ob) this).field_a.e((byte) -99);
                                                var8 = ((ob) this).field_a.i(-126);
                                                var9 = ((ob) this).field_a.e((byte) -110);
                                                var10 = 127 & var8;
                                                if ((128 & var8) == 0) {
                                                  stackOut_50_0 = 0;
                                                  stackIn_51_0 = stackOut_50_0;
                                                  break L18;
                                                } else {
                                                  stackOut_49_0 = 1;
                                                  stackIn_51_0 = stackOut_49_0;
                                                  break L18;
                                                }
                                              }
                                              L19: {
                                                var11 = stackIn_51_0;
                                                var12 = (long)var7 + ((long)var6 << 32);
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (cc) (Object) ((ob) this).field_e.b(-22585);
                                                  L20: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if (~var14_ref.field_l == ~var12) {
                                                        break L19;
                                                      } else {
                                                        var14_ref = (cc) (Object) ((ob) this).field_e.b((byte) -106);
                                                        continue L20;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (cc) (Object) ((ob) this).field_p.b(-22585);
                                                  L21: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if (~var14_ref.field_l != ~var12) {
                                                        var14_ref = (cc) (Object) ((ob) this).field_p.b((byte) -73);
                                                        continue L21;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref != null) {
                                                L22: {
                                                  if (var10 != 0) {
                                                    stackOut_65_0 = 9;
                                                    stackIn_66_0 = stackOut_65_0;
                                                    break L22;
                                                  } else {
                                                    stackOut_64_0 = 5;
                                                    stackIn_66_0 = stackOut_64_0;
                                                    break L22;
                                                  }
                                                }
                                                var15 = stackIn_66_0;
                                                ((ob) this).field_h = var14_ref;
                                                ((ob) this).field_h.field_y = new p(var9 + var15 + ((ob) this).field_h.field_x);
                                                ((ob) this).field_h.field_y.c(var10, (byte) 90);
                                                ((ob) this).field_h.field_y.d(var9, (byte) -81);
                                                ((ob) this).field_a.field_l = 0;
                                                ((ob) this).field_h.field_w = 10;
                                                break L10;
                                              } else {
                                                throw new IOException();
                                              }
                                            } else {
                                              if (((ob) this).field_h.field_w != 0) {
                                                throw new IOException();
                                              } else {
                                                if (((ob) this).field_a.field_o[0] == -1) {
                                                  ((ob) this).field_a.field_l = 0;
                                                  ((ob) this).field_h.field_w = 1;
                                                  break L10;
                                                } else {
                                                  ((ob) this).field_h = null;
                                                  break L10;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              stackOut_85_0 = 1;
                              stackIn_86_0 = stackOut_85_0;
                              break L4;
                            }
                          } else {
                            ((ob) this).field_l.field_l = 0;
                            ((ob) this).field_l.c(0, (byte) -110);
                            ((ob) this).field_l.a(var2_ref.field_l, 1392038664);
                            ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                            ((ob) this).field_p.a(0, (l) (Object) var2_ref);
                            var2_ref = (cc) (Object) ((ob) this).field_f.b((byte) -93);
                            continue L6;
                          }
                        }
                      } else {
                        ((ob) this).field_l.field_l = 0;
                        ((ob) this).field_l.c(1, (byte) -52);
                        ((ob) this).field_l.a(var2_ref.field_l, 1392038664);
                        ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                        ((ob) this).field_e.a(0, (l) (Object) var2_ref);
                        var2_ref = (cc) (Object) ((ob) this).field_o.b((byte) -73);
                        continue L5;
                      }
                    }
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((ob) this).field_s.a(param0 ^ 31258);
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
                  ((ob) this).field_g = ((ob) this).field_g + 1;
                  ((ob) this).field_c = -2;
                  ((ob) this).field_s = null;
                  if (((ob) this).d(14562) != 0) {
                    break L25;
                  } else {
                    if (0 == ((ob) this).a(param0 + 28108)) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_86_0 != 0;
            } else {
              if (0 != ((ob) this).d(param0 ^ -17145)) {
                return false;
              } else {
                if (((ob) this).a(-3151) == 0) {
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

    public ob() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 2;
        field_r = "Game options";
        field_y = "Quick Chat Help";
        field_v = new hg(10, 2, 2, 0);
        field_u = new int[8192];
        field_x = "You have not yet unlocked this option for use.";
        field_A = "(1 player wants to join)";
    }
}
