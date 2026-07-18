/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends gh {
    static int field_Vb;
    gh field_Ub;
    lb field_Sb;
    gh field_Tb;
    static int field_Wb;

    final void a(byte param0, int param1, int param2, boolean param3, int param4) {
        L0: {
          if (((kg) this).field_Sb.b(false)) {
            ((kg) this).field_Ub.field_gb = ((kg) this).field_Ub.field_gb + param4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 96) {
            break L1;
          } else {
            ((kg) this).field_Ub = null;
            break L1;
          }
        }
        L2: {
          if (((kg) this).field_Sb.e((byte) 58)) {
            ((kg) this).field_Ub.field_gb = ((kg) this).field_Ub.field_gb - param4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((kg) this).field_Sb.d((byte) 29)) {
            ((kg) this).field_Ub.field_gb = ((kg) this).field_Ub.field_gb + param2;
            break L3;
          } else {
            break L3;
          }
        }
        if (!((kg) this).field_Sb.f((byte) 115)) {
          if (!((kg) this).field_kb) {
            L4: {
              if (!param3) {
                if (-(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb) <= -((kg) this).field_Tb.field_Lb + ((kg) this).field_Ub.field_Lb + ((kg) this).field_Ub.field_lb) {
                  if (0 <= -(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb)) {
                    break L4;
                  } else {
                    ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                    if (!((kg) this).field_Sb.k(-113)) {
                      ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                      return;
                    } else {
                      ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                      ((kg) this).field_Ub.field_gb = 0;
                      ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                      return;
                    }
                  }
                } else {
                  ((kg) this).field_Ub.field_gb = -(((kg) this).field_Ub.field_Lb + (((kg) this).field_Ub.field_lb - ((kg) this).field_Tb.field_Lb)) + -((kg) this).field_Ub.field_eb;
                  if (0 <= -(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb)) {
                    if (!((kg) this).field_Sb.k(-113)) {
                      ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                      return;
                    } else {
                      ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                      ((kg) this).field_Ub.field_gb = 0;
                      ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                      return;
                    }
                  } else {
                    ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                    if (!((kg) this).field_Sb.k(-113)) {
                      ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                      return;
                    } else {
                      ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                      ((kg) this).field_Ub.field_gb = 0;
                      ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                      return;
                    }
                  }
                }
              } else {
                L5: {
                  if (-(((kg) this).field_Ub.field_gb + ((kg) this).field_Ub.field_eb) < 0) {
                    ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (((kg) this).field_Ub.field_lb + ((kg) this).field_Ub.field_Lb + -((kg) this).field_Tb.field_Lb >= -(((kg) this).field_Ub.field_gb + ((kg) this).field_Ub.field_eb)) {
                  break L4;
                } else {
                  ((kg) this).field_Ub.field_gb = -(-((kg) this).field_Tb.field_Lb + (((kg) this).field_Ub.field_Lb - -((kg) this).field_Ub.field_lb)) - ((kg) this).field_Ub.field_eb;
                  if (!((kg) this).field_Sb.k(-113)) {
                    ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                    return;
                  } else {
                    ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                    ((kg) this).field_Ub.field_gb = 0;
                    ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                    return;
                  }
                }
              }
            }
            if (!((kg) this).field_Sb.k(-113)) {
              ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
              return;
            } else {
              ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
              ((kg) this).field_Ub.field_gb = 0;
              ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
              return;
            }
          } else {
            L6: {
              ((kg) this).field_Ub.field_gb = ((kg) this).field_Ub.field_gb - param1;
              if (!param3) {
                if (-(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb) > -((kg) this).field_Tb.field_Lb + ((kg) this).field_Ub.field_Lb + ((kg) this).field_Ub.field_lb) {
                  ((kg) this).field_Ub.field_gb = -(((kg) this).field_Ub.field_Lb + (((kg) this).field_Ub.field_lb - ((kg) this).field_Tb.field_Lb)) + -((kg) this).field_Ub.field_eb;
                  if (0 <= -(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb)) {
                    break L6;
                  } else {
                    L7: {
                      ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                      if (!((kg) this).field_Sb.k(-113)) {
                        break L7;
                      } else {
                        ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                        ((kg) this).field_Ub.field_gb = 0;
                        break L7;
                      }
                    }
                    ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                    return;
                  }
                } else {
                  L8: {
                    if (0 <= -(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb)) {
                      break L8;
                    } else {
                      ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                      break L8;
                    }
                  }
                  L9: {
                    if (!((kg) this).field_Sb.k(-113)) {
                      break L9;
                    } else {
                      ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                      ((kg) this).field_Ub.field_gb = 0;
                      break L9;
                    }
                  }
                  ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                  return;
                }
              } else {
                L10: {
                  if (-(((kg) this).field_Ub.field_gb + ((kg) this).field_Ub.field_eb) < 0) {
                    ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (((kg) this).field_Ub.field_lb + ((kg) this).field_Ub.field_Lb + -((kg) this).field_Tb.field_Lb < -(((kg) this).field_Ub.field_gb + ((kg) this).field_Ub.field_eb)) {
                  ((kg) this).field_Ub.field_gb = -(-((kg) this).field_Tb.field_Lb + (((kg) this).field_Ub.field_Lb - -((kg) this).field_Ub.field_lb)) - ((kg) this).field_Ub.field_eb;
                  break L6;
                } else {
                  L11: {
                    if (!((kg) this).field_Sb.k(-113)) {
                      break L11;
                    } else {
                      ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
                      ((kg) this).field_Ub.field_gb = 0;
                      break L11;
                    }
                  }
                  ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
                  return;
                }
              }
            }
            if (!((kg) this).field_Sb.k(-113)) {
              ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
              return;
            } else {
              ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
              ((kg) this).field_Ub.field_gb = 0;
              ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
              return;
            }
          }
        } else {
          L12: {
            ((kg) this).field_Ub.field_gb = ((kg) this).field_Ub.field_gb - param2;
            if (!((kg) this).field_kb) {
              break L12;
            } else {
              ((kg) this).field_Ub.field_gb = ((kg) this).field_Ub.field_gb - param1;
              break L12;
            }
          }
          L13: {
            if (!param3) {
              L14: {
                if (-(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb) <= -((kg) this).field_Tb.field_Lb + ((kg) this).field_Ub.field_Lb + ((kg) this).field_Ub.field_lb) {
                  break L14;
                } else {
                  ((kg) this).field_Ub.field_gb = -(((kg) this).field_Ub.field_Lb + (((kg) this).field_Ub.field_lb - ((kg) this).field_Tb.field_Lb)) + -((kg) this).field_Ub.field_eb;
                  break L14;
                }
              }
              if (0 <= -(((kg) this).field_Ub.field_eb + ((kg) this).field_Ub.field_gb)) {
                break L13;
              } else {
                ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                break L13;
              }
            } else {
              L15: {
                if (-(((kg) this).field_Ub.field_gb + ((kg) this).field_Ub.field_eb) < 0) {
                  ((kg) this).field_Ub.field_gb = -((kg) this).field_Ub.field_eb;
                  break L15;
                } else {
                  break L15;
                }
              }
              if (((kg) this).field_Ub.field_lb + ((kg) this).field_Ub.field_Lb + -((kg) this).field_Tb.field_Lb >= -(((kg) this).field_Ub.field_gb + ((kg) this).field_Ub.field_eb)) {
                break L13;
              } else {
                ((kg) this).field_Ub.field_gb = -(-((kg) this).field_Tb.field_Lb + (((kg) this).field_Ub.field_Lb - -((kg) this).field_Ub.field_lb)) - ((kg) this).field_Ub.field_eb;
                break L13;
              }
            }
          }
          L16: {
            if (!((kg) this).field_Sb.k(-113)) {
              break L16;
            } else {
              ((kg) this).field_Ub.field_eb = -((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, param3, ((kg) this).field_Ub.field_Lb, (byte) 35);
              ((kg) this).field_Ub.field_gb = 0;
              break L16;
            }
          }
          ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, param0 + -97);
          return;
        }
    }

    kg(String param0, gh param1, gh param2, lb param3) {
        this(ke.a((CharSequence) (Object) param0, (byte) -48), param1, param2, param3);
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param3.getGraphics();
                sb.field_bb.a((byte) -51, var4, 0, 0);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("kg.D(").append(0).append(',').append(0).append(',').append(28594).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, boolean param4, byte param5) {
        if (param5 != -41) {
            return false;
        }
        return this.a(param2, param4, 114, param1, param0, ((kg) this).field_Tb.field_Lb, param3);
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (0 >= param1) {
                L2: {
                  if (param2 == 22025) {
                    break L2;
                  } else {
                    field_Vb = 1;
                    break L2;
                  }
                }
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << 1;
                param1--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "kg.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((kg) this).field_Lb = param3;
        if (param1 != -2048) {
          ((kg) this).field_Tb = null;
          ((kg) this).field_zb = param0;
          ((kg) this).field_Y = param5;
          ((kg) this).field_eb = param6;
          this.a(param2, param4, (byte) 126);
          return;
        } else {
          ((kg) this).field_zb = param0;
          ((kg) this).field_Y = param5;
          ((kg) this).field_eb = param6;
          this.a(param2, param4, (byte) 126);
          return;
        }
    }

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = param0 & 8191;
        if (param1 < -67) {
          if (param0 < 4096) {
            L0: {
              if (2048 > param0) {
                stackOut_18_0 = hk.field_Zb[2048 + -param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -hk.field_Zb[param0 + -2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 >= 6144) {
                stackOut_14_0 = hk.field_Zb[-6144 + param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -hk.field_Zb[-param0 + 6144];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          int discarded$1 = kg.a(61, 53, -111);
          if (param0 < 4096) {
            L2: {
              if (2048 > param0) {
                stackOut_8_0 = hk.field_Zb[2048 + -param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -hk.field_Zb[param0 + -2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 >= 6144) {
                stackOut_4_0 = hk.field_Zb[-6144 + param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -hk.field_Zb[-param0 + 6144];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    kg(long param0, gh param1, gh param2, lb param3) {
        super(param0, (gh) null);
        try {
            ((kg) this).field_Tb = new gh(0L, param2);
            ((kg) this).field_Sb = new lb(0L, param3);
            ((kg) this).a(((kg) this).field_Tb, 125);
            ((kg) this).a((gh) (Object) ((kg) this).field_Sb, 119);
            ((kg) this).field_Ub = param1;
            ((kg) this).field_Tb.a(param1, 123);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "kg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(byte param0) {
        if (!jn.field_g) {
            return false;
        }
        if (0 != ib.field_b) {
            return false;
        }
        if (param0 <= 35) {
            field_Vb = 77;
            return true;
        }
        return true;
    }

    final static void a(int param0, mi param1, mi param2, int param3) {
        try {
            ud.field_C = 480;
            pa.field_k = param2;
            wb.field_a = param1;
            sf.a(74, pb.field_c / 2, pb.field_j / 2);
            he.a(false, param2.field_U, param1.field_U, param2.field_U - -param2.field_F, param1.field_F + param1.field_U);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "kg.B(" + 2048 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 480 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        ((kg) this).field_Ub.field_Y = 0;
        ((kg) this).field_Tb.field_zb = -param1 + ((kg) this).field_zb - param0;
        ((kg) this).field_Tb.field_Lb = ((kg) this).field_Lb;
        ((kg) this).field_Ub.field_zb = -param0 + (((kg) this).field_zb + -param1);
        ((kg) this).field_Sb.a(((kg) this).field_Tb.field_Lb, -((kg) this).field_Ub.field_eb, ((kg) this).field_Ub.field_Lb, -param0 + ((kg) this).field_zb, 0, param0, ((kg) this).field_Lb, 4454);
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        if (!param6) {
            if (!((kg) this).field_kb) {
                var8 = 0;
                ((kg) this).field_Ub.a(((kg) this).field_Tb.field_Lb, (byte) -108, param4, var8 != 0);
                ((kg) this).a((byte) 96, param0, param5, false, param3);
                return var8 != 0;
            }
            if (param1) {
                var8 = 0;
                ((kg) this).field_Ub.a(((kg) this).field_Tb.field_Lb, (byte) -108, param4, var8 != 0);
                ((kg) this).a((byte) 96, param0, param5, false, param3);
                return var8 != 0;
            }
            var8 = 1;
            ((kg) this).field_Ub.a(((kg) this).field_Tb.field_Lb, (byte) -108, param4, var8 != 0);
            ((kg) this).a((byte) 96, param0, param5, false, param3);
            return var8 != 0;
        }
        var8 = 1;
        ((kg) this).field_Ub.a(((kg) this).field_Tb.field_Lb, (byte) -108, param4, var8 != 0);
        ((kg) this).a((byte) 96, param0, param5, false, param3);
        return var8 != 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((kg) this).a((byte) 96, param3, ((kg) this).field_Tb.field_Lb, param0, param2);
        if (param1 != 8113) {
            ((kg) this).field_Tb = null;
        }
    }

    static {
    }
}
