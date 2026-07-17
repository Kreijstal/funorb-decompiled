/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends sb {
    static String[] field_q;
    static sf field_r;
    static int field_s;
    private pj field_t;

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            s var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            var6 = EscapeVector.field_A;
            try {
              L0: {
                L1: {
                  if (null != ((bk) this).field_t) {
                    try {
                      L2: {
                        ((bk) this).field_t.c(12497);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((bk) this).field_t = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 < -80) {
                  ((bk) this).field_t = (pj) param0;
                  this.f(78);
                  this.a(param1, false);
                  ((bk) this).field_c = null;
                  ((bk) this).field_o.field_m = 0;
                  L4: while (true) {
                    var4_ref3 = (s) (Object) ((bk) this).field_l.b((byte) -75);
                    if (var4_ref3 == null) {
                      L5: while (true) {
                        var4_ref3 = (s) (Object) ((bk) this).field_n.b((byte) -75);
                        if (var4_ref3 == null) {
                          L6: {
                            if (((bk) this).field_m != 0) {
                              {
                                L7: {
                                  ((bk) this).field_e.field_m = 0;
                                  ((bk) this).field_e.f(4, -123);
                                  ((bk) this).field_e.f((int) ((bk) this).field_m, -123);
                                  ((bk) this).field_e.a((byte) 125, 0);
                                  ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                                  break L7;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((bk) this).field_f = 0;
                          ((bk) this).field_k = td.b(128);
                          break L0;
                        } else {
                          ((bk) this).field_j.a(-1, (fl) (Object) var4_ref3);
                          continue L5;
                        }
                      }
                    } else {
                      ((bk) this).field_p.a(-1, (fl) (Object) var4_ref3);
                      continue L4;
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
                stackOut_33_0 = (RuntimeException) var4_ref2;
                stackOut_33_1 = new StringBuilder().append("bk.F(");
                stackIn_36_0 = stackOut_33_0;
                stackIn_36_1 = stackOut_33_1;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L11;
                } else {
                  stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                  stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                  stackOut_34_2 = "{...}";
                  stackIn_37_0 = stackOut_34_0;
                  stackIn_37_1 = stackOut_34_1;
                  stackIn_37_2 = stackOut_34_2;
                  break L11;
                }
              }
              throw t.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param1 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_q = null;
              if (param0 == -24811) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "bk.Q(" + param0 + 41);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            RuntimeException var3_ref = null;
            Exception var4 = null;
            n stackIn_3_0 = null;
            n stackIn_5_0 = null;
            n stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            n stackOut_2_0 = null;
            n stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            n stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            try {
              L0: {
                if (null != ((bk) this).field_t) {
                  try {
                    L1: {
                      L2: {
                        ((bk) this).field_e.field_m = 0;
                        stackOut_2_0 = ((bk) this).field_e;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_3_0 = stackOut_2_0;
                        if (!param0) {
                          stackOut_5_0 = (n) (Object) stackIn_5_0;
                          stackOut_5_1 = 3;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          break L2;
                        } else {
                          stackOut_3_0 = (n) (Object) stackIn_3_0;
                          stackOut_3_1 = 2;
                          stackIn_6_0 = stackOut_3_0;
                          stackIn_6_1 = stackOut_3_1;
                          break L2;
                        }
                      }
                      L3: {
                        ((n) (Object) stackIn_6_0).f(stackIn_6_1, -123);
                        ((bk) this).field_e.a(0L, 125);
                        if (!param1) {
                          break L3;
                        } else {
                          bk.g(90);
                          break L3;
                        }
                      }
                      ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L5: {
                          ((bk) this).field_t.c(12497);
                          break L5;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L6: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L6;
                        }
                      }
                      ((bk) this).field_t = null;
                      ((bk) this).field_d = -2;
                      ((bk) this).field_g = ((bk) this).field_g + 1;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw t.a((Throwable) (Object) var3_ref, "bk.N(" + param0 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ij a(int param0, boolean param1, int param2, int param3, int param4) {
        ij var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ij stackIn_7_0 = null;
        ij stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_12_0 = null;
        ij stackOut_6_0 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var5 = (ij) (Object) qd.field_n.a(false);
            L1: while (true) {
              if (null == var5) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    field_q = null;
                    break L2;
                  }
                }
                var5 = new ij();
                var5.field_j = param4;
                var5.field_n = param0;
                var5.field_h = param2;
                qd.field_n.a(-12328, (hg) (Object) var5);
                aj.a(124, param3, var5);
                stackOut_12_0 = (ij) var5;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                if (~param0 != ~var5.field_n) {
                  var5 = (ij) (Object) qd.field_n.b((byte) 70);
                  continue L1;
                } else {
                  stackOut_6_0 = (ij) var5;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var5_ref, "bk.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_13_0;
    }

    final void b(byte param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                ((bk) this).field_t.c(12497);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
            L3: {
              ((bk) this).field_g = ((bk) this).field_g + 1;
              if (param0 < -108) {
                break L3;
              } else {
                bk.h(-33);
                break L3;
              }
            }
            ((bk) this).field_d = -1;
            ((bk) this).field_t = null;
            ((bk) this).field_m = (byte)(int)(1.0 + 255.0 * Math.random());
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "bk.B(" + param0 + 41);
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((bk) this).a(-28);
                break L1;
              }
            }
            L2: {
              if (((bk) this).field_t == null) {
                break L2;
              } else {
                ((bk) this).field_t.c(12497);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "bk.E(" + param0 + 41);
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param1) {
              var3_int = param2 >>> 31;
              stackOut_3_0 = (param2 - -var3_int) / param0 + -var3_int;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 36;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "bk.P(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        c var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        tg var5 = null;
        String var5_ref = null;
        String var6 = null;
        tg var6_ref = null;
        String var7 = null;
        tg var7_ref = null;
        int var8 = 0;
        int stackIn_12_0 = 0;
        tg stackIn_62_0 = null;
        tg stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        tg stackOut_60_0 = null;
        tg stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var1_ref = om.field_g;
            var2 = var1_ref.e(param0);
            if (param0 == var2) {
              L1: {
                if (null == ml.field_a) {
                  ml.field_a = new nn(128);
                  qc.field_Ab = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var1_ref.e(0) != 1) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              L3: {
                var3_int = stackIn_12_0;
                var4_ref_String = var1_ref.c(false);
                if (var3_int != 0) {
                  String discarded$3 = var1_ref.c(false);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var5 = gf.a(var4_ref_String, (byte) -125);
                var6 = var1_ref.c(false);
                var7 = sf.a(-123, (CharSequence) (Object) var4_ref_String);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5 != null) {
                  break L5;
                } else {
                  var5 = gf.a(var6, (byte) 114);
                  if (null != var5) {
                    ml.field_a.a((long)var7.hashCode(), (fl) (Object) var5, 26);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (null == var5) {
                  var5 = new tg();
                  ml.field_a.a((long)var7.hashCode(), (fl) (Object) var5, 37);
                  int fieldTemp$4 = qc.field_Ab;
                  qc.field_Ab = qc.field_Ab + 1;
                  var5.field_pb = fieldTemp$4;
                  jd.field_a.a(-12328, (hg) (Object) var5);
                  break L6;
                } else {
                  break L6;
                }
              }
              var5.field_ob = var4_ref_String;
              return;
            } else {
              if (var2 == 1) {
                L7: {
                  if (bm.field_b == null) {
                    bm.field_b = new nn(128);
                    ua.field_a = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var3 = var1_ref.c(false);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var4_ref_String = var1_ref.c(false);
                  var5_ref = var1_ref.c(false);
                  var6_ref = fk.a(param0 ^ -1465, var4_ref_String);
                  if (var6_ref != null) {
                    break L9;
                  } else {
                    var6_ref = fk.a(-1465, var5_ref);
                    if (var6_ref != null) {
                      bm.field_b.a((long)sf.a(-88, (CharSequence) (Object) var4_ref_String).hashCode(), (fl) (Object) var6_ref, 25);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (null != var6_ref) {
                    break L10;
                  } else {
                    var6_ref = new tg();
                    bm.field_b.a((long)sf.a(-109, (CharSequence) (Object) var4_ref_String).hashCode(), (fl) (Object) var6_ref, param0 ^ 123);
                    int fieldTemp$5 = ua.field_a;
                    ua.field_a = ua.field_a + 1;
                    var6_ref.field_pb = fieldTemp$5;
                    ji.field_c.a(-12328, (hg) (Object) var6_ref);
                    break L10;
                  }
                }
                L11: {
                  if (null != var3) {
                    var3 = var3.intern();
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var6_ref.field_ob = var4_ref_String;
                var6_ref.field_lb = var3;
                var6_ref.c((byte) -14);
                var7_ref = (tg) (Object) ji.field_c.a(false);
                L12: while (true) {
                  L13: {
                    if (null == var7_ref) {
                      break L13;
                    } else {
                      if (!EscapeVector.a(var6_ref, var7_ref, -7457)) {
                        break L13;
                      } else {
                        var7_ref = (tg) (Object) ji.field_c.b((byte) 70);
                        continue L12;
                      }
                    }
                  }
                  L14: {
                    if (var7_ref == null) {
                      ji.field_c.a(param0 ^ -12328, (hg) (Object) var6_ref);
                      break L14;
                    } else {
                      stackOut_60_0 = (tg) var6_ref;
                      stackOut_60_1 = (tg) var7_ref;
                      stackOut_60_2 = -7;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_62_1 = stackOut_60_1;
                      stackIn_62_2 = stackOut_60_2;
                      EscapeVector.a((hg) (Object) stackIn_62_0, (hg) (Object) stackIn_62_1, (byte) stackIn_62_2);
                      break L14;
                    }
                  }
                  return;
                }
              } else {
                if (var2 == 2) {
                  L15: {
                    if (mi.field_g != 1) {
                      break L15;
                    } else {
                      mi.field_g = 2;
                      break L15;
                    }
                  }
                  return;
                } else {
                  if (var2 == 3) {
                    L16: {
                      if (mi.field_g != 2) {
                        break L16;
                      } else {
                        mi.field_g = 1;
                        break L16;
                      }
                    }
                    return;
                  } else {
                    if (4 == var2) {
                      mi.field_g = 1;
                      var3 = var1_ref.c(false);
                      di.field_f = var3.intern();
                      var4 = var1_ref.e(0);
                      ii.a((byte) 16, var4);
                      return;
                    } else {
                      pf.a(false, "F1: " + hf.b((byte) -76), (Throwable) null);
                      nm.a(16);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "bk.M(" + param0 + 41);
        }
    }

    private final void f(int param0) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (null != ((bk) this).field_t) {
                  {
                    L1: {
                      ((bk) this).field_e.field_m = 0;
                      ((bk) this).field_e.f(6, -123);
                      var2_int = 45 % ((-48 - param0) / 39);
                      ((bk) this).field_e.b(1743120456, 3);
                      ((bk) this).field_e.h(82, 0);
                      ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                      break L1;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw t.a((Throwable) (Object) var2_ref, "bk.L(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            s var2_ref2 = null;
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
            s var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_21_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_117_0 = 0;
            int stackIn_134_0 = 0;
            int stackIn_144_0 = 0;
            int stackIn_146_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_22_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_116_0 = 0;
            int stackOut_114_0 = 0;
            int stackOut_133_0 = 0;
            int stackOut_143_0 = 0;
            int stackOut_145_0 = 0;
            var16 = EscapeVector.field_A;
            try {
              L0: {
                if (null != ((bk) this).field_t) {
                  L1: {
                    var2_long = td.b(param0 + 4122);
                    var4 = (int)(-((bk) this).field_k + var2_long);
                    ((bk) this).field_k = var2_long;
                    if (var4 <= 200) {
                      break L1;
                    } else {
                      var4 = 200;
                      break L1;
                    }
                  }
                  ((bk) this).field_f = ((bk) this).field_f + var4;
                  if (30000 < ((bk) this).field_f) {
                    try {
                      L2: {
                        ((bk) this).field_t.c(param0 + 16491);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((bk) this).field_t = null;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              if (null == ((bk) this).field_t) {
                L4: {
                  if (0 != ((bk) this).a(true)) {
                    break L4;
                  } else {
                    if (((bk) this).a((byte) 88) == 0) {
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
              } else {
                ((bk) this).field_t.a((byte) 123);
                var2_ref2 = (s) (Object) ((bk) this).field_p.a(0);
                L5: while (true) {
                  if (var2_ref2 == null) {
                    var2_ref2 = (s) (Object) ((bk) this).field_j.a(param0 ^ param0);
                    L6: while (true) {
                      if (var2_ref2 == null) {
                        var2_int = 0;
                        L7: while (true) {
                          L8: {
                            if (var2_int >= 100) {
                              break L8;
                            } else {
                              var3_int = ((bk) this).field_t.b(param0 + 3876);
                              if (var3_int < 0) {
                                throw new IOException();
                              } else {
                                if (var3_int == 0) {
                                  break L8;
                                } else {
                                  L9: {
                                    ((bk) this).field_f = 0;
                                    var4 = 0;
                                    if (((bk) this).field_c != null) {
                                      if (((bk) this).field_c.field_F == 0) {
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
                                    if (var4 > 0) {
                                      L11: {
                                        var5 = var4 + -((bk) this).field_o.field_m;
                                        if (var3_int >= var5) {
                                          break L11;
                                        } else {
                                          var5 = var3_int;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        ((bk) this).field_t.a(((bk) this).field_o.field_m, var5, ((bk) this).field_o.field_g, (byte) -49);
                                        if (((bk) this).field_m == 0) {
                                          break L12;
                                        } else {
                                          var6 = 0;
                                          L13: while (true) {
                                            if (var6 >= var5) {
                                              break L12;
                                            } else {
                                              ((bk) this).field_o.field_g[var6 + ((bk) this).field_o.field_m] = (byte)n.a((int) ((bk) this).field_o.field_g[var6 + ((bk) this).field_o.field_m], (int) ((bk) this).field_m);
                                              var6++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      }
                                      ((bk) this).field_o.field_m = ((bk) this).field_o.field_m + var5;
                                      if (~((bk) this).field_o.field_m > ~var4) {
                                        break L10;
                                      } else {
                                        if (((bk) this).field_c != null) {
                                          if (0 == ((bk) this).field_c.field_F) {
                                            if (((bk) this).field_o.field_g[0] == -1) {
                                              ((bk) this).field_o.field_m = 0;
                                              ((bk) this).field_c.field_F = 1;
                                              break L10;
                                            } else {
                                              ((bk) this).field_c = null;
                                              break L10;
                                            }
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          L14: {
                                            ((bk) this).field_o.field_m = 0;
                                            var6 = ((bk) this).field_o.e(0);
                                            var7 = ((bk) this).field_o.g(-5053);
                                            var8 = ((bk) this).field_o.e(0);
                                            var9 = ((bk) this).field_o.g(-5053);
                                            var10 = var8 & 127;
                                            if (0 == (128 & var8)) {
                                              stackOut_88_0 = 0;
                                              stackIn_89_0 = stackOut_88_0;
                                              break L14;
                                            } else {
                                              stackOut_86_0 = 1;
                                              stackIn_89_0 = stackOut_86_0;
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            var11 = stackIn_89_0;
                                            var12 = (long)var7 + ((long)var6 << 32);
                                            var14 = null;
                                            if (var11 == 0) {
                                              var14_ref = (s) (Object) ((bk) this).field_l.a(0);
                                              L16: while (true) {
                                                if (null == var14_ref) {
                                                  break L15;
                                                } else {
                                                  if (~var12 != ~var14_ref.field_p) {
                                                    var14_ref = (s) (Object) ((bk) this).field_l.a((byte) -52);
                                                    continue L16;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (s) (Object) ((bk) this).field_n.a(0);
                                              L17: while (true) {
                                                if (var14_ref == null) {
                                                  break L15;
                                                } else {
                                                  stackOut_92_0 = (var12 < var14_ref.field_p ? -1 : (var12 == var14_ref.field_p ? 0 : 1));
                                                  stackIn_94_0 = stackOut_92_0;
                                                  if (stackIn_94_0 != 0) {
                                                    var14_ref = (s) (Object) ((bk) this).field_n.a((byte) 106);
                                                    continue L17;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (null != var14_ref) {
                                            L18: {
                                              ((bk) this).field_c = var14_ref;
                                              if (var10 != 0) {
                                                stackOut_116_0 = 9;
                                                stackIn_117_0 = stackOut_116_0;
                                                break L18;
                                              } else {
                                                stackOut_114_0 = 5;
                                                stackIn_117_0 = stackOut_114_0;
                                                break L18;
                                              }
                                            }
                                            var15 = stackIn_117_0;
                                            ((bk) this).field_c.field_A = new n(var15 + (var9 - -((bk) this).field_c.field_y));
                                            ((bk) this).field_c.field_A.f(var10, -123);
                                            ((bk) this).field_c.field_A.a((byte) 125, var9);
                                            ((bk) this).field_c.field_F = 10;
                                            ((bk) this).field_o.field_m = 0;
                                            break L10;
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    } else {
                                      L19: {
                                        var5 = ((bk) this).field_c.field_A.field_g.length - ((bk) this).field_c.field_y;
                                        var6 = -((bk) this).field_c.field_F + 512;
                                        if (~(-((bk) this).field_c.field_A.field_m + var5) <= ~var6) {
                                          break L19;
                                        } else {
                                          var6 = var5 + -((bk) this).field_c.field_A.field_m;
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (~var6 < ~var3_int) {
                                          var6 = var3_int;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        ((bk) this).field_t.a(((bk) this).field_c.field_A.field_m, var6, ((bk) this).field_c.field_A.field_g, (byte) -49);
                                        if (((bk) this).field_m != 0) {
                                          var7 = 0;
                                          L22: while (true) {
                                            if (~var6 >= ~var7) {
                                              break L21;
                                            } else {
                                              ((bk) this).field_c.field_A.field_g[var7 + ((bk) this).field_c.field_A.field_m] = (byte)n.a((int) ((bk) this).field_c.field_A.field_g[var7 + ((bk) this).field_c.field_A.field_m], (int) ((bk) this).field_m);
                                              var7++;
                                              continue L22;
                                            }
                                          }
                                        } else {
                                          break L21;
                                        }
                                      }
                                      ((bk) this).field_c.field_F = ((bk) this).field_c.field_F + var6;
                                      ((bk) this).field_c.field_A.field_m = ((bk) this).field_c.field_A.field_m + var6;
                                      if (~var5 != ~((bk) this).field_c.field_A.field_m) {
                                        if (((bk) this).field_c.field_F == 512) {
                                          ((bk) this).field_c.field_F = 0;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        ((bk) this).field_c.d(-110);
                                        ((bk) this).field_c.field_u = false;
                                        ((bk) this).field_c = null;
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
                          stackOut_133_0 = 1;
                          stackIn_134_0 = stackOut_133_0;
                          return stackIn_134_0 != 0;
                        }
                      } else {
                        ((bk) this).field_e.field_m = 0;
                        ((bk) this).field_e.f(0, -123);
                        ((bk) this).field_e.a(var2_ref2.field_p, -3);
                        ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                        ((bk) this).field_n.a(-1, (fl) (Object) var2_ref2);
                        var2_ref2 = (s) (Object) ((bk) this).field_j.a((byte) -43);
                        continue L6;
                      }
                    }
                  } else {
                    ((bk) this).field_e.field_m = 0;
                    ((bk) this).field_e.f(1, -123);
                    ((bk) this).field_e.a(var2_ref2.field_p, -118);
                    ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                    ((bk) this).field_l.a(param0 + 3993, (fl) (Object) var2_ref2);
                    var2_ref2 = (s) (Object) ((bk) this).field_p.a((byte) -101);
                    continue L5;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                L23: {
                  ((bk) this).field_t.c(12497);
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
                ((bk) this).field_t = null;
                ((bk) this).field_d = -2;
                ((bk) this).field_g = ((bk) this).field_g + 1;
                if (((bk) this).a(true) != 0) {
                  break L25;
                } else {
                  if (((bk) this).a((byte) 88) != 0) {
                    break L25;
                  } else {
                    stackOut_143_0 = 1;
                    stackIn_144_0 = stackOut_143_0;
                    return stackIn_144_0 != 0;
                  }
                }
              }
              stackOut_145_0 = 0;
              stackIn_146_0 = stackOut_145_0;
              return stackIn_146_0 != 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw t.a((Throwable) (Object) var2_ref, "bk.I(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Object a(boolean param0, byte[] param1, int param2) {
        km var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        km stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        km stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 == 9) {
              if (null != param1) {
                if (param1.length <= 136) {
                  if (param0) {
                    stackOut_12_0 = pn.a(param2 + -9, param1);
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = (byte[]) param1;
                    stackIn_11_0 = stackOut_10_0;
                    return (Object) (Object) stackIn_11_0;
                  }
                } else {
                  var3 = new km();
                  ((fh) (Object) var3).a(true, param1);
                  stackOut_7_0 = (km) var3;
                  stackIn_8_0 = stackOut_7_0;
                  return (Object) (Object) stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("bk.O(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return (Object) (Object) stackIn_13_0;
    }

    public bk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.<delay><br>Your mission is complete."};
    }
}
