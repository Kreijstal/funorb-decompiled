/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends ob {
    static int field_r;
    private j field_q;

    final void e(int param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  this.field_q.b((byte) -118);
                  if (param0 == 20406) {
                    break L2;
                  } else {
                    this.a(true, 38);
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L3;
              }
            }
            this.field_q = null;
            this.field_p = -1;
            this.field_j = this.field_j + 1;
            this.field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "ap.J(" + param0 + ')');
        }
    }

    final void a(boolean param0, Object param1, boolean param2) {
        try {
            ng stackIn_28_0 = null;
            ng stackIn_30_0 = null;
            ng stackIn_31_0 = null;
            int stackIn_31_1 = 0;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            ld var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != this.field_q) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            this.field_q.b((byte) -118);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof Exception ? 6 : 40);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4 = (Exception) ((Object) caughtException);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_q = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.field_q = (j) (param1);
                            this.d((byte) -121);
                            this.a(param0, 25);
                            this.field_h = null;
                            this.field_i.field_f = 0;
                            if (!param2) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            var4_ref = (ld) ((Object) this.field_f.d(-4425));
                            if (var4_ref != null) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var6 != 0) {
                                statePc = 17;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var6 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            this.field_m.a((byte) 122, var4_ref);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var6 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var4_ref = (ld) ((Object) this.field_a.d(-4425));
                            if (var4_ref != null) {
                                statePc = 23;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var6 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var6 == 0) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            this.field_k.a((byte) 110, var4_ref);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var6 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (this.field_d == 0) {
                                statePc = 38;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_n.field_f = 0;
                            this.field_n.a(true, 4);
                            stackIn_30_0 = this.field_n;
                            stackIn_28_0 = stackIn_30_0;
                            if (param2) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof IOException ? 33 : 40);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackIn_31_0 = (ng) ((Object) stackIn_28_0);
                            stackIn_31_1 = 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof IOException ? 33 : 40);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackIn_31_0 = (ng) ((Object) stackIn_30_0);
                            stackIn_31_1 = 0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof IOException ? 33 : 40);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((ng) (Object) stackIn_31_0).a(stackIn_31_1 != 0, (int) this.field_d);
                            this.field_n.a(0, -16384);
                            this.field_q.a(0, 90, this.field_n.field_h, this.field_n.field_h.length);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof IOException ? 33 : 40);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            this.field_q.b((byte) -118);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof Exception ? 36 : 40);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.field_q = null;
                            this.field_j = this.field_j + 1;
                            this.field_p = -2;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            this.field_c = 0;
                            this.field_e = lo.a((byte) -33);
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 40;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_43_0 = (RuntimeException) (var4_ref3);
                        stackIn_41_0 = stackIn_43_0;
                        stackIn_43_1 = new StringBuilder().append("ap.D(").append(param0).append(',');
                        stackIn_41_1 = stackIn_43_1;
                        if (param1 == null) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        stackIn_44_0 = (RuntimeException) ((Object) stackIn_41_0);
                        stackIn_44_1 = (StringBuilder) ((Object) stackIn_41_1);
                        stackIn_44_2 = "{...}";
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 43: {
                        stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                        stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                        stackIn_44_2 = "null";
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        throw dn.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ')');
                    }
                    case 45: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            int var3_int = 0;
            ng stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ng stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var3 = null;
            IOException var4 = null;
            Exception var5 = null;
            try {
              L0: {
                var3_int = -20 / ((param1 - -57) / 33);
                if (this.field_q != null) {
                  try {
                    L1: {
                      L2: {
                        this.field_n.field_f = 0;
                        stackIn_5_0 = this.field_n;

                        stackIn_5_1 = 1;

                        if (param0) {
                          stackIn_6_0 = (ng) ((Object) stackIn_5_0);
                          stackIn_6_1 = stackIn_5_1;
                          stackIn_6_2 = 2;
                          break L2;
                        } else {
                          stackIn_6_0 = (ng) ((Object) stackIn_5_0);
                          stackIn_6_1 = stackIn_5_1;
                          stackIn_6_2 = 3;
                          break L2;
                        }
                      }
                      ((ng) (Object) stackIn_6_0).a(stackIn_6_1 != 0, stackIn_6_2);
                      this.field_n.a(0L, false);
                      this.field_q.a(0, 108, this.field_n.field_h, this.field_n.field_h.length);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var4 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L4: {
                          this.field_q.b((byte) -118);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      this.field_p = -2;
                      this.field_j = this.field_j + 1;
                      this.field_q = null;
                      break L3;
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
              var3 = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) ((Object) var3), "ap.K(" + param0 + ',' + param1 + ')');
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

    private final void d(byte param0) {
        try {
            int var2_int = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            IOException var3 = null;
            Exception var4 = null;
            try {
              L0: {
                var2_int = -62 % ((19 - param0) / 51);
                if (null != this.field_q) {
                  try {
                    L1: {
                      this.field_n.field_f = 0;
                      this.field_n.a(true, 6);
                      this.field_n.a((byte) 104, 3);
                      this.field_n.c(-161478600, 0);
                      this.field_q.a(0, 124, this.field_n.field_h, this.field_n.field_h.length);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var3 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L3: {
                          this.field_q.b((byte) -118);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L4: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L4;
                        }
                      }
                      this.field_j = this.field_j + 1;
                      this.field_p = -2;
                      this.field_q = null;
                      break L2;
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
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) ((Object) var2), "ap.L(" + param0 + ')');
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

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        ce stackIn_67_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        md var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        ce var5 = null;
        String var5_ref = null;
        String var6 = null;
        ce var6_ref = null;
        String var7 = null;
        ce var7_ref = null;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ap.a(true);
                break L1;
              }
            }
            var1 = kd.field_n;
            var2 = var1.h(255);
            if (0 == var2) {
              L2: {
                if (null != vl.field_d) {
                  break L2;
                } else {
                  vl.field_d = new vp(128);
                  hl.field_h = 0;
                  break L2;
                }
              }
              L3: {
                if (var1.h(255) != 1) {
                  stackIn_14_0 = 0;
                  break L3;
                } else {
                  stackIn_14_0 = 1;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_14_0;
                var4_ref_String = var1.i(117);
                if (var3_int != 0) {
                  var1.i(110);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param0) {
                  stackIn_22_0 = 0;
                  break L5;
                } else {
                  stackIn_22_0 = 1;
                  break L5;
                }
              }
              L6: {
                var5 = fk.a(stackIn_22_0 != 0, var4_ref_String);
                var6 = var1.i(122);
                var7 = fe.a(60136, (CharSequence) ((Object) var4_ref_String));
                if (var7 != null) {
                  break L6;
                } else {
                  var7 = var4_ref_String;
                  break L6;
                }
              }
              L7: {
                if (null != var5) {
                  break L7;
                } else {
                  var5 = fk.a(true, var6);
                  if (var5 != null) {
                    vl.field_d.a(var5, (long)var7.hashCode(), (byte) 125);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var5 == null) {
                  var5 = new ce();
                  vl.field_d.a(var5, (long)var7.hashCode(), (byte) 104);
                  fieldTemp$0 = hl.field_h;
                  hl.field_h = hl.field_h + 1;
                  var5.field_db = fieldTemp$0;
                  g.field_b.b(0, var5);
                  break L8;
                } else {
                  break L8;
                }
              }
              var5.field_fb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 == 1) {
                L9: {
                  if (null != me.field_f) {
                    break L9;
                  } else {
                    me.field_f = new vp(128);
                    ob.field_g = 0;
                    break L9;
                  }
                }
                L10: {
                  var3 = var1.i(118);
                  if (((String) (var3)).equals("")) {
                    var3 = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1.i(119);
                  var5_ref = var1.i(123);
                  var6_ref = rg.a(var4_ref_String, (byte) -3);
                  if (null == var6_ref) {
                    var6_ref = rg.a(var5_ref, (byte) -1);
                    if (var6_ref == null) {
                      break L11;
                    } else {
                      me.field_f.a(var6_ref, (long)fe.a(60136, (CharSequence) ((Object) var4_ref_String)).hashCode(), (byte) 92);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var6_ref != null) {
                    break L12;
                  } else {
                    var6_ref = new ce();
                    me.field_f.a(var6_ref, (long)fe.a(60136, (CharSequence) ((Object) var4_ref_String)).hashCode(), (byte) 85);
                    fieldTemp$1 = ob.field_g;
                    ob.field_g = ob.field_g + 1;
                    var6_ref.field_db = fieldTemp$1;
                    df.field_b.b(0, var6_ref);
                    break L12;
                  }
                }
                L13: {
                  if (null != var3) {
                    var3 = ((String) (var3)).intern();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var6_ref.field_cb = (String) (var3);
                var6_ref.field_fb = var4_ref_String;
                var6_ref.a(param0);
                var7_ref = (ce) ((Object) df.field_b.g(32073));
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        L18: {
                          if (var7_ref == null) {
                            break L18;
                          } else {
                            stackIn_67_0 = (ce) (var6_ref);

                            if (var8 != 0) {
                              break L17;
                            } else {
                              if (!ll.a(stackIn_67_0, 0, var7_ref)) {
                                break L18;
                              } else {
                                var7_ref = (ce) ((Object) df.field_b.a(false));
                                if (var8 == 0) {
                                  continue L14;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        if (null == var7_ref) {
                          break L16;
                        } else {
                          stackIn_67_0 = (ce) (var7_ref);
                          break L17;
                        }
                      }
                      rf.a(stackIn_67_0, var6_ref, 47);
                      if (var8 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                    df.field_b.b(0, var6_ref);
                    break L15;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if ((var2 ^ -1) != -3) {
                  if (var2 == 3) {
                    L19: {
                      if (2 == mh.field_h) {
                        mh.field_h = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 != var2) {
                      wp.a((Throwable) null, "F1: " + ug.a(-1815), 21862);
                      jj.a(4);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      mh.field_h = 1;
                      var3 = var1.i(111);
                      nh.field_z = ((String) (var3)).intern();
                      var4 = var1.h(255);
                      wl.a(7, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L20: {
                    if (1 == mh.field_h) {
                      mh.field_h = 2;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "ap.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final boolean b(byte param0) {
        try {
            int stackIn_19_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_108_0 = 0;
            int stackIn_116_0 = 0;
            int stackIn_120_0 = 0;
            int stackIn_137_0 = 0;
            int stackIn_147_0 = 0;
            int stackIn_149_0 = 0;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            ld var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3_int = 0;
            Exception var3 = null;
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
            ld var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (this.field_q != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2_long = lo.a((byte) 95);
                            var4 = (int)(-this.field_e + var2_long);
                            if (var4 <= 200) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = 200;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_e = var2_long;
                            this.field_c = this.field_c + var4;
                            if (this.field_c <= 30000) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_q.b((byte) -118);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 9 : 150);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var5_ref_Exception = (Exception) ((Object) caughtException);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            this.field_q = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (null == this.field_q) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-1 != (this.b(20) ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (0 == this.d(20)) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackIn_19_0 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        try {
                            stackIn_21_0 = 1;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        try {
                            this.field_q.a(-128);
                            var2 = (ld) ((Object) this.field_m.b(120));
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null == var2) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.field_n.field_f = 0;
                            this.field_n.a(true, 1);
                            this.field_n.a(var2.field_k, false);
                            this.field_q.a(0, 106, this.field_n.field_h, this.field_n.field_h.length);
                            this.field_f.a((byte) 113, var2);
                            var2 = (ld) ((Object) this.field_m.a(127));
                            if (var16 != 0) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var16 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var2 = (ld) ((Object) this.field_k.b(124));
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2 == null) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            this.field_n.field_f = 0;
                            this.field_n.a(true, 0);
                            this.field_n.a(var2.field_k, false);
                            this.field_q.a(0, 116, this.field_n.field_h, this.field_n.field_h.length);
                            this.field_a.a((byte) 111, var2);
                            var2 = (ld) ((Object) this.field_k.a(104));
                            if (var16 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var2_int = 0;
                            if (param0 >= 60) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            this.e(111);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 136;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var3_int = this.field_q.c(0);
                            stackIn_137_0 = var3_int ^ -1;
                            stackIn_36_0 = stackIn_137_0;
                            if (var16 != 0) {
                                statePc = 137;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (stackIn_36_0 <= -1) {
                                statePc = 41;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (0 == var3_int) {
                                statePc = 136;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            this.field_c = 0;
                            var4 = 0;
                            if (this.field_h == null) {
                                statePc = 49;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (0 == this.field_h.field_t) {
                                statePc = 48;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var4 = 10;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (-1 > (var4 ^ -1)) {
                                statePc = 75;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = this.field_h.field_s.field_h.length - this.field_h.field_u;
                            var6 = -this.field_h.field_t + 512;
                            if (var6 <= var5 - this.field_h.field_s.field_f) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var6 = var5 + -this.field_h.field_s.field_f;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 56;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6 = var3_int;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = ((Object) stateCaught_56 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            this.field_q.a(this.field_h.field_s.field_h, var6, 2034, this.field_h.field_s.field_f);
                            if (this.field_d == 0) {
                                statePc = 64;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var7 = 0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = ((Object) stateCaught_58 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var6 <= var7) {
                                statePc = 64;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = ((Object) stateCaught_59 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            this.field_h.field_s.field_h[var7 + this.field_h.field_s.field_f] = (byte)oe.a((int) this.field_h.field_s.field_h[var7 + this.field_h.field_s.field_f], (int) this.field_d);
                            var7++;
                            if (var16 != 0) {
                                statePc = 65;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = ((Object) stateCaught_60 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var16 == 0) {
                                statePc = 59;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = ((Object) stateCaught_61 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = ((Object) stateCaught_62 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            this.field_h.field_s.field_f = this.field_h.field_s.field_f + var6;
                            this.field_h.field_t = this.field_h.field_t + var6;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = ((Object) stateCaught_64 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var5 != this.field_h.field_s.field_f) {
                                statePc = 69;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = ((Object) stateCaught_65 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            this.field_h.a(1);
                            this.field_h.field_n = false;
                            this.field_h = null;
                            if (var16 == 0) {
                                statePc = 135;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = ((Object) stateCaught_66 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = ((Object) stateCaught_67 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (-513 != (this.field_h.field_t ^ -1)) {
                                statePc = 135;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = ((Object) stateCaught_69 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = ((Object) stateCaught_70 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            this.field_h.field_t = 0;
                            if (var16 == 0) {
                                statePc = 135;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = ((Object) stateCaught_72 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = ((Object) stateCaught_73 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var5 = var4 - this.field_i.field_f;
                            if (var5 <= var3_int) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = ((Object) stateCaught_75 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var5 = var3_int;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = ((Object) stateCaught_76 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            this.field_q.a(this.field_i.field_h, var5, 2034, this.field_i.field_f);
                            if ((this.field_d ^ -1) == -1) {
                                statePc = 84;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = ((Object) stateCaught_77 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var6 = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = ((Object) stateCaught_78 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if ((var5 ^ -1) >= (var6 ^ -1)) {
                                statePc = 84;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = ((Object) stateCaught_79 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            this.field_i.field_h[this.field_i.field_f - -var6] = (byte)oe.a((int) this.field_i.field_h[this.field_i.field_f + var6], (int) this.field_d);
                            var6++;
                            if (var16 != 0) {
                                statePc = 85;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = ((Object) stateCaught_80 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var16 == 0) {
                                statePc = 79;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = ((Object) stateCaught_81 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = ((Object) stateCaught_82 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            this.field_i.field_f = this.field_i.field_f + var5;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = ((Object) stateCaught_84 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var4 > this.field_i.field_f) {
                                statePc = 135;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = ((Object) stateCaught_85 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (null == this.field_h) {
                                statePc = 91;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = ((Object) stateCaught_86 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = ((Object) stateCaught_87 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = ((Object) stateCaught_89 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            this.field_i.field_f = 0;
                            var6 = this.field_i.h(255);
                            var7 = this.field_i.b((byte) 126);
                            var8 = this.field_i.h(255);
                            var9 = this.field_i.b((byte) 127);
                            var10 = 127 & var8;
                            if (-1 == (var8 & 128 ^ -1)) {
                                statePc = 94;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = ((Object) stateCaught_91 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackIn_95_0 = 1;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = ((Object) stateCaught_92 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            stackIn_95_0 = 0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = ((Object) stateCaught_94 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var11 = stackIn_95_0;
                            var12 = (long)var7 + ((long)var6 << -643036640);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = ((Object) stateCaught_95 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var14_ref = (ld) ((Object) this.field_a.b(120));
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = ((Object) stateCaught_96 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (var14_ref == null) {
                                statePc = 112;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = ((Object) stateCaught_97 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            stackIn_116_0 = ((var14_ref.field_k ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_k ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_99_0 = stackIn_116_0;
                            if (var16 != 0) {
                                statePc = 116;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = ((Object) stateCaught_98 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackIn_101_0 = stackIn_99_0;
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = ((Object) stateCaught_99 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (stackIn_101_0 == 0) {
                                statePc = 112;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = ((Object) stateCaught_101 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = ((Object) stateCaught_102 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var14_ref = (ld) ((Object) this.field_a.a(93));
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = ((Object) stateCaught_104 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var14_ref = (ld) ((Object) this.field_f.b(114));
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = ((Object) stateCaught_105 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (var14_ref == null) {
                                statePc = 112;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = ((Object) stateCaught_106 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            stackIn_116_0 = (var14_ref.field_k < var12 ? -1 : (var14_ref.field_k == var12 ? 0 : 1));
                            stackIn_108_0 = stackIn_116_0;
                            if (var16 != 0) {
                                statePc = 116;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = ((Object) stateCaught_107 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if (stackIn_108_0 == 0) {
                                statePc = 112;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = ((Object) stateCaught_108 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = ((Object) stateCaught_109 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var14_ref = (ld) ((Object) this.field_f.a(96));
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = ((Object) stateCaught_111 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            if (var14_ref != null) {
                                statePc = 115;
                            } else {
                                statePc = 113;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = ((Object) stateCaught_112 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = ((Object) stateCaught_113 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            stackIn_116_0 = -1;
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = ((Object) stateCaught_115 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            if (stackIn_116_0 == (var10 ^ -1)) {
                                statePc = 119;
                            } else {
                                statePc = 117;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = ((Object) stateCaught_116 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            stackIn_120_0 = 9;
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = ((Object) stateCaught_117 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            stackIn_120_0 = 5;
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = ((Object) stateCaught_119 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            var15 = stackIn_120_0;
                            this.field_h = var14_ref;
                            this.field_h.field_s = new ng(this.field_h.field_u + (var15 + var9));
                            this.field_h.field_s.a(true, var10);
                            this.field_h.field_s.a(var9, -16384);
                            this.field_h.field_t = 10;
                            this.field_i.field_f = 0;
                            if (var16 == 0) {
                                statePc = 135;
                            } else {
                                statePc = 121;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = ((Object) stateCaught_120 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            if (0 == this.field_h.field_t) {
                                statePc = 126;
                            } else {
                                statePc = 122;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = ((Object) stateCaught_121 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = ((Object) stateCaught_122 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            statePc = 133;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = ((Object) stateCaught_124 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            if ((this.field_i.field_h[0] ^ -1) == 0) {
                                statePc = 130;
                            } else {
                                statePc = 127;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = ((Object) stateCaught_126 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            this.field_h = null;
                            if (var16 == 0) {
                                statePc = 135;
                            } else {
                                statePc = 128;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = ((Object) stateCaught_127 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = ((Object) stateCaught_128 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            this.field_h.field_t = 1;
                            this.field_i.field_f = 0;
                            if (var16 == 0) {
                                statePc = 135;
                            } else {
                                statePc = 131;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = ((Object) stateCaught_130 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            statePc = 133;
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = ((Object) stateCaught_131 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = ((Object) stateCaught_133 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 34;
                            } else {
                                statePc = 136;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = ((Object) stateCaught_135 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            stackIn_137_0 = 1;
                            statePc = 137;
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = ((Object) stateCaught_136 instanceof IOException ? 138 : 150);
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        return stackIn_137_0 != 0;
                    }
                    case 138: {
                        try {
                            var2_ref = (IOException) ((Object) caughtException);
                            statePc = 139;
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            this.field_q.b((byte) -118);
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = ((Object) stateCaught_139 instanceof Exception ? 141 : 150);
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            statePc = 142;
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            statePc = 142;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            this.field_q = null;
                            this.field_p = -2;
                            this.field_j = this.field_j + 1;
                            if (0 != this.b(20)) {
                                statePc = 146;
                            } else {
                                statePc = 143;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            if (0 == this.d(20)) {
                                statePc = 148;
                            } else {
                                statePc = 144;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            statePc = 146;
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            stackIn_147_0 = 0;
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        return stackIn_147_0 != 0;
                    }
                    case 148: {
                        try {
                            stackIn_149_0 = 1;
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = 150;
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        return stackIn_149_0 != 0;
                    }
                    case 150: {
                        var2_ref2 = (RuntimeException) ((Object) caughtException);
                        throw dn.a((Throwable) ((Object) var2_ref2), "ap.E(" + param0 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_q == null) {
                break L1;
              } else {
                this.field_q.b((byte) -118);
                break L1;
              }
            }
            var2_int = -61 / ((-61 - param0) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "ap.G(" + param0 + ')');
        }
    }

    public ap() {
    }

    static {
    }
}
