/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class da extends ae {
    static int field_m;
    private bc field_q;
    static qe field_n;
    static qj[][] field_p;
    static int field_o;

    final static li a(ik param0, int param1, byte param2) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -108) {
                break L1;
              } else {
                da.a(79, (byte) -19);
                break L1;
              }
            }
            stackIn_3_0 = bd.a(-31085, bh.a(param0, 100, param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("da.K(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void c(byte param0) {
        if (!(this.field_q == null)) {
            this.field_q.d(param0 ^ 16777114);
        }
        if (param0 != 101) {
            da.a(-15, (byte) 51);
        }
    }

    final static int a(boolean param0, boolean param1, String param2, String param3, int param4, int param5) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_100_0 = 0;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            StringBuilder stackIn_106_1 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            var9 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (r.field_i == null) {
                    if (!bf.a(param1, (byte) 104)) {
                      stackIn_6_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (param4 > 67) {
                  L2: {
                    if (jc.field_a == gk.field_a) {
                      L3: {
                        if (param1) {
                          var10 = (String) null;
                          af.field_o = ie.a(nl.field_e, param3, false, (String) null, (byte) -119);
                          break L3;
                        } else {
                          af.field_o = rl.a(20, false, param3, param2);
                          break L3;
                        }
                      }
                      ra.field_C.field_k = 0;
                      ra.field_C.a(14, (byte) -72);
                      ra.field_C.a(af.field_o.a(false).field_b, (byte) -100);
                      me.a(-1, -1);
                      jc.field_a = sg.field_d;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (jc.field_a == sg.field_d) {
                      if (!hf.a(1, false)) {
                        break L4;
                      } else {
                        L5: {
                          var6_int = ne.field_a.h(16383);
                          if (var6_int == 0) {
                            jc.field_a = md.field_e;
                            break L5;
                          } else {
                            hd.field_o = -1;
                            uk.field_c = var6_int;
                            jc.field_a = ij.field_j;
                            break L5;
                          }
                        }
                        ne.field_a.field_k = 0;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    if (jc.field_a != md.field_e) {
                      break L6;
                    } else {
                      if (!hf.a(8, false)) {
                        break L6;
                      } else {
                        h.field_d = ne.field_a.f((byte) 110);
                        ne.field_a.field_k = 0;
                        md.a(af.field_o, param5, param1, -1, param0);
                        jc.field_a = ca.field_b;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (ca.field_b != jc.field_a) {
                      break L7;
                    } else {
                      if (!hf.a(1, false)) {
                        break L7;
                      } else {
                        L8: {
                          var6_int = ne.field_a.h(16383);
                          kg.field_a = null;
                          uk.field_c = var6_int;
                          ne.field_a.field_k = 0;
                          if (var6_int == 0) {
                            break L8;
                          } else {
                            if (var6_int != 1) {
                              if (8 == var6_int) {
                                lj.a((byte) 124);
                                kg.field_f = false;
                                stackIn_35_0 = var6_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                jc.field_a = ij.field_j;
                                hd.field_o = -1;
                                break L7;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        hd.field_o = -1;
                        jc.field_a = qe.field_C;
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (jc.field_a == qe.field_C) {
                      if (fh.a(520)) {
                        L10: {
                          nl.field_e = ne.field_a.f((byte) 28);
                          sl.field_j = ne.field_a.h(16383);
                          ne.field_a.h(16383);
                          hk.field_d = ne.field_a.d((byte) -67);
                          var6 = ne.field_a.d(19016);
                          var7 = ne.field_a.h(16383);
                          if ((1 & var7) == 0) {
                            break L10;
                          } else {
                            qi.b(8770);
                            break L10;
                          }
                        }
                        L11: {
                          if (!param1) {
                            L12: {
                              if ((4 & var7) == 0) {
                                stackIn_47_0 = 0;
                                break L12;
                              } else {
                                stackIn_47_0 = 1;
                                break L12;
                              }
                            }
                            L13: {
                              fd.field_i = stackIn_47_0 != 0;
                              if ((8 & var7) == 0) {
                                stackIn_50_0 = 0;
                                break L13;
                              } else {
                                stackIn_50_0 = 1;
                                break L13;
                              }
                            }
                            fi.field_o = stackIn_50_0 != 0;
                            if (fi.field_o) {
                              break L11;
                            } else {
                              break L11;
                            }
                          } else {
                            break L11;
                          }
                        }
                        L14: {
                          if (!mk.field_c) {
                            break L14;
                          } else {
                            ne.field_a.h(16383);
                            ne.field_a.h(16383);
                            ne.field_a.e((byte) 113);
                            jd.field_d = ne.field_a.d((byte) -118);
                            qa.field_a = new byte[jd.field_d];
                            var8 = 0;
                            L15: while (true) {
                              if (jd.field_d <= var8) {
                                break L14;
                              } else {
                                qa.field_a[var8] = ne.field_a.f(-127);
                                var8++;
                                continue L15;
                              }
                            }
                          }
                        }
                        L16: {
                          ue.field_a = ne.field_a.g(0);
                          var11 = (CharSequence) ((Object) ue.field_a);
                          dd.field_p = r.a(var11, -11133);
                          si.field_d = ne.field_a.h(16383);
                          jc.field_a = ka.field_b;
                          if (af.field_o.a(false) != nd.field_M) {
                            if (af.field_o.a(false) == ji.field_a) {
                              qi.field_f.a(gd.b((byte) 77), -4);
                              break L16;
                            } else {
                              break L16;
                            }
                          } else {
                            rd.field_o.a(gd.b((byte) 77), -4);
                            break L16;
                          }
                        }
                        L17: {
                          kg.field_f = false;
                          if (var6 != null) {
                            dh.a(-19136, var6, gd.b((byte) 77));
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          L19: {
                            if (hk.field_d > 0) {
                              break L19;
                            } else {
                              if (fd.field_i) {
                                break L19;
                              } else {
                                try {
                                  L20: {
                                    sj.a((byte) -128, "unzap", gd.b((byte) 77));
                                    break L20;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L21: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    break L21;
                                  }
                                }
                                break L18;
                              }
                            }
                          }
                          try {
                            L22: {
                              sj.a(gd.b((byte) 77), new Object[]{ue.a(nl.field_e, (byte) 114)}, 7648, "zap");
                              break L22;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L23: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L23;
                            }
                          }
                          break L18;
                        }
                        L24: {
                          if (-1 > (hk.field_d ^ -1)) {
                            oc.field_i = true;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        ra.field_C.a((byte) -83, pl.field_a);
                        var8 = 0;
                        L25: while (true) {
                          if (4 <= var8) {
                            ne.field_a.a((byte) -83, pl.field_a);
                            stackIn_79_0 = uk.field_c;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            pl.field_a[var8] = pl.field_a[var8] + 50;
                            var8++;
                            continue L25;
                          }
                        }
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L26: {
                    if (jc.field_a != ij.field_j) {
                      break L26;
                    } else {
                      if (!fh.a(520)) {
                        break L26;
                      } else {
                        L27: {
                          lj.a((byte) 124);
                          if (-8 != (uk.field_c ^ -1)) {
                            break L27;
                          } else {
                            if (kg.field_f) {
                              break L27;
                            } else {
                              kg.field_f = true;
                              stackIn_85_0 = -1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        L28: {
                          if (-8 == (uk.field_c ^ -1)) {
                            uk.field_c = 3;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        fi.field_t = ne.field_a.g(0);
                        kg.field_f = false;
                        stackIn_90_0 = uk.field_c;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                  L29: {
                    if (r.field_i != null) {
                      break L29;
                    } else {
                      if (!kg.field_f) {
                        var6_int = ke.field_c;
                        ke.field_c = ma.field_c;
                        ma.field_c = var6_int;
                        kg.field_f = true;
                        break L29;
                      } else {
                        L30: {
                          if ((bj.b(-21676) ^ -1L) >= -30001L) {
                            fi.field_t = cf.field_m;
                            break L30;
                          } else {
                            fi.field_t = nk.field_j;
                            break L30;
                          }
                        }
                        kg.field_f = false;
                        stackIn_97_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                  stackIn_100_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_9_0 = 76;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L31: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_103_0 = (RuntimeException) (var6_ref);

                stackIn_103_1 = new StringBuilder().append("da.P(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackIn_104_2 = "null";
                  break L31;
                } else {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackIn_104_2 = "{...}";
                  break L31;
                }
              }
              L32: {


                stackIn_106_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');

                if (param3 == null) {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackIn_107_2 = "null";
                  break L32;
                } else {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackIn_107_2 = "{...}";
                  break L32;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_104_0), stackIn_107_2 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_9_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_35_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_79_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_85_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_90_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_97_0;
                        } else {
                          return stackIn_100_0;
                        }
                      }
                    }
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

    final void b(byte param0) {
        try {
            this.field_q.d(16777215);
        } catch (Exception exception) {
        }
        this.field_q = null;
        if (param0 <= 95) {
            field_m = 57;
        }
        this.field_b = -1;
        this.field_e = this.field_e + 1;
        this.field_i = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void e(int param0) {
        field_n = null;
        field_p = (qj[][]) null;
        if (param0 < 63) {
            field_p = (qj[][]) null;
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            be stackIn_4_0 = null;
            be stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null != this.field_q) {
              try {
                L0: {
                  L1: {
                    this.field_g.field_k = 0;
                    stackIn_4_0 = this.field_g;

                    if (!param0) {
                      stackIn_5_0 = (be) ((Object) stackIn_4_0);
                      stackIn_5_1 = 3;
                      break L1;
                    } else {
                      stackIn_5_0 = (be) ((Object) stackIn_4_0);
                      stackIn_5_1 = 2;
                      break L1;
                    }
                  }
                  ((be) (Object) stackIn_5_0).a(stackIn_5_1, (byte) -127);
                  this.field_g.a(2488, 0L);
                  this.field_q.a(-103, this.field_g.field_j, this.field_g.field_j.length, param1);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.d(16777215);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_b = -2;
                  this.field_e = this.field_e + 1;
                  this.field_q = null;
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

    final static void a(int param0, byte param1) {
        li var2 = null;
        int var3 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              qd.field_d = param0;
              var2 = (li) ((Object) kd.field_a.b(2));
              if (param1 == -74) {
                break L1;
              } else {
                field_p = (qj[][]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (jk.field_c != null) {
                    var2 = (li) ((Object) jk.field_c.b(2));
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        stackIn_13_0 = var2.field_k.b(param1 ^ -10000594);
                        L5: {
                          if (!stackIn_13_0) {
                            var2.a(-33);
                            break L5;
                          } else {
                            var2.field_j.g(128 + qd.field_d * var2.field_m >> -1893181208);
                            break L5;
                          }
                        }
                        var2 = (li) ((Object) jk.field_c.a(10));
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L6: {
                  if (var2.field_k.b(10000536)) {
                    var2.field_j.g(128 + var2.field_m * qd.field_d >> -892832824);
                    break L6;
                  } else {
                    var2.a(-76);
                    break L6;
                  }
                }
                var2 = (li) ((Object) kd.field_a.a(param1 ^ -68));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "da.L(" + param0 + ',' + param1 + ')');
        }
    }

    public da() {
    }

    private final void d(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            Exception var3 = null;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_g.field_k = 0;
                    this.field_g.a(6, (byte) -59);
                    this.field_g.c((byte) -38, 3);
                    this.field_g.b(0, (byte) -118);
                    this.field_q.a(-102, this.field_g.field_j, this.field_g.field_j.length, 0);
                    if (param0 < -5) {
                      break L1;
                    } else {
                      field_p = (qj[][]) null;
                      break L1;
                    }
                  }
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.d(16777215);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_e = this.field_e + 1;
                  this.field_b = -2;
                  this.field_q = null;
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

    final void a(byte param0, boolean param1, Object param2) {
        try {
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            hi var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_q) {
                    try {
                      L2: {
                        this.field_q.d(16777215);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_q = (bc) (param2);
                this.d((byte) -42);
                this.a(param1, 0);
                this.field_l = null;
                this.field_a.field_k = 0;
                L4: while (true) {
                  var4_ref = (hi) ((Object) this.field_c.a(-58));
                  if (var4_ref != null) {
                    this.field_f.a(var4_ref, true);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref = (hi) ((Object) this.field_k.a(-58));
                      if (var4_ref == null) {
                        L6: {
                          if (param0 == 121) {
                            break L6;
                          } else {
                            this.c((byte) 104);
                            break L6;
                          }
                        }
                        L7: {
                          if (this.field_i != 0) {
                            try {
                              L8: {
                                this.field_g.field_k = 0;
                                this.field_g.a(4, (byte) -112);
                                this.field_g.a((int) this.field_i, (byte) -99);
                                this.field_g.b(false, 0);
                                this.field_q.a(-126, this.field_g.field_j, this.field_g.field_j.length, 0);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_q.d(16777215);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_b = -2;
                                this.field_q = null;
                                this.field_e = this.field_e + 1;
                                break L9;
                              }
                            }
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        this.field_d = 0;
                        this.field_j = qg.a(false);
                        break L0;
                      } else {
                        this.field_h.a(var4_ref, true);
                        continue L5;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_28_0 = (RuntimeException) (var4_ref3);

                stackIn_28_1 = new StringBuilder().append("da.F(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackIn_29_2 = "null";
                  break L12;
                } else {
                  stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackIn_29_2 = "{...}";
                  break L12;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0) {
        try {
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            hi var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
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
            hi var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = TrackController.field_F ? 1 : 0;
              if (null != this.field_q) {
                L1: {
                  var2_long = qg.a(false);
                  var4 = (int)(-this.field_j + var2_long);
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_j = var2_long;
                this.field_d = this.field_d + var4;
                if (30000 < this.field_d) {
                  try {
                    L2: {
                      this.field_q.d(param0 + 16748049);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_q = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != this.field_q) {
              if (param0 == 29166) {
                try {
                  L4: {
                    this.field_q.a(true);
                    var2 = (hi) ((Object) this.field_f.b(48));
                    L5: while (true) {
                      if (var2 == null) {
                        var2 = (hi) ((Object) this.field_h.b(48));
                        L6: while (true) {
                          if (var2 == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (var2_int >= 100) {
                                  break L8;
                                } else {
                                  var3_int = this.field_q.b(0);
                                  if ((var3_int ^ -1) > -1) {
                                    throw new IOException();
                                  } else {
                                    if (0 == var3_int) {
                                      break L8;
                                    } else {
                                      L9: {
                                        this.field_d = 0;
                                        var4 = 0;
                                        if (null == this.field_l) {
                                          var4 = 10;
                                          break L9;
                                        } else {
                                          if (this.field_l.field_z == 0) {
                                            var4 = 1;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if ((var4 ^ -1) < -1) {
                                          L11: {
                                            var5 = var4 + -this.field_a.field_k;
                                            if (var3_int >= var5) {
                                              break L11;
                                            } else {
                                              var5 = var3_int;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            this.field_q.a(this.field_a.field_j, 0, var5, this.field_a.field_k);
                                            if (this.field_i == 0) {
                                              break L12;
                                            } else {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var5 <= var6) {
                                                  break L12;
                                                } else {
                                                  this.field_a.field_j[this.field_a.field_k + var6] = (byte)ma.a((int) this.field_a.field_j[this.field_a.field_k + var6], (int) this.field_i);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            }
                                          }
                                          this.field_a.field_k = this.field_a.field_k + var5;
                                          if (this.field_a.field_k >= var4) {
                                            if (null != this.field_l) {
                                              if (0 != this.field_l.field_z) {
                                                throw new IOException();
                                              } else {
                                                if (this.field_a.field_j[0] == -1) {
                                                  this.field_l.field_z = 1;
                                                  this.field_a.field_k = 0;
                                                  break L10;
                                                } else {
                                                  this.field_l = null;
                                                  break L10;
                                                }
                                              }
                                            } else {
                                              L14: {
                                                this.field_a.field_k = 0;
                                                var6 = this.field_a.h(16383);
                                                var7 = this.field_a.e((byte) 113);
                                                var8 = this.field_a.h(16383);
                                                var9 = this.field_a.e((byte) 113);
                                                var10 = var8 & 127;
                                                if (-1 == (128 & var8 ^ -1)) {
                                                  stackIn_62_0 = 0;
                                                  break L14;
                                                } else {
                                                  stackIn_62_0 = 1;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_62_0;
                                                var12 = (long)var7 + ((long)var6 << -1146053600);
                                                var14 = null;
                                                if (var11 == 0) {
                                                  var14_ref = (hi) ((Object) this.field_c.b(48));
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (var12 != var14_ref.field_m) {
                                                        var14_ref = (hi) ((Object) this.field_c.a((byte) 118));
                                                        continue L16;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (hi) ((Object) this.field_k.b(48));
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if ((var12 ^ -1L) == (var14_ref.field_m ^ -1L)) {
                                                        break L15;
                                                      } else {
                                                        var14_ref = (hi) ((Object) this.field_k.a((byte) 109));
                                                        continue L17;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                L18: {
                                                  if (0 == var10) {
                                                    stackIn_78_0 = 5;
                                                    break L18;
                                                  } else {
                                                    stackIn_78_0 = 9;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_78_0;
                                                this.field_l = var14_ref;
                                                this.field_l.field_x = new be(var9 - (-var15 + -this.field_l.field_B));
                                                this.field_l.field_x.a(var10, (byte) -120);
                                                this.field_l.field_x.b(false, var9);
                                                this.field_l.field_z = 10;
                                                this.field_a.field_k = 0;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          L19: {
                                            var5 = -this.field_l.field_B + this.field_l.field_x.field_j.length;
                                            var6 = -this.field_l.field_z + 512;
                                            if (var6 > -this.field_l.field_x.field_k + var5) {
                                              var6 = var5 - this.field_l.field_x.field_k;
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            if (var3_int < var6) {
                                              var6 = var3_int;
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          L21: {
                                            this.field_q.a(this.field_l.field_x.field_j, 0, var6, this.field_l.field_x.field_k);
                                            if (-1 == (this.field_i ^ -1)) {
                                              break L21;
                                            } else {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var7 >= var6) {
                                                  break L21;
                                                } else {
                                                  this.field_l.field_x.field_j[this.field_l.field_x.field_k - -var7] = (byte)ma.a((int) this.field_l.field_x.field_j[this.field_l.field_x.field_k + var7], (int) this.field_i);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            }
                                          }
                                          this.field_l.field_x.field_k = this.field_l.field_x.field_k + var6;
                                          this.field_l.field_z = this.field_l.field_z + var6;
                                          if (var5 != this.field_l.field_x.field_k) {
                                            if (-513 != (this.field_l.field_z ^ -1)) {
                                              break L10;
                                            } else {
                                              this.field_l.field_z = 0;
                                              break L10;
                                            }
                                          } else {
                                            this.field_l.e(param0 + -29166);
                                            this.field_l.field_w = false;
                                            this.field_l = null;
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
                              stackIn_86_0 = 1;
                              break L4;
                            }
                          } else {
                            this.field_g.field_k = 0;
                            this.field_g.a(0, (byte) -74);
                            this.field_g.a(2488, var2.field_m);
                            this.field_q.a(-106, this.field_g.field_j, this.field_g.field_j.length, 0);
                            this.field_k.a(var2, true);
                            var2 = (hi) ((Object) this.field_h.a((byte) 113));
                            continue L6;
                          }
                        }
                      } else {
                        this.field_g.field_k = 0;
                        this.field_g.a(1, (byte) -96);
                        this.field_g.a(2488, var2.field_m);
                        this.field_q.a(-124, this.field_g.field_j, this.field_g.field_j.length, 0);
                        this.field_c.a(var2, true);
                        var2 = (hi) ((Object) this.field_f.a((byte) 108));
                        continue L5;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2_ref = (IOException) (Object) decompiledCaughtException;
                  try {
                    L23: {
                      this.field_q.d(16777215);
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
                    this.field_q = null;
                    this.field_b = -2;
                    this.field_e = this.field_e + 1;
                    if (this.a((byte) 105) != 0) {
                      break L25;
                    } else {
                      if (0 == this.a(7)) {
                        return true;
                      } else {
                        break L25;
                      }
                    }
                  }
                  return false;
                }
                return stackIn_86_0 != 0;
              } else {
                return true;
              }
            } else {
              if (0 != this.a((byte) 105)) {
                return false;
              } else {
                if (0 == this.a(param0 ^ 29161)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = 20;
    }
}
