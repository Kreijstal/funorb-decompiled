/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ih {
    static dh field_u;
    static String field_t;
    static jp[] field_s;
    private wh field_q;
    static String field_r;

    final static void a(int param0, ak param1, j param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        jp var4 = null;
        jp var5 = null;
        int var6 = 0;
        jp[] var7 = null;
        jp var9 = null;
        jp var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (oa.field_Sb == null) {
              return;
            } else {
              L1: {
                var3_int = 256 * km.field_i / 32;
                var4 = oa.field_Sb.c((byte) -123);
                if (var4 == null) {
                  break L1;
                } else {
                  if (km.field_i == 0) {
                    var4.c(-var4.field_x + 640, 470 - var4.field_z);
                    break L1;
                  } else {
                    var4.b(-var4.field_x + 640, 470 - var4.field_z, 256 + -var3_int);
                    break L1;
                  }
                }
              }
              L2: {
                if (km.field_i <= 0) {
                  break L2;
                } else {
                  if (ih.field_k != null) {
                    ih.field_k.b(640 + -ih.field_k.field_x, 480 + -ih.field_k.field_z - 10, var3_int);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var5 = nm.field_f[param2.field_y];
                if (var4 == null) {
                  break L3;
                } else {
                  var5.c(-3 + (640 + -((var4.field_x - -var5.field_x) / 2)), -var4.field_z + 515);
                  break L3;
                }
              }
              L4: {
                var6 = kb.a(param1, 0, 100, param2);
                var7 = oa.field_Sb.b(-106);
                if (var7 != null) {
                  var9 = var7[var6];
                  var9.c(-20 + (-var9.field_x + 640), 520 - var9.field_z);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (km.field_i <= 0) {
                  break L5;
                } else {
                  if (null != fq.field_c) {
                    var10 = fq.field_c[var6];
                    var10.b(-var10.field_x + 620, 40 + (-var10.field_z + 480), var3_int);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("a.B(").append(640).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    private final void g(byte param0) {
        try {
            int var2 = 0;
            Exception var4 = null;
            Throwable decompiledCaughtException = null;
            if (((a) this).field_q == null) {
              return;
            } else {
              var2 = 74 % ((param0 - 14) / 57);
              {
                L0: {
                  ((a) this).field_m.field_l = 0;
                  ((a) this).field_m.a(44, 6);
                  ((a) this).field_m.a((byte) 47, 3);
                  ((a) this).field_m.b((byte) 125, 0);
                  ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
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

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            da var2_ref = null;
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
            da var14_ref = null;
            int var15 = 0;
            int var16 = 0;
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
              var16 = BrickABrac.field_J ? 1 : 0;
              if (((a) this).field_q != null) {
                L1: {
                  var2_long = ue.a(false);
                  var4 = (int)(var2_long - ((a) this).field_o);
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((a) this).field_o = var2_long;
                ((a) this).field_b = ((a) this).field_b + var4;
                if (((a) this).field_b > 30000) {
                  try {
                    L2: {
                      ((a) this).field_q.a((byte) 120);
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
              if (0 != ((a) this).e((byte) -67)) {
                return false;
              } else {
                if (((a) this).c((byte) -105) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  ((a) this).field_q.c(-1);
                  var2_ref = (da) (Object) ((a) this).field_g.a(true);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (da) (Object) ((a) this).field_a.a(true);
                      L6: while (true) {
                        if (var2_ref == null) {
                          L7: {
                            if (param0 > 10) {
                              break L7;
                            } else {
                              a.h((byte) -19);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (100 <= var2_int) {
                                break L9;
                              } else {
                                var3_int = ((a) this).field_q.d(10434);
                                if (var3_int >= 0) {
                                  if (0 == var3_int) {
                                    break L9;
                                  } else {
                                    L10: {
                                      ((a) this).field_b = 0;
                                      var4 = 0;
                                      if (null == ((a) this).field_e) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (0 != ((a) this).field_e.field_K) {
                                          break L10;
                                        } else {
                                          var4 = 1;
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var4 <= 0) {
                                        L12: {
                                          var5 = -((a) this).field_e.field_F + ((a) this).field_e.field_D.field_k.length;
                                          var6 = 512 - ((a) this).field_e.field_K;
                                          if (var6 > var5 + -((a) this).field_e.field_D.field_l) {
                                            var6 = var5 - ((a) this).field_e.field_D.field_l;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var3_int < var6) {
                                            var6 = var3_int;
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          ((a) this).field_q.a(25826, ((a) this).field_e.field_D.field_k, var6, ((a) this).field_e.field_D.field_l);
                                          if (((a) this).field_h != 0) {
                                            var7 = 0;
                                            L15: while (true) {
                                              if (var7 >= var6) {
                                                break L14;
                                              } else {
                                                ((a) this).field_e.field_D.field_k[var7 + ((a) this).field_e.field_D.field_l] = (byte)pn.a((int) ((a) this).field_e.field_D.field_k[var7 + ((a) this).field_e.field_D.field_l], (int) ((a) this).field_h);
                                                var7++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        ((a) this).field_e.field_K = ((a) this).field_e.field_K + var6;
                                        ((a) this).field_e.field_D.field_l = ((a) this).field_e.field_D.field_l + var6;
                                        if (var5 != ((a) this).field_e.field_D.field_l) {
                                          if (((a) this).field_e.field_K != 512) {
                                            break L11;
                                          } else {
                                            ((a) this).field_e.field_K = 0;
                                            break L11;
                                          }
                                        } else {
                                          ((a) this).field_e.d(3);
                                          ((a) this).field_e.field_u = false;
                                          ((a) this).field_e = null;
                                          break L11;
                                        }
                                      } else {
                                        L16: {
                                          var5 = var4 + -((a) this).field_l.field_l;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          ((a) this).field_q.a(25826, ((a) this).field_l.field_k, var5, ((a) this).field_l.field_l);
                                          if (0 != ((a) this).field_h) {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var6 >= var5) {
                                                break L17;
                                              } else {
                                                ((a) this).field_l.field_k[((a) this).field_l.field_l - -var6] = (byte)pn.a((int) ((a) this).field_l.field_k[((a) this).field_l.field_l + var6], (int) ((a) this).field_h);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        ((a) this).field_l.field_l = ((a) this).field_l.field_l + var5;
                                        if (((a) this).field_l.field_l >= var4) {
                                          if (null == ((a) this).field_e) {
                                            L19: {
                                              ((a) this).field_l.field_l = 0;
                                              var6 = ((a) this).field_l.l(255);
                                              var7 = ((a) this).field_l.e(255);
                                              var8 = ((a) this).field_l.l(255);
                                              var9 = ((a) this).field_l.e(255);
                                              var10 = var8 & 127;
                                              if (0 == (var8 & 128)) {
                                                stackOut_49_0 = 0;
                                                stackIn_50_0 = stackOut_49_0;
                                                break L19;
                                              } else {
                                                stackOut_48_0 = 1;
                                                stackIn_50_0 = stackOut_48_0;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_50_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (da) (Object) ((a) this).field_n.a(true);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var14_ref.field_j != var12) {
                                                      var14_ref = (da) (Object) ((a) this).field_n.e(-8394);
                                                      continue L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (da) (Object) ((a) this).field_c.a(true);
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var12 != var14_ref.field_j) {
                                                      var14_ref = (da) (Object) ((a) this).field_c.e(-8394);
                                                      continue L22;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L23: {
                                                if (var10 != 0) {
                                                  stackOut_65_0 = 9;
                                                  stackIn_66_0 = stackOut_65_0;
                                                  break L23;
                                                } else {
                                                  stackOut_64_0 = 5;
                                                  stackIn_66_0 = stackOut_64_0;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              ((a) this).field_e = var14_ref;
                                              ((a) this).field_e.field_D = new wq(var9 - -var15 - -((a) this).field_e.field_F);
                                              ((a) this).field_e.field_D.a(-107, var10);
                                              ((a) this).field_e.field_D.a(var9, (byte) -79);
                                              ((a) this).field_e.field_K = 10;
                                              ((a) this).field_l.field_l = 0;
                                              break L11;
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            if (0 == ((a) this).field_e.field_K) {
                                              if (((a) this).field_l.field_k[0] == -1) {
                                                ((a) this).field_l.field_l = 0;
                                                ((a) this).field_e.field_K = 1;
                                                break L11;
                                              } else {
                                                ((a) this).field_e = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            stackOut_89_0 = 1;
                            stackIn_90_0 = stackOut_89_0;
                            break L4;
                          }
                        } else {
                          ((a) this).field_m.field_l = 0;
                          ((a) this).field_m.a(-128, 0);
                          ((a) this).field_m.a(var2_ref.field_j, (byte) -32);
                          ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                          ((a) this).field_c.a((tk) (Object) var2_ref, false);
                          var2_ref = (da) (Object) ((a) this).field_a.e(-8394);
                          continue L6;
                        }
                      }
                    } else {
                      ((a) this).field_m.field_l = 0;
                      ((a) this).field_m.a(-102, 1);
                      ((a) this).field_m.a(var2_ref.field_j, (byte) -32);
                      ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                      ((a) this).field_n.a((tk) (Object) var2_ref, false);
                      var2_ref = (da) (Object) ((a) this).field_g.e(-8394);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((a) this).field_q.a((byte) 119);
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
                  ((a) this).field_f = -2;
                  ((a) this).field_q = null;
                  ((a) this).field_i = ((a) this).field_i + 1;
                  if (((a) this).e((byte) -41) != 0) {
                    break L26;
                  } else {
                    if (0 != ((a) this).c((byte) 101)) {
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

    final static boolean a(int param0, mp param1, mp param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2.field_Sb - param1.field_Sb;
              if (rk.field_Tb != param2.field_Ub) {
                if (null == param2.field_Ub) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (rk.field_Tb == param1.field_Ub) {
                var3_int += 200;
                break L2;
              } else {
                if (param1.field_Ub != null) {
                  break L2;
                } else {
                  var3_int -= 200;
                  break L2;
                }
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("a.I(").append(200).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final void a(byte param0) {
        try {
            ((a) this).field_q.a((byte) 113);
        } catch (Exception exception) {
        }
        ((a) this).field_i = ((a) this).field_i + 1;
        if (param0 != 8) {
            return;
        }
        ((a) this).field_f = -1;
        ((a) this).field_q = null;
        ((a) this).field_h = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void h(byte param0) {
        field_r = null;
        if (param0 > -92) {
            a.h((byte) 64);
        }
        field_u = null;
        field_s = null;
        field_t = null;
    }

    final static void f(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = fi.field_w[0];
              if (param0 == 94) {
                break L1;
              } else {
                a.f((byte) 52);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (fi.field_w.length <= var2) {
                break L0;
              } else {
                var3 = fi.field_w[var2];
                pm.a(ek.field_jb, var2 << 4, ek.field_jb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "a.F(" + param0 + 41);
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            da var4_ref3 = null;
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
            var6 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((a) this).field_q != null) {
                    try {
                      L2: {
                        ((a) this).field_q.a((byte) 114);
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
                L4: {
                  ((a) this).field_q = (wh) param0;
                  this.g((byte) 116);
                  int discarded$1 = 0;
                  this.a(param1);
                  if (param2 == 12) {
                    break L4;
                  } else {
                    ((a) this).a((byte) -71);
                    break L4;
                  }
                }
                ((a) this).field_l.field_l = 0;
                ((a) this).field_e = null;
                L5: while (true) {
                  var4_ref3 = (da) (Object) ((a) this).field_n.a(25609);
                  if (var4_ref3 == null) {
                    L6: while (true) {
                      var4_ref3 = (da) (Object) ((a) this).field_c.a(param2 + 25597);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((a) this).field_h == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((a) this).field_m.field_l = 0;
                                ((a) this).field_m.a(param2 + 50, 4);
                                ((a) this).field_m.a(40, (int) ((a) this).field_h);
                                ((a) this).field_m.a(0, (byte) -79);
                                ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((a) this).field_b = 0;
                        ((a) this).field_o = ue.a(false);
                        break L0;
                      } else {
                        ((a) this).field_a.a((tk) (Object) var4_ref3, false);
                        continue L6;
                      }
                    }
                  } else {
                    ((a) this).field_g.a((tk) (Object) var4_ref3, false);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("a.E(");
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
              throw qb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (!(((a) this).field_q == null)) {
            ((a) this).field_q.a((byte) 111);
        }
        if (param0 != 30) {
            this.g((byte) -72);
        }
    }

    private final void a(boolean param0) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wq stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            wq stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            wq stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            wq stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            wq stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            wq stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (((a) this).field_q != null) {
              try {
                L0: {
                  ((a) this).field_m.field_l = 0;
                  L1: {
                    stackOut_4_0 = ((a) this).field_m;
                    stackOut_4_1 = 37;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (!param0) {
                      stackOut_6_0 = (wq) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 3;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L1;
                    } else {
                      stackOut_5_0 = (wq) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L1;
                    }
                  }
                  ((wq) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                  ((a) this).field_m.a(0L, (byte) -32);
                  ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((a) this).field_q.a((byte) 117);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((a) this).field_f = -2;
                  ((a) this).field_i = ((a) this).field_i + 1;
                  ((a) this).field_q = null;
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

    public a() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Enter name of friend to add to list";
        field_r = "Music: ";
    }
}
