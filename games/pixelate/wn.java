/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wn extends rf {
    static ak field_t;
    static int field_u;
    static int field_r;
    private mo field_s;
    static int[] field_q;

    final void e(byte param0) {
        try {
            ((wn) this).field_s.b(-1);
        } catch (Exception exception) {
        }
        ((wn) this).field_h = ((wn) this).field_h + 1;
        if (param0 != 0) {
            field_r = 79;
        }
        ((wn) this).field_m = -1;
        ((wn) this).field_s = null;
        ((wn) this).field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void d() {
        io.field_d = hm.a(64);
        on.field_ob = 0;
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            rj var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            var6 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param2 == 8) {
                    break L1;
                  } else {
                    this.e(-125);
                    break L1;
                  }
                }
                L2: {
                  if (((wn) this).field_s != null) {
                    try {
                      L3: {
                        ((wn) this).field_s.b(-1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    ((wn) this).field_s = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((wn) this).field_s = (mo) param0;
                this.e(0);
                this.a((byte) 73, param1);
                ((wn) this).field_g.field_m = 0;
                ((wn) this).field_c = null;
                L5: while (true) {
                  var4_ref3 = (rj) (Object) ((wn) this).field_f.a((byte) 80);
                  if (var4_ref3 != null) {
                    ((wn) this).field_e.a(param2 ^ 84, (lm) (Object) var4_ref3);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref3 = (rj) (Object) ((wn) this).field_p.a((byte) 80);
                      if (var4_ref3 != null) {
                        ((wn) this).field_l.a(param2 + 104, (lm) (Object) var4_ref3);
                        continue L6;
                      } else {
                        L7: {
                          if (0 != ((wn) this).field_a) {
                            {
                              L8: {
                                ((wn) this).field_b.field_m = 0;
                                ((wn) this).field_b.e(160, 4);
                                ((wn) this).field_b.e(160, (int) ((wn) this).field_a);
                                ((wn) this).field_b.d(0, param2 + -126);
                                ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -89, 0, ((wn) this).field_b.field_k);
                                break L8;
                              }
                            }
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ((wn) this).field_o = 0;
                        ((wn) this).field_k = hm.a(64);
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
                stackOut_27_0 = (RuntimeException) var4_ref2;
                stackOut_27_1 = new StringBuilder().append("wn.D(");
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param0 == null) {
                  stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                  stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L12;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L12;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            rj var2_ref = null;
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
            rj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_90_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_89_0 = 0;
            L0: {
              var16 = Pixelate.field_H ? 1 : 0;
              if (null == ((wn) this).field_s) {
                break L0;
              } else {
                L1: {
                  var2_long = hm.a(64);
                  var4 = (int)(var2_long - ((wn) this).field_k);
                  ((wn) this).field_k = var2_long;
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((wn) this).field_o = ((wn) this).field_o + var4;
                if (((wn) this).field_o > 30000) {
                  try {
                    L2: {
                      ((wn) this).field_s.b(-1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((wn) this).field_s = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (((wn) this).field_s == null) {
              if (((wn) this).b(-97) != 0) {
                return false;
              } else {
                if (((wn) this).a((byte) 34) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  ((wn) this).field_s.b((byte) -106);
                  var2_ref = (rj) (Object) ((wn) this).field_e.c(61);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (rj) (Object) ((wn) this).field_l.c(72);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((wn) this).field_s.a(-73);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (0 != var3_int) {
                                    L9: {
                                      ((wn) this).field_o = 0;
                                      var4 = 0;
                                      if (null == ((wn) this).field_c) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (((wn) this).field_c.field_H == 0) {
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
                                          var5 = -((wn) this).field_c.field_B + ((wn) this).field_c.field_D.field_k.length;
                                          var6 = -((wn) this).field_c.field_H + 512;
                                          if (var5 + -((wn) this).field_c.field_D.field_m < var6) {
                                            var6 = -((wn) this).field_c.field_D.field_m + var5;
                                            break L11;
                                          } else {
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
                                          ((wn) this).field_s.a(((wn) this).field_c.field_D.field_k, ((wn) this).field_c.field_D.field_m, (byte) 119, var6);
                                          if (((wn) this).field_a == 0) {
                                            break L13;
                                          } else {
                                            var17 = 0;
                                            var7 = var17;
                                            L14: while (true) {
                                              if (var17 >= var6) {
                                                break L13;
                                              } else {
                                                ((wn) this).field_c.field_D.field_k[((wn) this).field_c.field_D.field_m + var17] = (byte)bn.a((int) ((wn) this).field_c.field_D.field_k[((wn) this).field_c.field_D.field_m + var17], (int) ((wn) this).field_a);
                                                var17++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        ((wn) this).field_c.field_H = ((wn) this).field_c.field_H + var6;
                                        ((wn) this).field_c.field_D.field_m = ((wn) this).field_c.field_D.field_m + var6;
                                        if (var5 != ((wn) this).field_c.field_D.field_m) {
                                          if (((wn) this).field_c.field_H != 512) {
                                            break L10;
                                          } else {
                                            ((wn) this).field_c.field_H = 0;
                                            break L10;
                                          }
                                        } else {
                                          ((wn) this).field_c.e(17);
                                          ((wn) this).field_c.field_v = false;
                                          ((wn) this).field_c = null;
                                          break L10;
                                        }
                                      } else {
                                        L15: {
                                          var5 = -((wn) this).field_g.field_m + var4;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((wn) this).field_s.a(((wn) this).field_g.field_k, ((wn) this).field_g.field_m, (byte) 119, var5);
                                          if (0 != ((wn) this).field_a) {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var5 <= var6) {
                                                break L16;
                                              } else {
                                                ((wn) this).field_g.field_k[var6 + ((wn) this).field_g.field_m] = (byte)bn.a((int) ((wn) this).field_g.field_k[var6 + ((wn) this).field_g.field_m], (int) ((wn) this).field_a);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                        ((wn) this).field_g.field_m = ((wn) this).field_g.field_m + var5;
                                        if (var4 <= ((wn) this).field_g.field_m) {
                                          if (null == ((wn) this).field_c) {
                                            L18: {
                                              ((wn) this).field_g.field_m = 0;
                                              var6 = ((wn) this).field_g.f(255);
                                              var7 = ((wn) this).field_g.k(0);
                                              var8 = ((wn) this).field_g.f(255);
                                              var9 = ((wn) this).field_g.k(0);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_49_0 = 0;
                                                stackIn_50_0 = stackOut_49_0;
                                                break L18;
                                              } else {
                                                stackOut_48_0 = 1;
                                                stackIn_50_0 = stackOut_48_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_50_0;
                                              var12 = ((long)var6 << 32) - -(long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (rj) (Object) ((wn) this).field_f.c(96);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (~var14_ref.field_q != ~var12) {
                                                      var14_ref = (rj) (Object) ((wn) this).field_f.a(65151);
                                                      continue L20;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (rj) (Object) ((wn) this).field_p.c(62);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var14_ref.field_q != var12) {
                                                      var14_ref = (rj) (Object) ((wn) this).field_p.a(65151);
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
                                                  stackOut_65_0 = 5;
                                                  stackIn_66_0 = stackOut_65_0;
                                                  break L22;
                                                } else {
                                                  stackOut_64_0 = 9;
                                                  stackIn_66_0 = stackOut_64_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              ((wn) this).field_c = var14_ref;
                                              ((wn) this).field_c.field_D = new we(var15 + var9 - -((wn) this).field_c.field_B);
                                              ((wn) this).field_c.field_D.e(160, var10);
                                              ((wn) this).field_c.field_D.d(var9, -59);
                                              ((wn) this).field_c.field_H = 10;
                                              ((wn) this).field_g.field_m = 0;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            if (((wn) this).field_c.field_H == 0) {
                                              if (((wn) this).field_g.field_k[0] == -1) {
                                                ((wn) this).field_c.field_H = 1;
                                                ((wn) this).field_g.field_m = 0;
                                                break L10;
                                              } else {
                                                ((wn) this).field_c = null;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L10;
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
                            L23: {
                              if (!param0) {
                                break L23;
                              } else {
                                wn.c(-11);
                                break L23;
                              }
                            }
                            stackOut_89_0 = 1;
                            stackIn_90_0 = stackOut_89_0;
                            break L4;
                          }
                        } else {
                          ((wn) this).field_b.field_m = 0;
                          ((wn) this).field_b.e(160, 0);
                          ((wn) this).field_b.a(var2_ref.field_q, 91);
                          ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -113, 0, ((wn) this).field_b.field_k);
                          ((wn) this).field_p.a(-114, (lm) (Object) var2_ref);
                          var2_ref = (rj) (Object) ((wn) this).field_l.a(65151);
                          continue L6;
                        }
                      }
                    } else {
                      ((wn) this).field_b.field_m = 0;
                      ((wn) this).field_b.e(160, 1);
                      ((wn) this).field_b.a(var2_ref.field_q, 109);
                      ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -118, 0, ((wn) this).field_b.field_k);
                      ((wn) this).field_f.a(98, (lm) (Object) var2_ref);
                      var2_ref = (rj) (Object) ((wn) this).field_e.a(65151);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((wn) this).field_s.b(-1);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  ((wn) this).field_h = ((wn) this).field_h + 1;
                  ((wn) this).field_s = null;
                  ((wn) this).field_m = -2;
                  if (0 != ((wn) this).b(-30)) {
                    break L26;
                  } else {
                    if (((wn) this).a((byte) 34) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_90_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f() {
        field_q = null;
        field_t = null;
    }

    private final void e(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((wn) this).field_s == null) {
              return;
            } else {
              {
                L0: {
                  ((wn) this).field_b.field_m = 0;
                  ((wn) this).field_b.e(160, 6);
                  ((wn) this).field_b.a(3, (byte) 109);
                  ((wn) this).field_b.b(1276387944, 0);
                  ((wn) this).field_s.a(((wn) this).field_b.field_k.length, param0 ^ -103, param0, ((wn) this).field_b.field_k);
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

    final static void c(int param0) {
        pj[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        pj[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5 = up.field_n;
            var1 = var5;
            var2 = param0;
            L1: while (true) {
              if (var5.length <= var2) {
                break L0;
              } else {
                var3 = var5[var2];
                var3.a(-110);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1_ref, "wn.E(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = -89 % ((param0 - 82) / 33);
        if (!(((wn) this).field_s == null)) {
            ((wn) this).field_s.b(-1);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            we stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            we stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            we stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            we stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            we stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            we stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (((wn) this).field_s == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((wn) this).field_b.field_m = 0;
                    stackOut_3_0 = ((wn) this).field_b;
                    stackOut_3_1 = 160;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (!param1) {
                      stackOut_5_0 = (we) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (we) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((we) (Object) stackIn_6_0).e(stackIn_6_1, stackIn_6_2);
                  ((wn) this).field_b.a(0L, -59);
                  ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -85, 0, ((wn) this).field_b.field_k);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((wn) this).field_s.b(-1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((wn) this).field_h = ((wn) this).field_h + 1;
                  ((wn) this).field_m = -2;
                  ((wn) this).field_s = null;
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

    public wn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 256;
        field_q = new int[8192];
    }
}
