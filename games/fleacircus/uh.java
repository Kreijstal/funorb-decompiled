/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends lh {
    int field_q;
    int field_u;
    int field_p;
    static dd[] field_m;
    int field_j;
    int field_l;
    static sf field_s;
    static String field_o;
    static dd field_k;
    int field_i;
    static String field_t;
    static int[] field_n;
    int[] field_r;

    final static rh a(int param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_3_0 = null;
        rh stackOut_1_0 = null;
        try {
          L0: {
            if (param1 == 26) {
              stackOut_3_0 = ag.a(param2, param4, false, param0, param3, 1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (rh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var5), "uh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              this.field_u = param5;
              this.field_r = param1;
              if (param0 == 3) {
                break L1;
              } else {
                this.field_p = 120;
                break L1;
              }
            }
            this.field_l = param6;
            this.field_i = param7;
            this.field_p = param3;
            this.field_q = param4;
            this.field_j = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var9);
            stackOut_5_1 = new StringBuilder().append("uh.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_t = null;
            field_o = null;
            field_n = null;
            field_m = null;
            field_k = null;
            field_s = null;
            if (param0 != 8) {
                field_n = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "uh.C(" + param0 + ')');
        }
    }

    final static void a(byte param0, rh param1) {
        String discarded$1 = null;
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_775_0 = null;
        StringBuilder stackIn_775_1 = null;
        RuntimeException stackIn_777_0 = null;
        StringBuilder stackIn_777_1 = null;
        RuntimeException stackIn_778_0 = null;
        StringBuilder stackIn_778_1 = null;
        String stackIn_778_2 = null;
        int stackIn_786_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_774_0 = null;
        StringBuilder stackOut_774_1 = null;
        RuntimeException stackOut_777_0 = null;
        StringBuilder stackOut_777_1 = null;
        String stackOut_777_2 = null;
        RuntimeException stackOut_775_0 = null;
        StringBuilder stackOut_775_1 = null;
        String stackOut_775_2 = null;
        int stackOut_785_0 = 0;
        int stackOut_783_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              em.field_c = param1;
              var2_array = tf.a(0, "waitingfor_patches");
              if (var2_array != null) {
                cf.field_b = ab.a(0, var2_array);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2_array = tf.a(0, "loading_patches");
              if (null != var2_array) {
                kk.field_c = ab.a(0, var2_array);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2_array = tf.a(0, "level_names,0,0");
              if (null == var2_array) {
                break L3;
              } else {
                wj.field_c[0][0] = ab.a(0, var2_array);
                break L3;
              }
            }
            L4: {
              var2_array = tf.a(0, "level_names,0,1");
              if (null != var2_array) {
                wj.field_c[0][1] = ab.a(0, var2_array);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2_array = tf.a(0, "level_names,0,2");
              if (var2_array == null) {
                break L5;
              } else {
                wj.field_c[0][2] = ab.a(0, var2_array);
                break L5;
              }
            }
            L6: {
              var2_array = tf.a(0, "level_names,0,3");
              if (var2_array != null) {
                wj.field_c[0][3] = ab.a(0, var2_array);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2_array = tf.a(0, "level_names,0,4");
              if (null != var2_array) {
                wj.field_c[0][4] = ab.a(0, var2_array);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2_array = tf.a(0, "level_names,0,5");
              if (var2_array != null) {
                wj.field_c[0][5] = ab.a(0, var2_array);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2_array = tf.a(0, "level_names,0,6");
              if (var2_array == null) {
                break L9;
              } else {
                wj.field_c[0][6] = ab.a(0, var2_array);
                break L9;
              }
            }
            L10: {
              var2_array = tf.a(0, "level_names,0,7");
              if (null == var2_array) {
                break L10;
              } else {
                wj.field_c[0][7] = ab.a(0, var2_array);
                break L10;
              }
            }
            L11: {
              var2_array = tf.a(0, "level_names,0,8");
              if (var2_array != null) {
                wj.field_c[0][8] = ab.a(0, var2_array);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2_array = tf.a(0, "level_names,0,9");
              if (var2_array != null) {
                wj.field_c[0][9] = ab.a(0, var2_array);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var2_array = tf.a(0, "level_names,0,10");
              if (null != var2_array) {
                wj.field_c[0][10] = ab.a(0, var2_array);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2_array = tf.a(0, "level_names,0,11");
              if (var2_array != null) {
                wj.field_c[0][11] = ab.a(0, var2_array);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2_array = tf.a(0, "level_names,0,12");
              if (var2_array != null) {
                wj.field_c[0][12] = ab.a(0, var2_array);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2_array = tf.a(0, "level_names,0,13");
              if (var2_array == null) {
                break L16;
              } else {
                wj.field_c[0][13] = ab.a(0, var2_array);
                break L16;
              }
            }
            L17: {
              var2_array = tf.a(0, "level_names,0,14");
              if (var2_array != null) {
                wj.field_c[0][14] = ab.a(0, var2_array);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2_array = tf.a(0, "level_names,0,15");
              if (null != var2_array) {
                wj.field_c[0][15] = ab.a(0, var2_array);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2_array = tf.a(0, "level_names,0,16");
              if (null == var2_array) {
                break L19;
              } else {
                wj.field_c[0][16] = ab.a(0, var2_array);
                break L19;
              }
            }
            L20: {
              var2_array = tf.a(0, "level_names,0,17");
              if (var2_array != null) {
                wj.field_c[0][17] = ab.a(0, var2_array);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2_array = tf.a(0, "level_names,0,18");
              if (var2_array != null) {
                wj.field_c[0][18] = ab.a(0, var2_array);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2_array = tf.a(0, "level_names,0,19");
              if (var2_array != null) {
                wj.field_c[0][19] = ab.a(0, var2_array);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2_array = tf.a(0, "level_names,0,20");
              if (var2_array != null) {
                wj.field_c[0][20] = ab.a(0, var2_array);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2_array = tf.a(0, "level_names,0,21");
              if (var2_array == null) {
                break L24;
              } else {
                wj.field_c[0][21] = ab.a(0, var2_array);
                break L24;
              }
            }
            L25: {
              var2_array = tf.a(0, "level_names,0,22");
              if (null != var2_array) {
                wj.field_c[0][22] = ab.a(0, var2_array);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2_array = tf.a(0, "level_names,0,23");
              if (null != var2_array) {
                wj.field_c[0][23] = ab.a(0, var2_array);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2_array = tf.a(0, "level_names,0,24");
              if (var2_array == null) {
                break L27;
              } else {
                wj.field_c[0][24] = ab.a(0, var2_array);
                break L27;
              }
            }
            L28: {
              var2_array = tf.a(0, "level_names,0,25");
              if (null == var2_array) {
                break L28;
              } else {
                wj.field_c[0][25] = ab.a(0, var2_array);
                break L28;
              }
            }
            L29: {
              var2_array = tf.a(0, "level_names,0,26");
              if (var2_array == null) {
                break L29;
              } else {
                wj.field_c[0][26] = ab.a(0, var2_array);
                break L29;
              }
            }
            L30: {
              var2_array = tf.a(0, "level_names,0,27");
              if (var2_array != null) {
                wj.field_c[0][27] = ab.a(0, var2_array);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              var2_array = tf.a(0, "level_names,0,28");
              if (var2_array != null) {
                wj.field_c[0][28] = ab.a(0, var2_array);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2_array = tf.a(0, "level_names,0,29");
              if (var2_array == null) {
                break L32;
              } else {
                wj.field_c[0][29] = ab.a(0, var2_array);
                break L32;
              }
            }
            L33: {
              var2_array = tf.a(0, "level_names,0,30");
              if (null == var2_array) {
                break L33;
              } else {
                wj.field_c[0][30] = ab.a(0, var2_array);
                break L33;
              }
            }
            L34: {
              var2_array = tf.a(0, "level_names,0,31");
              if (var2_array == null) {
                break L34;
              } else {
                wj.field_c[0][31] = ab.a(0, var2_array);
                break L34;
              }
            }
            L35: {
              var2_array = tf.a(0, "level_names,0,32");
              if (null == var2_array) {
                break L35;
              } else {
                wj.field_c[0][32] = ab.a(0, var2_array);
                break L35;
              }
            }
            L36: {
              var2_array = tf.a(0, "level_names,0,33");
              if (null != var2_array) {
                wj.field_c[0][33] = ab.a(0, var2_array);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2_array = tf.a(0, "level_names,0,34");
              if (var2_array != null) {
                wj.field_c[0][34] = ab.a(0, var2_array);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2_array = tf.a(0, "level_names,0,35");
              if (null == var2_array) {
                break L38;
              } else {
                wj.field_c[0][35] = ab.a(0, var2_array);
                break L38;
              }
            }
            L39: {
              var2_array = tf.a(0, "level_names,0,36");
              if (null != var2_array) {
                wj.field_c[0][36] = ab.a(0, var2_array);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2_array = tf.a(0, "level_names,0,37");
              if (null == var2_array) {
                break L40;
              } else {
                wj.field_c[0][37] = ab.a(0, var2_array);
                break L40;
              }
            }
            L41: {
              var2_array = tf.a(0, "level_names,0,38");
              if (null == var2_array) {
                break L41;
              } else {
                wj.field_c[0][38] = ab.a(0, var2_array);
                break L41;
              }
            }
            L42: {
              var2_array = tf.a(0, "level_names,0,39");
              if (null != var2_array) {
                wj.field_c[0][39] = ab.a(0, var2_array);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2_array = tf.a(0, "level_names,0,40");
              if (null == var2_array) {
                break L43;
              } else {
                wj.field_c[0][40] = ab.a(0, var2_array);
                break L43;
              }
            }
            L44: {
              var2_array = tf.a(0, "level_names,1,0");
              if (null == var2_array) {
                break L44;
              } else {
                wj.field_c[1][0] = ab.a(0, var2_array);
                break L44;
              }
            }
            L45: {
              var2_array = tf.a(0, "level_names,1,1");
              if (var2_array == null) {
                break L45;
              } else {
                wj.field_c[1][1] = ab.a(0, var2_array);
                break L45;
              }
            }
            L46: {
              var2_array = tf.a(0, "level_names,1,2");
              if (var2_array != null) {
                wj.field_c[1][2] = ab.a(0, var2_array);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2_array = tf.a(0, "level_names,1,3");
              if (var2_array == null) {
                break L47;
              } else {
                wj.field_c[1][3] = ab.a(0, var2_array);
                break L47;
              }
            }
            L48: {
              var2_array = tf.a(0, "level_names,1,4");
              if (var2_array != null) {
                wj.field_c[1][4] = ab.a(0, var2_array);
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              var2_array = tf.a(0, "level_names,1,5");
              if (var2_array != null) {
                wj.field_c[1][5] = ab.a(0, var2_array);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2_array = tf.a(0, "level_names,1,6");
              if (null != var2_array) {
                wj.field_c[1][6] = ab.a(0, var2_array);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              var2_array = tf.a(0, "level_names,1,7");
              if (null == var2_array) {
                break L51;
              } else {
                wj.field_c[1][7] = ab.a(0, var2_array);
                break L51;
              }
            }
            L52: {
              var2_array = tf.a(0, "level_names,1,8");
              if (null == var2_array) {
                break L52;
              } else {
                wj.field_c[1][8] = ab.a(0, var2_array);
                break L52;
              }
            }
            L53: {
              var2_array = tf.a(0, "level_names,1,9");
              if (var2_array == null) {
                break L53;
              } else {
                wj.field_c[1][9] = ab.a(0, var2_array);
                break L53;
              }
            }
            L54: {
              var2_array = tf.a(0, "level_names,1,10");
              if (null == var2_array) {
                break L54;
              } else {
                wj.field_c[1][10] = ab.a(0, var2_array);
                break L54;
              }
            }
            L55: {
              var2_array = tf.a(0, "level_names,1,11");
              if (null != var2_array) {
                wj.field_c[1][11] = ab.a(0, var2_array);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2_array = tf.a(0, "level_names,1,12");
              if (null == var2_array) {
                break L56;
              } else {
                wj.field_c[1][12] = ab.a(0, var2_array);
                break L56;
              }
            }
            L57: {
              var2_array = tf.a(0, "level_names,1,13");
              if (null == var2_array) {
                break L57;
              } else {
                wj.field_c[1][13] = ab.a(0, var2_array);
                break L57;
              }
            }
            L58: {
              var2_array = tf.a(0, "level_names,1,14");
              if (null == var2_array) {
                break L58;
              } else {
                wj.field_c[1][14] = ab.a(0, var2_array);
                break L58;
              }
            }
            L59: {
              var2_array = tf.a(0, "level_names,1,15");
              if (var2_array != null) {
                wj.field_c[1][15] = ab.a(0, var2_array);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2_array = tf.a(0, "level_names,1,16");
              if (null != var2_array) {
                wj.field_c[1][16] = ab.a(0, var2_array);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2_array = tf.a(0, "level_names,1,17");
              if (var2_array != null) {
                wj.field_c[1][17] = ab.a(0, var2_array);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2_array = tf.a(0, "level_names,1,18");
              if (null != var2_array) {
                wj.field_c[1][18] = ab.a(0, var2_array);
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              var2_array = tf.a(0, "level_names,1,19");
              if (var2_array == null) {
                break L63;
              } else {
                wj.field_c[1][19] = ab.a(0, var2_array);
                break L63;
              }
            }
            L64: {
              var2_array = tf.a(0, "level_names,1,20");
              if (var2_array != null) {
                wj.field_c[1][20] = ab.a(0, var2_array);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2_array = tf.a(0, "level_names,1,21");
              if (var2_array != null) {
                wj.field_c[1][21] = ab.a(0, var2_array);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2_array = tf.a(0, "level_names,1,22");
              if (var2_array == null) {
                break L66;
              } else {
                wj.field_c[1][22] = ab.a(0, var2_array);
                break L66;
              }
            }
            L67: {
              var2_array = tf.a(0, "level_names,1,23");
              if (null != var2_array) {
                wj.field_c[1][23] = ab.a(0, var2_array);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2_array = tf.a(0, "level_names,1,24");
              if (null == var2_array) {
                break L68;
              } else {
                wj.field_c[1][24] = ab.a(0, var2_array);
                break L68;
              }
            }
            L69: {
              var2_array = tf.a(0, "level_names,1,25");
              if (null == var2_array) {
                break L69;
              } else {
                wj.field_c[1][25] = ab.a(0, var2_array);
                break L69;
              }
            }
            L70: {
              var2_array = tf.a(0, "level_names,1,26");
              if (null != var2_array) {
                wj.field_c[1][26] = ab.a(0, var2_array);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2_array = tf.a(0, "level_names,1,27");
              if (null == var2_array) {
                break L71;
              } else {
                wj.field_c[1][27] = ab.a(0, var2_array);
                break L71;
              }
            }
            L72: {
              var2_array = tf.a(0, "level_names,1,28");
              if (var2_array == null) {
                break L72;
              } else {
                wj.field_c[1][28] = ab.a(0, var2_array);
                break L72;
              }
            }
            L73: {
              var2_array = tf.a(0, "level_names,1,29");
              if (var2_array != null) {
                wj.field_c[1][29] = ab.a(0, var2_array);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2_array = tf.a(0, "END_OF_FREE_GAME");
              if (null != var2_array) {
                nc.field_b = ab.a(0, var2_array);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              var2_array = tf.a(0, "achievement_names,0");
              if (var2_array == null) {
                break L75;
              } else {
                wa.field_f[0] = ab.a(0, var2_array);
                break L75;
              }
            }
            L76: {
              var2_array = tf.a(0, "achievement_names,1");
              if (null != var2_array) {
                wa.field_f[1] = ab.a(0, var2_array);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2_array = tf.a(0, "achievement_names,2");
              if (var2_array == null) {
                break L77;
              } else {
                wa.field_f[2] = ab.a(0, var2_array);
                break L77;
              }
            }
            L78: {
              var2_array = tf.a(0, "achievement_names,3");
              if (null != var2_array) {
                wa.field_f[3] = ab.a(0, var2_array);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              var2_array = tf.a(0, "achievement_names,4");
              if (null != var2_array) {
                wa.field_f[4] = ab.a(0, var2_array);
                break L79;
              } else {
                break L79;
              }
            }
            L80: {
              var2_array = tf.a(0, "achievement_names,5");
              if (null != var2_array) {
                wa.field_f[5] = ab.a(0, var2_array);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              var2_array = tf.a(0, "achievement_names,6");
              if (var2_array == null) {
                break L81;
              } else {
                wa.field_f[6] = ab.a(0, var2_array);
                break L81;
              }
            }
            L82: {
              var2_array = tf.a(0, "achievement_names,7");
              if (null != var2_array) {
                wa.field_f[7] = ab.a(0, var2_array);
                break L82;
              } else {
                break L82;
              }
            }
            L83: {
              var2_array = tf.a(0, "achievement_names,8");
              if (null != var2_array) {
                wa.field_f[8] = ab.a(0, var2_array);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2_array = tf.a(0, "achievement_names,9");
              if (null == var2_array) {
                break L84;
              } else {
                wa.field_f[9] = ab.a(0, var2_array);
                break L84;
              }
            }
            L85: {
              var2_array = tf.a(0, "achievement_names,10");
              if (null == var2_array) {
                break L85;
              } else {
                wa.field_f[10] = ab.a(0, var2_array);
                break L85;
              }
            }
            L86: {
              var2_array = tf.a(0, "achievement_names,11");
              if (null == var2_array) {
                break L86;
              } else {
                wa.field_f[11] = ab.a(0, var2_array);
                break L86;
              }
            }
            L87: {
              var2_array = tf.a(0, "achievement_names,12");
              if (var2_array != null) {
                wa.field_f[12] = ab.a(0, var2_array);
                break L87;
              } else {
                break L87;
              }
            }
            L88: {
              var2_array = tf.a(0, "achievement_names,13");
              if (var2_array != null) {
                wa.field_f[13] = ab.a(0, var2_array);
                break L88;
              } else {
                break L88;
              }
            }
            L89: {
              var2_array = tf.a(0, "achievement_names,14");
              if (null != var2_array) {
                wa.field_f[14] = ab.a(0, var2_array);
                break L89;
              } else {
                break L89;
              }
            }
            L90: {
              var2_array = tf.a(0, "achievement_names,15");
              if (null != var2_array) {
                wa.field_f[15] = ab.a(0, var2_array);
                break L90;
              } else {
                break L90;
              }
            }
            L91: {
              var2_array = tf.a(0, "achievement_criteria,0");
              if (var2_array == null) {
                break L91;
              } else {
                ij.field_J[0] = ab.a(0, var2_array);
                break L91;
              }
            }
            L92: {
              var2_array = tf.a(0, "achievement_criteria,1");
              if (null != var2_array) {
                ij.field_J[1] = ab.a(0, var2_array);
                break L92;
              } else {
                break L92;
              }
            }
            L93: {
              var2_array = tf.a(0, "achievement_criteria,2");
              if (var2_array != null) {
                ij.field_J[2] = ab.a(0, var2_array);
                break L93;
              } else {
                break L93;
              }
            }
            L94: {
              var2_array = tf.a(0, "achievement_criteria,3");
              if (var2_array == null) {
                break L94;
              } else {
                ij.field_J[3] = ab.a(0, var2_array);
                break L94;
              }
            }
            L95: {
              var2_array = tf.a(0, "achievement_criteria,4");
              if (var2_array == null) {
                break L95;
              } else {
                ij.field_J[4] = ab.a(0, var2_array);
                break L95;
              }
            }
            L96: {
              var2_array = tf.a(0, "achievement_criteria,5");
              if (null != var2_array) {
                ij.field_J[5] = ab.a(0, var2_array);
                break L96;
              } else {
                break L96;
              }
            }
            L97: {
              var2_array = tf.a(0, "achievement_criteria,6");
              if (var2_array != null) {
                ij.field_J[6] = ab.a(0, var2_array);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2_array = tf.a(0, "achievement_criteria,7");
              if (null != var2_array) {
                ij.field_J[7] = ab.a(0, var2_array);
                break L98;
              } else {
                break L98;
              }
            }
            L99: {
              var2_array = tf.a(0, "achievement_criteria,8");
              if (var2_array != null) {
                ij.field_J[8] = ab.a(0, var2_array);
                break L99;
              } else {
                break L99;
              }
            }
            L100: {
              var2_array = tf.a(0, "achievement_criteria,9");
              if (var2_array != null) {
                ij.field_J[9] = ab.a(0, var2_array);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2_array = tf.a(0, "achievement_criteria,10");
              if (null != var2_array) {
                ij.field_J[10] = ab.a(0, var2_array);
                break L101;
              } else {
                break L101;
              }
            }
            L102: {
              var2_array = tf.a(0, "achievement_criteria,11");
              if (null != var2_array) {
                ij.field_J[11] = ab.a(0, var2_array);
                break L102;
              } else {
                break L102;
              }
            }
            L103: {
              var2_array = tf.a(0, "achievement_criteria,12");
              if (var2_array != null) {
                ij.field_J[12] = ab.a(0, var2_array);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2_array = tf.a(0, "achievement_criteria,13");
              if (null != var2_array) {
                ij.field_J[13] = ab.a(0, var2_array);
                break L104;
              } else {
                break L104;
              }
            }
            L105: {
              var2_array = tf.a(0, "achievement_criteria,14");
              if (null == var2_array) {
                break L105;
              } else {
                ij.field_J[14] = ab.a(0, var2_array);
                break L105;
              }
            }
            L106: {
              var2_array = tf.a(0, "achievement_criteria,15");
              if (null == var2_array) {
                break L106;
              } else {
                ij.field_J[15] = ab.a(0, var2_array);
                break L106;
              }
            }
            L107: {
              var2_array = tf.a(0, "BLOCKS_IN_THE_LEVEL_INTRO");
              if (null == var2_array) {
                break L107;
              } else {
                gj.field_D = ab.a(0, var2_array);
                break L107;
              }
            }
            L108: {
              var2_array = tf.a(0, "SHADOW_OPEN");
              if (var2_array != null) {
                ti.field_a = ab.a(0, var2_array);
                break L108;
              } else {
                break L108;
              }
            }
            L109: {
              var2_array = tf.a(0, "SHADOW_CLOSE");
              if (null != var2_array) {
                ua.field_xb = ab.a(0, var2_array);
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              var2_array = tf.a(0, "START_LEVEL_BUTTON_CAPTION");
              if (null == var2_array) {
                break L110;
              } else {
                hg.field_o = ab.a(0, var2_array);
                break L110;
              }
            }
            L111: {
              var2_array = tf.a(0, "START_LEVEL_BUTTON_CAPTION_EXT");
              if (null != var2_array) {
                discarded$1 = ab.a(0, var2_array);
                break L111;
              } else {
                break L111;
              }
            }
            L112: {
              var2_array = tf.a(0, "GOTO_NEXT_LEVEL_BUTTON_CAPTION");
              if (null != var2_array) {
                nj.field_d = ab.a(0, var2_array);
                break L112;
              } else {
                break L112;
              }
            }
            L113: {
              var2_array = tf.a(0, "ENTRANCE_TIP");
              if (null == var2_array) {
                break L113;
              } else {
                jk.field_o = ab.a(0, var2_array);
                break L113;
              }
            }
            L114: {
              var2_array = tf.a(0, "WALL_TIP");
              if (null != var2_array) {
                ak.field_g = ab.a(0, var2_array);
                break L114;
              } else {
                break L114;
              }
            }
            L115: {
              var2_array = tf.a(0, "RAMP_TIP");
              if (var2_array != null) {
                qa.field_o = ab.a(0, var2_array);
                break L115;
              } else {
                break L115;
              }
            }
            L116: {
              var2_array = tf.a(0, "BALLOON_TIP");
              if (null == var2_array) {
                break L116;
              } else {
                ta.field_s = ab.a(0, var2_array);
                break L116;
              }
            }
            L117: {
              var2_array = tf.a(0, "TRAPDOOR_TIP");
              if (null != var2_array) {
                wh.field_c = ab.a(0, var2_array);
                break L117;
              } else {
                break L117;
              }
            }
            L118: {
              var2_array = tf.a(0, "WATER_TIP");
              if (var2_array != null) {
                jk.field_q = ab.a(0, var2_array);
                break L118;
              } else {
                break L118;
              }
            }
            L119: {
              var2_array = tf.a(0, "FAN_TIP");
              if (var2_array != null) {
                ga.field_r = ab.a(0, var2_array);
                break L119;
              } else {
                break L119;
              }
            }
            L120: {
              var2_array = tf.a(0, "SPIDER_TIP");
              if (var2_array == null) {
                break L120;
              } else {
                wj.field_a = ab.a(0, var2_array);
                break L120;
              }
            }
            L121: {
              var2_array = tf.a(0, "TRANSPORTER_TIP");
              if (null != var2_array) {
                of.field_g = ab.a(0, var2_array);
                break L121;
              } else {
                break L121;
              }
            }
            L122: {
              var2_array = tf.a(0, "BOMB_TIP");
              if (null != var2_array) {
                ca.field_O = ab.a(0, var2_array);
                break L122;
              } else {
                break L122;
              }
            }
            L123: {
              var2_array = tf.a(0, "EXIT_TIP");
              if (var2_array != null) {
                fh.field_f = ab.a(0, var2_array);
                break L123;
              } else {
                break L123;
              }
            }
            L124: {
              var2_array = tf.a(0, "RECESSED_WALL_TIP");
              if (var2_array != null) {
                hd.field_d = ab.a(0, var2_array);
                break L124;
              } else {
                break L124;
              }
            }
            L125: {
              var2_array = tf.a(0, "ANTI_GRAVITY_TIP");
              if (null != var2_array) {
                qj.field_F = ab.a(0, var2_array);
                break L125;
              } else {
                break L125;
              }
            }
            L126: {
              var2_array = tf.a(0, "BARRIER_TIP");
              if (null == var2_array) {
                break L126;
              } else {
                ti.field_b = ab.a(0, var2_array);
                break L126;
              }
            }
            L127: {
              var2_array = tf.a(0, "ONE_TOUCH_WALL_TIP");
              if (var2_array == null) {
                break L127;
              } else {
                wa.field_p = ab.a(0, var2_array);
                break L127;
              }
            }
            L128: {
              var2_array = tf.a(0, "WEAK_PLATFORM_TIP");
              if (null != var2_array) {
                gf.field_a = ab.a(0, var2_array);
                break L128;
              } else {
                break L128;
              }
            }
            L129: {
              var2_array = tf.a(0, "BLUE_SWITCH_TIP");
              if (var2_array == null) {
                break L129;
              } else {
                gg.field_d = ab.a(0, var2_array);
                break L129;
              }
            }
            L130: {
              var2_array = tf.a(0, "GREEN_SWITCH_TIP");
              if (var2_array != null) {
                fi.field_k = ab.a(0, var2_array);
                break L130;
              } else {
                break L130;
              }
            }
            L131: {
              var2_array = tf.a(0, "SPIKES_TIP");
              if (var2_array != null) {
                ld.field_b = ab.a(0, var2_array);
                break L131;
              } else {
                break L131;
              }
            }
            L132: {
              var2_array = tf.a(0, "SPRING_TIP");
              if (var2_array == null) {
                break L132;
              } else {
                si.field_H = ab.a(0, var2_array);
                break L132;
              }
            }
            L133: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,0");
              if (var2_array == null) {
                break L133;
              } else {
                kl.field_a[0] = ab.a(0, var2_array);
                break L133;
              }
            }
            L134: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,1");
              if (var2_array != null) {
                kl.field_a[1] = ab.a(0, var2_array);
                break L134;
              } else {
                break L134;
              }
            }
            L135: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,2");
              if (var2_array == null) {
                break L135;
              } else {
                kl.field_a[2] = ab.a(0, var2_array);
                break L135;
              }
            }
            L136: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,3");
              if (null != var2_array) {
                kl.field_a[3] = ab.a(0, var2_array);
                break L136;
              } else {
                break L136;
              }
            }
            L137: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,4");
              if (var2_array == null) {
                break L137;
              } else {
                kl.field_a[4] = ab.a(0, var2_array);
                break L137;
              }
            }
            L138: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,5");
              if (var2_array == null) {
                break L138;
              } else {
                kl.field_a[5] = ab.a(0, var2_array);
                break L138;
              }
            }
            L139: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,6");
              if (var2_array != null) {
                kl.field_a[6] = ab.a(0, var2_array);
                break L139;
              } else {
                break L139;
              }
            }
            L140: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,7");
              if (null == var2_array) {
                break L140;
              } else {
                kl.field_a[7] = ab.a(0, var2_array);
                break L140;
              }
            }
            L141: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,8");
              if (var2_array != null) {
                kl.field_a[8] = ab.a(0, var2_array);
                break L141;
              } else {
                break L141;
              }
            }
            L142: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,9");
              if (null == var2_array) {
                break L142;
              } else {
                kl.field_a[9] = ab.a(0, var2_array);
                break L142;
              }
            }
            L143: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,10");
              if (var2_array == null) {
                break L143;
              } else {
                kl.field_a[10] = ab.a(0, var2_array);
                break L143;
              }
            }
            L144: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,11");
              if (var2_array != null) {
                kl.field_a[11] = ab.a(0, var2_array);
                break L144;
              } else {
                break L144;
              }
            }
            L145: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,12");
              if (var2_array != null) {
                kl.field_a[12] = ab.a(0, var2_array);
                break L145;
              } else {
                break L145;
              }
            }
            L146: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,13");
              if (null == var2_array) {
                break L146;
              } else {
                kl.field_a[13] = ab.a(0, var2_array);
                break L146;
              }
            }
            L147: {
              var2_array = tf.a(0, "TUTORIAL_TEXT,14");
              if (var2_array == null) {
                break L147;
              } else {
                kl.field_a[14] = ab.a(0, var2_array);
                break L147;
              }
            }
            L148: {
              var2_array = tf.a(0, "NEW_GAME");
              if (null == var2_array) {
                break L148;
              } else {
                ec.field_a = ab.a(0, var2_array);
                break L148;
              }
            }
            L149: {
              var2_array = tf.a(0, "CLASSIC_GAME");
              if (null != var2_array) {
                ib.field_e = ab.a(0, var2_array);
                break L149;
              } else {
                break L149;
              }
            }
            L150: {
              var2_array = tf.a(0, "CONTINUE");
              if (null == var2_array) {
                break L150;
              } else {
                r.field_k = ab.a(0, var2_array);
                break L150;
              }
            }
            L151: {
              var2_array = tf.a(0, "SHOW_TIPS");
              if (var2_array == null) {
                break L151;
              } else {
                bb.field_H = ab.a(0, var2_array);
                break L151;
              }
            }
            L152: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_1");
              if (null != var2_array) {
                fj.field_a = ab.a(0, var2_array);
                break L152;
              } else {
                break L152;
              }
            }
            L153: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_2");
              if (null == var2_array) {
                break L153;
              } else {
                pb.field_h = ab.a(0, var2_array);
                break L153;
              }
            }
            L154: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_3");
              if (var2_array == null) {
                break L154;
              } else {
                tb.field_b = ab.a(0, var2_array);
                break L154;
              }
            }
            L155: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_4");
              if (var2_array != null) {
                mh.field_v = ab.a(0, var2_array);
                break L155;
              } else {
                break L155;
              }
            }
            L156: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_5");
              if (var2_array != null) {
                na.field_b = ab.a(0, var2_array);
                break L156;
              } else {
                break L156;
              }
            }
            L157: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_6");
              if (null == var2_array) {
                break L157;
              } else {
                ec.field_d = ab.a(0, var2_array);
                break L157;
              }
            }
            L158: {
              var2_array = tf.a(0, "INSTRUCTIONS_TITLES_7");
              if (var2_array != null) {
                vj.field_a = ab.a(0, var2_array);
                break L158;
              } else {
                break L158;
              }
            }
            L159: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_1_1");
              if (null != var2_array) {
                em.field_a = ab.a(0, var2_array);
                break L159;
              } else {
                break L159;
              }
            }
            L160: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_1_2");
              if (null == var2_array) {
                break L160;
              } else {
                hf.field_f = ab.a(0, var2_array);
                break L160;
              }
            }
            L161: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_1_3");
              if (null == var2_array) {
                break L161;
              } else {
                oj.field_j = ab.a(0, var2_array);
                break L161;
              }
            }
            L162: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_1");
              if (var2_array != null) {
                hc.field_f = ab.a(0, var2_array);
                break L162;
              } else {
                break L162;
              }
            }
            L163: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_2");
              if (null != var2_array) {
                si.field_o = ab.a(0, var2_array);
                break L163;
              } else {
                break L163;
              }
            }
            L164: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_3");
              if (null != var2_array) {
                ia.field_o = ab.a(0, var2_array);
                break L164;
              } else {
                break L164;
              }
            }
            L165: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_4");
              if (var2_array == null) {
                break L165;
              } else {
                vg.field_v = ab.a(0, var2_array);
                break L165;
              }
            }
            L166: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_5");
              if (null != var2_array) {
                qa.field_q = ab.a(0, var2_array);
                break L166;
              } else {
                break L166;
              }
            }
            L167: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_6");
              if (null == var2_array) {
                break L167;
              } else {
                ea.field_c = ab.a(0, var2_array);
                break L167;
              }
            }
            L168: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_7");
              if (var2_array != null) {
                cl.field_c = ab.a(0, var2_array);
                break L168;
              } else {
                break L168;
              }
            }
            L169: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_2_8");
              if (var2_array != null) {
                wa.field_d = ab.a(0, var2_array);
                break L169;
              } else {
                break L169;
              }
            }
            L170: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_3_1");
              if (null == var2_array) {
                break L170;
              } else {
                fl.field_d = ab.a(0, var2_array);
                break L170;
              }
            }
            L171: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_3_2");
              if (null != var2_array) {
                oc.field_d = ab.a(0, var2_array);
                break L171;
              } else {
                break L171;
              }
            }
            L172: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_3_3");
              if (null != var2_array) {
                af.field_a = ab.a(0, var2_array);
                break L172;
              } else {
                break L172;
              }
            }
            L173: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_3_4");
              if (var2_array == null) {
                break L173;
              } else {
                dl.field_u = ab.a(0, var2_array);
                break L173;
              }
            }
            L174: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_3_5");
              if (var2_array != null) {
                kl.field_d = ab.a(0, var2_array);
                break L174;
              } else {
                break L174;
              }
            }
            L175: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_3_6");
              if (null != var2_array) {
                w.field_i = ab.a(0, var2_array);
                break L175;
              } else {
                break L175;
              }
            }
            L176: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_1");
              if (null == var2_array) {
                break L176;
              } else {
                hc.field_c = ab.a(0, var2_array);
                break L176;
              }
            }
            L177: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_2");
              if (var2_array != null) {
                pl.field_i = ab.a(0, var2_array);
                break L177;
              } else {
                break L177;
              }
            }
            L178: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_3");
              if (var2_array != null) {
                oe.field_b = ab.a(0, var2_array);
                break L178;
              } else {
                break L178;
              }
            }
            L179: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_4");
              if (null == var2_array) {
                break L179;
              } else {
                em.field_h = ab.a(0, var2_array);
                break L179;
              }
            }
            L180: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_5");
              if (null != var2_array) {
                re.field_b = ab.a(0, var2_array);
                break L180;
              } else {
                break L180;
              }
            }
            L181: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_6");
              if (var2_array == null) {
                break L181;
              } else {
                kf.field_j = ab.a(0, var2_array);
                break L181;
              }
            }
            L182: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_4_7");
              if (null != var2_array) {
                lg.field_a = ab.a(0, var2_array);
                break L182;
              } else {
                break L182;
              }
            }
            L183: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_5_1");
              if (var2_array != null) {
                jg.field_c = ab.a(0, var2_array);
                break L183;
              } else {
                break L183;
              }
            }
            L184: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_5_2");
              if (null == var2_array) {
                break L184;
              } else {
                hm.field_f = ab.a(0, var2_array);
                break L184;
              }
            }
            L185: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_5_3");
              if (var2_array != null) {
                ui.field_lb = ab.a(0, var2_array);
                break L185;
              } else {
                break L185;
              }
            }
            L186: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_5_4");
              if (null == var2_array) {
                break L186;
              } else {
                gm.field_ib = ab.a(0, var2_array);
                break L186;
              }
            }
            L187: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_5_5");
              if (var2_array == null) {
                break L187;
              } else {
                j.field_l = ab.a(0, var2_array);
                break L187;
              }
            }
            L188: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_5_6");
              if (null == var2_array) {
                break L188;
              } else {
                cj.field_a = ab.a(0, var2_array);
                break L188;
              }
            }
            L189: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_6_1");
              if (null != var2_array) {
                jj.field_V = ab.a(0, var2_array);
                break L189;
              } else {
                break L189;
              }
            }
            L190: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_6_2");
              if (null != var2_array) {
                g.field_t = ab.a(0, var2_array);
                break L190;
              } else {
                break L190;
              }
            }
            L191: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_6_3");
              if (null == var2_array) {
                break L191;
              } else {
                qj.field_E = ab.a(0, var2_array);
                break L191;
              }
            }
            L192: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_7_1");
              if (null == var2_array) {
                break L192;
              } else {
                ga.field_q = ab.a(0, var2_array);
                break L192;
              }
            }
            L193: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_7_2");
              if (var2_array == null) {
                break L193;
              } else {
                kb.field_n = ab.a(0, var2_array);
                break L193;
              }
            }
            L194: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_7_3");
              if (var2_array == null) {
                break L194;
              } else {
                vc.field_g = ab.a(0, var2_array);
                break L194;
              }
            }
            L195: {
              var2_array = tf.a(0, "INSTRUCTIONS_BODIES_7_4");
              if (null == var2_array) {
                break L195;
              } else {
                ai.field_o = ab.a(0, var2_array);
                break L195;
              }
            }
            L196: {
              var2_array = tf.a(0, "GAME_NAME_JSTRING");
              if (null == var2_array) {
                break L196;
              } else {
                ih.field_m = ab.a(0, var2_array);
                break L196;
              }
            }
            L197: {
              var2_array = tf.a(0, "GAME_COMPLETE,0");
              if (var2_array == null) {
                break L197;
              } else {
                bh.field_u[0] = ab.a(0, var2_array);
                break L197;
              }
            }
            L198: {
              var2_array = tf.a(0, "GAME_COMPLETE,1");
              if (var2_array != null) {
                bh.field_u[1] = ab.a(0, var2_array);
                break L198;
              } else {
                break L198;
              }
            }
            L199: {
              var2_array = tf.a(0, "GAME_COMPLETE,2");
              if (var2_array != null) {
                bh.field_u[2] = ab.a(0, var2_array);
                break L199;
              } else {
                break L199;
              }
            }
            L200: {
              var2_array = tf.a(0, "LEVEL_NOT_YET_REACHED_MESSAGE");
              if (var2_array == null) {
                break L200;
              } else {
                ik.field_C = ab.a(0, var2_array);
                break L200;
              }
            }
            L201: {
              var2_array = tf.a(0, "LABEL_BUTTON_BLOCK");
              if (null == var2_array) {
                break L201;
              } else {
                ha.field_p = ab.a(0, var2_array);
                break L201;
              }
            }
            L202: {
              var2_array = tf.a(0, "LABEL_BUTTON_LEFTSLOPE");
              if (var2_array != null) {
                j.field_h = ab.a(0, var2_array);
                break L202;
              } else {
                break L202;
              }
            }
            L203: {
              var2_array = tf.a(0, "LABEL_BUTTON_RIGHTSLOPE");
              if (null != var2_array) {
                tb.field_e = ab.a(0, var2_array);
                break L203;
              } else {
                break L203;
              }
            }
            L204: {
              var2_array = tf.a(0, "LABEL_LEVELNAME");
              if (null != var2_array) {
                pk.field_G = ab.a(0, var2_array);
                break L204;
              } else {
                break L204;
              }
            }
            L205: {
              var2_array = tf.a(0, "LABEL_FLEAINFO");
              var3 = -26 / ((-20 - param0) / 37);
              if (var2_array == null) {
                break L205;
              } else {
                fb.field_f = ab.a(0, var2_array);
                break L205;
              }
            }
            L206: {
              var2_array = tf.a(0, "LABEL_FLEAINFO_LEVELSELECT");
              if (var2_array == null) {
                break L206;
              } else {
                kl.field_b = ab.a(0, var2_array);
                break L206;
              }
            }
            L207: {
              var2_array = tf.a(0, "LABEL_MUSTSAVE");
              if (var2_array == null) {
                break L207;
              } else {
                fleas.field_H = ab.a(0, var2_array);
                break L207;
              }
            }
            L208: {
              var2_array = tf.a(0, "LABEL_FLEASRESCUED");
              if (var2_array != null) {
                va.field_s = ab.a(0, var2_array);
                break L208;
              } else {
                break L208;
              }
            }
            L209: {
              var2_array = tf.a(0, "LABEL_SCORE");
              if (null == var2_array) {
                break L209;
              } else {
                hm.field_h = ab.a(0, var2_array);
                break L209;
              }
            }
            L210: {
              var2_array = tf.a(0, "LABEL_SCORE_THIS_LEVEL");
              if (null != var2_array) {
                pd.field_i = ab.a(0, var2_array);
                break L210;
              } else {
                break L210;
              }
            }
            L211: {
              var2_array = tf.a(0, "BONUS");
              if (null == var2_array) {
                break L211;
              } else {
                fleas.field_I = ab.a(0, var2_array);
                break L211;
              }
            }
            L212: {
              var2_array = tf.a(0, "LABEL_BONUS_TIME");
              if (var2_array == null) {
                break L212;
              } else {
                lf.field_b = ab.a(0, var2_array);
                break L212;
              }
            }
            L213: {
              var2_array = tf.a(0, "LABEL_LEVELCOMPLETE");
              if (null != var2_array) {
                fi.field_l = ab.a(0, var2_array);
                break L213;
              } else {
                break L213;
              }
            }
            L214: {
              var2_array = tf.a(0, "LEVEL_FAIL_MESSAGE");
              if (var2_array == null) {
                break L214;
              } else {
                uj.field_d = ab.a(0, var2_array);
                break L214;
              }
            }
            L215: {
              var2_array = tf.a(0, "members_benefits_captions,0");
              if (null != var2_array) {
                jd.field_g[0] = ab.a(0, var2_array);
                break L215;
              } else {
                break L215;
              }
            }
            L216: {
              var2_array = tf.a(0, "members_benefits_captions,1");
              if (null == var2_array) {
                break L216;
              } else {
                jd.field_g[1] = ab.a(0, var2_array);
                break L216;
              }
            }
            L217: {
              var2_array = tf.a(0, "members_benefits_captions,2");
              if (null == var2_array) {
                break L217;
              } else {
                jd.field_g[2] = ab.a(0, var2_array);
                break L217;
              }
            }
            L218: {
              var2_array = tf.a(0, "members_benefits_captions,3");
              if (var2_array == null) {
                break L218;
              } else {
                jd.field_g[3] = ab.a(0, var2_array);
                break L218;
              }
            }
            em.field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L219: {
            var2 = decompiledCaughtException;
            stackOut_774_0 = (RuntimeException) (var2);
            stackOut_774_1 = new StringBuilder().append("uh.A(").append(param0).append(',');
            stackIn_777_0 = stackOut_774_0;
            stackIn_777_1 = stackOut_774_1;
            stackIn_775_0 = stackOut_774_0;
            stackIn_775_1 = stackOut_774_1;
            if (param1 == null) {
              stackOut_777_0 = (RuntimeException) ((Object) stackIn_777_0);
              stackOut_777_1 = (StringBuilder) ((Object) stackIn_777_1);
              stackOut_777_2 = "null";
              stackIn_778_0 = stackOut_777_0;
              stackIn_778_1 = stackOut_777_1;
              stackIn_778_2 = stackOut_777_2;
              break L219;
            } else {
              stackOut_775_0 = (RuntimeException) ((Object) stackIn_775_0);
              stackOut_775_1 = (StringBuilder) ((Object) stackIn_775_1);
              stackOut_775_2 = "{...}";
              stackIn_778_0 = stackOut_775_0;
              stackIn_778_1 = stackOut_775_1;
              stackIn_778_2 = stackOut_775_2;
              break L219;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_778_0), stackIn_778_2 + ')');
        }
        L220: {
          if (!cd.field_e) {
            break L220;
          } else {
            L221: {
              if (var4 == 0) {
                stackOut_785_0 = 1;
                stackIn_786_0 = stackOut_785_0;
                break L221;
              } else {
                stackOut_783_0 = 0;
                stackIn_786_0 = stackOut_783_0;
                break L221;
              }
            }
            fleas.field_A = stackIn_786_0 != 0;
            break L220;
          }
        }
    }

    uh() {
    }

    static {
        field_o = "Retry";
        field_n = new int[5];
        field_t = "Highscores";
    }
}
