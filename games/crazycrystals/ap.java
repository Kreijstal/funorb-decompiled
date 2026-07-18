/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends ob {
    static int field_r;
    private j field_q;

    final void e(int param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((ap) this).field_q.b((byte) -118);
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
            ((ap) this).field_q = null;
            ((ap) this).field_p = -1;
            ((ap) this).field_j = ((ap) this).field_j + 1;
            ((ap) this).field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2_ref, "ap.J(" + param0 + ')');
        }
    }

    final void a(boolean param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ld var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
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
            Throwable decompiledCaughtException = null;
            ng stackOut_27_0 = null;
            ng stackOut_30_0 = null;
            int stackOut_30_1 = 0;
            ng stackOut_28_0 = null;
            int stackOut_28_1 = 0;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            var6 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  if (null != ((ap) this).field_q) {
                    try {
                      L2: {
                        ((ap) this).field_q.b((byte) -118);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ap) this).field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ap) this).field_q = (j) param1;
                this.d((byte) -121);
                this.a(param0, 25);
                ((ap) this).field_h = null;
                ((ap) this).field_i.field_f = 0;
                if (!param2) {
                  L4: while (true) {
                    L5: {
                      L6: {
                        L7: {
                          var4_ref3 = (ld) (Object) ((ap) this).field_f.d(-4425);
                          if (var4_ref3 != null) {
                            break L7;
                          } else {
                            if (var6 != 0) {
                              break L6;
                            } else {
                              if (var6 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        ((ap) this).field_m.a((byte) 122, (ij) (Object) var4_ref3);
                        break L6;
                      }
                      if (var6 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                    L8: while (true) {
                      L9: {
                        L10: {
                          L11: {
                            var4_ref3 = (ld) (Object) ((ap) this).field_a.d(-4425);
                            if (var4_ref3 != null) {
                              break L11;
                            } else {
                              if (var6 != 0) {
                                break L10;
                              } else {
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          ((ap) this).field_k.a((byte) 110, (ij) (Object) var4_ref3);
                          break L10;
                        }
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                      L12: {
                        if (((ap) this).field_d == 0) {
                          break L12;
                        } else {
                          try {
                            L13: {
                              L14: {
                                ((ap) this).field_n.field_f = 0;
                                ((ap) this).field_n.a(true, 4);
                                stackOut_27_0 = ((ap) this).field_n;
                                stackIn_30_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (param2) {
                                  stackOut_30_0 = (ng) (Object) stackIn_30_0;
                                  stackOut_30_1 = 0;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  break L14;
                                } else {
                                  stackOut_28_0 = (ng) (Object) stackIn_28_0;
                                  stackOut_28_1 = 1;
                                  stackIn_31_0 = stackOut_28_0;
                                  stackIn_31_1 = stackOut_28_1;
                                  break L14;
                                }
                              }
                              ((ng) (Object) stackIn_31_0).a(stackIn_31_1 != 0, (int) ((ap) this).field_d);
                              ((ap) this).field_n.a(0, -16384);
                              ((ap) this).field_q.a(0, 90, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                              break L13;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L15: {
                              var4_ref = (IOException) (Object) decompiledCaughtException;
                              try {
                                L16: {
                                  ((ap) this).field_q.b((byte) -118);
                                  break L16;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter2) {
                                decompiledCaughtException = decompiledCaughtParameter2;
                                L17: {
                                  var5 = (Exception) (Object) decompiledCaughtException;
                                  break L17;
                                }
                              }
                              ((ap) this).field_q = null;
                              ((ap) this).field_j = ((ap) this).field_j + 1;
                              ((ap) this).field_p = -2;
                              break L15;
                            }
                          }
                          break L12;
                        }
                      }
                      ((ap) this).field_c = 0;
                      ((ap) this).field_e = lo.a((byte) -33);
                      break L0;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L18: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_40_0 = (RuntimeException) var4_ref2;
                stackOut_40_1 = new StringBuilder().append("ap.D(").append(param0).append(',');
                stackIn_43_0 = stackOut_40_0;
                stackIn_43_1 = stackOut_40_1;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                if (param1 == null) {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "null";
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L18;
                } else {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "{...}";
                  stackIn_44_0 = stackOut_41_0;
                  stackIn_44_1 = stackOut_41_1;
                  stackIn_44_2 = stackOut_41_2;
                  break L18;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param2 + ')');
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
            RuntimeException var3 = null;
            IOException var4 = null;
            Exception var5 = null;
            ng stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            ng stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ng stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            ng stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            ng stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            ng stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            try {
              L0: {
                var3_int = -20 / ((param1 - -57) / 33);
                if (((ap) this).field_q != null) {
                  try {
                    L1: {
                      L2: {
                        ((ap) this).field_n.field_f = 0;
                        stackOut_2_0 = ((ap) this).field_n;
                        stackOut_2_1 = 1;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_5_1 = stackOut_2_1;
                        stackIn_3_0 = stackOut_2_0;
                        stackIn_3_1 = stackOut_2_1;
                        if (param0) {
                          stackOut_5_0 = (ng) (Object) stackIn_5_0;
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = 2;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          stackIn_6_2 = stackOut_5_2;
                          break L2;
                        } else {
                          stackOut_3_0 = (ng) (Object) stackIn_3_0;
                          stackOut_3_1 = stackIn_3_1;
                          stackOut_3_2 = 3;
                          stackIn_6_0 = stackOut_3_0;
                          stackIn_6_1 = stackOut_3_1;
                          stackIn_6_2 = stackOut_3_2;
                          break L2;
                        }
                      }
                      ((ng) (Object) stackIn_6_0).a(stackIn_6_1 != 0, stackIn_6_2);
                      ((ap) this).field_n.a(0L, false);
                      ((ap) this).field_q.a(0, 108, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var4 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L4: {
                          ((ap) this).field_q.b((byte) -118);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      ((ap) this).field_p = -2;
                      ((ap) this).field_j = ((ap) this).field_j + 1;
                      ((ap) this).field_q = null;
                      break L3;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) (Object) var3, "ap.K(" + param0 + ',' + param1 + ')');
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
            RuntimeException var2 = null;
            IOException var3 = null;
            Exception var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_int = -62 % ((19 - param0) / 51);
                if (null != ((ap) this).field_q) {
                  {
                    L1: {
                      ((ap) this).field_n.field_f = 0;
                      ((ap) this).field_n.a(true, 6);
                      ((ap) this).field_n.a((byte) 104, 3);
                      ((ap) this).field_n.c(-161478600, 0);
                      ((ap) this).field_q.a(0, 124, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
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
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) (Object) var2, "ap.L(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        md var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ce var5_ref = null;
        ce var6 = null;
        String var6_ref = null;
        String var7 = null;
        ce var7_ref = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        ce stackIn_60_0 = null;
        ce stackIn_67_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        ce stackOut_59_0 = null;
        ce stackOut_65_0 = null;
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
            var1_ref = kd.field_n;
            var2 = var1_ref.h(255);
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
                if (var1_ref.h(255) != 1) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_14_0;
                var4_ref_String = var1_ref.i(117);
                if (var3_int != 0) {
                  String discarded$3 = var1_ref.i(110);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param0) {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L5;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_22_0 = stackOut_19_0;
                  break L5;
                }
              }
              L6: {
                var5_ref = fk.a(stackIn_22_0 != 0, var4_ref_String);
                var6_ref = var1_ref.i(122);
                var7 = fe.a(60136, (CharSequence) (Object) var4_ref_String);
                if (var7 != null) {
                  break L6;
                } else {
                  var7 = var4_ref_String;
                  break L6;
                }
              }
              L7: {
                if (null != var5_ref) {
                  break L7;
                } else {
                  var5_ref = fk.a(true, var6_ref);
                  if (var5_ref != null) {
                    vl.field_d.a((ij) (Object) var5_ref, (long)var7.hashCode(), (byte) 125);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var5_ref == null) {
                  var5_ref = new ce();
                  vl.field_d.a((ij) (Object) var5_ref, (long)var7.hashCode(), (byte) 104);
                  int fieldTemp$4 = hl.field_h;
                  hl.field_h = hl.field_h + 1;
                  var5_ref.field_db = fieldTemp$4;
                  g.field_b.b(0, (jb) (Object) var5_ref);
                  break L8;
                } else {
                  break L8;
                }
              }
              var5_ref.field_fb = var4_ref_String;
              return;
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
                  var3 = var1_ref.i(118);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1_ref.i(119);
                  var5 = var1_ref.i(123);
                  var6 = rg.a(var4_ref_String, (byte) -3);
                  if (null == var6) {
                    var6 = rg.a(var5, (byte) -1);
                    if (var6 == null) {
                      break L11;
                    } else {
                      me.field_f.a((ij) (Object) var6, (long)fe.a(60136, (CharSequence) (Object) var4_ref_String).hashCode(), (byte) 92);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var6 != null) {
                    break L12;
                  } else {
                    var6 = new ce();
                    me.field_f.a((ij) (Object) var6, (long)fe.a(60136, (CharSequence) (Object) var4_ref_String).hashCode(), (byte) 85);
                    int fieldTemp$5 = ob.field_g;
                    ob.field_g = ob.field_g + 1;
                    var6.field_db = fieldTemp$5;
                    df.field_b.b(0, (jb) (Object) var6);
                    break L12;
                  }
                }
                L13: {
                  if (null != var3) {
                    var3 = var3.intern();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var6.field_cb = var3;
                var6.field_fb = var4_ref_String;
                var6.a(param0);
                var7_ref = (ce) (Object) df.field_b.g(32073);
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        L18: {
                          if (var7_ref == null) {
                            break L18;
                          } else {
                            stackOut_59_0 = (ce) var6;
                            stackIn_67_0 = stackOut_59_0;
                            stackIn_60_0 = stackOut_59_0;
                            if (var8 != 0) {
                              break L17;
                            } else {
                              if (!ll.a(stackIn_60_0, 0, var7_ref)) {
                                break L18;
                              } else {
                                var7_ref = (ce) (Object) df.field_b.a(false);
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
                          stackOut_65_0 = (ce) var7_ref;
                          stackIn_67_0 = stackOut_65_0;
                          break L17;
                        }
                      }
                      rf.a((jb) (Object) stackIn_67_0, (jb) (Object) var6, 47);
                      if (var8 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                    df.field_b.b(0, (jb) (Object) var6);
                    break L15;
                  }
                  return;
                }
              } else {
                if (var2 != 2) {
                  if (var2 == 3) {
                    L19: {
                      if (2 == mh.field_h) {
                        mh.field_h = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  } else {
                    if (4 != var2) {
                      wp.a((Throwable) null, "F1: " + ug.a(-1815), 21862);
                      jj.a(4);
                      break L0;
                    } else {
                      mh.field_h = 1;
                      var3 = var1_ref.i(111);
                      nh.field_z = var3.intern();
                      var4 = var1_ref.h(255);
                      wl.a(7, var4);
                      return;
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
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "ap.M(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            ld var2_ref2 = null;
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
            ld var14_ref = null;
            int var15 = 0;
            int var16 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_20_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_107_0 = 0;
            int stackOut_98_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_115_0 = 0;
            int stackOut_119_0 = 0;
            int stackOut_117_0 = 0;
            int stackOut_136_0 = 0;
            int stackOut_148_0 = 0;
            int stackOut_146_0 = 0;
            var16 = CrazyCrystals.field_B;
            try {
              L0: {
                if (((ap) this).field_q != null) {
                  L1: {
                    var2_long = lo.a((byte) 95);
                    var4 = (int)(-((ap) this).field_e + var2_long);
                    if (var4 <= 200) {
                      break L1;
                    } else {
                      var4 = 200;
                      break L1;
                    }
                  }
                  ((ap) this).field_e = var2_long;
                  ((ap) this).field_c = ((ap) this).field_c + var4;
                  if (((ap) this).field_c <= 30000) {
                    break L0;
                  } else {
                    try {
                      L2: {
                        ((ap) this).field_q.b((byte) -118);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ap) this).field_q = null;
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              if (null == ((ap) this).field_q) {
                L4: {
                  if (((ap) this).b(20) != 0) {
                    break L4;
                  } else {
                    if (0 == ((ap) this).d(20)) {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                ((ap) this).field_q.a(-128);
                var2_ref2 = (ld) (Object) ((ap) this).field_m.b(120);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (null == var2_ref2) {
                        break L7;
                      } else {
                        ((ap) this).field_n.field_f = 0;
                        ((ap) this).field_n.a(true, 1);
                        ((ap) this).field_n.a(var2_ref2.field_k, false);
                        ((ap) this).field_q.a(0, 106, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                        ((ap) this).field_f.a((byte) 113, (ij) (Object) var2_ref2);
                        var2_ref2 = (ld) (Object) ((ap) this).field_m.a(127);
                        if (var16 != 0) {
                          break L6;
                        } else {
                          if (var16 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var2_ref2 = (ld) (Object) ((ap) this).field_k.b(124);
                    break L6;
                  }
                  L8: while (true) {
                    L9: {
                      if (var2_ref2 == null) {
                        break L9;
                      } else {
                        ((ap) this).field_n.field_f = 0;
                        ((ap) this).field_n.a(true, 0);
                        ((ap) this).field_n.a(var2_ref2.field_k, false);
                        ((ap) this).field_q.a(0, 116, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                        ((ap) this).field_a.a((byte) 111, (ij) (Object) var2_ref2);
                        var2_ref2 = (ld) (Object) ((ap) this).field_k.a(104);
                        if (var16 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var2_int = 0;
                      if (param0 >= 60) {
                        break L10;
                      } else {
                        ((ap) this).e(111);
                        break L10;
                      }
                    }
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (var2_int >= 100) {
                            break L13;
                          } else {
                            var3_int = ((ap) this).field_q.c(0);
                            stackOut_35_0 = ~var3_int;
                            stackIn_137_0 = stackOut_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            if (var16 != 0) {
                              break L12;
                            } else {
                              if (stackIn_36_0 <= -1) {
                                if (0 == var3_int) {
                                  break L13;
                                } else {
                                  L14: {
                                    L15: {
                                      ((ap) this).field_c = 0;
                                      var4 = 0;
                                      if (((ap) this).field_h == null) {
                                        break L15;
                                      } else {
                                        if (0 == ((ap) this).field_h.field_t) {
                                          var4 = 1;
                                          if (var16 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    var4 = 10;
                                    break L14;
                                  }
                                  L16: {
                                    L17: {
                                      if (var4 > 0) {
                                        break L17;
                                      } else {
                                        L18: {
                                          var5 = ((ap) this).field_h.field_s.field_h.length - ((ap) this).field_h.field_u;
                                          var6 = -((ap) this).field_h.field_t + 512;
                                          if (var6 <= var5 - ((ap) this).field_h.field_s.field_f) {
                                            break L18;
                                          } else {
                                            var6 = var5 + -((ap) this).field_h.field_s.field_f;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L19;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          L21: {
                                            ((ap) this).field_q.a(((ap) this).field_h.field_s.field_h, var6, 2034, ((ap) this).field_h.field_s.field_f);
                                            if (((ap) this).field_d == 0) {
                                              break L21;
                                            } else {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var6 <= var7) {
                                                  break L21;
                                                } else {
                                                  ((ap) this).field_h.field_s.field_h[var7 + ((ap) this).field_h.field_s.field_f] = (byte)oe.a((int) ((ap) this).field_h.field_s.field_h[var7 + ((ap) this).field_h.field_s.field_f], (int) ((ap) this).field_d);
                                                  var7++;
                                                  if (var16 != 0) {
                                                    break L20;
                                                  } else {
                                                    if (var16 == 0) {
                                                      continue L22;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          ((ap) this).field_h.field_s.field_f = ((ap) this).field_h.field_s.field_f + var6;
                                          ((ap) this).field_h.field_t = ((ap) this).field_h.field_t + var6;
                                          break L20;
                                        }
                                        L23: {
                                          if (var5 != ((ap) this).field_h.field_s.field_f) {
                                            break L23;
                                          } else {
                                            ((ap) this).field_h.a(1);
                                            ((ap) this).field_h.field_n = false;
                                            ((ap) this).field_h = null;
                                            if (var16 == 0) {
                                              break L16;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        if (((ap) this).field_h.field_t != 512) {
                                          break L16;
                                        } else {
                                          ((ap) this).field_h.field_t = 0;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    L24: {
                                      var5 = var4 - ((ap) this).field_i.field_f;
                                      if (var5 <= var3_int) {
                                        break L24;
                                      } else {
                                        var5 = var3_int;
                                        break L24;
                                      }
                                    }
                                    L25: {
                                      L26: {
                                        ((ap) this).field_q.a(((ap) this).field_i.field_h, var5, 2034, ((ap) this).field_i.field_f);
                                        if (((ap) this).field_d == 0) {
                                          break L26;
                                        } else {
                                          var6 = 0;
                                          L27: while (true) {
                                            if (~var5 >= ~var6) {
                                              break L26;
                                            } else {
                                              ((ap) this).field_i.field_h[((ap) this).field_i.field_f - -var6] = (byte)oe.a((int) ((ap) this).field_i.field_h[((ap) this).field_i.field_f + var6], (int) ((ap) this).field_d);
                                              var6++;
                                              if (var16 != 0) {
                                                break L25;
                                              } else {
                                                if (var16 == 0) {
                                                  continue L27;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      ((ap) this).field_i.field_f = ((ap) this).field_i.field_f + var5;
                                      break L25;
                                    }
                                    if (var4 > ((ap) this).field_i.field_f) {
                                      break L16;
                                    } else {
                                      L28: {
                                        if (null == ((ap) this).field_h) {
                                          L29: {
                                            ((ap) this).field_i.field_f = 0;
                                            var6 = ((ap) this).field_i.h(255);
                                            var7 = ((ap) this).field_i.b((byte) 126);
                                            var8 = ((ap) this).field_i.h(255);
                                            var9 = ((ap) this).field_i.b((byte) 127);
                                            var10 = 127 & var8;
                                            if ((var8 & 128) == 0) {
                                              stackOut_94_0 = 0;
                                              stackIn_95_0 = stackOut_94_0;
                                              break L29;
                                            } else {
                                              stackOut_92_0 = 1;
                                              stackIn_95_0 = stackOut_92_0;
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            L31: {
                                              var11 = stackIn_95_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (ld) (Object) ((ap) this).field_f.b(114);
                                                L32: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_107_0 = (var14_ref.field_k < var12 ? -1 : (var14_ref.field_k == var12 ? 0 : 1));
                                                    stackIn_116_0 = stackOut_107_0;
                                                    stackIn_108_0 = stackOut_107_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      if (stackIn_108_0 == 0) {
                                                        break L31;
                                                      } else {
                                                        var14_ref = (ld) (Object) ((ap) this).field_f.a(96);
                                                        if (var16 == 0) {
                                                          continue L32;
                                                        } else {
                                                          break L31;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ld) (Object) ((ap) this).field_a.b(120);
                                                L33: while (true) {
                                                  if (var14_ref == null) {
                                                    break L31;
                                                  } else {
                                                    stackOut_98_0 = (~var14_ref.field_k < ~var12 ? -1 : (~var14_ref.field_k == ~var12 ? 0 : 1));
                                                    stackIn_116_0 = stackOut_98_0;
                                                    stackIn_99_0 = stackOut_98_0;
                                                    if (var16 != 0) {
                                                      break L30;
                                                    } else {
                                                      stackOut_99_0 = stackIn_99_0;
                                                      stackIn_101_0 = stackOut_99_0;
                                                      if (stackIn_101_0 == 0) {
                                                        break L31;
                                                      } else {
                                                        var14_ref = (ld) (Object) ((ap) this).field_a.a(93);
                                                        continue L33;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              stackOut_115_0 = -1;
                                              stackIn_116_0 = stackOut_115_0;
                                              break L30;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                          L34: {
                                            if (stackIn_116_0 == ~var10) {
                                              stackOut_119_0 = 5;
                                              stackIn_120_0 = stackOut_119_0;
                                              break L34;
                                            } else {
                                              stackOut_117_0 = 9;
                                              stackIn_120_0 = stackOut_117_0;
                                              break L34;
                                            }
                                          }
                                          var15 = stackIn_120_0;
                                          ((ap) this).field_h = var14_ref;
                                          ((ap) this).field_h.field_s = new ng(((ap) this).field_h.field_u + (var15 + var9));
                                          ((ap) this).field_h.field_s.a(true, var10);
                                          ((ap) this).field_h.field_s.a(var9, -16384);
                                          ((ap) this).field_h.field_t = 10;
                                          ((ap) this).field_i.field_f = 0;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L35: {
                                        if (0 == ((ap) this).field_h.field_t) {
                                          L36: {
                                            if (((ap) this).field_i.field_h[0] == -1) {
                                              break L36;
                                            } else {
                                              ((ap) this).field_h = null;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L36;
                                              }
                                            }
                                          }
                                          ((ap) this).field_h.field_t = 1;
                                          ((ap) this).field_i.field_f = 0;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L35;
                                          }
                                        } else {
                                          break L35;
                                        }
                                      }
                                      throw new IOException();
                                    }
                                  }
                                  var2_int++;
                                  if (var16 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        }
                        stackOut_136_0 = 1;
                        stackIn_137_0 = stackOut_136_0;
                        break L12;
                      }
                      return stackIn_137_0 != 0;
                    }
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (IOException) (Object) decompiledCaughtException;
              try {
                L37: {
                  ((ap) this).field_q.b((byte) -118);
                  break L37;
                }
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                L38: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  break L38;
                }
              }
              L39: {
                ((ap) this).field_q = null;
                ((ap) this).field_p = -2;
                ((ap) this).field_j = ((ap) this).field_j + 1;
                if (0 != ((ap) this).b(20)) {
                  break L39;
                } else {
                  if (0 == ((ap) this).d(20)) {
                    stackOut_148_0 = 1;
                    stackIn_149_0 = stackOut_148_0;
                    return stackIn_149_0 != 0;
                  } else {
                    break L39;
                  }
                }
              }
              stackOut_146_0 = 0;
              stackIn_147_0 = stackOut_146_0;
              return stackIn_147_0 != 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) (Object) var2_ref, "ap.E(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ap) this).field_q == null) {
                break L1;
              } else {
                ((ap) this).field_q.b((byte) -118);
                break L1;
              }
            }
            var2_int = -61 / ((-61 - param0) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "ap.G(" + param0 + ')');
        }
    }

    public ap() {
    }

    static {
    }
}
