/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class va {
    static int field_c;
    static String field_a;
    static int field_d;
    static String[] field_b;

    final static hj a(int param0, int param1, ki param2, byte param3) {
        RuntimeException var4 = null;
        hj stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hj stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -127) {
              if (pk.a(-117, param0, param2, param1)) {
                stackIn_7_0 = tj.c(117);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (hj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("va.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hj) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public final String toString() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "va.toString()");
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        try {
            field_a = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "va.C(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            int stackIn_4_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_34_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2_ref = null;
            try {
              L0: {
                if ((cd.field_t.field_i ^ -1) <= (param1 ^ -1)) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  if (null == p.field_d) {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    try {
                      L1: {
                        L2: {
                          if (param0) {
                            break L2;
                          } else {
                            field_a = (String) null;
                            break L2;
                          }
                        }
                        var2_int = p.field_d.b((byte) 101);
                        if (0 >= var2_int) {
                          L3: {
                            L4: {
                              if ((var2_int ^ -1) > -1) {
                                break L4;
                              } else {
                                if (ed.b(-1) <= 30000L) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            th.a(102);
                            break L3;
                          }
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          L5: {
                            if (var2_int > -cd.field_t.field_i + param1) {
                              var2_int = param1 - cd.field_t.field_i;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          p.field_d.a(cd.field_t.field_i, var2_int, -24, cd.field_t.field_j);
                          of.field_L = ji.b(-19);
                          cd.field_t.field_i = cd.field_t.field_i + var2_int;
                          if (cd.field_t.field_i >= param1) {
                            cd.field_t.field_i = 0;
                            stackIn_24_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            stackIn_22_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L1;
                          }
                        }
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var2_ref = (IOException) (Object) decompiledCaughtException;
                        th.a(110);
                        decompiledRegionSelector0 = 2;
                        break L6;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 4;
                        break L0;
                      } else {
                        stackIn_34_0 = 0;
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw dd.a((Throwable) ((Object) var2), "va.D(" + param0 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_9_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_34_0 != 0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_22_0 != 0;
                  } else {
                    return stackIn_24_0 != 0;
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

    final static void a(ki param0, byte param1) {
        RuntimeException stackIn_664_0 = null;
        StringBuilder stackIn_664_1 = null;
        RuntimeException stackIn_665_0 = null;
        StringBuilder stackIn_665_1 = null;
        String stackIn_665_2 = null;
        int stackIn_673_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              md.field_d = param0;
              var2 = jk.a(1, "orbisdeaded");
              if (null == var2) {
                break L1;
              } else {
                fd.field_d = bk.a(var2, -12465);
                break L1;
              }
            }
            L2: {
              var2 = jk.a(1, "toocostly");
              if (var2 != null) {
                ih.field_b = bk.a(var2, -12465);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = jk.a(1, "cannotdoithere");
              if (null != var2) {
                aa.field_a = bk.a(var2, -12465);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = jk.a(1, "barrierneedsedge");
              if (null != var2) {
                ue.field_J = bk.a(var2, -12465);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2 = jk.a(1, "gamename");
              if (param1 >= 23) {
                break L5;
              } else {
                va.a(false, -87);
                break L5;
              }
            }
            L6: {
              if (null != var2) {
                ui.field_e = bk.a(var2, -12465);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2 = jk.a(1, "dosomethingtoquit");
              if (var2 != null) {
                oh.field_d = bk.a(var2, -12465);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2 = jk.a(1, "wonthegame");
              if (var2 == null) {
                break L8;
              } else {
                sl.field_Z = bk.a(var2, -12465);
                break L8;
              }
            }
            L9: {
              var2 = jk.a(1, "spacenextwave");
              if (var2 == null) {
                break L9;
              } else {
                p.field_b = bk.a(var2, -12465);
                break L9;
              }
            }
            L10: {
              var2 = jk.a(1, "costtext");
              if (null != var2) {
                rh.field_a = bk.a(var2, -12465);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2 = jk.a(1, "frztext");
              if (var2 == null) {
                break L11;
              } else {
                t.field_k = bk.a(var2, -12465);
                break L11;
              }
            }
            L12: {
              var2 = jk.a(1, "aoetext");
              if (var2 == null) {
                break L12;
              } else {
                ei.field_b = bk.a(var2, -12465);
                break L12;
              }
            }
            L13: {
              var2 = jk.a(1, "damtxt");
              if (null != var2) {
                sd.field_d = bk.a(var2, -12465);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = jk.a(1, "rangetxt");
              if (var2 == null) {
                break L14;
              } else {
                ed.field_e = bk.a(var2, -12465);
                break L14;
              }
            }
            L15: {
              var2 = jk.a(1, "boltstxt");
              if (var2 == null) {
                break L15;
              } else {
                ca.field_a = bk.a(var2, -12465);
                break L15;
              }
            }
            L16: {
              var2 = jk.a(1, "barriertxt1");
              if (var2 != null) {
                wg.field_n = bk.a(var2, -12465);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var2 = jk.a(1, "barriertxt2");
              if (var2 == null) {
                break L17;
              } else {
                ed.field_d = bk.a(var2, -12465);
                break L17;
              }
            }
            L18: {
              var2 = jk.a(1, "tutorial_basic,0");
              if (null != var2) {
                pa.field_a[0] = bk.a(var2, -12465);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2 = jk.a(1, "tutorial_basic,1");
              if (null != var2) {
                pa.field_a[1] = bk.a(var2, -12465);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              var2 = jk.a(1, "tutorial_basic,2");
              if (var2 == null) {
                break L20;
              } else {
                pa.field_a[2] = bk.a(var2, -12465);
                break L20;
              }
            }
            L21: {
              var2 = jk.a(1, "tutorial_basic,3");
              if (null == var2) {
                break L21;
              } else {
                pa.field_a[3] = bk.a(var2, -12465);
                break L21;
              }
            }
            L22: {
              var2 = jk.a(1, "tutorial_basic,7");
              if (null == var2) {
                break L22;
              } else {
                pa.field_a[7] = bk.a(var2, -12465);
                break L22;
              }
            }
            L23: {
              var2 = jk.a(1, "tutorial_basic,8");
              if (var2 == null) {
                break L23;
              } else {
                pa.field_a[8] = bk.a(var2, -12465);
                break L23;
              }
            }
            L24: {
              var2 = jk.a(1, "tutorial_basic,9");
              if (var2 != null) {
                pa.field_a[9] = bk.a(var2, -12465);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              var2 = jk.a(1, "tutorial_basic,10");
              if (var2 != null) {
                pa.field_a[10] = bk.a(var2, -12465);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = jk.a(1, "tutorial_basic,11");
              if (var2 != null) {
                pa.field_a[11] = bk.a(var2, -12465);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = jk.a(1, "tutorial_basic,12");
              if (null == var2) {
                break L27;
              } else {
                pa.field_a[12] = bk.a(var2, -12465);
                break L27;
              }
            }
            L28: {
              var2 = jk.a(1, "tutorial_basic,13");
              if (var2 != null) {
                pa.field_a[13] = bk.a(var2, -12465);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              var2 = jk.a(1, "tutorial_basic,14");
              if (var2 == null) {
                break L29;
              } else {
                pa.field_a[14] = bk.a(var2, -12465);
                break L29;
              }
            }
            L30: {
              var2 = jk.a(1, "tutorial_basic,15");
              if (null == var2) {
                break L30;
              } else {
                pa.field_a[15] = bk.a(var2, -12465);
                break L30;
              }
            }
            L31: {
              var2 = jk.a(1, "tutorial_basic,16");
              if (null == var2) {
                break L31;
              } else {
                pa.field_a[16] = bk.a(var2, -12465);
                break L31;
              }
            }
            L32: {
              var2 = jk.a(1, "tutorial_basic,17");
              if (var2 != null) {
                pa.field_a[17] = bk.a(var2, -12465);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              var2 = jk.a(1, "tutorial_basic,18");
              if (var2 != null) {
                pa.field_a[18] = bk.a(var2, -12465);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = jk.a(1, "tutorial_advanced,0");
              if (var2 != null) {
                sa.field_d[0] = bk.a(var2, -12465);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = jk.a(1, "tutorial_advanced,1");
              if (var2 == null) {
                break L35;
              } else {
                sa.field_d[1] = bk.a(var2, -12465);
                break L35;
              }
            }
            L36: {
              var2 = jk.a(1, "tutorial_advanced,2");
              if (null != var2) {
                sa.field_d[2] = bk.a(var2, -12465);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2 = jk.a(1, "tutorial_advanced,3");
              if (var2 != null) {
                sa.field_d[3] = bk.a(var2, -12465);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2 = jk.a(1, "tutorial_advanced,4");
              if (var2 != null) {
                sa.field_d[4] = bk.a(var2, -12465);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2 = jk.a(1, "tutorial_advanced,5");
              if (var2 != null) {
                sa.field_d[5] = bk.a(var2, -12465);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = jk.a(1, "tutorial_advanced,6");
              if (null == var2) {
                break L40;
              } else {
                sa.field_d[6] = bk.a(var2, -12465);
                break L40;
              }
            }
            L41: {
              var2 = jk.a(1, "tutorial_advanced,7");
              if (var2 != null) {
                sa.field_d[7] = bk.a(var2, -12465);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2 = jk.a(1, "tutorial_advanced,8");
              if (null != var2) {
                sa.field_d[8] = bk.a(var2, -12465);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2 = jk.a(1, "tutorial_advanced,9");
              if (null == var2) {
                break L43;
              } else {
                sa.field_d[9] = bk.a(var2, -12465);
                break L43;
              }
            }
            L44: {
              var2 = jk.a(1, "tutorial_advanced,10");
              if (var2 == null) {
                break L44;
              } else {
                sa.field_d[10] = bk.a(var2, -12465);
                break L44;
              }
            }
            L45: {
              var2 = jk.a(1, "tutorial_advanced,11");
              if (null != var2) {
                sa.field_d[11] = bk.a(var2, -12465);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2 = jk.a(1, "tutorial_advanced,12");
              if (var2 != null) {
                sa.field_d[12] = bk.a(var2, -12465);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = jk.a(1, "tutorial_advanced,13");
              if (var2 != null) {
                sa.field_d[13] = bk.a(var2, -12465);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              var2 = jk.a(1, "tutorial_advanced,14");
              if (null == var2) {
                break L48;
              } else {
                sa.field_d[14] = bk.a(var2, -12465);
                break L48;
              }
            }
            L49: {
              var2 = jk.a(1, "tutorial_advanced,15");
              if (null == var2) {
                break L49;
              } else {
                sa.field_d[15] = bk.a(var2, -12465);
                break L49;
              }
            }
            L50: {
              var2 = jk.a(1, "tutorial_advanced,16");
              if (var2 == null) {
                break L50;
              } else {
                sa.field_d[16] = bk.a(var2, -12465);
                break L50;
              }
            }
            L51: {
              var2 = jk.a(1, "tutorial_advanced,17");
              if (null != var2) {
                sa.field_d[17] = bk.a(var2, -12465);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2 = jk.a(1, "tutorial_advanced,18");
              if (var2 != null) {
                sa.field_d[18] = bk.a(var2, -12465);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2 = jk.a(1, "overtenthousand");
              if (var2 == null) {
                break L53;
              } else {
                ci.field_m = bk.a(var2, -12465);
                break L53;
              }
            }
            L54: {
              var2 = jk.a(1, "thousand");
              if (var2 != null) {
                rf.field_H = bk.a(var2, -12465);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = jk.a(1, "energyname");
              if (null == var2) {
                break L55;
              } else {
                nh.field_a = bk.a(var2, -12465);
                break L55;
              }
            }
            L56: {
              var2 = jk.a(1, "prepyourdef");
              if (var2 != null) {
                jm.field_c = bk.a(var2, -12465);
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              var2 = jk.a(1, "nextwavein");
              if (var2 == null) {
                break L57;
              } else {
                nb.field_p = bk.a(var2, -12465);
                break L57;
              }
            }
            L58: {
              var2 = jk.a(1, "wavecomp");
              if (null == var2) {
                break L58;
              } else {
                nl.field_c = bk.a(var2, -12465);
                break L58;
              }
            }
            L59: {
              var2 = jk.a(1, "norbstr");
              if (null != var2) {
                d.field_h = bk.a(var2, -12465);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = jk.a(1, "beamblastname");
              if (null == var2) {
                break L60;
              } else {
                q.field_c = bk.a(var2, -12465);
                break L60;
              }
            }
            L61: {
              var2 = jk.a(1, "iceshotname");
              if (var2 != null) {
                fd.field_g = bk.a(var2, -12465);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2 = jk.a(1, "bigshotname");
              if (var2 == null) {
                break L62;
              } else {
                oj.field_o = bk.a(var2, -12465);
                break L62;
              }
            }
            L63: {
              var2 = jk.a(1, "chainshotname");
              if (var2 != null) {
                am.field_g = bk.a(var2, -12465);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2 = jk.a(1, "fastblastname");
              if (var2 != null) {
                jg.field_l = bk.a(var2, -12465);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2 = jk.a(1, "electroshockername");
              if (var2 != null) {
                kg.field_l = bk.a(var2, -12465);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2 = jk.a(1, "barriername");
              if (null == var2) {
                break L66;
              } else {
                gl.field_c = bk.a(var2, -12465);
                break L66;
              }
            }
            L67: {
              var2 = jk.a(1, "bonusscore");
              if (var2 != null) {
                rl.field_d = bk.a(var2, -12465);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2 = jk.a(1, "scoreis");
              if (var2 == null) {
                break L68;
              } else {
                ke.field_a = bk.a(var2, -12465);
                break L68;
              }
            }
            L69: {
              var2 = jk.a(1, "timenom");
              if (var2 == null) {
                break L69;
              } else {
                cf.field_g = bk.a(var2, -12465);
                break L69;
              }
            }
            L70: {
              var2 = jk.a(1, "wave");
              if (null == var2) {
                break L70;
              } else {
                gb.field_e = bk.a(var2, -12465);
                break L70;
              }
            }
            L71: {
              var2 = jk.a(1, "thingboss");
              if (null != var2) {
                ia.field_e = bk.a(var2, -12465);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2 = jk.a(1, "sneakoname");
              if (var2 == null) {
                break L72;
              } else {
                k.field_a = bk.a(var2, -12465);
                break L72;
              }
            }
            L73: {
              var2 = jk.a(1, "paniconame");
              if (var2 == null) {
                break L73;
              } else {
                od.field_a = bk.a(var2, -12465);
                break L73;
              }
            }
            L74: {
              var2 = jk.a(1, "splittoname");
              if (null != var2) {
                bi.field_a = bk.a(var2, -12465);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              var2 = jk.a(1, "awesomeoname");
              if (null != var2) {
                bk.field_b = bk.a(var2, -12465);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2 = jk.a(1, "irononame");
              if (var2 != null) {
                uh.field_c = bk.a(var2, -12465);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2 = jk.a(1, "ghostoname");
              if (var2 != null) {
                jl.field_f = bk.a(var2, -12465);
                break L77;
              } else {
                break L77;
              }
            }
            L78: {
              var2 = jk.a(1, "blamboname");
              if (null != var2) {
                gd.field_a = bk.a(var2, -12465);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              var2 = jk.a(1, "bomboname");
              if (null == var2) {
                break L79;
              } else {
                jd.field_f = bk.a(var2, -12465);
                break L79;
              }
            }
            L80: {
              var2 = jk.a(1, "flyboname");
              if (var2 == null) {
                break L80;
              } else {
                re.field_g = bk.a(var2, -12465);
                break L80;
              }
            }
            L81: {
              var2 = jk.a(1, "toughoname");
              if (var2 != null) {
                we.field_A = bk.a(var2, -12465);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2 = jk.a(1, "speedoname");
              if (null == var2) {
                break L82;
              } else {
                re.field_f = bk.a(var2, -12465);
                break L82;
              }
            }
            L83: {
              var2 = jk.a(1, "swarmoname");
              if (var2 == null) {
                break L83;
              } else {
                th.field_a = bk.a(var2, -12465);
                break L83;
              }
            }
            L84: {
              var2 = jk.a(1, "normoname");
              if (null != var2) {
                ig.field_gb = bk.a(var2, -12465);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2 = jk.a(1, "awesomewin");
              if (var2 != null) {
                mg.field_h = bk.a(var2, -12465);
                break L85;
              } else {
                break L85;
              }
            }
            L86: {
              var2 = jk.a(1, "blambolicouswin");
              if (null != var2) {
                nb.field_o = bk.a(var2, -12465);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              var2 = jk.a(1, "norbsomewin");
              if (null == var2) {
                break L87;
              } else {
                cc.field_r = bk.a(var2, -12465);
                break L87;
              }
            }
            L88: {
              var2 = jk.a(1, "orbsomewin");
              if (null == var2) {
                break L88;
              } else {
                oe.field_q = bk.a(var2, -12465);
                break L88;
              }
            }
            L89: {
              var2 = jk.a(1, "youwon");
              if (null != var2) {
                bi.field_d = bk.a(var2, -12465);
                break L89;
              } else {
                break L89;
              }
            }
            L90: {
              var2 = jk.a(1, "institle");
              if (var2 != null) {
                hi.field_l = bk.a(var2, -12465);
                break L90;
              } else {
                break L90;
              }
            }
            L91: {
              var2 = jk.a(1, "scoretitle");
              if (var2 == null) {
                break L91;
              } else {
                we.field_F = bk.a(var2, -12465);
                break L91;
              }
            }
            L92: {
              var2 = jk.a(1, "wavetitle");
              if (null != var2) {
                nh.field_e = bk.a(var2, -12465);
                break L92;
              } else {
                break L92;
              }
            }
            L93: {
              var2 = jk.a(1, "nametitle");
              if (null == var2) {
                break L93;
              } else {
                bg.field_d = bk.a(var2, -12465);
                break L93;
              }
            }
            L94: {
              var2 = jk.a(1, "bsths");
              if (null == var2) {
                break L94;
              } else {
                bk.field_c = bk.a(var2, -12465);
                break L94;
              }
            }
            L95: {
              var2 = jk.a(1, "myhs");
              if (var2 != null) {
                hh.field_e = bk.a(var2, -12465);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              var2 = jk.a(1, "allhs");
              if (var2 == null) {
                break L96;
              } else {
                df.field_a = bk.a(var2, -12465);
                break L96;
              }
            }
            L97: {
              var2 = jk.a(1, "thisishidden");
              if (var2 != null) {
                od.field_h = bk.a(var2, -12465);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2 = jk.a(1, "orbcoin");
              if (var2 == null) {
                break L98;
              } else {
                nf.field_n = bk.a(var2, -12465);
                break L98;
              }
            }
            L99: {
              var2 = jk.a(1, "unknownstuff");
              if (null != var2) {
                OrbDefence.field_E = bk.a(var2, -12465);
                break L99;
              } else {
                break L99;
              }
            }
            L100: {
              var2 = jk.a(1, "orbpoints");
              if (null != var2) {
                dj.field_e = bk.a(var2, -12465);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2 = jk.a(1, "achievethisgame");
              if (var2 != null) {
                ja.field_d = bk.a(var2, -12465);
                break L101;
              } else {
                break L101;
              }
            }
            L102: {
              var2 = jk.a(1, "achieve");
              if (var2 == null) {
                break L102;
              } else {
                wc.field_b = bk.a(var2, -12465);
                break L102;
              }
            }
            L103: {
              var2 = jk.a(1, "thousandseperator");
              if (var2 != null) {
                ck.field_k = bk.a(var2, -12465);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2 = jk.a(1, "cs5");
              if (var2 != null) {
                kd.field_b = bk.a(var2, -12465);
                break L104;
              } else {
                break L104;
              }
            }
            L105: {
              var2 = jk.a(1, "cs4");
              if (var2 != null) {
                p.field_e = bk.a(var2, -12465);
                break L105;
              } else {
                break L105;
              }
            }
            L106: {
              var2 = jk.a(1, "bs5");
              if (var2 != null) {
                cd.field_r = bk.a(var2, -12465);
                break L106;
              } else {
                break L106;
              }
            }
            L107: {
              var2 = jk.a(1, "bs4");
              if (null == var2) {
                break L107;
              } else {
                ug.field_o = bk.a(var2, -12465);
                break L107;
              }
            }
            L108: {
              var2 = jk.a(1, "ic5");
              if (var2 != null) {
                ua.field_b = bk.a(var2, -12465);
                break L108;
              } else {
                break L108;
              }
            }
            L109: {
              var2 = jk.a(1, "ic4");
              if (var2 != null) {
                b.field_q = bk.a(var2, -12465);
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              var2 = jk.a(1, "bb5");
              if (null == var2) {
                break L110;
              } else {
                ob.field_E = bk.a(var2, -12465);
                break L110;
              }
            }
            L111: {
              var2 = jk.a(1, "bb4");
              if (null == var2) {
                break L111;
              } else {
                lj.field_B = bk.a(var2, -12465);
                break L111;
              }
            }
            L112: {
              var2 = jk.a(1, "es5");
              if (null == var2) {
                break L112;
              } else {
                ua.field_d = bk.a(var2, -12465);
                break L112;
              }
            }
            L113: {
              var2 = jk.a(1, "es4");
              if (var2 == null) {
                break L113;
              } else {
                de.field_c = bk.a(var2, -12465);
                break L113;
              }
            }
            L114: {
              var2 = jk.a(1, "fb5");
              if (null != var2) {
                ob.field_L = bk.a(var2, -12465);
                break L114;
              } else {
                break L114;
              }
            }
            L115: {
              var2 = jk.a(1, "fb4");
              if (null == var2) {
                break L115;
              } else {
                nd.field_f = bk.a(var2, -12465);
                break L115;
              }
            }
            L116: {
              var2 = jk.a(1, "levellocked");
              if (var2 == null) {
                break L116;
              } else {
                wl.field_b = bk.a(var2, -12465);
                break L116;
              }
            }
            L117: {
              var2 = jk.a(1, "memberonlylevel");
              if (null != var2) {
                of.field_I = bk.a(var2, -12465);
                break L117;
              } else {
                break L117;
              }
            }
            L118: {
              var2 = jk.a(1, "levelselect");
              if (null != var2) {
                lc.field_u = bk.a(var2, -12465);
                break L118;
              } else {
                break L118;
              }
            }
            L119: {
              var2 = jk.a(1, "startfreegame");
              if (var2 == null) {
                break L119;
              } else {
                wh.field_d = bk.a(var2, -12465);
                break L119;
              }
            }
            L120: {
              var2 = jk.a(1, "startmembersgame");
              if (null == var2) {
                break L120;
              } else {
                k.field_e = bk.a(var2, -12465);
                break L120;
              }
            }
            L121: {
              var2 = jk.a(1, "achievement_names,0");
              if (null == var2) {
                break L121;
              } else {
                gj.field_j[0] = bk.a(var2, -12465);
                break L121;
              }
            }
            L122: {
              var2 = jk.a(1, "achievement_names,1");
              if (var2 == null) {
                break L122;
              } else {
                gj.field_j[1] = bk.a(var2, -12465);
                break L122;
              }
            }
            L123: {
              var2 = jk.a(1, "achievement_names,2");
              if (var2 == null) {
                break L123;
              } else {
                gj.field_j[2] = bk.a(var2, -12465);
                break L123;
              }
            }
            L124: {
              var2 = jk.a(1, "achievement_names,3");
              if (var2 != null) {
                gj.field_j[3] = bk.a(var2, -12465);
                break L124;
              } else {
                break L124;
              }
            }
            L125: {
              var2 = jk.a(1, "achievement_names,4");
              if (null == var2) {
                break L125;
              } else {
                gj.field_j[4] = bk.a(var2, -12465);
                break L125;
              }
            }
            L126: {
              var2 = jk.a(1, "achievement_names,5");
              if (var2 != null) {
                gj.field_j[5] = bk.a(var2, -12465);
                break L126;
              } else {
                break L126;
              }
            }
            L127: {
              var2 = jk.a(1, "achievement_names,6");
              if (null == var2) {
                break L127;
              } else {
                gj.field_j[6] = bk.a(var2, -12465);
                break L127;
              }
            }
            L128: {
              var2 = jk.a(1, "achievement_names,7");
              if (var2 != null) {
                gj.field_j[7] = bk.a(var2, -12465);
                break L128;
              } else {
                break L128;
              }
            }
            L129: {
              var2 = jk.a(1, "achievement_names,8");
              if (var2 != null) {
                gj.field_j[8] = bk.a(var2, -12465);
                break L129;
              } else {
                break L129;
              }
            }
            L130: {
              var2 = jk.a(1, "achievement_names,9");
              if (var2 != null) {
                gj.field_j[9] = bk.a(var2, -12465);
                break L130;
              } else {
                break L130;
              }
            }
            L131: {
              var2 = jk.a(1, "achievement_names,10");
              if (var2 == null) {
                break L131;
              } else {
                gj.field_j[10] = bk.a(var2, -12465);
                break L131;
              }
            }
            L132: {
              var2 = jk.a(1, "achievement_names,11");
              if (var2 != null) {
                gj.field_j[11] = bk.a(var2, -12465);
                break L132;
              } else {
                break L132;
              }
            }
            L133: {
              var2 = jk.a(1, "achievement_names,12");
              if (null != var2) {
                gj.field_j[12] = bk.a(var2, -12465);
                break L133;
              } else {
                break L133;
              }
            }
            L134: {
              var2 = jk.a(1, "achievement_names,13");
              if (null != var2) {
                gj.field_j[13] = bk.a(var2, -12465);
                break L134;
              } else {
                break L134;
              }
            }
            L135: {
              var2 = jk.a(1, "achievement_names,14");
              if (null == var2) {
                break L135;
              } else {
                gj.field_j[14] = bk.a(var2, -12465);
                break L135;
              }
            }
            L136: {
              var2 = jk.a(1, "achievement_names,15");
              if (null == var2) {
                break L136;
              } else {
                gj.field_j[15] = bk.a(var2, -12465);
                break L136;
              }
            }
            L137: {
              var2 = jk.a(1, "achievement_names,16");
              if (var2 == null) {
                break L137;
              } else {
                gj.field_j[16] = bk.a(var2, -12465);
                break L137;
              }
            }
            L138: {
              var2 = jk.a(1, "achievement_names,17");
              if (null == var2) {
                break L138;
              } else {
                gj.field_j[17] = bk.a(var2, -12465);
                break L138;
              }
            }
            L139: {
              var2 = jk.a(1, "achievement_names,18");
              if (var2 != null) {
                gj.field_j[18] = bk.a(var2, -12465);
                break L139;
              } else {
                break L139;
              }
            }
            L140: {
              var2 = jk.a(1, "achievement_names,19");
              if (null != var2) {
                gj.field_j[19] = bk.a(var2, -12465);
                break L140;
              } else {
                break L140;
              }
            }
            L141: {
              var2 = jk.a(1, "achievement_names,20");
              if (var2 != null) {
                gj.field_j[20] = bk.a(var2, -12465);
                break L141;
              } else {
                break L141;
              }
            }
            L142: {
              var2 = jk.a(1, "achievement_names,21");
              if (var2 == null) {
                break L142;
              } else {
                gj.field_j[21] = bk.a(var2, -12465);
                break L142;
              }
            }
            L143: {
              var2 = jk.a(1, "achievement_names,22");
              if (var2 == null) {
                break L143;
              } else {
                gj.field_j[22] = bk.a(var2, -12465);
                break L143;
              }
            }
            L144: {
              var2 = jk.a(1, "achievement_names,23");
              if (null == var2) {
                break L144;
              } else {
                gj.field_j[23] = bk.a(var2, -12465);
                break L144;
              }
            }
            L145: {
              var2 = jk.a(1, "achievement_criteria,0");
              if (var2 != null) {
                field_b[0] = bk.a(var2, -12465);
                break L145;
              } else {
                break L145;
              }
            }
            L146: {
              var2 = jk.a(1, "achievement_criteria,1");
              if (var2 != null) {
                field_b[1] = bk.a(var2, -12465);
                break L146;
              } else {
                break L146;
              }
            }
            L147: {
              var2 = jk.a(1, "achievement_criteria,2");
              if (var2 == null) {
                break L147;
              } else {
                field_b[2] = bk.a(var2, -12465);
                break L147;
              }
            }
            L148: {
              var2 = jk.a(1, "achievement_criteria,3");
              if (null != var2) {
                field_b[3] = bk.a(var2, -12465);
                break L148;
              } else {
                break L148;
              }
            }
            L149: {
              var2 = jk.a(1, "achievement_criteria,4");
              if (null != var2) {
                field_b[4] = bk.a(var2, -12465);
                break L149;
              } else {
                break L149;
              }
            }
            L150: {
              var2 = jk.a(1, "achievement_criteria,5");
              if (var2 != null) {
                field_b[5] = bk.a(var2, -12465);
                break L150;
              } else {
                break L150;
              }
            }
            L151: {
              var2 = jk.a(1, "achievement_criteria,6");
              if (null != var2) {
                field_b[6] = bk.a(var2, -12465);
                break L151;
              } else {
                break L151;
              }
            }
            L152: {
              var2 = jk.a(1, "achievement_criteria,7");
              if (null == var2) {
                break L152;
              } else {
                field_b[7] = bk.a(var2, -12465);
                break L152;
              }
            }
            L153: {
              var2 = jk.a(1, "achievement_criteria,8");
              if (var2 == null) {
                break L153;
              } else {
                field_b[8] = bk.a(var2, -12465);
                break L153;
              }
            }
            L154: {
              var2 = jk.a(1, "achievement_criteria,9");
              if (var2 != null) {
                field_b[9] = bk.a(var2, -12465);
                break L154;
              } else {
                break L154;
              }
            }
            L155: {
              var2 = jk.a(1, "achievement_criteria,10");
              if (var2 != null) {
                field_b[10] = bk.a(var2, -12465);
                break L155;
              } else {
                break L155;
              }
            }
            L156: {
              var2 = jk.a(1, "achievement_criteria,11");
              if (var2 != null) {
                field_b[11] = bk.a(var2, -12465);
                break L156;
              } else {
                break L156;
              }
            }
            L157: {
              var2 = jk.a(1, "achievement_criteria,12");
              if (null != var2) {
                field_b[12] = bk.a(var2, -12465);
                break L157;
              } else {
                break L157;
              }
            }
            L158: {
              var2 = jk.a(1, "achievement_criteria,13");
              if (var2 == null) {
                break L158;
              } else {
                field_b[13] = bk.a(var2, -12465);
                break L158;
              }
            }
            L159: {
              var2 = jk.a(1, "achievement_criteria,14");
              if (var2 != null) {
                field_b[14] = bk.a(var2, -12465);
                break L159;
              } else {
                break L159;
              }
            }
            L160: {
              var2 = jk.a(1, "achievement_criteria,15");
              if (var2 != null) {
                field_b[15] = bk.a(var2, -12465);
                break L160;
              } else {
                break L160;
              }
            }
            L161: {
              var2 = jk.a(1, "achievement_criteria,16");
              if (var2 == null) {
                break L161;
              } else {
                field_b[16] = bk.a(var2, -12465);
                break L161;
              }
            }
            L162: {
              var2 = jk.a(1, "achievement_criteria,17");
              if (null != var2) {
                field_b[17] = bk.a(var2, -12465);
                break L162;
              } else {
                break L162;
              }
            }
            L163: {
              var2 = jk.a(1, "achievement_criteria,18");
              if (var2 == null) {
                break L163;
              } else {
                field_b[18] = bk.a(var2, -12465);
                break L163;
              }
            }
            L164: {
              var2 = jk.a(1, "achievement_criteria,19");
              if (null != var2) {
                field_b[19] = bk.a(var2, -12465);
                break L164;
              } else {
                break L164;
              }
            }
            L165: {
              var2 = jk.a(1, "achievement_criteria,20");
              if (null == var2) {
                break L165;
              } else {
                field_b[20] = bk.a(var2, -12465);
                break L165;
              }
            }
            L166: {
              var2 = jk.a(1, "achievement_criteria,21");
              if (var2 == null) {
                break L166;
              } else {
                field_b[21] = bk.a(var2, -12465);
                break L166;
              }
            }
            L167: {
              var2 = jk.a(1, "achievement_criteria,22");
              if (null != var2) {
                field_b[22] = bk.a(var2, -12465);
                break L167;
              } else {
                break L167;
              }
            }
            L168: {
              var2 = jk.a(1, "achievement_criteria,23");
              if (var2 != null) {
                field_b[23] = bk.a(var2, -12465);
                break L168;
              } else {
                break L168;
              }
            }
            L169: {
              var2 = jk.a(1, "score_colon_space");
              if (var2 == null) {
                break L169;
              } else {
                bk.a(var2, -12465);
                break L169;
              }
            }
            L170: {
              var2 = jk.a(1, "instructions_pages,0");
              if (null == var2) {
                break L170;
              } else {
                oa.field_i[0] = bk.a(var2, -12465);
                break L170;
              }
            }
            L171: {
              var2 = jk.a(1, "instructions_pages,1");
              if (null == var2) {
                break L171;
              } else {
                oa.field_i[1] = bk.a(var2, -12465);
                break L171;
              }
            }
            L172: {
              var2 = jk.a(1, "instructions_pages,2");
              if (null == var2) {
                break L172;
              } else {
                oa.field_i[2] = bk.a(var2, -12465);
                break L172;
              }
            }
            L173: {
              var2 = jk.a(1, "instructions_pages,3");
              if (var2 != null) {
                oa.field_i[3] = bk.a(var2, -12465);
                break L173;
              } else {
                break L173;
              }
            }
            L174: {
              var2 = jk.a(1, "instructions_pages,4");
              if (null == var2) {
                break L174;
              } else {
                oa.field_i[4] = bk.a(var2, -12465);
                break L174;
              }
            }
            L175: {
              var2 = jk.a(1, "instructions_pages,5");
              if (null == var2) {
                break L175;
              } else {
                oa.field_i[5] = bk.a(var2, -12465);
                break L175;
              }
            }
            L176: {
              var2 = jk.a(1, "instructions_pages,6");
              if (null != var2) {
                oa.field_i[6] = bk.a(var2, -12465);
                break L176;
              } else {
                break L176;
              }
            }
            L177: {
              var2 = jk.a(1, "tutorialon");
              if (var2 != null) {
                cc.field_m = bk.a(var2, -12465);
                break L177;
              } else {
                break L177;
              }
            }
            L178: {
              var2 = jk.a(1, "tutorialoff");
              if (var2 == null) {
                break L178;
              } else {
                db.field_c = bk.a(var2, -12465);
                break L178;
              }
            }
            L179: {
              var2 = jk.a(1, "levelnames,0");
              if (var2 != null) {
                gb.field_g[0] = bk.a(var2, -12465);
                break L179;
              } else {
                break L179;
              }
            }
            L180: {
              var2 = jk.a(1, "levelnames,1");
              if (null == var2) {
                break L180;
              } else {
                gb.field_g[1] = bk.a(var2, -12465);
                break L180;
              }
            }
            L181: {
              var2 = jk.a(1, "levelnames,2");
              if (var2 == null) {
                break L181;
              } else {
                gb.field_g[2] = bk.a(var2, -12465);
                break L181;
              }
            }
            L182: {
              var2 = jk.a(1, "levelnames,3");
              if (var2 == null) {
                break L182;
              } else {
                gb.field_g[3] = bk.a(var2, -12465);
                break L182;
              }
            }
            L183: {
              var2 = jk.a(1, "levelnames,4");
              if (null == var2) {
                break L183;
              } else {
                gb.field_g[4] = bk.a(var2, -12465);
                break L183;
              }
            }
            L184: {
              var2 = jk.a(1, "levelnames,5");
              if (null != var2) {
                gb.field_g[5] = bk.a(var2, -12465);
                break L184;
              } else {
                break L184;
              }
            }
            L185: {
              var2 = jk.a(1, "benefits,0");
              if (null == var2) {
                break L185;
              } else {
                tk.field_r[0] = bk.a(var2, -12465);
                break L185;
              }
            }
            L186: {
              var2 = jk.a(1, "benefits,1");
              if (var2 != null) {
                tk.field_r[1] = bk.a(var2, -12465);
                break L186;
              } else {
                break L186;
              }
            }
            L187: {
              var2 = jk.a(1, "benefits,2");
              if (var2 != null) {
                tk.field_r[2] = bk.a(var2, -12465);
                break L187;
              } else {
                break L187;
              }
            }
            md.field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L188: {
            var2_ref = decompiledCaughtException;
            stackIn_664_0 = (RuntimeException) (var2_ref);

            stackIn_664_1 = new StringBuilder().append("va.B(");

            if (param0 == null) {
              stackIn_665_0 = (RuntimeException) ((Object) stackIn_664_0);
              stackIn_665_1 = (StringBuilder) ((Object) stackIn_664_1);
              stackIn_665_2 = "null";
              break L188;
            } else {
              stackIn_665_0 = (RuntimeException) ((Object) stackIn_664_0);
              stackIn_665_1 = (StringBuilder) ((Object) stackIn_664_1);
              stackIn_665_2 = "{...}";
              break L188;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_665_0), stackIn_665_2 + ',' + param1 + ')');
        }
        L189: {
          if (!tf.field_e) {
            break L189;
          } else {
            L190: {
              if (var3 == 0) {
                stackIn_673_0 = 1;
                break L190;
              } else {
                stackIn_673_0 = 0;
                break L190;
              }
            }
            OrbDefence.field_D = stackIn_673_0 != 0;
            break L189;
          }
        }
    }

    static {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = new String[]{"Pass wave 66, with only a single orb after wave 33", "Pass wave 33 in First Fight", "Pass wave 66 in First Fight", "Unlock the Dominion level, by achieving a score of one million points in either Pincer or Breakout.", "Pass wave 66 in First Fight with three orbs intact", "Pass wave 66 in First Fight with all orbs intact", "Pass wave 99 in First Fight", "Pass wave 99 in First Fight with all orbs intact", "Pass wave 99 in Dominion", "Kill 99 enemies with level 5 fast blasts", "Kill 99 enemies with level 5 chain shots", "Kill 99 enemies with level 5 big shots", "Kill 99 enemies with level 5 beam blasts", "Defeat a boss wave in First Fight", "Defeat three boss waves in First Fight", "Defeat all the boss waves in First Fight", "Pass wave 99 in First Fight without building any ice turrets", "Lose all but the front orb after wave 33, in First Fight", "Use electroshock turrets to stun 250 Norbs at once", "Use barriers to stop 30 Norbs simultaneously", "Let a Norb live for 4 minutes, without losing an orb", "Achieve a score of one million points in either Gridlock or Orb central", "Unlock the Gridlock and Orb Central levels by passing wave 66 in Pincer or Breakout", "Kill the Ghosto boss during Hallowe'en"};
        field_c = 4;
    }
}
