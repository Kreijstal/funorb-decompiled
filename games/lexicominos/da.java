/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static gf field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hh.field_M != null) {
            uc.field_eb = 0;
            cj.field_i = param0.getX();
            ij.field_h = param0.getY();
            ql.field_K = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("da.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (null != hh.field_M) {
            uc.field_eb = 0;
            bb.field_I = 0;
            ql.field_K = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
            }
            if (0 == (var2_int & 4)) {
            }
            if ((8 & var2_int) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("da.mouseReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(String[] args, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_36_0 = false;
        String stackIn_54_0 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        boolean stackOut_35_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2) {
            field_b = 126;
          }
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          L1: while (true) {
            var6_int = param1.indexOf("<%", var5);
            stackIn_6_0 = ~var6_int;
            L2: while (true) {
              if (stackIn_6_0 > -1) {
                if (var11 == 0) {
                  break L2;
                }
              } else {
                var5 = var6_int + 2;
              }
              while (var3_int > var5) {
                stackOut_13_0 = ne.a((byte) 115, param1.charAt(var5));
                stackIn_6_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                if (var11 != 0) {
                  continue L2;
                }
                if (stackIn_14_0) {
                  var5++;
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!bc.a(param2, (CharSequence) ((Object) var7_ref_String)) &&
                var11 == 0) {
                continue L1;
              }
              if (var3_int > var5 &&
                param1.charAt(var5) == 62) {
                var5++;
                var8 = si.a((byte) 120, (CharSequence) ((Object) var7_ref_String));
                var4 = var4 + (args[var8].length() + var6_int - var5);
              }
              if (var11 == 0) {
                continue L1;
              }
              break;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          L10: while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            stackIn_32_0 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            L11: while (!(decompiledNaturalLoopExit0 = (stackIn_32_0 > var8Lifetime1))) {
              var5Lifetime1 = 2 + var8Lifetime1;
              while (var3_int > var5Lifetime1) {
                stackOut_35_0 = ne.a((byte) 85, param1.charAt(var5Lifetime1));
                stackIn_32_0 = stackOut_35_0 ? 1 : 0;
                stackIn_36_0 = stackOut_35_0;
                if (var11 != 0) {
                  continue L11;
                }
                if (stackIn_36_0) {
                  var5Lifetime1++;
                  continue;
                }
                break;
              }
              var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
              if (!bc.a(param2, (CharSequence) ((Object) var9))) {
                continue L10;
              }
              if (var11 == 0) {
                if (var3_int > var5Lifetime1 &&
                  param1.charAt(var5Lifetime1) == 62) {
                  var5Lifetime1++;
                  var10 = si.a((byte) 114, (CharSequence) ((Object) var9));
                  discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
                  discarded$1 = var6.append(args[var10]);
                  var7 = var5Lifetime1;
                }
                continue L10;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              discarded$2 = var6.append(param1.substring(var7));
            }
            break;
          }
          stackIn_54_0 = var6.toString();
          return stackIn_54_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_58_0 = var3;
          stackIn_58_1 = new StringBuilder().append("da.B(");
          if (args == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (hh.field_M != null) {
            uc.field_eb = 0;
            cj.field_i = -1;
            ij.field_h = -1;
            ql.field_K = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("da.mouseExited(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (hh.field_M != null) {
            uc.field_eb = 0;
            cj.field_i = param0.getX();
            ij.field_h = param0.getY();
            ql.field_K = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("da.mouseEntered(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hh.field_M != null) {
            bb.field_I = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("da.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hh.field_M != null) {
            uc.field_eb = 0;
            cj.field_i = param0.getX();
            ij.field_h = param0.getY();
            ql.field_K = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("da.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("da.mouseClicked(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (hh.field_M != null) {
            uc.field_eb = 0;
            qb.field_j = param0.getX();
            gk.field_b = param0.getY();
            rf.c(0);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              lj.field_a = 1;
              bb.field_I = 1;
              if (Lexicominos.field_L) {
                lj.field_a = 2;
                bb.field_I = 2;
              }
            } else {
              lj.field_a = 2;
              bb.field_I = 2;
            }
            var2_int = param0.getModifiers();
            if ((4 & var2_int) != 0) {
            }
            if (0 != (var2_int & 16)) {
            }
            ql.field_K = true;
            if (0 == (var2_int & 8)) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("da.mousePressed(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 < 121) {
            da.a((String[]) null, (String) null, false);
          }
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "da.A(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, boolean param4, pk param5, byte param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_60_0Lifetime1;
        int stackIn_60_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var30 = Lexicominos.field_L ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param2[3] >> 2;
          var22 = param2[4] >> 2;
          var23 = param2[5] >> 2;
          var24 = param2[6] >> 2;
          var25 = param2[7] >> 2;
          var26 = param2[8] >> 2;
          var27 = param2[9] >> 2;
          var28 = param2[10] >> 2;
          var12 = param0[5] * var23 + param0[3] * var21 + var22 * param0[4] >> 14;
          var13 = param0[5] * var26 + (var24 * param0[3] + param0[4] * var25) >> 14;
          var29 = param2[11] >> 2;
          var18 = param0[10] * var22 + (var21 * param0[9] + var23 * param0[11]) >> 14;
          var15 = var21 * param0[6] - (-(param0[7] * var22) - var23 * param0[8]) >> 14;
          var19 = param0[11] * var26 + (var25 * param0[10] + var24 * param0[9]) >> 14;
          var20 = param0[11] * var29 + var27 * param0[9] + var28 * param0[10] >> 14;
          var14 = param0[4] * var28 + (var27 * param0[3] + var29 * param0[5]) >> 14;
          var17 = param0[7] * var28 + var27 * param0[6] + var29 * param0[8] >> 14;
          var16 = var25 * param0[7] + (param0[6] * var24 + param0[8] * var26) >> 14;
          if (param6 > -19) {
            return;
          }
          var21Lifetime1 = param0[0] - param2[0];
          var22Lifetime1 = -param2[1] + param0[1];
          var23Lifetime1 = -param2[2] + param0[2];
          var9 = var23Lifetime1 * param2[5] + (param2[4] * var22Lifetime1 + var21Lifetime1 * param2[3]) >> 16 - sb.field_d;
          var10 = var22Lifetime1 * param2[7] + var21Lifetime1 * param2[6] + param2[8] * var23Lifetime1 >> 16 - sb.field_d;
          var11 = var21Lifetime1 * param2[9] - (-(var22Lifetime1 * param2[10]) - var23Lifetime1 * param2[11]) >> 16;
          var21Lifetime2 = k.field_g;
          var22Lifetime2 = k.field_a;
          var23Lifetime2 = 0;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param5.field_w) {
              var24Lifetime1 = param5.field_h[var23Lifetime2];
              var25Lifetime1 = param5.field_I[var23Lifetime2];
              var26Lifetime1 = param5.field_g[var23Lifetime2];
              var27Lifetime1 = (var12 * var24Lifetime1 + var25Lifetime1 * var15 + var26Lifetime1 * var18 >> -sb.field_d + 16) + var9;
              var28Lifetime1 = (var19 * var26Lifetime1 + (var13 * var24Lifetime1 + var16 * var25Lifetime1) >> -sb.field_d + 16) + var10;
              var29Lifetime1 = var11 + (var17 * var25Lifetime1 + (var24Lifetime1 * var14 + var20 * var26Lifetime1) >> 16);
              stackIn_60_0 = 50;
              stackIn_60_1 = var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_60_0 > stackIn_60_1) {
                  stackIn_69_0 = ~var18;
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_60_0 <= stackIn_60_1) {
                  ej.field_c[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  fk.field_d[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                  qd.field_a[var23Lifetime2] = var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  qd.field_a[var23Lifetime2] = -2147483648;
                }
                if (param3) {
                  pd.field_l[var23Lifetime2] = var27Lifetime1 >> sb.field_d;
                  cl.field_U[var23Lifetime2] = var28Lifetime1 >> sb.field_d;
                  pc.field_n[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (param5.field_y != null &&
                null != param5.field_i &&
                null != param5.field_p &&
                null != param5.field_o &&
                param5.field_l != null &&
                param5.field_u != null &&
                null != param5.field_C &&
                param5.field_r != null &&
                param5.field_t != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param5.field_H)) {
                  var24Lifetime1Lifetime1 = param5.field_y[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param5.field_i[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param5.field_p[var23Lifetime2];
                  pl.field_c[var23Lifetime2] = (var24Lifetime1Lifetime1 * var12 + var25Lifetime1Lifetime1 * var15 + var18 * var26Lifetime1Lifetime1 >> 16) + var9;
                  bd.field_k[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 + var25Lifetime1Lifetime1 * var16 + var19 * var26Lifetime1Lifetime1 >> 16);
                  wg.field_j[var23Lifetime2] = (var17 * var25Lifetime1Lifetime1 + var14 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param5.field_o[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param5.field_l[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param5.field_u[var23Lifetime2];
                  vg.field_c[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + (var12 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var15) >> 16);
                  kd.field_b[var23Lifetime2] = (var13 * var24Lifetime1Lifetime1 + (var16 * var25Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1) >> 16) + var10;
                  pf.field_k[var23Lifetime2] = (var24Lifetime1Lifetime1 * var14 + var25Lifetime1Lifetime1 * var17 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param5.field_C[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param5.field_r[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param5.field_t[var23Lifetime2];
                  kd.field_g[var23Lifetime2] = var9 + (var24Lifetime1Lifetime1 * var12 + var25Lifetime1Lifetime1 * var15 + var26Lifetime1Lifetime1 * var18 >> 16);
                  kc.field_l[var23Lifetime2] = (var19 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var16 + var24Lifetime1Lifetime1 * var13) >> 16) + var10;
                  ee.field_f[var23Lifetime2] = var11 + (var25Lifetime1Lifetime1 * var17 + (var14 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var20) >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param1))) {
                var9 = param0[3];
                var10 = param0[4];
                var11 = param0[5];
                var12 = param0[6];
                var13 = param0[7];
                var14 = param0[8];
                var15 = param0[9];
                var16 = param0[10];
                var17 = param0[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_60_0Lifetime1 = param5.field_A;
                  stackIn_60_1Lifetime1 = var18;
                  if (stackIn_60_0Lifetime1 <= stackIn_60_1Lifetime1) {
                    break;
                  }
                  stackIn_69_0 = ~var18;
                  if (var30 != 0) {
                    break L1;
                  }
                  if (stackIn_69_0 <= ~qf.field_q.length) {
                    break;
                  }
                  var19 = param5.field_z[var18];
                  var20 = param5.field_b[var18];
                  var21Lifetime2 = param5.field_c[var18];
                  qf.field_q[var18] = var21Lifetime2 * var15 + (var9 * var19 + var12 * var20) >> 16;
                  ee.field_b[var18] = var21Lifetime2 * var16 + (var10 * var19 + var20 * var13) >> 16;
                  wh.field_e[var18] = var21Lifetime2 * var17 + (var19 * var11 + var14 * var20) >> 16;
                  var18++;
                }
              }
            }
            stackIn_69_0 = var8;
            break;
          }
          he.a(stackIn_69_0, param5, 109, var7_int, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_74_0 = var7;
          stackIn_74_1 = new StringBuilder().append("da.C(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_a = null;
    }
}
