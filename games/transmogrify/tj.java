/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tj extends uh {
    static int[] field_w;
    private gj field_x;
    static String field_t;
    static String field_A;
    static int field_u;
    static ti field_s;
    static String field_z;
    static int field_y;
    static String field_v;

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            pj var2_ref = null;
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
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_18_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_64_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_17_0 = 0;
            L0: {
              var16 = Transmogrify.field_A ? 1 : 0;
              if (null == ((tj) this).field_x) {
                break L0;
              } else {
                L1: {
                  var2_long = lk.a(0);
                  var4 = (int)(-((tj) this).field_l + var2_long);
                  ((tj) this).field_l = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((tj) this).field_b = ((tj) this).field_b + var4;
                if (((tj) this).field_b <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((tj) this).field_x.a(true);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((tj) this).field_x = null;
                  break L0;
                }
              }
            }
            if (null == ((tj) this).field_x) {
              if (0 != ((tj) this).a((byte) -68)) {
                return false;
              } else {
                if (((tj) this).e(-10236) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  ((tj) this).field_x.d(-60);
                  if (param0 > 115) {
                    var2_ref = (pj) (Object) ((tj) this).field_c.b((byte) 125);
                    L5: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (pj) (Object) ((tj) this).field_a.b((byte) 114);
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (100 <= var2_int) {
                                  break L8;
                                } else {
                                  var3_int = ((tj) this).field_x.a((byte) -119);
                                  if (0 > var3_int) {
                                    throw new IOException();
                                  } else {
                                    if (0 != var3_int) {
                                      L9: {
                                        ((tj) this).field_b = 0;
                                        var4 = 0;
                                        if (((tj) this).field_e != null) {
                                          if (((tj) this).field_e.field_C != 0) {
                                            break L9;
                                          } else {
                                            var4 = 1;
                                            break L9;
                                          }
                                        } else {
                                          var4 = 10;
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (var4 > 0) {
                                          L11: {
                                            var5 = -((tj) this).field_g.field_h + var4;
                                            if (var5 > var3_int) {
                                              var5 = var3_int;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            ((tj) this).field_x.a(((tj) this).field_g.field_h, var5, ((tj) this).field_g.field_g, 5768);
                                            if (((tj) this).field_m != 0) {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var5 <= var6) {
                                                  break L12;
                                                } else {
                                                  ((tj) this).field_g.field_g[var6 + ((tj) this).field_g.field_h] = (byte)ak.a((int) ((tj) this).field_g.field_g[var6 + ((tj) this).field_g.field_h], (int) ((tj) this).field_m);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((tj) this).field_g.field_h = ((tj) this).field_g.field_h + var5;
                                          if (var4 > ((tj) this).field_g.field_h) {
                                            break L10;
                                          } else {
                                            if (((tj) this).field_e == null) {
                                              L14: {
                                                ((tj) this).field_g.field_h = 0;
                                                var6 = ((tj) this).field_g.d((byte) 56);
                                                var7 = ((tj) this).field_g.c((byte) -125);
                                                var8 = ((tj) this).field_g.d((byte) 90);
                                                var9 = ((tj) this).field_g.c((byte) -104);
                                                var10 = 127 & var8;
                                                if ((var8 & 128) == 0) {
                                                  stackOut_64_0 = 0;
                                                  stackIn_65_0 = stackOut_64_0;
                                                  break L14;
                                                } else {
                                                  stackOut_63_0 = 1;
                                                  stackIn_65_0 = stackOut_63_0;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_65_0;
                                                var12 = ((long)var6 << 32) - -(long)var7;
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (pj) (Object) ((tj) this).field_h.b((byte) 124);
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (var12 != var14_ref.field_j) {
                                                        var14_ref = (pj) (Object) ((tj) this).field_h.a(119);
                                                        continue L16;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (pj) (Object) ((tj) this).field_n.b((byte) 127);
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (~var12 != ~var14_ref.field_j) {
                                                        var14_ref = (pj) (Object) ((tj) this).field_n.a(83);
                                                        continue L17;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref != null) {
                                                L18: {
                                                  ((tj) this).field_e = var14_ref;
                                                  if (var10 == 0) {
                                                    stackOut_80_0 = 5;
                                                    stackIn_81_0 = stackOut_80_0;
                                                    break L18;
                                                  } else {
                                                    stackOut_79_0 = 9;
                                                    stackIn_81_0 = stackOut_79_0;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_81_0;
                                                ((tj) this).field_e.field_B = new oa(var15 + (var9 + ((tj) this).field_e.field_z));
                                                ((tj) this).field_e.field_B.f(6389, var10);
                                                ((tj) this).field_e.field_B.a(-112, var9);
                                                ((tj) this).field_g.field_h = 0;
                                                ((tj) this).field_e.field_C = 10;
                                                break L10;
                                              } else {
                                                throw new IOException();
                                              }
                                            } else {
                                              if (0 != ((tj) this).field_e.field_C) {
                                                throw new IOException();
                                              } else {
                                                if (((tj) this).field_g.field_g[0] == -1) {
                                                  ((tj) this).field_g.field_h = 0;
                                                  ((tj) this).field_e.field_C = 1;
                                                  break L10;
                                                } else {
                                                  ((tj) this).field_e = null;
                                                  break L10;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L19: {
                                            var5 = -((tj) this).field_e.field_z + ((tj) this).field_e.field_B.field_g.length;
                                            var6 = -((tj) this).field_e.field_C + 512;
                                            if (var5 - ((tj) this).field_e.field_B.field_h >= var6) {
                                              break L19;
                                            } else {
                                              var6 = var5 + -((tj) this).field_e.field_B.field_h;
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
                                            ((tj) this).field_x.a(((tj) this).field_e.field_B.field_h, var6, ((tj) this).field_e.field_B.field_g, 5768);
                                            if (((tj) this).field_m != 0) {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var7 >= var6) {
                                                  break L21;
                                                } else {
                                                  ((tj) this).field_e.field_B.field_g[var7 + ((tj) this).field_e.field_B.field_h] = (byte)ak.a((int) ((tj) this).field_e.field_B.field_g[var7 + ((tj) this).field_e.field_B.field_h], (int) ((tj) this).field_m);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                          ((tj) this).field_e.field_B.field_h = ((tj) this).field_e.field_B.field_h + var6;
                                          ((tj) this).field_e.field_C = ((tj) this).field_e.field_C + var6;
                                          if (((tj) this).field_e.field_B.field_h != var5) {
                                            if (((tj) this).field_e.field_C == 512) {
                                              ((tj) this).field_e.field_C = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            ((tj) this).field_e.b((byte) -79);
                                            ((tj) this).field_e.field_m = false;
                                            ((tj) this).field_e = null;
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
                              stackOut_88_0 = 1;
                              stackIn_89_0 = stackOut_88_0;
                              break L4;
                            }
                          } else {
                            ((tj) this).field_i.field_h = 0;
                            ((tj) this).field_i.f(6389, 0);
                            ((tj) this).field_i.a(var2_ref.field_j, true);
                            ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                            ((tj) this).field_n.a((byte) -128, (ri) (Object) var2_ref);
                            var2_ref = (pj) (Object) ((tj) this).field_a.a(104);
                            continue L6;
                          }
                        }
                      } else {
                        ((tj) this).field_i.field_h = 0;
                        ((tj) this).field_i.f(6389, 1);
                        ((tj) this).field_i.a(var2_ref.field_j, true);
                        ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                        ((tj) this).field_h.a((byte) -128, (ri) (Object) var2_ref);
                        var2_ref = (pj) (Object) ((tj) this).field_c.a(97);
                        continue L5;
                      }
                    }
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((tj) this).field_x.a(true);
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
                  ((tj) this).field_p = ((tj) this).field_p + 1;
                  ((tj) this).field_k = -2;
                  ((tj) this).field_x = null;
                  if (((tj) this).a((byte) 87) != 0) {
                    break L25;
                  } else {
                    if (((tj) this).e(-10236) == 0) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_89_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            pj var4_ref3 = null;
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
            var6 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((tj) this).field_x != null) {
                    try {
                      L2: {
                        ((tj) this).field_x.a(true);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((tj) this).field_x = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((tj) this).field_x = (gj) param1;
                int discarded$1 = 0;
                this.a();
                this.a(3, param0);
                ((tj) this).field_e = null;
                if (param2 == 20) {
                  ((tj) this).field_g.field_h = 0;
                  L4: while (true) {
                    var4_ref3 = (pj) (Object) ((tj) this).field_h.d(-31914);
                    if (var4_ref3 != null) {
                      ((tj) this).field_c.a((byte) -128, (ri) (Object) var4_ref3);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref3 = (pj) (Object) ((tj) this).field_n.d(param2 + -31934);
                        if (var4_ref3 != null) {
                          ((tj) this).field_a.a((byte) -128, (ri) (Object) var4_ref3);
                          continue L5;
                        } else {
                          L6: {
                            if (((tj) this).field_m != 0) {
                              {
                                L7: {
                                  ((tj) this).field_i.field_h = 0;
                                  ((tj) this).field_i.f(6389, 4);
                                  ((tj) this).field_i.f(6389, (int) ((tj) this).field_m);
                                  ((tj) this).field_i.a(-122, 0);
                                  ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                                  break L7;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((tj) this).field_b = 0;
                          ((tj) this).field_l = lk.a(param2 + -20);
                          break L0;
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
                stackOut_27_0 = (RuntimeException) var4_ref2;
                stackOut_27_1 = new StringBuilder().append("tj.D(").append(param0).append(44);
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param1 == null) {
                  stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                  stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L11;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L11;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        try {
            ((tj) this).field_x.a(true);
            int var2_int = 19 % ((81 - param0) / 34);
        } catch (Exception exception) {
        }
        ((tj) this).field_k = -1;
        ((tj) this).field_x = null;
        ((tj) this).field_p = ((tj) this).field_p + 1;
        ((tj) this).field_m = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            oa stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            oa stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            oa stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            oa stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            oa stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            oa stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (((tj) this).field_x != null) {
              try {
                L0: {
                  L1: {
                    if (param0 == 3) {
                      break L1;
                    } else {
                      this.a(-2, false);
                      break L1;
                    }
                  }
                  L2: {
                    ((tj) this).field_i.field_h = 0;
                    stackOut_4_0 = ((tj) this).field_i;
                    stackOut_4_1 = 6389;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (param1) {
                      stackOut_6_0 = (oa) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (oa) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((oa) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                  ((tj) this).field_i.a(0L, true);
                  ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      ((tj) this).field_x.a(true);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((tj) this).field_p = ((tj) this).field_p + 1;
                  ((tj) this).field_k = -2;
                  ((tj) this).field_x = null;
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

    private final void a() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((tj) this).field_x == null) {
              return;
            } else {
              {
                L0: {
                  ((tj) this).field_i.field_h = 0;
                  ((tj) this).field_i.f(6389, 6);
                  ((tj) this).field_i.i(3, 45);
                  ((tj) this).field_i.c(0, -159688920);
                  ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
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

    final void a(int param0) {
        if (!(null == ((tj) this).field_x)) {
            ((tj) this).field_x.a(true);
        }
        if (param0 != -2025316960) {
            field_A = null;
        }
    }

    public tj() {
    }

    public static void d() {
        field_z = null;
        field_w = null;
        field_v = null;
        int var1 = 0;
        field_t = null;
        field_A = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = "Create a free account to start using this feature";
        field_z = "Submit for ";
        field_A = "Please enter your age in years";
        field_v = null;
    }
}
