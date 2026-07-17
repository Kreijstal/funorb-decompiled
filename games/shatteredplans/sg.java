/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends qr {
    qr field_Bb;
    private qr field_Db;
    static qr field_zb;
    static int field_Cb;
    static qr field_Ab;
    static String field_yb;
    static String field_xb;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var4 = -param1;
        if (param0 == 50) {
          L0: {
            if (((sg) this).field_Db != null) {
              var4 = ((sg) this).field_Db.e(false);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = -param1;
            if (null != ((sg) this).field_Bb) {
              var5 = ((sg) this).field_Bb.a(-param2 + (-param1 + -param2) + (((sg) this).field_K - var4), (byte) -79);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var6 = param2 + (var4 + param2) - (-param1 - var5);
            if (((sg) this).field_K < var6) {
              var5 = var5 + (((sg) this).field_K + -var6);
              var6 = ((sg) this).field_K;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((sg) this).field_y == 1) {
              param2 = param2 + (-var6 + ((sg) this).field_K) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((sg) this).field_y != 2) {
              break L4;
            } else {
              param2 = param2 + (((sg) this).field_K + -var6);
              break L4;
            }
          }
          if (null == ((sg) this).field_Db) {
            if (((sg) this).field_Bb != null) {
              ((sg) this).field_Bb.a(var5, ((sg) this).field_mb, (byte) 50, 0, param2 + (var4 - -param1));
              if (((sg) this).field_Db != null) {
                ((sg) this).field_Bb.field_y = 0;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              } else {
                ((sg) this).field_Bb.field_y = ((sg) this).field_y;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              }
            } else {
              return;
            }
          } else {
            ((sg) this).field_Db.a(var4, ((sg) this).field_mb, (byte) 61, 0, param2);
            ((sg) this).field_Db.field_G = ((sg) this).field_G;
            if (((sg) this).field_Bb != null) {
              ((sg) this).field_Bb.a(var5, ((sg) this).field_mb, (byte) 50, 0, param2 + (var4 - -param1));
              if (((sg) this).field_Db != null) {
                ((sg) this).field_Bb.field_y = 0;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              } else {
                ((sg) this).field_Bb.field_y = ((sg) this).field_y;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L5: {
            var7 = null;
            sg.a(true, false, -42, (String) null, (nq) null);
            if (((sg) this).field_Db != null) {
              var4 = ((sg) this).field_Db.e(false);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var5 = -param1;
            if (null != ((sg) this).field_Bb) {
              var5 = ((sg) this).field_Bb.a(-param2 + (-param1 + -param2) + (((sg) this).field_K - var4), (byte) -79);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var6 = param2 + (var4 + param2) - (-param1 - var5);
            if (((sg) this).field_K < var6) {
              var5 = var5 + (((sg) this).field_K + -var6);
              var6 = ((sg) this).field_K;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (((sg) this).field_y == 1) {
              param2 = param2 + (-var6 + ((sg) this).field_K) / 2;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (((sg) this).field_y != 2) {
              break L9;
            } else {
              param2 = param2 + (((sg) this).field_K + -var6);
              break L9;
            }
          }
          if (null != ((sg) this).field_Db) {
            ((sg) this).field_Db.a(var4, ((sg) this).field_mb, (byte) 61, 0, param2);
            ((sg) this).field_Db.field_G = ((sg) this).field_G;
            if (((sg) this).field_Bb != null) {
              ((sg) this).field_Bb.a(var5, ((sg) this).field_mb, (byte) 50, 0, param2 + (var4 - -param1));
              if (((sg) this).field_Db != null) {
                ((sg) this).field_Bb.field_y = 0;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              } else {
                ((sg) this).field_Bb.field_y = ((sg) this).field_y;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              }
            } else {
              return;
            }
          } else {
            if (((sg) this).field_Bb != null) {
              ((sg) this).field_Bb.a(var5, ((sg) this).field_mb, (byte) 50, 0, param2 + (var4 - -param1));
              if (((sg) this).field_Db != null) {
                ((sg) this).field_Bb.field_y = 0;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              } else {
                ((sg) this).field_Bb.field_y = ((sg) this).field_y;
                ((sg) this).field_Bb.field_G = ((sg) this).field_G;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    sg(long param0, qr param1, qr param2, qr param3, bi param4, String param5) {
        super(param0, param1);
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                ((sg) this).field_Db = new qr(0L, param2);
                ((sg) this).field_Db.field_pb = param4;
                ((sg) this).a(4, ((sg) this).field_Db);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                ((sg) this).field_Bb = new qr(0L, param3, param5);
                ((sg) this).a(4, ((sg) this).field_Bb);
                ((sg) this).e((byte) -128);
                break L2;
              } else {
                ((sg) this).e((byte) -128);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("sg.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((sg) this).a(param5, param1, (byte) 42, param2, param6);
        this.a(param0, param4, param3);
    }

    public static void f(byte param0) {
        field_zb = null;
        field_Ab = null;
        field_yb = null;
        field_xb = null;
    }

    final static void a(boolean param0, boolean param1, int param2, String param3, nq param4) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == cb.field_h) {
                cb.field_h = new pf();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = new String[32];
              var10 = var9;
              var6 = param4.a(param3, new int[1], var10);
              if (!param1) {
                break L2;
              } else {
                param2 = param2 - var6 * 50;
                break L2;
              }
            }
            if (param0) {
              var7 = 0;
              L3: while (true) {
                if (var6 <= var7) {
                  break L0;
                } else {
                  cb.field_h.a((byte) -113, (oh) (Object) new hd(var9[var7], param4, var7 * 50 + param2));
                  var7++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("sg.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null == ((sg) this).field_Db) {
            break L0;
          } else {
            var4 = ((sg) this).field_Db.e(false);
            break L0;
          }
        }
        if (param1 > -62) {
          L1: {
            ((sg) this).field_Bb = null;
            if (((sg) this).field_Bb == null) {
              break L1;
            } else {
              var5 = ((sg) this).field_Bb.e(false);
              break L1;
            }
          }
          return var5 + var4 + (param2 + (param0 - -param2));
        } else {
          L2: {
            if (((sg) this).field_Bb == null) {
              break L2;
            } else {
              var5 = ((sg) this).field_Bb.e(false);
              break L2;
            }
          }
          return var5 + var4 + (param2 + (param0 - -param2));
        }
    }

    final static as a(byte param0, mg param1) {
        as var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        as stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        as stackOut_2_0 = null;
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
            L1: {
              var2 = new as(param1);
              var2.field_v = -var2.field_v;
              if (param0 == 101) {
                break L1;
              } else {
                var3 = null;
                as discarded$2 = sg.a((byte) -73, (mg) null);
                break L1;
              }
            }
            stackOut_2_0 = (as) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("sg.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = "This resource is limiting your fleet production.";
        field_xb = "Unfortunately you are not eligible to create an account.";
    }
}
