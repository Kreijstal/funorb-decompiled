/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ih extends ej {
    static vl field_x;
    static String field_z;
    static String field_u;
    static bd field_v;
    static volatile boolean field_s;
    private td field_t;
    static int field_w;
    static oc[] field_y;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            lm var2_ref = null;
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
            lm var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_48_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_83_0 = 0;
            L0: {
              var16 = HostileSpawn.field_I ? 1 : 0;
              if (null == ((ih) this).field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = hn.a((byte) 80);
                  var4 = (int)(-((ih) this).field_c + var2_long);
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ih) this).field_c = var2_long;
                ((ih) this).field_f = ((ih) this).field_f + var4;
                if (((ih) this).field_f > 30000) {
                  try {
                    L2: {
                      ((ih) this).field_t.a(37);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ih) this).field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (param0 < -75) {
              if (((ih) this).field_t != null) {
                try {
                  L4: {
                    ((ih) this).field_t.a((byte) -55);
                    var2_ref = (lm) (Object) ((ih) this).field_b.d((byte) -35);
                    L5: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (lm) (Object) ((ih) this).field_l.d((byte) -35);
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (100 <= var2_int) {
                                  break L8;
                                } else {
                                  var3_int = ((ih) this).field_t.b((byte) 59);
                                  if (var3_int >= 0) {
                                    if (var3_int == 0) {
                                      break L8;
                                    } else {
                                      L9: {
                                        ((ih) this).field_f = 0;
                                        var4 = 0;
                                        if (null != ((ih) this).field_p) {
                                          if (((ih) this).field_p.field_x == 0) {
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
                                            var5 = ((ih) this).field_p.field_C.field_n.length + -((ih) this).field_p.field_B;
                                            var6 = -((ih) this).field_p.field_x + 512;
                                            if (~(var5 - ((ih) this).field_p.field_C.field_i) <= ~var6) {
                                              break L11;
                                            } else {
                                              var6 = -((ih) this).field_p.field_C.field_i + var5;
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
                                            ((ih) this).field_t.a(-1, ((ih) this).field_p.field_C.field_n, ((ih) this).field_p.field_C.field_i, var6);
                                            if (((ih) this).field_r != 0) {
                                              var17 = 0;
                                              var7 = var17;
                                              L14: while (true) {
                                                if (~var17 <= ~var6) {
                                                  break L13;
                                                } else {
                                                  ((ih) this).field_p.field_C.field_n[((ih) this).field_p.field_C.field_i - -var17] = (byte)bm.a((int) ((ih) this).field_p.field_C.field_n[((ih) this).field_p.field_C.field_i + var17], (int) ((ih) this).field_r);
                                                  var17++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((ih) this).field_p.field_x = ((ih) this).field_p.field_x + var6;
                                          ((ih) this).field_p.field_C.field_i = ((ih) this).field_p.field_C.field_i + var6;
                                          if (~((ih) this).field_p.field_C.field_i != ~var5) {
                                            if (((ih) this).field_p.field_x == 512) {
                                              ((ih) this).field_p.field_x = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            ((ih) this).field_p.c(-1);
                                            ((ih) this).field_p.field_v = false;
                                            ((ih) this).field_p = null;
                                            break L10;
                                          }
                                        } else {
                                          L15: {
                                            var5 = var4 - ((ih) this).field_i.field_i;
                                            if (var5 > var3_int) {
                                              var5 = var3_int;
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            ((ih) this).field_t.a(-1, ((ih) this).field_i.field_n, ((ih) this).field_i.field_i, var5);
                                            if (((ih) this).field_r != 0) {
                                              var6 = 0;
                                              L17: while (true) {
                                                if (var5 <= var6) {
                                                  break L16;
                                                } else {
                                                  ((ih) this).field_i.field_n[var6 + ((ih) this).field_i.field_i] = (byte)bm.a((int) ((ih) this).field_i.field_n[var6 + ((ih) this).field_i.field_i], (int) ((ih) this).field_r);
                                                  var6++;
                                                  continue L17;
                                                }
                                              }
                                            } else {
                                              break L16;
                                            }
                                          }
                                          ((ih) this).field_i.field_i = ((ih) this).field_i.field_i + var5;
                                          if (~((ih) this).field_i.field_i > ~var4) {
                                            break L10;
                                          } else {
                                            if (null == ((ih) this).field_p) {
                                              L18: {
                                                ((ih) this).field_i.field_i = 0;
                                                var6 = ((ih) this).field_i.l(32270);
                                                var7 = ((ih) this).field_i.d(8195);
                                                var8 = ((ih) this).field_i.l(32270);
                                                var9 = ((ih) this).field_i.d(8195);
                                                var10 = var8 & 127;
                                                if ((128 & var8) == 0) {
                                                  stackOut_47_0 = 0;
                                                  stackIn_48_0 = stackOut_47_0;
                                                  break L18;
                                                } else {
                                                  stackOut_46_0 = 1;
                                                  stackIn_48_0 = stackOut_46_0;
                                                  break L18;
                                                }
                                              }
                                              L19: {
                                                var11 = stackIn_48_0;
                                                var12 = ((long)var6 << 32) - -(long)var7;
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (lm) (Object) ((ih) this).field_a.d((byte) -35);
                                                  L20: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if (~var12 == ~var14_ref.field_h) {
                                                        break L19;
                                                      } else {
                                                        var14_ref = (lm) (Object) ((ih) this).field_a.b((byte) -18);
                                                        continue L20;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (lm) (Object) ((ih) this).field_j.d((byte) -35);
                                                  L21: while (true) {
                                                    if (var14_ref == null) {
                                                      break L19;
                                                    } else {
                                                      if (var14_ref.field_h == var12) {
                                                        break L19;
                                                      } else {
                                                        var14_ref = (lm) (Object) ((ih) this).field_j.b((byte) -52);
                                                        continue L21;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref != null) {
                                                L22: {
                                                  if (var10 != 0) {
                                                    stackOut_61_0 = 9;
                                                    stackIn_62_0 = stackOut_61_0;
                                                    break L22;
                                                  } else {
                                                    stackOut_60_0 = 5;
                                                    stackIn_62_0 = stackOut_60_0;
                                                    break L22;
                                                  }
                                                }
                                                var15 = stackIn_62_0;
                                                ((ih) this).field_p = var14_ref;
                                                ((ih) this).field_p.field_C = new vi(var15 + (var9 - -((ih) this).field_p.field_B));
                                                ((ih) this).field_p.field_C.d(122, var10);
                                                ((ih) this).field_p.field_C.b(var9, 25251);
                                                ((ih) this).field_p.field_x = 10;
                                                ((ih) this).field_i.field_i = 0;
                                                break L10;
                                              } else {
                                                throw new IOException();
                                              }
                                            } else {
                                              if (((ih) this).field_p.field_x != 0) {
                                                throw new IOException();
                                              } else {
                                                if (((ih) this).field_i.field_n[0] != -1) {
                                                  ((ih) this).field_p = null;
                                                  break L10;
                                                } else {
                                                  ((ih) this).field_i.field_i = 0;
                                                  ((ih) this).field_p.field_x = 1;
                                                  break L10;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    }
                                  } else {
                                    throw new IOException();
                                  }
                                }
                              }
                              stackOut_83_0 = 1;
                              stackIn_84_0 = stackOut_83_0;
                              break L4;
                            }
                          } else {
                            ((ih) this).field_m.field_i = 0;
                            ((ih) this).field_m.d(100, 0);
                            ((ih) this).field_m.a(-127, var2_ref.field_h);
                            ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) -127, 0);
                            ((ih) this).field_a.a((dk) (Object) var2_ref, 56);
                            var2_ref = (lm) (Object) ((ih) this).field_l.b((byte) -114);
                            continue L6;
                          }
                        }
                      } else {
                        ((ih) this).field_m.field_i = 0;
                        ((ih) this).field_m.d(124, 1);
                        ((ih) this).field_m.a(-113, var2_ref.field_h);
                        ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) -63, 0);
                        ((ih) this).field_j.a((dk) (Object) var2_ref, -126);
                        var2_ref = (lm) (Object) ((ih) this).field_b.b((byte) -59);
                        continue L5;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L23: {
                      ((ih) this).field_t.a(-98);
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
                    ((ih) this).field_t = null;
                    ((ih) this).field_k = ((ih) this).field_k + 1;
                    ((ih) this).field_e = -2;
                    if (((ih) this).c((byte) 122) != 0) {
                      break L25;
                    } else {
                      if (0 != ((ih) this).b((byte) -34)) {
                        break L25;
                      } else {
                        return true;
                      }
                    }
                  }
                  return false;
                }
                return stackIn_84_0 != 0;
              } else {
                L26: {
                  if (((ih) this).c((byte) 122) != 0) {
                    break L26;
                  } else {
                    if (((ih) this).b((byte) -34) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        if (null != ((ih) this).field_t) {
            ((ih) this).field_t.a(-105);
        }
        int var2 = -92 % ((param0 - -63) / 63);
    }

    final void c(int param0) {
        try {
            if (param0 != 194) {
                boolean discarded$0 = ((ih) this).e(57);
            }
            ((ih) this).field_t.a(-114);
        } catch (Exception exception) {
        }
        ((ih) this).field_e = -1;
        ((ih) this).field_t = null;
        ((ih) this).field_k = ((ih) this).field_k + 1;
        ((ih) this).field_r = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void g(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((ih) this).field_t == null) {
              return;
            } else {
              {
                L0: {
                  ((ih) this).field_m.field_i = 0;
                  ((ih) this).field_m.d(98, 6);
                  ((ih) this).field_m.e(3, -91);
                  ((ih) this).field_m.a((byte) -119, 0);
                  ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) 32, 0);
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

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            lm var4_ref3 = null;
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
            var6 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ((ih) this).field_t) {
                    try {
                      L2: {
                        ((ih) this).field_t.a(-98);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ih) this).field_t = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ih) this).field_t = (td) param2;
                this.g(24);
                this.a((byte) 47, param0);
                ((ih) this).field_p = null;
                ((ih) this).field_i.field_i = 0;
                L4: while (true) {
                  var4_ref3 = (lm) (Object) ((ih) this).field_j.a((byte) 27);
                  if (var4_ref3 != null) {
                    ((ih) this).field_b.a((dk) (Object) var4_ref3, 40);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (lm) (Object) ((ih) this).field_a.a((byte) 27);
                      if (var4_ref3 != null) {
                        ((ih) this).field_l.a((dk) (Object) var4_ref3, -127);
                        continue L5;
                      } else {
                        L6: {
                          if (param1 == 75) {
                            break L6;
                          } else {
                            field_v = null;
                            break L6;
                          }
                        }
                        L7: {
                          if (((ih) this).field_r == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((ih) this).field_m.field_i = 0;
                                ((ih) this).field_m.d(106, 4);
                                ((ih) this).field_m.d(param1 ^ 52, (int) ((ih) this).field_r);
                                ((ih) this).field_m.b(0, 25251);
                                ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) 87, 0);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((ih) this).field_f = 0;
                        ((ih) this).field_c = hn.a((byte) 80);
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
                stackOut_26_1 = new StringBuilder().append("ih.C(").append(param0).append(44).append(param1).append(44);
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (param2 == null) {
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
              throw wg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oj var7 = null;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = 24 + uj.field_p.field_e;
            var6 = uj.field_p.field_g;
            if (param0 == -15587) {
              var2_int = 0;
              L1: while (true) {
                if (rc.field_e <= var2_int) {
                  break L0;
                } else {
                  L2: {
                    var7 = re.field_n[var2_int];
                    var3 = -var5 + (int)(24.0 * ((double)var7.field_j.field_e + var7.field_l.field_f));
                    var4 = -var6 + (int)((var7.field_l.field_a + (double)var7.field_j.field_g) * 24.0);
                    if (var3 < -96) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "ih.D(" + param0 + 44 + param1 + 41);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            vi stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            vi stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            vi stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            vi stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            vi stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            vi stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (null != ((ih) this).field_t) {
              try {
                L0: {
                  L1: {
                    ((ih) this).field_m.field_i = 0;
                    stackOut_2_0 = ((ih) this).field_m;
                    stackOut_2_1 = 123;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (param1) {
                      stackOut_4_0 = (vi) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (vi) (Object) stackIn_3_0;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  ((vi) (Object) stackIn_5_0).d(stackIn_5_1, stackIn_5_2);
                  ((ih) this).field_m.a(-121, 0L);
                  ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) -105, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((ih) this).field_t.a(param0 ^ 127);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((ih) this).field_e = -2;
                  ((ih) this).field_k = ((ih) this).field_k + 1;
                  ((ih) this).field_t = null;
                  break L2;
                }
              }
              L5: {
                if (param0 == 47) {
                  break L5;
                } else {
                  ((ih) this).a((byte) -29);
                  break L5;
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

    public static void f(int param0) {
        if (param0 != 200) {
            field_x = null;
        }
        field_x = null;
        field_u = null;
        field_z = null;
        field_y = null;
        field_v = null;
    }

    public ih() {
    }

    final static int a(oc param0, byte param1, oc param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                ih.a(-70, -116);
                break L1;
              }
            }
            L2: {
              if (param0.field_g >= param2.field_g) {
                stackOut_4_0 = param0.field_g + -param2.field_g;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = param2.field_g + -param0.field_g;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (param2.field_e > param0.field_e) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = -param0.field_e + param2.field_e;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = -param2.field_e + param0.field_e;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L3;
              }
            }
            stackOut_8_0 = stackIn_8_0 + stackIn_8_1;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ih.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Activate the reactor on this level, or seal off the breach from environmental controls.";
        field_s = false;
        field_z = "This door is sealed from the other side. I'll have to find another way around.";
        field_x = new vl();
        field_w = 9;
    }
}
