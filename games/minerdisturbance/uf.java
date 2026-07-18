/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf extends ch {
    static char[] field_q;
    static String[] field_w;
    static nm field_r;
    static String field_t;
    static gf[] field_p;
    static String field_v;
    private ll field_s;
    static String field_u;

    final void b(byte param0) {
        if (!(((uf) this).field_s == null)) {
            ((uf) this).field_s.b(122);
        }
        int var2 = 90 % ((param0 - -57) / 40);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(nn.a(110, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("uf.K(").append(13).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ee var2_ref = null;
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
            ee var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_44_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_82_0 = 0;
            L0: {
              var16 = MinerDisturbance.field_ab;
              if (((uf) this).field_s != null) {
                L1: {
                  var2_long = sf.a((byte) 103);
                  var4 = (int)(var2_long + -((uf) this).field_e);
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((uf) this).field_e = var2_long;
                ((uf) this).field_d = ((uf) this).field_d + var4;
                if (((uf) this).field_d <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((uf) this).field_s.b(91);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((uf) this).field_s = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != ((uf) this).field_s) {
              try {
                L4: {
                  ((uf) this).field_s.a((byte) 124);
                  var2_ref = (ee) (Object) ((uf) this).field_n.a(87);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ee) (Object) ((uf) this).field_l.a(117);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var3_int = 96 / ((param0 - 52) / 60);
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((uf) this).field_s.c(0);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((uf) this).field_d = 0;
                                      var4 = 0;
                                      if (((uf) this).field_c != null) {
                                        if (0 == ((uf) this).field_c.field_D) {
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
                                      if (var4 <= 0) {
                                        L11: {
                                          var5 = ((uf) this).field_c.field_G.field_u.length + -((uf) this).field_c.field_I;
                                          var6 = 512 - ((uf) this).field_c.field_D;
                                          if (~var6 < ~(var5 + -((uf) this).field_c.field_G.field_o)) {
                                            var6 = var5 + -((uf) this).field_c.field_G.field_o;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((uf) this).field_s.a(false, ((uf) this).field_c.field_G.field_u, ((uf) this).field_c.field_G.field_o, var6);
                                          if (((uf) this).field_b != 0) {
                                            var17 = 0;
                                            var7 = var17;
                                            L14: while (true) {
                                              if (var17 >= var6) {
                                                break L13;
                                              } else {
                                                ((uf) this).field_c.field_G.field_u[((uf) this).field_c.field_G.field_o - -var17] = (byte)eg.a((int) ((uf) this).field_c.field_G.field_u[((uf) this).field_c.field_G.field_o + var17], (int) ((uf) this).field_b);
                                                var17++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        ((uf) this).field_c.field_D = ((uf) this).field_c.field_D + var6;
                                        ((uf) this).field_c.field_G.field_o = ((uf) this).field_c.field_G.field_o + var6;
                                        if (((uf) this).field_c.field_G.field_o == var5) {
                                          ((uf) this).field_c.a((byte) -119);
                                          ((uf) this).field_c.field_C = false;
                                          ((uf) this).field_c = null;
                                          break L10;
                                        } else {
                                          if (((uf) this).field_c.field_D == 512) {
                                            ((uf) this).field_c.field_D = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      } else {
                                        L15: {
                                          var5 = var4 - ((uf) this).field_a.field_o;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((uf) this).field_s.a(false, ((uf) this).field_a.field_u, ((uf) this).field_a.field_o, var5);
                                          if (((uf) this).field_b == 0) {
                                            break L16;
                                          } else {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (~var5 >= ~var6) {
                                                break L16;
                                              } else {
                                                ((uf) this).field_a.field_u[((uf) this).field_a.field_o + var6] = (byte)eg.a((int) ((uf) this).field_a.field_u[((uf) this).field_a.field_o + var6], (int) ((uf) this).field_b);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                        ((uf) this).field_a.field_o = ((uf) this).field_a.field_o + var5;
                                        if (~((uf) this).field_a.field_o > ~var4) {
                                          break L10;
                                        } else {
                                          if (null != ((uf) this).field_c) {
                                            if (((uf) this).field_c.field_D != 0) {
                                              throw new IOException();
                                            } else {
                                              if (((uf) this).field_a.field_u[0] == -1) {
                                                ((uf) this).field_a.field_o = 0;
                                                ((uf) this).field_c.field_D = 1;
                                                break L10;
                                              } else {
                                                ((uf) this).field_c = null;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              ((uf) this).field_a.field_o = 0;
                                              var6 = ((uf) this).field_a.d((byte) -54);
                                              var7 = ((uf) this).field_a.b((byte) 49);
                                              var8 = ((uf) this).field_a.d((byte) -54);
                                              var9 = ((uf) this).field_a.b((byte) 83);
                                              var10 = var8 & 127;
                                              if ((128 & var8) == 0) {
                                                stackOut_43_0 = 0;
                                                stackIn_44_0 = stackOut_43_0;
                                                break L18;
                                              } else {
                                                stackOut_42_0 = 1;
                                                stackIn_44_0 = stackOut_42_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_44_0;
                                              var12 = ((long)var6 << 32) - -(long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ee) (Object) ((uf) this).field_m.a(-123);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var14_ref.field_p == var12) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (ee) (Object) ((uf) this).field_m.d(-128);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ee) (Object) ((uf) this).field_i.a(-78);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var14_ref.field_p != var12) {
                                                      var14_ref = (ee) (Object) ((uf) this).field_i.d(126);
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
                                                if (var10 == 0) {
                                                  stackOut_58_0 = 5;
                                                  stackIn_59_0 = stackOut_58_0;
                                                  break L22;
                                                } else {
                                                  stackOut_57_0 = 9;
                                                  stackIn_59_0 = stackOut_57_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_59_0;
                                              ((uf) this).field_c = var14_ref;
                                              ((uf) this).field_c.field_G = new sb(((uf) this).field_c.field_I + var15 + var9);
                                              ((uf) this).field_c.field_G.c(var10, 25564);
                                              ((uf) this).field_c.field_G.a((byte) 92, var9);
                                              ((uf) this).field_a.field_o = 0;
                                              ((uf) this).field_c.field_D = 10;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
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
                          ((uf) this).field_k.field_o = 0;
                          ((uf) this).field_k.c(0, 25564);
                          ((uf) this).field_k.a(-82, var2_ref.field_p);
                          ((uf) this).field_s.a((byte) 93, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                          ((uf) this).field_m.a((al) (Object) var2_ref, false);
                          var2_ref = (ee) (Object) ((uf) this).field_l.d(126);
                          continue L6;
                        }
                      }
                    } else {
                      ((uf) this).field_k.field_o = 0;
                      ((uf) this).field_k.c(1, 25564);
                      ((uf) this).field_k.a(-107, var2_ref.field_p);
                      ((uf) this).field_s.a((byte) 100, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                      ((uf) this).field_i.a((al) (Object) var2_ref, false);
                      var2_ref = (ee) (Object) ((uf) this).field_n.d(-68);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((uf) this).field_s.b(122);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                ((uf) this).field_s = null;
                ((uf) this).field_j = -2;
                ((uf) this).field_o = ((uf) this).field_o + 1;
                if (((uf) this).a(-11975) != 0) {
                  return false;
                } else {
                  if (((uf) this).b(1461895584) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              return stackIn_83_0 != 0;
            } else {
              L25: {
                if (0 != ((uf) this).a(-11975)) {
                  break L25;
                } else {
                  if (((uf) this).b(1461895584) != 0) {
                    break L25;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        try {
            ((uf) this).field_s.b(124);
        } catch (Exception exception) {
        }
        ((uf) this).field_o = ((uf) this).field_o + 1;
        ((uf) this).field_j = -1;
        ((uf) this).field_s = null;
        ((uf) this).field_b = (byte)(int)(Math.random() * 255.0 + 1.0);
        if (param0 != 20) {
            ((uf) this).field_s = null;
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_v = null;
        field_r = null;
        field_q = null;
        field_u = null;
        if (param0 != 200) {
            uf.f(119);
        }
        field_w = null;
        field_p = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            sb stackIn_3_0 = null;
            sb stackIn_4_0 = null;
            sb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            sb stackOut_2_0 = null;
            sb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            sb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            if (null != ((uf) this).field_s) {
              try {
                L0: {
                  L1: {
                    ((uf) this).field_k.field_o = 0;
                    stackOut_2_0 = ((uf) this).field_k;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (param0) {
                      stackOut_4_0 = (sb) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L1;
                    } else {
                      stackOut_3_0 = (sb) (Object) stackIn_3_0;
                      stackOut_3_1 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L1;
                    }
                  }
                  ((sb) (Object) stackIn_5_0).c(stackIn_5_1, 25564);
                  ((uf) this).field_k.a(-116, 0L);
                  ((uf) this).field_s.a((byte) 120, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((uf) this).field_s.b(97);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((uf) this).field_s = null;
                  ((uf) this).field_o = ((uf) this).field_o + 1;
                  ((uf) this).field_j = -2;
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

    private final void e(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((uf) this).field_s) {
              {
                L0: {
                  ((uf) this).field_k.field_o = 0;
                  ((uf) this).field_k.c(6, 25564);
                  ((uf) this).field_k.a(3, (byte) -113);
                  ((uf) this).field_k.b((byte) 124, 0);
                  ((uf) this).field_s.a((byte) 107, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ee var4_ref3 = null;
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
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  if (((uf) this).field_s != null) {
                    try {
                      L2: {
                        ((uf) this).field_s.b(param2 + -24355);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((uf) this).field_s = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((uf) this).field_s = (ll) param0;
                this.e(-101);
                this.a(param1, -18232);
                if (param2 == 24458) {
                  ((uf) this).field_c = null;
                  ((uf) this).field_a.field_o = 0;
                  L4: while (true) {
                    var4_ref3 = (ee) (Object) ((uf) this).field_i.c(8192);
                    if (var4_ref3 != null) {
                      ((uf) this).field_n.a((al) (Object) var4_ref3, false);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref3 = (ee) (Object) ((uf) this).field_m.c(8192);
                        if (var4_ref3 == null) {
                          L6: {
                            if (((uf) this).field_b != 0) {
                              {
                                L7: {
                                  ((uf) this).field_k.field_o = 0;
                                  ((uf) this).field_k.c(4, 25564);
                                  ((uf) this).field_k.c((int) ((uf) this).field_b, param2 ^ 15446);
                                  ((uf) this).field_k.a((byte) 105, 0);
                                  ((uf) this).field_s.a((byte) 106, ((uf) this).field_k.field_u, ((uf) this).field_k.field_u.length, 0);
                                  break L7;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((uf) this).field_d = 0;
                          ((uf) this).field_e = sf.a((byte) -45);
                          break L0;
                        } else {
                          ((uf) this).field_l.a((al) (Object) var4_ref3, false);
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_26_0 = (RuntimeException) var4_ref2;
                stackOut_26_1 = new StringBuilder().append("uf.B(");
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
              throw lj.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public uf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_t = "Type your age in years";
        field_q = new char[]{'\r', '\n'};
        field_p = new gf[1000];
        field_v = "Press <img=18> to continue.";
        field_u = "The micro drill! Its ultra lightweight frame allows you to mine in mid-air or while swimming. If you're a miner on the move, make this a priority purchase.";
    }
}
