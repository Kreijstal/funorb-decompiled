/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pn extends dk {
    static lc field_z;
    static String field_C;
    static String field_A;
    static String field_w;
    private el field_B;
    static String field_y;
    static boolean field_x;

    final void d(byte param0) {
        try {
            ((pn) this).field_B.b(4155);
        } catch (Exception exception) {
        }
        ((pn) this).field_b = -1;
        ((pn) this).field_l = ((pn) this).field_l + 1;
        ((pn) this).field_B = null;
        ((pn) this).field_g = (byte)(int)(Math.random() * 255.0 + 1.0);
        if (param0 <= 81) {
            pn.c(false);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if ((param0 ^ -1) > -1) {
              break L1;
            } else {
              if (-65537 >= (param0 ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var2 += 16;
          param0 = param0 >>> 16;
          break L0;
        }
        L2: {
          if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-17 < (param0 ^ -1)) {
            break L3;
          } else {
            var2 += 4;
            param0 = param0 >>> 4;
            break L3;
          }
        }
        L4: {
          if (-5 >= (param0 ^ -1)) {
            var2 += 2;
            param0 = param0 >>> 2;
            break L4;
          } else {
            break L4;
          }
        }
        if (param1 < -40) {
          L5: {
            if ((param0 ^ -1) > -2) {
              break L5;
            } else {
              param0 = param0 >>> 1;
              var2++;
              break L5;
            }
          }
          return param0 + var2;
        } else {
          return -21;
        }
    }

    public static void c(boolean param0) {
        field_C = null;
        field_z = null;
        field_A = null;
        if (!param0) {
            int discarded$0 = pn.a(125, 76, (byte) -34);
        }
        field_y = null;
        field_w = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            jc stackIn_5_0 = null;
            jc stackIn_6_0 = null;
            jc stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            jc stackOut_4_0 = null;
            jc stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            jc stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            if (((pn) this).field_B != null) {
              try {
                L0: {
                  L1: {
                    ((pn) this).field_t.field_l = 0;
                    if (param1 == -13919) {
                      break L1;
                    } else {
                      field_w = null;
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_4_0 = ((pn) this).field_t;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param0) {
                      stackOut_6_0 = (jc) (Object) stackIn_6_0;
                      stackOut_6_1 = 2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (jc) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((jc) (Object) stackIn_7_0).a(stackIn_7_1, -97);
                  ((pn) this).field_t.a(0L, 65280);
                  ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      ((pn) this).field_B.b(4155);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((pn) this).field_l = ((pn) this).field_l + 1;
                  ((pn) this).field_B = null;
                  ((pn) this).field_b = -2;
                  break L3;
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

    final static int a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var3 = 97 % ((param2 - -57) / 61);
        int var4 = 0;
        int var5 = ih.field_a;
        while (var4 < mn.field_c.length) {
            var6 = wg.field_h[var4];
            if (0 > var6) {
                var5 = var5 + re.field_m;
            } else {
                var7 = gl.a(1492912648, true, mn.field_c[var4]);
                var8 = -(var7 >> 293317281) + hn.field_q;
                var5 = var5 + oh.field_d;
                if (wf.a(-eh.field_d + var8, param1, (eh.field_d << 1126633249) + var7, true, var5, param0, mi.field_c + (bj.field_j << -2114951871))) {
                    return var6;
                }
                var5 = var5 + (mi.field_c + (bj.field_j << 1959035009) - -oh.field_d);
            }
            var4++;
        }
        return -1;
    }

    final void b(int param0) {
        if (param0 <= 17) {
            return;
        }
        if (null != ((pn) this).field_B) {
            ((pn) this).field_B.b(4155);
        }
    }

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ub var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var6 = Virogrid.field_F ? 1 : 0;
              if (null != ((pn) this).field_B) {
                try {
                  L1: {
                    ((pn) this).field_B.b(4155);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var4 = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                ((pn) this).field_B = null;
                break L0;
              } else {
                break L0;
              }
            }
            ((pn) this).field_B = (el) param2;
            this.b(false);
            this.a(param1, -13919);
            ((pn) this).field_n.field_l = 0;
            ((pn) this).field_d = null;
            L3: while (true) {
              var4_ref2 = (ub) (Object) ((pn) this).field_c.a((byte) -103);
              if (var4_ref2 != null) {
                ((pn) this).field_i.a((wb) (Object) var4_ref2, (byte) 93);
                continue L3;
              } else {
                L4: while (true) {
                  var4_ref2 = (ub) (Object) ((pn) this).field_h.a((byte) -103);
                  if (var4_ref2 != null) {
                    ((pn) this).field_p.a((wb) (Object) var4_ref2, (byte) 119);
                    continue L4;
                  } else {
                    L5: {
                      if (0 != ((pn) this).field_g) {
                        try {
                          L6: {
                            ((pn) this).field_t.field_l = 0;
                            ((pn) this).field_t.a(4, 97);
                            ((pn) this).field_t.a((int) ((pn) this).field_g, -101);
                            ((pn) this).field_t.a(0, (byte) -42);
                            ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                            break L6;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L7: {
                            var4_ref = (IOException) (Object) decompiledCaughtException;
                            try {
                              L8: {
                                ((pn) this).field_B.b(4155);
                                break L8;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L9: {
                                var5 = (Exception) (Object) decompiledCaughtException;
                                break L9;
                              }
                            }
                            ((pn) this).field_l = ((pn) this).field_l + 1;
                            ((pn) this).field_b = -2;
                            ((pn) this).field_B = null;
                            break L7;
                          }
                        }
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L10: {
                      ((pn) this).field_k = 0;
                      if (param0 < 0) {
                        break L10;
                      } else {
                        field_C = null;
                        break L10;
                      }
                    }
                    ((pn) this).field_f = hc.a(-9986);
                    return;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        ok.field_L = hd.field_b.a(de.field_pb[14]);
        if (param0) {
            int discarded$0 = pn.a(-7, (byte) 94);
        }
        int var1 = hd.field_b.a(de.field_pb[15]);
        if (!(var1 <= ok.field_L)) {
            ok.field_L = var1;
        }
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ub var2_ref = null;
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
            ub var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_60_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_83_0 = 0;
            L0: {
              var16 = Virogrid.field_F ? 1 : 0;
              if (((pn) this).field_B == null) {
                break L0;
              } else {
                L1: {
                  var2_long = hc.a(-9986);
                  var4 = (int)(-((pn) this).field_f + var2_long);
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((pn) this).field_f = var2_long;
                ((pn) this).field_k = ((pn) this).field_k + var4;
                if (-30001 <= (((pn) this).field_k ^ -1)) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((pn) this).field_B.b(4155);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((pn) this).field_B = null;
                  break L0;
                }
              }
            }
            if (null != ((pn) this).field_B) {
              try {
                L4: {
                  L5: {
                    ((pn) this).field_B.c(-110);
                    if (param0 <= -9) {
                      break L5;
                    } else {
                      field_w = null;
                      break L5;
                    }
                  }
                  var2_ref = (ub) (Object) ((pn) this).field_i.d(-1);
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ub) (Object) ((pn) this).field_p.d(-1);
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if ((var2_int ^ -1) <= -101) {
                                break L9;
                              } else {
                                var3_int = ((pn) this).field_B.f(31479);
                                if (-1 < (var3_int ^ -1)) {
                                  throw new IOException();
                                } else {
                                  if (-1 == (var3_int ^ -1)) {
                                    break L9;
                                  } else {
                                    L10: {
                                      ((pn) this).field_k = 0;
                                      var4 = 0;
                                      if (null != ((pn) this).field_d) {
                                        if ((((pn) this).field_d.field_C ^ -1) != -1) {
                                          break L10;
                                        } else {
                                          var4 = 1;
                                          break L10;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (0 < var4) {
                                        L12: {
                                          var5 = -((pn) this).field_n.field_l + var4;
                                          if (var5 > var3_int) {
                                            var5 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((pn) this).field_B.a(var5, ((pn) this).field_n.field_g, -1, ((pn) this).field_n.field_l);
                                          if (-1 == (((pn) this).field_g ^ -1)) {
                                            break L13;
                                          } else {
                                            var6 = 0;
                                            L14: while (true) {
                                              if ((var6 ^ -1) <= (var5 ^ -1)) {
                                                break L13;
                                              } else {
                                                ((pn) this).field_n.field_g[((pn) this).field_n.field_l - -var6] = (byte)jd.a((int) ((pn) this).field_n.field_g[((pn) this).field_n.field_l + var6], (int) ((pn) this).field_g);
                                                var6++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        ((pn) this).field_n.field_l = ((pn) this).field_n.field_l + var5;
                                        if ((var4 ^ -1) < (((pn) this).field_n.field_l ^ -1)) {
                                          break L11;
                                        } else {
                                          if (((pn) this).field_d != null) {
                                            if (((pn) this).field_d.field_C == 0) {
                                              if (0 != (((pn) this).field_n.field_g[0] ^ -1)) {
                                                ((pn) this).field_d = null;
                                                break L11;
                                              } else {
                                                ((pn) this).field_d.field_C = 1;
                                                ((pn) this).field_n.field_l = 0;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L15: {
                                              ((pn) this).field_n.field_l = 0;
                                              var6 = ((pn) this).field_n.g(11132);
                                              var7 = ((pn) this).field_n.d((byte) 103);
                                              var8 = ((pn) this).field_n.g(11132);
                                              var9 = ((pn) this).field_n.d((byte) 116);
                                              var10 = 127 & var8;
                                              if ((128 & var8 ^ -1) == -1) {
                                                stackOut_59_0 = 0;
                                                stackIn_60_0 = stackOut_59_0;
                                                break L15;
                                              } else {
                                                stackOut_58_0 = 1;
                                                stackIn_60_0 = stackOut_58_0;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              var11 = stackIn_60_0;
                                              var12 = ((long)var6 << -1746883872) - -(long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ub) (Object) ((pn) this).field_h.d(-1);
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if ((var12 ^ -1L) != (var14_ref.field_j ^ -1L)) {
                                                      var14_ref = (ub) (Object) ((pn) this).field_h.a(26605);
                                                      continue L17;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ub) (Object) ((pn) this).field_c.d(-1);
                                                L18: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var12 == var14_ref.field_j) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (ub) (Object) ((pn) this).field_c.a(26605);
                                                      continue L18;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L19: {
                                                if (var10 == 0) {
                                                  stackOut_74_0 = 5;
                                                  stackIn_75_0 = stackOut_74_0;
                                                  break L19;
                                                } else {
                                                  stackOut_73_0 = 9;
                                                  stackIn_75_0 = stackOut_73_0;
                                                  break L19;
                                                }
                                              }
                                              var15 = stackIn_75_0;
                                              ((pn) this).field_d = var14_ref;
                                              ((pn) this).field_d.field_B = new jc(var15 + var9 - -((pn) this).field_d.field_A);
                                              ((pn) this).field_d.field_B.a(var10, 55);
                                              ((pn) this).field_d.field_B.a(var9, (byte) -42);
                                              ((pn) this).field_n.field_l = 0;
                                              ((pn) this).field_d.field_C = 10;
                                              break L11;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        }
                                      } else {
                                        L20: {
                                          var5 = -((pn) this).field_d.field_A + ((pn) this).field_d.field_B.field_g.length;
                                          var6 = 512 + -((pn) this).field_d.field_C;
                                          if (-((pn) this).field_d.field_B.field_l + var5 < var6) {
                                            var6 = -((pn) this).field_d.field_B.field_l + var5;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var3_int >= var6) {
                                            break L21;
                                          } else {
                                            var6 = var3_int;
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          ((pn) this).field_B.a(var6, ((pn) this).field_d.field_B.field_g, -1, ((pn) this).field_d.field_B.field_l);
                                          if (-1 != (((pn) this).field_g ^ -1)) {
                                            var7 = 0;
                                            L23: while (true) {
                                              if (var6 <= var7) {
                                                break L22;
                                              } else {
                                                ((pn) this).field_d.field_B.field_g[((pn) this).field_d.field_B.field_l - -var7] = (byte)jd.a((int) ((pn) this).field_d.field_B.field_g[((pn) this).field_d.field_B.field_l + var7], (int) ((pn) this).field_g);
                                                var7++;
                                                continue L23;
                                              }
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                        ((pn) this).field_d.field_C = ((pn) this).field_d.field_C + var6;
                                        ((pn) this).field_d.field_B.field_l = ((pn) this).field_d.field_B.field_l + var6;
                                        if ((var5 ^ -1) == (((pn) this).field_d.field_B.field_l ^ -1)) {
                                          ((pn) this).field_d.c(23);
                                          ((pn) this).field_d.field_t = false;
                                          ((pn) this).field_d = null;
                                          break L11;
                                        } else {
                                          if (512 == ((pn) this).field_d.field_C) {
                                            ((pn) this).field_d.field_C = 0;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                            stackOut_83_0 = 1;
                            stackIn_84_0 = stackOut_83_0;
                            break L4;
                          }
                        } else {
                          ((pn) this).field_t.field_l = 0;
                          ((pn) this).field_t.a(0, 104);
                          ((pn) this).field_t.a(var2_ref.field_j, 65280);
                          ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                          ((pn) this).field_h.a((wb) (Object) var2_ref, (byte) 99);
                          var2_ref = (ub) (Object) ((pn) this).field_p.a(26605);
                          continue L7;
                        }
                      }
                    } else {
                      ((pn) this).field_t.field_l = 0;
                      ((pn) this).field_t.a(1, -83);
                      ((pn) this).field_t.a(var2_ref.field_j, 65280);
                      ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                      ((pn) this).field_c.a((wb) (Object) var2_ref, (byte) 93);
                      var2_ref = (ub) (Object) ((pn) this).field_i.a(26605);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((pn) this).field_B.b(4155);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                ((pn) this).field_l = ((pn) this).field_l + 1;
                ((pn) this).field_B = null;
                ((pn) this).field_b = -2;
                if ((((pn) this).a((byte) 116) ^ -1) != -1) {
                  return false;
                } else {
                  if ((((pn) this).e(108) ^ -1) == -1) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              return stackIn_84_0 != 0;
            } else {
              L26: {
                if (((pn) this).a((byte) -16) != 0) {
                  break L26;
                } else {
                  if ((((pn) this).e(109) ^ -1) != -1) {
                    break L26;
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

    public pn() {
    }

    private final void b(boolean param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((pn) this).field_B) {
              try {
                L0: {
                  ((pn) this).field_t.field_l = 0;
                  ((pn) this).field_t.a(6, 122);
                  ((pn) this).field_t.a(3, param0);
                  ((pn) this).field_t.a((byte) -76, 0);
                  ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      ((pn) this).field_B.b(4155);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((pn) this).field_l = ((pn) this).field_l + 1;
                  ((pn) this).field_B = null;
                  ((pn) this).field_b = -2;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Your email address is used to identify this account";
        field_C = "Rotate camera right";
        field_A = "<%0> wants to join";
        field_y = "This is your RuneScape clan if you have one.";
        field_z = new lc(4, 1, 1, 1);
    }
}
