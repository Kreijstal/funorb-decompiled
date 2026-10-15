/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends mh {
    mh field_Wb;
    static th field_Sb;
    mm field_Qb;
    mh field_Xb;
    mh field_Tb;
    static int field_Pb;
    static String field_Rb;
    static String field_Ub;
    static int field_Yb;
    static String field_Vb;

    final static jp[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 >= -62) {
          field_Pb = -111;
        }
        jp[] var6 = new jp[9];
        jp[] var5 = var6;
        jp dupTemp$0 = hd.a(param2, param0, (byte) -6);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        jp dupTemp$1 = hd.a(param4, param0, (byte) -6);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 != 0) {
          var6[4] = hd.a(param3, 64, (byte) -6);
        }
        return var5;
    }

    final static void a(int param0, gb param1) {
        int stackIn_2_0;
        mh stackIn_2_1;
        Object stackIn_2_2;
        Object stackIn_2_3;
        String stackIn_2_4;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        nn var5 = null;
        String var6 = null;
        nn var7 = null;
        String var8 = null;
        nn var9 = null;
        String var10 = null;
        nn var11 = null;
        String var12 = null;
        nn var13 = null;
        try {
          stackIn_2_0 = param1.field_c;
          stackIn_2_1 = param1.field_b;
          stackIn_2_2 = null;
          stackIn_2_3 = null;
          stackIn_2_4 = param1.field_m;
          if (param1.field_c == 1) {
            stackIn_3_5 = param1.field_o;
          } else {
            stackIn_3_5 = 0;
          }
          mn.a(stackIn_2_0, stackIn_2_1, (mm) (stackIn_2_2), (int[]) (stackIn_2_3), stackIn_2_4, stackIn_3_5, (byte) -58, param1.field_k, param1.field_q);
          if (param1.field_c == 0 &&
            !cb.e(-91) &&
            null == o.field_e &&
            nl.field_f == null) {
            if (!qo.field_I) {
              var5 = bm.field_d;
              var6 = ol.field_x;
              var5.field_d.a(var6, 14, (byte) 84);
            }
            var7 = bm.field_d;
            var8 = tq.field_b;
            var7.field_d.a(var8, 20, (byte) 118);
          }
          if (param1.field_c == 1 &&
            !cb.e(-128) &&
            null != o.field_e &&
            param1.field_o == o.field_e.e((byte) 118)) {
            if (!qo.field_I) {
              var9 = bm.field_d;
              var10 = hc.field_b;
              var9.field_d.a(var10, 14, (byte) 120);
            }
            var11 = bm.field_d;
            var12 = gn.field_y;
            var11.field_d.a(var12, 20, (byte) 103);
          }
          bm.field_d.a(true);
          bm.field_d.a(true, false);
          bm.field_d.a(param1.field_g, (byte) -79, param1.field_c);
          bm.field_d.a((byte) -126);
          bm.field_d.a(param1, -96);
          var13 = bm.field_d;
          var3 = tb.field_fb;
          var4 = qo.field_O;
          var13.field_d.a(var4, -101, 0, param0, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("hj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    hj(long param0, mh param1, mh param2, fj param3, mh param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Xb = new mh(0L, (mh) null);
          this.field_Qb = new mm(0L, this.field_Xb, param2, param3);
          this.field_Tb = new mh(0L, param4);
          this.field_Wb = new mh(0L, param4);
          this.field_Tb.field_Mb = param5;
          this.field_Wb.field_Mb = param6;
          this.a(this.field_Qb, 0);
          this.a(this.field_Tb, 0);
          this.a(this.field_Wb, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "hj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (!param0) {
          return;
        }
        this.field_Ib = param2;
        this.field_cb = param7;
        this.field_P = param3;
        this.field_zb = param4;
        this.a(param6, -779, param5, param1);
    }

    public static void h(int param0) {
        field_Ub = null;
        field_Sb = null;
        if (param0 > -15) {
          gb var2 = (gb) null;
          hj.a(-63, (gb) null);
        }
        field_Vb = null;
        field_Rb = null;
    }

    final static void b(int param0, int param1) {
        nm var2 = null;
        int var3 = 0;
        ln var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != 0) {
            return;
          }
          var4 = (ln) (ie.field_v.d(-28));
          while (var4 != null) {
            gn.a(param0, 125, var4);
            var4 = (ln) (ie.field_v.a((byte) 116));
          }
          var2 = uc.field_q.d(-54);
          while (var2 != null) {
            bd.a(param0, 92);
            var2 = uc.field_q.a((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "hj.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5) {
        try {
          lb.a(param0, -param2 + param1, param3, param2, 3, 0, 196);
          lb.c(param0, -param2 + param1, param3, param2, 3, param5);
          ob.field_D.c(param4, pq.field_k, -1 + (-ob.field_D.field_P + po.field_a - ob.field_D.field_P), 2, -1);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "hj.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2, int param3, CharSequence param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = param0 - param5;
          var7 = 0;
          if (param2 != 86) {
            stackIn_3_0 = -79;
            return stackIn_3_0;
          }
          while (var7 < var6_int) {
            {
              var8 = param4.charAt(var7 + param5);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param1[var7 + param3] = (byte)-128;
                    break;
                  case 8218:
                    param1[param3 + var7] = (byte)-126;
                    break;
                  case 402:
                    param1[param3 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param3] = (byte)-124;
                    break;
                  case 8230:
                    param1[param3 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param3] = (byte)-122;
                    break;
                  case 8225:
                    param1[param3 + var7] = (byte)-121;
                    break;
                  case 710:
                    param1[var7 + param3] = (byte)-120;
                    break;
                  case 8240:
                    param1[param3 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[param3 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param1[param3 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[param3 + var7] = (byte)-116;
                    break;
                  case 381:
                    param1[var7 + param3] = (byte)-114;
                    break;
                  case 8216:
                    param1[param3 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param1[var7 + param3] = (byte)-110;
                    break;
                  case 8220:
                    param1[var7 + param3] = (byte)-109;
                    break;
                  case 8221:
                    param1[var7 + param3] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param3] = (byte)-107;
                    break;
                  case 8211:
                    param1[param3 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param1[param3 + var7] = (byte)-105;
                    break;
                  case 732:
                    param1[param3 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[var7 + param3] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param3] = (byte)-102;
                    break;
                  case 8250:
                    param1[param3 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[var7 + param3] = (byte)-100;
                    break;
                  case 382:
                    param1[param3 + var7] = (byte)-98;
                    break;
                  default:
                    param1[var7 + param3] = (byte)63;
                    break;
                  case 376:
                    param1[param3 + var7] = (byte)-97;
                    break;
                }
              } else {
                param1[var7 + param3] = (byte)var8;
              }
            }
            var7++;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("hj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = param4 + param1;
          if (param2 < 114) {
            field_Ub = (String) null;
          }
          var6 = param0 + param3;
          if (lb.field_i >= param1) {
            stackIn_6_0 = lb.field_i;
          } else {
            stackIn_6_0 = param1;
          }
          var7 = stackIn_6_0;
          if (lb.field_b < param0) {
            stackIn_9_0 = param0;
          } else {
            stackIn_9_0 = lb.field_b;
          }
          var8 = stackIn_9_0;
          if (lb.field_f > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = lb.field_f;
          }
          var9 = stackIn_12_0;
          if (lb.field_j <= var6) {
            stackIn_15_0 = lb.field_j;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (lb.field_i <= param1 &&
            param1 < lb.field_f) {
            var11 = var8 * lb.field_c + param1;
            var12 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              lb.field_l[var11] = 16777215;
              var11 = var11 + 2 * lb.field_c;
            }
          }
          if (param0 >= lb.field_b &&
            lb.field_j > var6) {
            var11Lifetime1 = var7 + param0 * lb.field_c;
            var12Lifetime1 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              lb.field_l[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (lb.field_i <= var5_int &&
            lb.field_f > var5_int) {
            var11Lifetime2 = var5_int + ((1 & -param1 + var5_int) + var8) * lb.field_c;
            var12Lifetime2 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              lb.field_l[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + lb.field_c * 2;
            }
          }
          if (lb.field_b <= param0) {
            if (lb.field_j <= var6) {
              return;
            }
            var11Lifetime3 = (var6 - param0 & 1) + (var7 + var6 * lb.field_c);
            var12Lifetime3 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              lb.field_l[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var5), "hj.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param3 + this.field_Ib) / 2;
        int var6 = -param0 + this.field_cb;
        this.field_Qb.a(param3, (byte) -111, this.field_Ib, 0, 0, param2, var6 - param3);
        this.field_Tb.field_cb = param0;
        this.field_Tb.field_P = 0;
        this.field_Tb.field_Ib = -param3 + var5;
        this.field_Tb.field_zb = var6;
        this.field_Wb.field_zb = var6;
        this.field_Wb.field_Ib = -var5 + this.field_Ib;
        this.field_Wb.field_P = var5;
        this.field_Wb.field_cb = param0;
        if (param1 != -779) {
          this.field_Tb = (mh) null;
        }
    }

    hj(long param0, hj param1, String param2, String param3) {
        this(param0, param1, param1.field_Qb.field_Qb, param1.field_Qb.field_Ub, param1.field_Tb, param2, param3);
    }

    static {
        field_Pb = 0;
        field_Sb = new th(11, 0, 1, 2);
        field_Rb = "Invalid date";
        field_Yb = 20;
        field_Ub = "Unable to delete friend - system busy";
        field_Vb = "Lost";
    }
}
