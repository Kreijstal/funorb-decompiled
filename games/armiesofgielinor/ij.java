/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends dv {
    static String field_A;
    static ea field_w;
    static String field_B;
    static String field_C;
    static int field_y;
    static String field_u;
    static String field_v;
    private dr[] field_z;
    static int field_x;

    final boolean a(int param0, char param1, int param2) {
        boolean discarded$0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        String var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.a(-31501)) {
          var12 = this.field_o.q(param0 ^ param0);
          var5 = this.field_o.o(param0 ^ 30781);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L0: while (true) {
            if (var5 <= var9) {
              L1: {
                if (0 >= var5) {
                  stackIn_26_0 = 65535;
                  break L1;
                } else {
                  stackIn_26_0 = var12.charAt(var5 - 1);
                  break L1;
                }
              }
              L2: {
                var9 = stackIn_26_0;
                if (var12.length() <= var5) {
                  stackIn_29_0 = 65535;
                  break L2;
                } else {
                  stackIn_29_0 = var12.charAt(var5);
                  break L2;
                }
              }
              L3: {
                L4: {
                  L5: {
                    var10 = stackIn_29_0;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (param1 != 34) {
                          break L5;
                        } else {
                          if (var10 == 34) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (var7 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (39 != param1) {
                          break L6;
                        } else {
                          if (var10 == 39) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (var6 != 0) {
                      break L7;
                    } else {
                      if (var7 != 0) {
                        break L7;
                      } else {
                        if (param1 != 41) {
                          break L7;
                        } else {
                          if (var10 == 41) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if ((param2 ^ -1) != -86) {
                      break L8;
                    } else {
                      L9: {
                        if (var9 != 40) {
                          break L9;
                        } else {
                          if (var10 == 41) {
                            this.field_o.a(101, -26126, '￿');
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var6 == 0) {
                          break L10;
                        } else {
                          if (var9 != 34) {
                            break L10;
                          } else {
                            if (var10 == 34) {
                              this.field_o.a(101, -26126, '￿');
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L8;
                      } else {
                        if (39 != var9) {
                          break L8;
                        } else {
                          if (39 != var10) {
                            break L8;
                          } else {
                            this.field_o.a(101, -26126, '￿');
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    discarded$0 = super.a(-30847, param1, param2);
                    var4 = this.field_o.q(param0 ^ -30847);
                    var5 = this.field_o.o(param0 ^ -30779);
                    if (var6 != 0) {
                      break L11;
                    } else {
                      if (var7 != 0) {
                        break L11;
                      } else {
                        if (param1 == 40) {
                          this.field_o.a(-1, -26126, ')');
                          this.field_o.a(-98, var5, var5);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  L12: {
                    if (var6 != 0) {
                      break L12;
                    } else {
                      if (var7 != 0) {
                        break L12;
                      } else {
                        if (param1 == 34) {
                          this.field_o.a(-1, -26126, '"');
                          this.field_o.a(param0 + 30749, var5, var5);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (var6 != 0) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (param1 == 39) {
                        this.field_o.a(-1, param0 + 4721, '\'');
                        this.field_o.a(-98, var5, var5);
                        break L3;
                      } else {
                        vs.field_c = wf.a(this.field_o.q(0), -101);
                        return true;
                      }
                    }
                  }
                }
                this.field_o.c(1 + var5, false);
                break L3;
              }
              vs.field_c = wf.a(this.field_o.q(0), -101);
              return true;
            } else {
              if (var8 == 0) {
                L13: {
                  L14: {
                    var10 = var12.charAt(var9);
                    if (var6 != 0) {
                      break L14;
                    } else {
                      if (var7 != 0) {
                        break L14;
                      } else {
                        stackIn_14_0 = 0;
                        break L13;
                      }
                    }
                  }
                  if (var10 == 92) {
                    stackIn_14_0 = 1;
                    break L13;
                  } else {
                    stackIn_14_0 = 0;
                    break L13;
                  }
                }
                L15: {
                  L16: {
                    var8 = stackIn_14_0;
                    stackIn_17_0 = var6;

                    if (var7 != 0) {
                      break L16;
                    } else {

                      if (var10 != 34) {
                        break L16;
                      } else {
                        stackIn_18_0 = stackIn_17_0;
                        stackIn_18_1 = 1;
                        break L15;
                      }
                    }
                  }
                  stackIn_18_0 = stackIn_17_0;
                  stackIn_18_1 = 0;
                  break L15;
                }
                L17: {
                  L18: {
                    var6 = stackIn_18_0 ^ stackIn_18_1;
                    stackIn_21_0 = var7;

                    if (var6 != 0) {
                      break L18;
                    } else {

                      if (var10 != 39) {
                        break L18;
                      } else {
                        stackIn_22_0 = stackIn_21_0;
                        stackIn_22_1 = 1;
                        break L17;
                      }
                    }
                  }
                  stackIn_22_0 = stackIn_21_0;
                  stackIn_22_1 = 0;
                  break L17;
                }
                var7 = stackIn_22_0 ^ stackIn_22_1;
                var9++;
                continue L0;
              } else {
                var8 = 0;
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return super.a(-30847, param1, param2);
        }
    }

    ij(at param0, ka param1, hd param2) {
        super(param1, param2);
        int var4_int = 0;
        dr var5 = null;
        int incrementValue$0 = 0;
        try {
            this.field_z = new dr[param0.b(false)];
            var4_int = 0;
            var5 = (dr) ((Object) param0.e((byte) 94));
            while (var5 != null) {
                incrementValue$0 = var4_int;
                var4_int++;
                this.field_z[incrementValue$0] = var5;
                var5 = (dr) ((Object) param0.a((byte) 123));
            }
            this.a(-1, "# <col=ffaaff>FunOrbConsole (loaded " + this.field_z.length + " methods at " + new Date() + ")</col>");
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        int var2 = -78 / ((param0 - 13) / 33);
        String var3 = this.field_o.field_Pb.field_X;
        this.field_o.field_Pb.field_X = vs.field_c;
        super.b(-100);
        this.field_o.field_Pb.field_X = var3;
    }

    final String[] b(boolean param0) {
        ui discarded$0 = null;
        int incrementValue$1 = 0;
        int var3;
        og[] var4;
        int var5;
        String var6;
        int var8_int;
        String[] var8;
        int var9;
        int var10_int;
        dr var10;
        int var11;
        String var12;
        String var13;
        og var14;
        ui var15;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var13 = this.field_o.q(0);
          var6 = var13;
          var3 = this.field_o.o(95);
          var4 = vv.a(var13, 114);
          var5 = ms.a(var3, var4, -122);
          this.field_s.field_S = 0;
          var6 = "";
          if (0 > var5) {
            break L0;
          } else {
            L1: {
              var14 = var4[var5];
              var8_int = -var14.field_s + var3;
              if (rn.field_c != var14.field_q) {
                break L1;
              } else {
                if (var8_int > 0) {
                  var13 = var6;
                  var6 = var14.field_o.substring(0, Math.min(var14.field_o.length(), var8_int));
                  this.field_s.field_S = this.field_t.a(var13.substring(0, var14.field_s));
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var9 = var5;
            var10_int = 0;
            L2: while (true) {
              L3: {
                if (-1 < (var9 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if ((gm.field_d ^ -1) == (var4[var9].field_q ^ -1)) {
                      var10_int++;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var4[var9].field_q != mo.field_j) {
                      break L5;
                    } else {
                      var10_int--;
                      break L5;
                    }
                  }
                  if (var10_int < 0) {
                    break L3;
                  } else {
                    var9--;
                    continue L2;
                  }
                }
              }
              if (0 >= var9) {
                break L0;
              } else {
                if (var4[var9 + -1].field_q == rn.field_c) {
                  var13 = var6;
                  var6 = var4[-1 + var9].field_o;
                  this.field_s.field_S = this.field_t.a(var13.substring(0, var4[-1 + var9].field_s));
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L6: {
          var15 = this.a((byte) -75, var6);
          var8 = new String[var15.a(30578)];
          var9 = 0;
          var10 = (dr) ((Object) var15.a((byte) 43));
          if (param0) {
            break L6;
          } else {
            var12 = (String) null;
            discarded$0 = this.a((byte) 83, (String) null);
            break L6;
          }
        }
        L7: while (true) {
          if (var10 == null) {
            return var8;
          } else {
            incrementValue$1 = var9;
            var9++;
            var8[incrementValue$1] = var10.field_A;
            var10 = (dr) ((Object) var15.c(24));
            continue L7;
          }
        }
    }

    final static au b(byte param0, int param1) {
        if (param0 != 74) {
            return (au) null;
        }
        return null == qm.field_J ? null : (au) ((Object) qm.field_J.a((byte) -27, (long)param1));
    }

    final void a(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var3;
        og[] var4;
        int var5;
        String var6;
        int var8_int;
        StringBuilder var8;
        int var9;
        int var10;
        int var11;
        dr var12_ref_dr;
        int var12;
        dr var13;
        int var14;
        String var15;
        og var16;
        ui var17;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          var15 = this.field_o.q(0);
          var6 = var15;
          var6 = var15;
          var3 = this.field_o.o(-105);
          var4 = vv.a(var15, param0 + -11);
          var5 = ms.a(var3, var4, -126);
          var6 = "";
          if (0 > var5) {
            break L0;
          } else {
            var16 = var4[var5];
            var8_int = var3 + -var16.field_s;
            if (rn.field_c != var16.field_q) {
              break L0;
            } else {
              if (0 >= var8_int) {
                break L0;
              } else {
                if (var16.field_o.length() < var8_int) {
                  break L0;
                } else {
                  var6 = var16.field_o.substring(0, var8_int);
                  break L0;
                }
              }
            }
          }
        }
        var17 = this.a((byte) -75, var6);
        if (0 == var17.a(30578)) {
          return;
        } else {
          L1: {
            if (param0 == 122) {
              break L1;
            } else {
              this.b(77);
              break L1;
            }
          }
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_dr = (dr) ((Object) var17.a((byte) -110));
          L2: while (true) {
            if (var12_ref_dr == null) {
              L3: while (true) {
                L4: {
                  if (var10 == 0) {
                    break L4;
                  } else {
                    if ((var11 ^ -1) >= (var9 ^ -1)) {
                      break L4;
                    } else {
                      var12 = ((dr) ((Object) var17.a((byte) -112))).field_B.charAt(var9);
                      var13 = (dr) ((Object) var17.c(24));
                      L5: while (true) {
                        if (var13 == null) {
                          var9++;
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            discarded$0 = var8.append((char) var12);
                            continue L3;
                          }
                        } else {
                          L6: {
                            stackIn_22_0 = var10;

                            if ((var12 ^ -1) != (var13.field_B.charAt(var9) ^ -1)) {
                              stackIn_23_0 = stackIn_22_0;
                              stackIn_23_1 = 0;
                              break L6;
                            } else {
                              stackIn_23_0 = stackIn_22_0;
                              stackIn_23_1 = 1;
                              break L6;
                            }
                          }
                          var10 = stackIn_23_0 & stackIn_23_1;
                          var13 = (dr) ((Object) var17.c(24));
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L7: {
                  var12 = var3 - -var8.length();
                  if (var6.length() + var8.length() == var11) {
                    L8: {
                      var12++;
                      discarded$1 = var8.append("()");
                      if ((var17.a(30578) ^ -1) != -2) {
                        break L8;
                      } else {
                        if (((dr) ((Object) var17.a((byte) 44))).field_u.length == 0) {
                          var12++;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.field_o.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
                    this.field_o.c(var12, false);
                    break L7;
                  } else {
                    this.field_o.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
                    this.field_o.c(var12, false);
                    break L7;
                  }
                }
                return;
              }
            } else {
              L9: {
                if (var11 > var12_ref_dr.field_B.length()) {
                  var11 = var12_ref_dr.field_B.length();
                  break L9;
                } else {
                  break L9;
                }
              }
              var12_ref_dr = (dr) ((Object) var17.c(24));
              continue L2;
            }
          }
        }
    }

    private final ui a(byte param0, String param1) {
        ui var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ui var6 = null;
        ui stackIn_3_0 = null;
        ui stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -75) {
              var6 = new ui();
              var3 = var6;
              var4 = 0;
              L1: while (true) {
                if (var4 >= this.field_z.length) {
                  stackIn_10_0 = (ui) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!this.field_z[var4].field_B.startsWith(param1)) {
                      break L2;
                    } else {
                      this.field_z[var4].c((byte) -76);
                      var6.a(this.field_z[var4], false);
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (ui) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ij.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final boolean a(String param0, boolean param1) {
        try {
            ef var3 = null;
            cb var3_ref = null;
            RuntimeException var3_ref2 = null;
            je var4 = null;
            og var5 = null;
            at var6 = null;
            es var7 = null;
            int stackIn_2_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_10_0 = 0;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var6 = gu.a(false, param0);
                    if (param1) {
                      var7 = new es(var6);
                      var5 = fk.a(var7, -39);
                      if (!var7.a(124)) {
                        throw new ef(var7.a((byte) 13).field_s);
                      } else {
                        this.a(var5.a(1, this.field_z), -58);
                        stackIn_7_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    } else {
                      stackIn_2_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (ef decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (ef) (Object) decompiledCaughtException;
                  param0 = "<col=55ff55>" + param0.substring(0, var3.field_b) + "</col>" + param0.substring(var3.field_b);
                  var4 = (je) ((Object) this.field_d.field_Jb.field_fb.d((byte) -98));
                  var4.field_X = this.field_c + param0;
                  return false;
                } catch (cb decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3_ref = (cb) (Object) decompiledCaughtException;
                  this.a(-1, var3_ref.field_b);
                  stackIn_10_0 = 0;
                  return stackIn_10_0 != 0;
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref2);

                stackIn_13_1 = new StringBuilder().append("ij.D(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L2;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L2;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0 != 0;
            } else {
              return stackIn_7_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        int var1 = 10 % ((55 - param0) / 54);
        field_A = null;
        field_v = null;
        field_B = null;
        field_u = null;
        field_w = null;
        field_C = null;
    }

    static {
        field_C = "Model Viewer";
        field_A = "Click a unit's base to select it";
        field_B = "The King Black Dragon is already available.";
        field_y = 0;
        field_v = "Group";
        field_u = "Report abuse";
        field_x = 480;
    }
}
