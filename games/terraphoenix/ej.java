/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ej extends eb {
    private long field_P;
    private int field_L;
    static int field_V;
    static String field_R;
    static String field_N;
    private boolean field_W;
    private long field_Q;
    private int field_T;
    private boolean field_O;
    private int field_K;
    private int field_U;
    static jh field_M;
    static int field_S;

    private final void a(byte param0, int param1) {
        if (param0 != 19) {
          L0: {
            ((ej) this).field_Q = -34L;
            ((ej) this).field_K = param1;
            if (!bh.field_e[81]) {
              ((ej) this).field_T = ((ej) this).field_K;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((ej) this).field_K = param1;
            if (!bh.field_e[81]) {
              ((ej) this).field_T = ((ej) this).field_K;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void g(int param0) {
        if (param0 != -18369) {
          field_M = null;
          this.h(-1);
          this.i((byte) 71);
          return;
        } else {
          this.h(-1);
          this.i((byte) 71);
          return;
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        if (param0 != 14653) {
            String discarded$0 = ej.f((byte) 110);
            field_M = null;
            return;
        }
        field_M = null;
    }

    final static String f(byte param0) {
        if (param0 != -30) {
            String discarded$0 = ej.g((byte) -11);
            return fg.field_e;
        }
        return fg.field_e;
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        if (param1 == -3) {
          L0: {
            if (((ej) this).field_U != -1) {
              var3 = ((ej) this).field_U + -((ej) this).field_o.length();
              if (var3 >= 0) {
                return;
              } else {
                param0 = param0.substring(0, var3);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (((ej) this).field_K == ((ej) this).field_o.length()) {
            ((ej) this).field_o = ((ej) this).field_o + param0;
            ((ej) this).field_K = ((ej) this).field_K + param0.length();
            ((ej) this).field_T = ((ej) this).field_K;
            ((ej) this).i(124);
            return;
          } else {
            ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_K) + param0 + ((ej) this).field_o.substring(((ej) this).field_K, ((ej) this).field_o.length());
            ((ej) this).field_K = ((ej) this).field_K + param0.length();
            ((ej) this).field_T = ((ej) this).field_K;
            ((ej) this).i(124);
            return;
          }
        } else {
          return;
        }
    }

    void i(int param0) {
        L0: {
          if (((ej) this).field_r instanceof pa) {
            ((pa) (Object) ((ej) this).field_r).a((ej) this, (byte) 83);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 121) {
          String discarded$2 = ej.f((byte) 77);
          return;
        } else {
          return;
        }
    }

    private final void n(int param0) {
        if (param0 <= -69) {
          if (((ej) this).field_r instanceof pa) {
            ((pa) (Object) ((ej) this).field_r).a((ej) this, false);
            return;
          } else {
            return;
          }
        } else {
          field_M = null;
          if (!(((ej) this).field_r instanceof pa)) {
            return;
          } else {
            ((pa) (Object) ((ej) this).field_r).a((ej) this, false);
            return;
          }
        }
    }

    final static void a(int param0, int param1, dh param2, int param3, int param4) {
        Object var6 = null;
        param2.i(12, param1 + 25544);
        param2.h(-1564407352, 17);
        param2.h(-1564407352, param0);
        param2.h(param1 ^ 1564382701, param4);
        if (param1 != -25563) {
          var6 = null;
          ej.a(-21, (java.awt.Canvas) null);
          param2.i(param3, 24);
          return;
        } else {
          param2.i(param3, 24);
          return;
        }
    }

    private final void j(byte param0) {
        ld var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        w var10 = null;
        var8 = Terraphoenix.field_V;
        if (((ej) this).field_W) {
          if (!(((ej) this).field_l instanceof w)) {
            return;
          } else {
            var10 = (w) (Object) ((ej) this).field_l;
            var3 = var10.a((gl) this, -19302);
            var4 = var3.b(0);
            var5 = var10.a(28889, (gl) this);
            var6 = var10.a(8233) >> 778061729;
            if (var5 - var6 <= var4) {
              if (param0 > 81) {
                var7 = ((ej) this).field_y + var3.a(((ej) this).field_K, 0);
                if (var5 - var6 >= var7) {
                  if (var7 < var6) {
                    ((ej) this).field_y = var6 - (var7 - ((ej) this).field_y);
                    if (-1 <= (((ej) this).field_y ^ -1)) {
                      if (((ej) this).field_y < -var5 - -var6) {
                        ((ej) this).field_y = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ej) this).field_y = 0;
                      return;
                    }
                  } else {
                    if (-1 <= (((ej) this).field_y ^ -1)) {
                      if (((ej) this).field_y < -var5 - -var6) {
                        ((ej) this).field_y = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ej) this).field_y = 0;
                      return;
                    }
                  }
                } else {
                  ((ej) this).field_y = ((ej) this).field_y - (var7 + (-var5 - -var6));
                  if (-1 <= (((ej) this).field_y ^ -1)) {
                    if (((ej) this).field_y >= -var5 - -var6) {
                      return;
                    } else {
                      ((ej) this).field_y = var6 + -var5;
                      return;
                    }
                  } else {
                    ((ej) this).field_y = 0;
                    return;
                  }
                }
              } else {
                L0: {
                  var9 = null;
                  ((ej) this).a(false, (byte) -128, (String) null);
                  var7 = ((ej) this).field_y + var3.a(((ej) this).field_K, 0);
                  if (var5 - var6 >= var7) {
                    if (var7 < var6) {
                      ((ej) this).field_y = var6 - (var7 - ((ej) this).field_y);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((ej) this).field_y = ((ej) this).field_y - (var7 + (-var5 - -var6));
                    break L0;
                  }
                }
                if (-1 <= (((ej) this).field_y ^ -1)) {
                  if (((ej) this).field_y >= -var5 - -var6) {
                    return;
                  } else {
                    ((ej) this).field_y = var6 + -var5;
                    return;
                  }
                } else {
                  ((ej) this).field_y = 0;
                  return;
                }
              }
            } else {
              ((ej) this).field_y = 0;
              ((ej) this).field_v = 0;
              return;
            }
          }
        } else {
          ((ej) this).field_v = 0;
          ((ej) this).field_y = 0;
          return;
        }
    }

    private final void i(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -110 % ((param0 - -9) / 63);
        if (!(((ej) this).field_T == ((ej) this).field_K)) {
            var3 = ((ej) this).field_T >= ((ej) this).field_K ? ((ej) this).field_K : ((ej) this).field_T;
            var4 = ((ej) this).field_K > ((ej) this).field_T ? ((ej) this).field_K : ((ej) this).field_T;
            ((ej) this).field_K = var3;
            ((ej) this).field_T = var3;
            ((ej) this).field_o = ((ej) this).field_o.substring(0, var3) + ((ej) this).field_o.substring(var4, ((ej) this).field_o.length());
            ((ej) this).i(126);
        }
    }

    private final String j(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((ej) this).field_T >= ((ej) this).field_K) {
            stackOut_2_0 = ((ej) this).field_K;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((ej) this).field_T;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 != -18031) {
          L1: {
            var4 = null;
            ej.a(-116, -28, (dh) null, 31, 71);
            if (((ej) this).field_T >= ((ej) this).field_K) {
              stackOut_10_0 = ((ej) this).field_T;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = ((ej) this).field_K;
              stackIn_11_0 = stackOut_9_0;
              break L1;
            }
          }
          var3 = stackIn_11_0;
          return ((ej) this).field_o.substring(var2, var3);
        } else {
          L2: {
            if (((ej) this).field_T >= ((ej) this).field_K) {
              stackOut_6_0 = ((ej) this).field_T;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            } else {
              stackOut_5_0 = ((ej) this).field_K;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
          }
          var3 = stackIn_7_0;
          return ((ej) this).field_o.substring(var2, var3);
        }
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        var2 = ((ej) this).field_o.length();
        if (var2 != ((ej) this).field_K) {
          var3 = ((ej) this).field_K + param0;
          L0: while (true) {
            if (var2 > var3) {
              if (((ej) this).field_o.charAt(var3 + -1) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((ej) this).field_K;
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        int var4 = 0;
        L0: {
          if (param2 == null) {
            param2 = "";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((ej) this).field_o = param2;
          var4 = param2.length();
          if (-1 == ((ej) this).field_U) {
            break L1;
          } else {
            if (((ej) this).field_U < var4) {
              ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_U);
              break L1;
            } else {
              if (param1 < -117) {
                L2: {
                  ((ej) this).field_T = ((ej) this).field_o.length();
                  ((ej) this).field_K = ((ej) this).field_o.length();
                  if (!param0) {
                    ((ej) this).i(122);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L3: {
                  field_S = -91;
                  ((ej) this).field_T = ((ej) this).field_o.length();
                  ((ej) this).field_K = ((ej) this).field_o.length();
                  if (!param0) {
                    ((ej) this).i(122);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
        if (param1 >= -117) {
          L4: {
            field_S = -91;
            ((ej) this).field_T = ((ej) this).field_o.length();
            ((ej) this).field_K = ((ej) this).field_o.length();
            if (!param0) {
              ((ej) this).i(122);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            ((ej) this).field_T = ((ej) this).field_o.length();
            ((ej) this).field_K = ((ej) this).field_o.length();
            if (!param0) {
              ((ej) this).i(122);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    private final void h(int param0) {
        String var2 = this.j(-18031);
        if (!((var2.length() ^ -1) >= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(-18031)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(gl param0, int param1, int param2, int param3) {
        int var6 = 0;
        w var8 = null;
        w var9 = null;
        if (param3 >= 25) {
          super.a(param0, param1, param2, 86);
          this.j((byte) 105);
          if ((((ej) this).field_j ^ -1) == -2) {
            if (((ej) this).field_l instanceof w) {
              var9 = (w) (Object) ((ej) this).field_l;
              var6 = var9.a(ef.field_j, -3477, jb.field_b, (gl) this, param1, param2);
              if (0 == (var6 ^ -1)) {
                ((ej) this).field_P = ll.a(1000);
                return;
              } else {
                L0: {
                  if (!((ej) this).field_O) {
                    break L0;
                  } else {
                    if (var6 >= ((ej) this).field_L) {
                      break L0;
                    } else {
                      if (((ej) this).field_T >= var6) {
                        break L0;
                      } else {
                        var6 = ((ej) this).field_L;
                        break L0;
                      }
                    }
                  }
                }
                ((ej) this).field_K = var6;
                ((ej) this).field_P = ll.a(1000);
                return;
              }
            } else {
              ((ej) this).field_P = ll.a(1000);
              return;
            }
          } else {
            return;
          }
        } else {
          ej.m(-23);
          super.a(param0, param1, param2, 86);
          this.j((byte) 105);
          if ((((ej) this).field_j ^ -1) == -2) {
            if (!(((ej) this).field_l instanceof w)) {
              ((ej) this).field_P = ll.a(1000);
              return;
            } else {
              L1: {
                var8 = (w) (Object) ((ej) this).field_l;
                var6 = var8.a(ef.field_j, -3477, jb.field_b, (gl) this, param1, param2);
                if (0 != (var6 ^ -1)) {
                  L2: {
                    if (!((ej) this).field_O) {
                      break L2;
                    } else {
                      if (var6 >= ((ej) this).field_L) {
                        break L2;
                      } else {
                        if (((ej) this).field_T >= var6) {
                          break L2;
                        } else {
                          var6 = ((ej) this).field_L;
                          break L2;
                        }
                      }
                    }
                  }
                  ((ej) this).field_K = var6;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ej) this).field_P = ll.a(1000);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        w var8 = null;
        if (((ej) this).field_l != null) {
          if (param2 == 0) {
            ((ej) this).field_l.a(param3, (gl) this, param0, -24381, ((ej) this).field_A);
            if (((ej) this).field_l instanceof w) {
              L0: {
                var8 = (w) (Object) ((ej) this).field_l;
                if (((ej) this).field_K != ((ej) this).field_T) {
                  var8.b(0, param3, param0, (gl) this, ((ej) this).field_K, ((ej) this).field_T);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = ll.a(1000);
              if (((var6 - ((ej) this).field_P) % 1000L ^ -1L) <= -501L) {
                if (param1 >= -106) {
                  ((ej) this).field_T = -91;
                  return;
                } else {
                  return;
                }
              } else {
                var8.a(((ej) this).field_K, param3, (gl) this, param0, -32135);
                if (param1 >= -106) {
                  ((ej) this).field_T = -91;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 >= -106) {
                ((ej) this).field_T = -91;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 < -106) {
              return;
            } else {
              ((ej) this).field_T = -91;
              return;
            }
          }
        } else {
          if (param1 >= -106) {
            ((ej) this).field_T = -91;
            return;
          } else {
            return;
          }
        }
    }

    private final void h(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var3 = -54 % ((0 - param0) / 62);
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              this.i((byte) -91);
              this.a(var2, (byte) -3);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ej(String param0, sc param1, int param2) {
        super(param0, param1);
        ((ej) this).field_L = -1;
        ((ej) this).field_O = false;
        ((ej) this).field_Q = 0L;
        ((ej) this).field_l = vc.field_c.field_i;
        ((ej) this).field_U = param2;
        ((ej) this).a(true, (byte) -120, param0);
        ((ej) this).field_W = true;
        ((ej) this).field_P = ll.a(1000);
    }

    final void k(int param0) {
        Object var3 = null;
        ((ej) this).field_o = "";
        ((ej) this).field_K = 0;
        ((ej) this).field_T = 0;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((ej) this).a(false, 4, -51, -52, -78, (gl) null, 121);
          ((ej) this).i(122);
          return;
        } else {
          ((ej) this).i(122);
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 != -12966) {
          L0: {
            String discarded$9 = ej.g((byte) -119);
            if (11 == q.field_Jb) {
              ta.a(54);
              break L0;
            } else {
              break L0;
            }
          }
          pg.a(ed.field_d, da.field_f, ad.field_e, 101);
          ia.a(0, param1, 0, (byte) 116);
          return;
        } else {
          L1: {
            if (11 == q.field_Jb) {
              ta.a(54);
              break L1;
            } else {
              break L1;
            }
          }
          pg.a(ed.field_d, da.field_f, ad.field_e, 101);
          ia.a(0, param1, 0, (byte) 116);
          return;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (param0) {
            return false;
          } else {
            return false;
          }
        } else {
          if (((ej) this).field_l instanceof w) {
            L0: {
              var8_int = ((w) (Object) ((ej) this).field_l).a(ef.field_j, -3477, jb.field_b, (gl) this, param2, param3);
              stackOut_6_0 = this;
              stackOut_6_1 = 19;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              if (var8_int != -1) {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = var8_int;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                break L0;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                break L0;
              }
            }
            L1: {
              this.a((byte) stackIn_9_1, stackIn_9_2);
              var8 = ll.a(1000);
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (250L <= -((ej) this).field_Q + var8) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L1;
              }
            }
            ((ej) this).field_O = stackIn_12_1 != 0;
            if (((ej) this).field_O) {
              ((ej) this).field_T = this.l(-1);
              ((ej) this).field_K = this.o(1);
              if (-1 > (((ej) this).field_K ^ -1)) {
                if (32 != ((ej) this).field_o.charAt(((ej) this).field_K + -1)) {
                  ((ej) this).field_L = ((ej) this).field_K;
                  ((ej) this).field_Q = var8;
                  return true;
                } else {
                  ((ej) this).field_K = ((ej) this).field_K - 1;
                  ((ej) this).field_L = ((ej) this).field_K;
                  ((ej) this).field_Q = var8;
                  return true;
                }
              } else {
                ((ej) this).field_L = ((ej) this).field_K;
                ((ej) this).field_Q = var8;
                return true;
              }
            } else {
              ((ej) this).field_Q = var8;
              return true;
            }
          } else {
            if (param0) {
              return false;
            } else {
              return false;
            }
          }
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if ((((ej) this).field_K ^ -1) != param0) {
          var2 = ((ej) this).field_K + -1;
          L0: while (true) {
            if (0 < var2) {
              if (((ej) this).field_o.charAt(var2 - 1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((ej) this).field_K;
        }
    }

    final static String g(byte param0) {
        if (kj.field_f == null) {
            return "";
        }
        int var1 = -71 / ((67 - param0) / 55);
        return kj.field_f;
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        Object stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        Object stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        Object stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        Object stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        Object stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        Object stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        int stackIn_173_2 = 0;
        Object stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        Object stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        int stackOut_172_2 = 0;
        Object stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        int stackOut_171_2 = 0;
        Object stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        Object stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        ((ej) this).field_P = ll.a(1000);
        if (60 != param0) {
          if (param0 != 62) {
            if (param2 == 30) {
              if (param0 >= 32) {
                if (param0 <= 126) {
                  if (((ej) this).field_T == ((ej) this).field_K) {
                    L0: {
                      if (((ej) this).field_U == -1) {
                        break L0;
                      } else {
                        if (((ej) this).field_o.length() < ((ej) this).field_U) {
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (((ej) this).field_K < ((ej) this).field_o.length()) {
                      ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_K) + param0 + ((ej) this).field_o.substring(((ej) this).field_K, ((ej) this).field_o.length());
                      ((ej) this).field_K = ((ej) this).field_K + 1;
                      ((ej) this).field_T = ((ej) this).field_K;
                      ((ej) this).i(127);
                      return true;
                    } else {
                      ((ej) this).field_o = ((ej) this).field_o + param0;
                      ((ej) this).field_K = ((ej) this).field_o.length();
                      ((ej) this).field_T = ((ej) this).field_o.length();
                      ((ej) this).i(127);
                      return true;
                    }
                  } else {
                    L1: {
                      L2: {
                        this.i((byte) 62);
                        if (((ej) this).field_U == -1) {
                          break L2;
                        } else {
                          if (((ej) this).field_o.length() < ((ej) this).field_U) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      if (((ej) this).field_K < ((ej) this).field_o.length()) {
                        ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_K) + param0 + ((ej) this).field_o.substring(((ej) this).field_K, ((ej) this).field_o.length());
                        ((ej) this).field_K = ((ej) this).field_K + 1;
                        ((ej) this).field_T = ((ej) this).field_K;
                        ((ej) this).i(127);
                        break L1;
                      } else {
                        ((ej) this).field_o = ((ej) this).field_o + param0;
                        ((ej) this).field_K = ((ej) this).field_o.length();
                        ((ej) this).field_T = ((ej) this).field_o.length();
                        ((ej) this).i(127);
                        break L1;
                      }
                    }
                    return true;
                  }
                } else {
                  L3: {
                    if (param3 == 85) {
                      if (((ej) this).field_K == ((ej) this).field_T) {
                        if (((ej) this).field_K > 0) {
                          ((ej) this).field_T = ((ej) this).field_K - 1;
                          this.i((byte) 72);
                          return true;
                        } else {
                          break L3;
                        }
                      } else {
                        this.i((byte) -82);
                        return true;
                      }
                    } else {
                      if ((param3 ^ -1) != -102) {
                        if (param3 != -14) {
                          if (-97 != param3) {
                            if ((param3 ^ -1) == -98) {
                              if (((ej) this).field_K >= ((ej) this).field_o.length()) {
                                break L3;
                              } else {
                                L4: {
                                  stackOut_170_0 = this;
                                  stackOut_170_1 = 19;
                                  stackIn_172_0 = stackOut_170_0;
                                  stackIn_172_1 = stackOut_170_1;
                                  stackIn_171_0 = stackOut_170_0;
                                  stackIn_171_1 = stackOut_170_1;
                                  if (bh.field_e[82]) {
                                    stackOut_172_0 = this;
                                    stackOut_172_1 = stackIn_172_1;
                                    stackOut_172_2 = this.o(1);
                                    stackIn_173_0 = stackOut_172_0;
                                    stackIn_173_1 = stackOut_172_1;
                                    stackIn_173_2 = stackOut_172_2;
                                    break L4;
                                  } else {
                                    stackOut_171_0 = this;
                                    stackOut_171_1 = stackIn_171_1;
                                    stackOut_171_2 = 1 + ((ej) this).field_K;
                                    stackIn_173_0 = stackOut_171_0;
                                    stackIn_173_1 = stackOut_171_1;
                                    stackIn_173_2 = stackOut_171_2;
                                    break L4;
                                  }
                                }
                                this.a((byte) stackIn_173_1, stackIn_173_2);
                                return true;
                              }
                            } else {
                              if ((param3 ^ -1) != -103) {
                                if ((param3 ^ -1) != -104) {
                                  if (param3 != 84) {
                                    if (!bh.field_e[82]) {
                                      L5: {
                                        if (!bh.field_e[82]) {
                                          break L5;
                                        } else {
                                          if (-67 != (param3 ^ -1)) {
                                            break L5;
                                          } else {
                                            this.h(param2 + -31);
                                            return true;
                                          }
                                        }
                                      }
                                      if (!bh.field_e[82]) {
                                        break L3;
                                      } else {
                                        if (67 != param3) {
                                          break L3;
                                        } else {
                                          this.h((byte) -85);
                                          return true;
                                        }
                                      }
                                    } else {
                                      if (param3 != 65) {
                                        L6: {
                                          if (!bh.field_e[82]) {
                                            break L6;
                                          } else {
                                            if (-67 != (param3 ^ -1)) {
                                              break L6;
                                            } else {
                                              this.h(param2 + -31);
                                              return true;
                                            }
                                          }
                                        }
                                        if (bh.field_e[82]) {
                                          if (67 == param3) {
                                            this.h((byte) -85);
                                            return true;
                                          } else {
                                            return false;
                                          }
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        this.g(param2 ^ -18399);
                                        return true;
                                      }
                                    }
                                  } else {
                                    this.n(-79);
                                    return true;
                                  }
                                } else {
                                  this.a((byte) 19, ((ej) this).field_o.length());
                                  return true;
                                }
                              } else {
                                this.a((byte) 19, 0);
                                return true;
                              }
                            }
                          } else {
                            if (((ej) this).field_K > 0) {
                              L7: {
                                stackOut_139_0 = this;
                                stackOut_139_1 = 19;
                                stackIn_141_0 = stackOut_139_0;
                                stackIn_141_1 = stackOut_139_1;
                                stackIn_140_0 = stackOut_139_0;
                                stackIn_140_1 = stackOut_139_1;
                                if (!bh.field_e[82]) {
                                  stackOut_141_0 = this;
                                  stackOut_141_1 = stackIn_141_1;
                                  stackOut_141_2 = -1 + ((ej) this).field_K;
                                  stackIn_142_0 = stackOut_141_0;
                                  stackIn_142_1 = stackOut_141_1;
                                  stackIn_142_2 = stackOut_141_2;
                                  break L7;
                                } else {
                                  stackOut_140_0 = this;
                                  stackOut_140_1 = stackIn_140_1;
                                  stackOut_140_2 = this.l(-1);
                                  stackIn_142_0 = stackOut_140_0;
                                  stackIn_142_1 = stackOut_140_1;
                                  stackIn_142_2 = stackOut_140_2;
                                  break L7;
                                }
                              }
                              this.a((byte) stackIn_142_1, stackIn_142_2);
                              return true;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          ((ej) this).k(-1);
                          return true;
                        }
                      } else {
                        if (((ej) this).field_T == ((ej) this).field_K) {
                          if (((ej) this).field_K < ((ej) this).field_o.length()) {
                            ((ej) this).field_T = ((ej) this).field_K + 1;
                            this.i((byte) -102);
                            return true;
                          } else {
                            break L3;
                          }
                        } else {
                          this.i((byte) -102);
                          return true;
                        }
                      }
                    }
                  }
                  return false;
                }
              } else {
                L8: {
                  if (param3 == 85) {
                    if (((ej) this).field_K == ((ej) this).field_T) {
                      if (((ej) this).field_K > 0) {
                        ((ej) this).field_T = ((ej) this).field_K - 1;
                        this.i((byte) 72);
                        return true;
                      } else {
                        break L8;
                      }
                    } else {
                      this.i((byte) -82);
                      return true;
                    }
                  } else {
                    if ((param3 ^ -1) != -102) {
                      if (param3 != -14) {
                        if (-97 != param3) {
                          if ((param3 ^ -1) == -98) {
                            if (((ej) this).field_K >= ((ej) this).field_o.length()) {
                              return false;
                            } else {
                              L9: {
                                stackOut_114_0 = this;
                                stackOut_114_1 = 19;
                                stackIn_116_0 = stackOut_114_0;
                                stackIn_116_1 = stackOut_114_1;
                                stackIn_115_0 = stackOut_114_0;
                                stackIn_115_1 = stackOut_114_1;
                                if (bh.field_e[82]) {
                                  stackOut_116_0 = this;
                                  stackOut_116_1 = stackIn_116_1;
                                  stackOut_116_2 = this.o(1);
                                  stackIn_117_0 = stackOut_116_0;
                                  stackIn_117_1 = stackOut_116_1;
                                  stackIn_117_2 = stackOut_116_2;
                                  break L9;
                                } else {
                                  stackOut_115_0 = this;
                                  stackOut_115_1 = stackIn_115_1;
                                  stackOut_115_2 = 1 + ((ej) this).field_K;
                                  stackIn_117_0 = stackOut_115_0;
                                  stackIn_117_1 = stackOut_115_1;
                                  stackIn_117_2 = stackOut_115_2;
                                  break L9;
                                }
                              }
                              this.a((byte) stackIn_117_1, stackIn_117_2);
                              return true;
                            }
                          } else {
                            if ((param3 ^ -1) != -103) {
                              if ((param3 ^ -1) != -104) {
                                if (param3 != 84) {
                                  if (!bh.field_e[82]) {
                                    L10: {
                                      if (!bh.field_e[82]) {
                                        break L10;
                                      } else {
                                        if (-67 != (param3 ^ -1)) {
                                          break L10;
                                        } else {
                                          this.h(param2 + -31);
                                          return true;
                                        }
                                      }
                                    }
                                    if (bh.field_e[82]) {
                                      if (67 != param3) {
                                        return false;
                                      } else {
                                        this.h((byte) -85);
                                        return true;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    if (param3 != 65) {
                                      L11: {
                                        if (!bh.field_e[82]) {
                                          break L11;
                                        } else {
                                          if (-67 != (param3 ^ -1)) {
                                            break L11;
                                          } else {
                                            this.h(param2 + -31);
                                            return true;
                                          }
                                        }
                                      }
                                      if (bh.field_e[82]) {
                                        if (67 != param3) {
                                          return false;
                                        } else {
                                          this.h((byte) -85);
                                          return true;
                                        }
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      this.g(param2 ^ -18399);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.n(-79);
                                  return true;
                                }
                              } else {
                                this.a((byte) 19, ((ej) this).field_o.length());
                                return true;
                              }
                            } else {
                              this.a((byte) 19, 0);
                              return true;
                            }
                          }
                        } else {
                          if (((ej) this).field_K > 0) {
                            L12: {
                              stackOut_81_0 = this;
                              stackOut_81_1 = 19;
                              stackIn_83_0 = stackOut_81_0;
                              stackIn_83_1 = stackOut_81_1;
                              stackIn_82_0 = stackOut_81_0;
                              stackIn_82_1 = stackOut_81_1;
                              if (!bh.field_e[82]) {
                                stackOut_83_0 = this;
                                stackOut_83_1 = stackIn_83_1;
                                stackOut_83_2 = -1 + ((ej) this).field_K;
                                stackIn_84_0 = stackOut_83_0;
                                stackIn_84_1 = stackOut_83_1;
                                stackIn_84_2 = stackOut_83_2;
                                break L12;
                              } else {
                                stackOut_82_0 = this;
                                stackOut_82_1 = stackIn_82_1;
                                stackOut_82_2 = this.l(-1);
                                stackIn_84_0 = stackOut_82_0;
                                stackIn_84_1 = stackOut_82_1;
                                stackIn_84_2 = stackOut_82_2;
                                break L12;
                              }
                            }
                            this.a((byte) stackIn_84_1, stackIn_84_2);
                            return true;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        ((ej) this).k(-1);
                        return true;
                      }
                    } else {
                      if (((ej) this).field_T == ((ej) this).field_K) {
                        if (((ej) this).field_K < ((ej) this).field_o.length()) {
                          ((ej) this).field_T = ((ej) this).field_K + 1;
                          this.i((byte) -102);
                          return true;
                        } else {
                          break L8;
                        }
                      } else {
                        this.i((byte) -102);
                        return true;
                      }
                    }
                  }
                }
                return false;
              }
            } else {
              L13: {
                this.h(121);
                if (param0 < 32) {
                  break L13;
                } else {
                  if (param0 > 126) {
                    break L13;
                  } else {
                    L14: {
                      if (((ej) this).field_T == ((ej) this).field_K) {
                        break L14;
                      } else {
                        this.i((byte) 62);
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        if (((ej) this).field_U == -1) {
                          break L16;
                        } else {
                          if (((ej) this).field_o.length() < ((ej) this).field_U) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (((ej) this).field_K < ((ej) this).field_o.length()) {
                        ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_K) + param0 + ((ej) this).field_o.substring(((ej) this).field_K, ((ej) this).field_o.length());
                        ((ej) this).field_K = ((ej) this).field_K + 1;
                        ((ej) this).field_T = ((ej) this).field_K;
                        ((ej) this).i(127);
                        break L15;
                      } else {
                        ((ej) this).field_o = ((ej) this).field_o + param0;
                        ((ej) this).field_K = ((ej) this).field_o.length();
                        ((ej) this).field_T = ((ej) this).field_o.length();
                        ((ej) this).i(127);
                        break L15;
                      }
                    }
                    return true;
                  }
                }
              }
              L17: {
                if (param3 == 85) {
                  if (((ej) this).field_K == ((ej) this).field_T) {
                    if (((ej) this).field_K > 0) {
                      ((ej) this).field_T = ((ej) this).field_K - 1;
                      this.i((byte) 72);
                      return true;
                    } else {
                      break L17;
                    }
                  } else {
                    this.i((byte) -82);
                    return true;
                  }
                } else {
                  if ((param3 ^ -1) != -102) {
                    if (param3 != -14) {
                      if (-97 != param3) {
                        if ((param3 ^ -1) == -98) {
                          if (((ej) this).field_K < ((ej) this).field_o.length()) {
                            L18: {
                              stackOut_57_0 = this;
                              stackOut_57_1 = 19;
                              stackIn_59_0 = stackOut_57_0;
                              stackIn_59_1 = stackOut_57_1;
                              stackIn_58_0 = stackOut_57_0;
                              stackIn_58_1 = stackOut_57_1;
                              if (bh.field_e[82]) {
                                stackOut_59_0 = this;
                                stackOut_59_1 = stackIn_59_1;
                                stackOut_59_2 = this.o(1);
                                stackIn_60_0 = stackOut_59_0;
                                stackIn_60_1 = stackOut_59_1;
                                stackIn_60_2 = stackOut_59_2;
                                break L18;
                              } else {
                                stackOut_58_0 = this;
                                stackOut_58_1 = stackIn_58_1;
                                stackOut_58_2 = 1 + ((ej) this).field_K;
                                stackIn_60_0 = stackOut_58_0;
                                stackIn_60_1 = stackOut_58_1;
                                stackIn_60_2 = stackOut_58_2;
                                break L18;
                              }
                            }
                            this.a((byte) stackIn_60_1, stackIn_60_2);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          if ((param3 ^ -1) != -103) {
                            if ((param3 ^ -1) != -104) {
                              if (param3 != 84) {
                                L19: {
                                  if (!bh.field_e[82]) {
                                    break L19;
                                  } else {
                                    if (param3 != 65) {
                                      break L19;
                                    } else {
                                      this.g(param2 ^ -18399);
                                      return true;
                                    }
                                  }
                                }
                                L20: {
                                  if (!bh.field_e[82]) {
                                    break L20;
                                  } else {
                                    if (-67 != (param3 ^ -1)) {
                                      break L20;
                                    } else {
                                      this.h(param2 + -31);
                                      return true;
                                    }
                                  }
                                }
                                if (bh.field_e[82]) {
                                  if (67 == param3) {
                                    this.h((byte) -85);
                                    return true;
                                  } else {
                                    return false;
                                  }
                                } else {
                                  return false;
                                }
                              } else {
                                this.n(-79);
                                return true;
                              }
                            } else {
                              this.a((byte) 19, ((ej) this).field_o.length());
                              return true;
                            }
                          } else {
                            this.a((byte) 19, 0);
                            return true;
                          }
                        }
                      } else {
                        if (((ej) this).field_K > 0) {
                          L21: {
                            stackOut_31_0 = this;
                            stackOut_31_1 = 19;
                            stackIn_33_0 = stackOut_31_0;
                            stackIn_33_1 = stackOut_31_1;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            if (!bh.field_e[82]) {
                              stackOut_33_0 = this;
                              stackOut_33_1 = stackIn_33_1;
                              stackOut_33_2 = -1 + ((ej) this).field_K;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              stackIn_34_2 = stackOut_33_2;
                              break L21;
                            } else {
                              stackOut_32_0 = this;
                              stackOut_32_1 = stackIn_32_1;
                              stackOut_32_2 = this.l(-1);
                              stackIn_34_0 = stackOut_32_0;
                              stackIn_34_1 = stackOut_32_1;
                              stackIn_34_2 = stackOut_32_2;
                              break L21;
                            }
                          }
                          this.a((byte) stackIn_34_1, stackIn_34_2);
                          return true;
                        } else {
                          break L17;
                        }
                      }
                    } else {
                      ((ej) this).k(-1);
                      return true;
                    }
                  } else {
                    if (((ej) this).field_T == ((ej) this).field_K) {
                      if (((ej) this).field_K < ((ej) this).field_o.length()) {
                        ((ej) this).field_T = ((ej) this).field_K + 1;
                        this.i((byte) -102);
                        return true;
                      } else {
                        break L17;
                      }
                    } else {
                      this.i((byte) -102);
                      return true;
                    }
                  }
                }
              }
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = 162;
        field_R = "Waiting for levels";
        field_N = "Confirm Password: ";
    }
}
