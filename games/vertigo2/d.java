/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class d extends iq {
    private boolean field_D;
    static float field_C;
    boolean field_F;
    private boolean field_E;
    boolean field_G;

    void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((d) this).field_v) {
                break L1;
              } else {
                if (((d) this).field_v instanceof ij) {
                  ((ij) (Object) ((d) this).field_v).a(param3, (d) this, (byte) -123, param1, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param2 >= 111) {
                break L2;
              } else {
                ((d) this).a(51, -64, (byte) -111, 64);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "d.R(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 >= rk.field_y) {
                break L1;
              } else {
                if (!ce.field_c) {
                  break L1;
                } else {
                  bi.d(0, 0, bi.field_e, td.field_c.field_C);
                  oc.field_v.b(param1, 0);
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (ko.field_P > 0) {
                  break L3;
                } else {
                  if (mp.field_b > 0) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (!im.field_g) {
                break L2;
              } else {
                bi.d(0, 0, bi.field_e, td.field_c.field_C);
                wc.field_m.b(param1, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "d.KA(" + 69 + 44 + param1 + 41);
        }
    }

    boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param5 <= -107) {
              L1: {
                if (!((d) this).field_F) {
                  break L1;
                } else {
                  if (((d) this).a(0, param2, param1, param0, param6)) {
                    L2: {
                      boolean discarded$1 = ((d) this).a((byte) 116, param3);
                      ((d) this).field_A = param4;
                      if (null == ((d) this).field_v) {
                        break L2;
                      } else {
                        if (((d) this).field_v instanceof wf) {
                          ((wf) (Object) ((d) this).field_v).a(true, param2, param1, (d) this, param0, param6, param4);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("d.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static int b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -37 / ((param0 - 31) / 55);
                var3 = 0;
                if (param1 < 0) {
                  break L2;
                } else {
                  if (65536 <= param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var3 += 16;
              param1 = param1 >>> 16;
              break L1;
            }
            L3: {
              if (256 <= param1) {
                param1 = param1 >>> 8;
                var3 += 8;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 >= 16) {
                var3 += 4;
                param1 = param1 >>> 4;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 < 4) {
                break L5;
              } else {
                var3 += 2;
                param1 = param1 >>> 2;
                break L5;
              }
            }
            L6: {
              if (param1 < 1) {
                break L6;
              } else {
                var3++;
                param1 = param1 >>> 1;
                break L6;
              }
            }
            stackOut_19_0 = var3 + param1;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "d.LA(" + param0 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    final static boolean a(char param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                L2: {
                  L3: {
                    if (param0 < 48) {
                      break L3;
                    } else {
                      if (param0 <= 57) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (65 > param0) {
                      break L4;
                    } else {
                      if (param0 <= 90) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param0 < 97) {
                      break L5;
                    } else {
                      if (param0 > 122) {
                        break L5;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L1;
                }
                stackOut_19_0 = 1;
                stackIn_22_0 = stackOut_19_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "d.GA(" + param0 + 44 + param1 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -79) {
                break L1;
              } else {
                StringBuilder discarded$4 = ((d) this).a((Hashtable) null, -24, (byte) 81, (StringBuilder) null);
                break L1;
              }
            }
            L2: {
              if (((d) this).a(param3, param2 ^ 78, param1, param0)) {
                L3: {
                  ((d) this).a(param0, param3, true, param1);
                  if (!((d) this).field_G) {
                    break L3;
                  } else {
                    StringBuilder discarded$5 = param3.append(" active");
                    break L3;
                  }
                }
                if (!((d) this).field_F) {
                  StringBuilder discarded$6 = param3.append(" disabled");
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_13_0 = (StringBuilder) param3;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("d.FA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_14_0;
    }

    boolean a(byte param0, iq param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param0 == 116) {
              L1: {
                if (!((d) this).field_F) {
                  break L1;
                } else {
                  if (((d) this).field_E) {
                    L2: {
                      param1.d((byte) 2);
                      ((d) this).field_D = true;
                      if (null == ((d) this).field_v) {
                        break L2;
                      } else {
                        if (((d) this).field_v instanceof hg) {
                          ((hg) (Object) ((d) this).field_v).a(9787, (iq) this, ((d) this).field_D);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("d.DA(").append(param0).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final static void a() {
        RuntimeException var1 = null;
        mi var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        tp var6 = null;
        String var7 = null;
        tp var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = id.field_f;
            var2 = var1_ref.h(-11);
            if (var2 != 0) {
              if (var2 == 1) {
                L1: {
                  if (se.field_A != null) {
                    break L1;
                  } else {
                    se.field_A = new fi(128);
                    sq.field_b = 0;
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.f(128);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.f(128);
                  var5 = var1_ref.f(128);
                  var6 = vo.a(var4_ref_String, 0);
                  if (var6 != null) {
                    break L3;
                  } else {
                    var6 = vo.a(var5, 0);
                    if (null != var6) {
                      se.field_A.a((gp) (Object) var6, (long)rc.a((CharSequence) (Object) var4_ref_String, 320).hashCode(), -107);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 == null) {
                    var6 = new tp();
                    se.field_A.a((gp) (Object) var6, (long)rc.a((CharSequence) (Object) var4_ref_String, 320).hashCode(), -111);
                    int fieldTemp$4 = sq.field_b;
                    sq.field_b = sq.field_b + 1;
                    var6.field_Pb = fieldTemp$4;
                    tm.field_a.a((li) (Object) var6, false);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var3 == null) {
                    break L5;
                  } else {
                    var3 = var3.intern();
                    break L5;
                  }
                }
                var6.field_Ib = var5;
                var6.field_Mb = var4_ref_String;
                var6.field_Lb = var3;
                var6.c(2);
                var7_ref = (tp) (Object) tm.field_a.a((byte) 100);
                L6: while (true) {
                  L7: {
                    if (var7_ref == null) {
                      break L7;
                    } else {
                      if (!md.a(1308, var7_ref, var6)) {
                        break L7;
                      } else {
                        var7_ref = (tp) (Object) tm.field_a.b(50);
                        if (var9 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (null == var7_ref) {
                        break L9;
                      } else {
                        int discarded$5 = 18724;
                        jn.a((li) (Object) var6, (li) (Object) var7_ref);
                        if (var9 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    tm.field_a.a((li) (Object) var6, false);
                    break L8;
                  }
                  return;
                }
              } else {
                if (2 != var2) {
                  if (var2 != 3) {
                    if (var2 != 4) {
                      ke.a((Throwable) null, "F1: " + or.a(118), 0);
                      rm.b((byte) -57);
                      break L0;
                    } else {
                      ba.field_d = 1;
                      var3 = var1_ref.f(128);
                      dg.field_d = var3.intern();
                      var4 = var1_ref.h(-11);
                      int discarded$6 = -65;
                      ir.a(var4);
                      return;
                    }
                  } else {
                    L10: {
                      if (ba.field_d != 2) {
                        break L10;
                      } else {
                        ba.field_d = 1;
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    if (1 != ba.field_d) {
                      break L11;
                    } else {
                      ba.field_d = 2;
                      break L11;
                    }
                  }
                  return;
                }
              }
            } else {
              L12: {
                if (null == jn.field_g) {
                  jn.field_g = new fi(128);
                  vd.field_a = 0;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (1 != var1_ref.h(-11)) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L13;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L13;
                }
              }
              L14: {
                L15: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1_ref.f(128);
                  if (var3_int != 0) {
                    break L15;
                  } else {
                    var5 = var4_ref_String;
                    if (var9 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                var5 = var1_ref.f(128);
                break L14;
              }
              L16: {
                var6 = or.a(56, var4_ref_String);
                var7 = var1_ref.f(128);
                var8 = rc.a((CharSequence) (Object) var4_ref_String, 320);
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (null != var6) {
                  break L17;
                } else {
                  var6 = or.a(56, var7);
                  if (var6 == null) {
                    break L17;
                  } else {
                    jn.field_g.a((gp) (Object) var6, (long)var8.hashCode(), 72);
                    break L17;
                  }
                }
              }
              L18: {
                if (null == var6) {
                  var6 = new tp();
                  jn.field_g.a((gp) (Object) var6, (long)var8.hashCode(), 98);
                  int fieldTemp$7 = vd.field_a;
                  vd.field_a = vd.field_a + 1;
                  var6.field_Pb = fieldTemp$7;
                  vj.field_d.a((li) (Object) var6, false);
                  break L18;
                } else {
                  break L18;
                }
              }
              var6.field_Mb = var4_ref_String;
              var6.field_Ib = var7;
              var6.field_Hb = var5;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "d.IA(" + 46 + 41);
        }
    }

    d(String param0, ur param1, uf param2) {
        super(param0, param1, param2);
        ((d) this).field_D = false;
        ((d) this).field_F = true;
        ((d) this).field_E = true;
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 >= 3) {
                break L1;
              } else {
                ((d) this).field_F = false;
                break L1;
              }
            }
            stackOut_3_0 = ((d) this).field_D;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "d.OA(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((d) this).field_D) {
                ((d) this).field_D = false;
                if (((d) this).field_v == null) {
                  break L1;
                } else {
                  if (((d) this).field_v instanceof hg) {
                    ((hg) (Object) ((d) this).field_v).a(9787, (iq) this, ((d) this).field_D);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 2) {
                break L2;
              } else {
                ((d) this).field_F = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "d.MA(" + param0 + 41);
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((d) this).field_v == null) {
                break L1;
              } else {
                if (!(((d) this).field_v instanceof wf)) {
                  break L1;
                } else {
                  ((wf) (Object) ((d) this).field_v).a(97, param3, param2, param4, param5, (d) this);
                  break L1;
                }
              }
            }
            L2: {
              ((d) this).field_A = 0;
              if (param1 == 46) {
                break L2;
              } else {
                boolean discarded$2 = ((d) this).a('u', -8, -87, (iq) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7;
            stackOut_10_1 = new StringBuilder().append("d.HA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
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
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                int discarded$2 = d.b(24, 69);
                break L1;
              }
            }
            L2: {
              if (!((d) this).f(param1 ^ 101)) {
                break L2;
              } else {
                L3: {
                  if (84 == param2) {
                    break L3;
                  } else {
                    if (83 != param2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((d) this).a(-1, 1, (byte) 113, -1);
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("d.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    d(String param0, uf param1) {
        this(param0, eb.field_c.field_p, param1);
    }

    void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              super.a((byte) 34, param1, param2, param3);
              if (((d) this).field_A == 0) {
                break L1;
              } else {
                if (~q.field_v != ~((d) this).field_A) {
                  L2: {
                    if (!((d) this).a(0, param2, param1, ed.field_n, gb.field_d)) {
                      break L2;
                    } else {
                      if (q.field_v == 0) {
                        ((d) this).a(ed.field_n + -param1, ((d) this).field_A, (byte) 117, gb.field_d - param2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((d) this).a(param3, (byte) 46, param1, param2, ed.field_n, gb.field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 >= 6) {
                break L3;
              } else {
                boolean discarded$2 = d.a('ﾬ', -84);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("d.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    protected d() {
        ((d) this).field_D = false;
        ((d) this).field_F = true;
        ((d) this).field_E = true;
        try {
            ((d) this).field_B = eb.field_c.field_q;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "d.<init>()");
        }
    }

    static {
    }
}
