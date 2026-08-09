/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    static String field_d;
    static int[] field_c;
    static ak field_a;
    static jl field_b;

    final static int[] a(int[] param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_58_0 = null;
        int[] stackIn_60_0 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = param0.length;
                if (null == qj.field_a) {
                  break L2;
                } else {
                  if (2 * var2_int > qj.field_a.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              qj.field_a = new int[var2_int * 2];
              bj.field_b = new int[var2_int * 2];
              break L1;
            }
            ef.field_g = 0;
            var5 = param0[-2 + var2_int];
            var6 = param0[-1 + var2_int];
            var7_int = 0;
            L3: while (true) {
              if (var2_int <= var7_int) {
                if (param1 != (ef.field_g ^ -1)) {
                  var7 = bj.field_b;
                  bj.field_b = qj.field_a;
                  qj.field_a = var7;
                  var2_int = ef.field_g;
                  ef.field_g = 0;
                  var5 = bj.field_b[-2 + var2_int];
                  var6 = bj.field_b[-1 + var2_int];
                  var8_int = 0;
                  L4: while (true) {
                    if (var2_int <= var8_int) {
                      if (ef.field_g != 0) {
                        var7 = bj.field_b;
                        bj.field_b = qj.field_a;
                        qj.field_a = var7;
                        var2_int = ef.field_g;
                        ef.field_g = 0;
                        var5 = bj.field_b[var2_int + -2];
                        var6 = bj.field_b[var2_int - 1];
                        var8_int = 0;
                        L5: while (true) {
                          if (var2_int <= var8_int) {
                            if (-1 != (ef.field_g ^ -1)) {
                              var7 = bj.field_b;
                              bj.field_b = qj.field_a;
                              var2_int = ef.field_g;
                              qj.field_a = var7;
                              ef.field_g = 0;
                              var6 = bj.field_b[-1 + var2_int];
                              var5 = bj.field_b[var2_int - 2];
                              var8_int = 0;
                              L6: while (true) {
                                if (var2_int <= var8_int) {
                                  if (ef.field_g != 0) {
                                    var15 = new int[ef.field_g];
                                    var14 = var15;
                                    var8 = var14;
                                    qb.a(qj.field_a, 0, var15, 0, ef.field_g);
                                    stackIn_60_0 = (int[]) (var8);
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    stackIn_58_0 = null;
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                } else {
                                  L7: {
                                    var3 = var5;
                                    var4 = var6;
                                    var6 = bj.field_b[1 + var8_int];
                                    var5 = bj.field_b[var8_int];
                                    if (var6 >= t.field_a) {
                                      if (t.field_a > var4) {
                                        var9 = var3;
                                        var10 = var4;
                                        var11 = var5;
                                        var12 = var6;
                                        fieldTemp$0 = ef.field_g;
                                        ef.field_g = ef.field_g + 1;
                                        qj.field_a[fieldTemp$0] = var9 - -((var11 - var9) * (t.field_a - var10) / (var12 - var10));
                                        fieldTemp$1 = ef.field_g;
                                        ef.field_g = ef.field_g + 1;
                                        qj.field_a[fieldTemp$1] = t.field_a;
                                        break L7;
                                      } else {
                                        var8_int += 2;
                                        continue L6;
                                      }
                                    } else {
                                      L8: {
                                        if (t.field_a <= var4) {
                                          var9 = var5;
                                          var10 = var6;
                                          var11 = var3;
                                          var12 = var4;
                                          fieldTemp$2 = ef.field_g;
                                          ef.field_g = ef.field_g + 1;
                                          qj.field_a[fieldTemp$2] = (-var10 + t.field_a) * (var11 + -var9) / (-var10 + var12) + var9;
                                          fieldTemp$3 = ef.field_g;
                                          ef.field_g = ef.field_g + 1;
                                          qj.field_a[fieldTemp$3] = t.field_a;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      fieldTemp$4 = ef.field_g;
                                      ef.field_g = ef.field_g + 1;
                                      qj.field_a[fieldTemp$4] = var5;
                                      fieldTemp$5 = ef.field_g;
                                      ef.field_g = ef.field_g + 1;
                                      qj.field_a[fieldTemp$5] = var6;
                                      break L7;
                                    }
                                  }
                                  var8_int += 2;
                                  continue L6;
                                }
                              }
                            } else {
                              stackIn_44_0 = null;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            L9: {
                              var4 = var6;
                              var3 = var5;
                              var6 = bj.field_b[var8_int - -1];
                              var5 = bj.field_b[var8_int];
                              if ((t.field_f ^ -1) < (var6 ^ -1)) {
                                if (var4 >= t.field_f) {
                                  var9 = var3;
                                  var10 = var4;
                                  var11 = var5;
                                  var12 = var6;
                                  fieldTemp$6 = ef.field_g;
                                  ef.field_g = ef.field_g + 1;
                                  qj.field_a[fieldTemp$6] = var9 - -((t.field_f + -var10) * (var11 - var9) / (var12 + -var10));
                                  fieldTemp$7 = ef.field_g;
                                  ef.field_g = ef.field_g + 1;
                                  qj.field_a[fieldTemp$7] = t.field_f;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              } else {
                                L10: {
                                  if (var4 >= t.field_f) {
                                    break L10;
                                  } else {
                                    var9 = var5;
                                    var10 = var6;
                                    var11 = var3;
                                    var12 = var4;
                                    fieldTemp$8 = ef.field_g;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[fieldTemp$8] = var9 - -((-var9 + var11) * (t.field_f - var10) / (var12 + -var10));
                                    fieldTemp$9 = ef.field_g;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[fieldTemp$9] = t.field_f;
                                    break L10;
                                  }
                                }
                                fieldTemp$10 = ef.field_g;
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[fieldTemp$10] = var5;
                                fieldTemp$11 = ef.field_g;
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[fieldTemp$11] = var6;
                                break L9;
                              }
                            }
                            var8_int += 2;
                            continue L5;
                          }
                        }
                      } else {
                        stackIn_31_0 = null;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L11: {
                        var4 = var6;
                        var3 = var5;
                        var6 = bj.field_b[var8_int - -1];
                        var5 = bj.field_b[var8_int];
                        if (var5 >= t.field_h) {
                          if (var3 < t.field_h) {
                            var9 = var3;
                            var10 = var4;
                            var11 = var5;
                            var12 = var6;
                            fieldTemp$12 = ef.field_g;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[fieldTemp$12] = t.field_h;
                            fieldTemp$13 = ef.field_g;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[fieldTemp$13] = (t.field_h + -var9) * (var12 - var10) / (var11 + -var9) + var10;
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          L12: {
                            if (var3 >= t.field_h) {
                              var9 = var5;
                              var10 = var6;
                              var11 = var3;
                              var12 = var4;
                              fieldTemp$14 = ef.field_g;
                              ef.field_g = ef.field_g + 1;
                              qj.field_a[fieldTemp$14] = t.field_h;
                              fieldTemp$15 = ef.field_g;
                              ef.field_g = ef.field_g + 1;
                              qj.field_a[fieldTemp$15] = var10 + (t.field_h + -var9) * (-var10 + var12) / (var11 + -var9);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          fieldTemp$16 = ef.field_g;
                          ef.field_g = ef.field_g + 1;
                          qj.field_a[fieldTemp$16] = var5;
                          fieldTemp$17 = ef.field_g;
                          ef.field_g = ef.field_g + 1;
                          qj.field_a[fieldTemp$17] = var6;
                          break L11;
                        }
                      }
                      var8_int += 2;
                      continue L4;
                    }
                  }
                } else {
                  stackIn_17_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L13: {
                  var4 = var6;
                  var3 = var5;
                  var5 = param0[var7_int];
                  var6 = param0[var7_int + 1];
                  if ((var5 ^ -1) <= (t.field_e ^ -1)) {
                    L14: {
                      if (t.field_e <= var3) {
                        break L14;
                      } else {
                        var8_int = var5;
                        var9 = var6;
                        var10 = var3;
                        var11 = var4;
                        fieldTemp$18 = ef.field_g;
                        ef.field_g = ef.field_g + 1;
                        qj.field_a[fieldTemp$18] = t.field_e;
                        fieldTemp$19 = ef.field_g;
                        ef.field_g = ef.field_g + 1;
                        qj.field_a[fieldTemp$19] = (t.field_e - var8_int) * (-var9 + var11) / (var10 + -var8_int) + var9;
                        break L14;
                      }
                    }
                    fieldTemp$20 = ef.field_g;
                    ef.field_g = ef.field_g + 1;
                    qj.field_a[fieldTemp$20] = var5;
                    fieldTemp$21 = ef.field_g;
                    ef.field_g = ef.field_g + 1;
                    qj.field_a[fieldTemp$21] = var6;
                    break L13;
                  } else {
                    if (var3 >= t.field_e) {
                      var8_int = var3;
                      var9 = var4;
                      var10 = var5;
                      var11 = var6;
                      fieldTemp$22 = ef.field_g;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[fieldTemp$22] = t.field_e;
                      fieldTemp$23 = ef.field_g;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[fieldTemp$23] = (-var9 + var11) * (-var8_int + t.field_e) / (var10 + -var8_int) + var9;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                var7_int += 2;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var2);

            stackIn_63_1 = new StringBuilder().append("ep.D(");

            if (param0 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L15;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L15;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_17_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (int[]) ((Object) stackIn_31_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (int[]) ((Object) stackIn_44_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (int[]) ((Object) stackIn_58_0);
              } else {
                return stackIn_60_0;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                var3 = (String) null;
                ep.a((byte) 64, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < cl.field_a) {
                  break L2;
                } else {
                  if (param1.length() <= gd.field_l) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("ep.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void c(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (pm.field_h == null) {
                    break L1;
                  } else {
                    pm.field_h.b((byte) 119);
                    break L1;
                  }
                }
                if (param0 == -26721) {
                  L2: {
                    if (fh.field_J == null) {
                      break L2;
                    } else {
                      fh.field_J.a((byte) -92);
                      break L2;
                    }
                  }
                  L3: {
                    if (null != rj.field_G) {
                      try {
                        L4: {
                          rj.field_G.a(true);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (ug.field_l != null) {
                      var1_int = 0;
                      L7: while (true) {
                        if (ug.field_l.length <= var1_int) {
                          break L6;
                        } else {
                          if (null != ug.field_l[var1_int]) {
                            try {
                              L8: {
                                ug.field_l[var1_int].a(true);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L9;
                              }
                            }
                            var1_int++;
                            continue L7;
                          } else {
                            var1_int++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw aa.a((Throwable) ((Object) var1), "ep.C(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != -2) {
            int[] var2 = (int[]) null;
            ep.a((int[]) null, -67);
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 30022) {
            break L0;
          } else {
            field_a = (ak) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!wp.a(-8798)) {
              break L2;
            } else {
              if ((8 & pa.field_b) != 0) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        field_d = "Tiles Dropped: ";
    }
}
