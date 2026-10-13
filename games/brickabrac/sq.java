/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq {
    static int[] field_b;
    static String field_a;
    static kb field_c;

    final static void a(tg param0, int param1, java.awt.Frame param2) {
        ql var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(10, param2);
            while (var3.field_f == 0) {
              wj.a(param1 ^ 20898, 10L);
            }
            if (var3.field_f != 1) {
              wj.a(-128, 100L);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          param2.dispose();
          if (param1 == -20954) {
            return;
          }
          field_c = (kb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("sq.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            if (param0 != -32) {
              field_a = (String) null;
            }
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param1 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param1 + var9;
                if (var6 != var10 / param1) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_39_0 = var6;
            return stackIn_39_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("sq.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static m a(int param0) {
        if (param0 > 31) {
          return new m(IndexedSpriteGeometry.a(57), ga.c(30794));
        }
        field_c = (kb) null;
        return new m(IndexedSpriteGeometry.a(57), ga.c(30794));
    }

    public static void a(byte param0) {
        if (param0 == -11) {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (int[]) null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        nn var4_ref_nn = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        mp var3 = wn.a(param0, param1, -16);
        nn var4_ref_nnLifetime1;
        if (var3 != null) {
          bm.field_d.a(true, false);
          var4_ref_nn = bm.field_d;
          var5_ref_String = oo.field_y;
          var4_ref_nn.field_d.a(var5_ref_String, 5, (byte) 104);
          var4_ref_nnLifetime1 = bm.field_d;
          var5 = tb.pressX;
          var6 = qo.pressY;
          var4_ref_nnLifetime1.field_d.a(var6, -98, 0, 0, var5);
        }
        int var4 = -44 % ((-3 - param2) / 50);
        jm.a(param0, true, param1);
    }

    final static void a(boolean param0) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        long var1;
        long var3;
        long var5;
        ff.field_d.clear((byte) -83);
        if (!pf.field_f) {
          if (!param0) {
            if (GzipInflater.field_g) {
              if (d.field_H != rn.field_c) {
                bq.field_b.field_l.setLength(0);
                DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
                discarded$9 = bq.field_b.field_l.append(" fps");
                rn.field_c = d.field_H;
              }
              ff.field_d.addLast(bq.field_b, (byte) 3);
            }
          } else {
            sq.a(15);
            if (GzipInflater.field_g) {
              if (d.field_H != rn.field_c) {
                bq.field_b.field_l.setLength(0);
                DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
                discarded$8 = bq.field_b.field_l.append(" fps");
                rn.field_c = d.field_H;
              }
              ff.field_d.addLast(bq.field_b, (byte) 3);
            }
          }
          return;
        }
        var1 = Runtime.getRuntime().totalMemory();
        var3 = Runtime.getRuntime().freeMemory();
        var5 = (-var3 + var1) / 1024L;
        var3 = var3 / 1024L;
        var1 = var1 / 1024L;
        if (~RankingsScreen.field_u != ~var1) {
          bj.field_P.field_l.setLength(0);
          DelegatingCanvas.a(-9, var5, bj.field_P.field_l);
          discarded$10 = bj.field_P.field_l.append(" kB / ");
          DelegatingCanvas.a(-9, var1, bj.field_P.field_l);
          discarded$11 = bj.field_P.field_l.append(" kB");
          mk.field_j = var5;
          RankingsScreen.field_u = var1;
          ff.field_d.addLast(bj.field_P, (byte) 3);
          if (!param0) {
            if (GzipInflater.field_g) {
              if (d.field_H != rn.field_c) {
                bq.field_b.field_l.setLength(0);
                DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
                discarded$13 = bq.field_b.field_l.append(" fps");
                rn.field_c = d.field_H;
              }
              ff.field_d.addLast(bq.field_b, (byte) 3);
            }
          } else {
            sq.a(15);
            if (GzipInflater.field_g) {
              if (d.field_H != rn.field_c) {
                bq.field_b.field_l.setLength(0);
                DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
                discarded$12 = bq.field_b.field_l.append(" fps");
                rn.field_c = d.field_H;
              }
              ff.field_d.addLast(bq.field_b, (byte) 3);
            }
          }
          return;
        }
        if (mk.field_j == var5) {
          ff.field_d.addLast(bj.field_P, (byte) 3);
          if (!param0) {
            if (GzipInflater.field_g) {
              if (d.field_H != rn.field_c) {
                bq.field_b.field_l.setLength(0);
                DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
                discarded$14 = bq.field_b.field_l.append(" fps");
                rn.field_c = d.field_H;
              }
              ff.field_d.addLast(bq.field_b, (byte) 3);
            }
          } else {
            sq.a(15);
            if (GzipInflater.field_g) {
              if (d.field_H != rn.field_c) {
                bq.field_b.field_l.setLength(0);
                DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
                discarded$15 = bq.field_b.field_l.append(" fps");
                rn.field_c = d.field_H;
              }
              ff.field_d.addLast(bq.field_b, (byte) 3);
            }
          }
          return;
        }
        bj.field_P.field_l.setLength(0);
        DelegatingCanvas.a(-9, var5, bj.field_P.field_l);
        discarded$16 = bj.field_P.field_l.append(" kB / ");
        DelegatingCanvas.a(-9, var1, bj.field_P.field_l);
        discarded$17 = bj.field_P.field_l.append(" kB");
        mk.field_j = var5;
        RankingsScreen.field_u = var1;
        ff.field_d.addLast(bj.field_P, (byte) 3);
        if (!param0) {
          if (GzipInflater.field_g) {
            if (d.field_H != rn.field_c) {
              bq.field_b.field_l.setLength(0);
              DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
              discarded$18 = bq.field_b.field_l.append(" fps");
              rn.field_c = d.field_H;
            }
            ff.field_d.addLast(bq.field_b, (byte) 3);
          }
        } else {
          sq.a(15);
          if (GzipInflater.field_g) {
            if (d.field_H != rn.field_c) {
              bq.field_b.field_l.setLength(0);
              DelegatingCanvas.a(-9, (long)d.field_H, bq.field_b.field_l);
              discarded$19 = bq.field_b.field_l.append(" fps");
              rn.field_c = d.field_H;
            }
            ff.field_d.addLast(bq.field_b, (byte) 3);
          }
        }
        return;
    }

    static {
        int var0 = 0;
        field_b = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
          field_b[var0] = 65793 * var0;
        }
        field_a = "Email: ";
    }
}
