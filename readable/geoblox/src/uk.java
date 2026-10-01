/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends q {
    static int[] field_i;
    private boolean field_n;
    static float field_j;
    static int field_o;
    static String field_p;
    static Sprite field_m;
    static String[] field_l;
    private String field_k;

    final void c(byte param0) {
        this.field_k = null;
        if (param0 > -78) {
            field_j = -0.8683637976646423f;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = qj.a(param1, "", '_', (byte) 119);
          var3 = bj.a(105, param2);
          if (param0 != 8) {
            field_i = (int[]) null;
          }
          L2: {
            if (0 == (param1.indexOf(param2) ^ -1)) {
              if (0 == (param1.indexOf(var3) ^ -1)) {
                stackIn_7_0 = 0;
                break L2;
              }
            }
            stackIn_7_0 = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3_ref);

          stackIn_10_1 = new StringBuilder().append("uk.E(").append(param0).append(',');

          if (param1 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }


          stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

          if (param2 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
        return stackIn_7_0 != 0;
    }

    final static String tutorialMessageForStep(int tutorialStepId, int param1) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        if (param1 != 24146) {
            field_m = (Sprite) null;
            var2 = tutorialStepId;
            if (-1 == (var2 ^ -1)) {
                return vh.tutorialRotationMessage;
            }
            if (var2 == 1) {
                return oi.tutorialColourMatchMessage;
            }
            if (!(-3 == (var2 ^ -1))) {
                if (var2 == 3) {
                    return li.tutorialCompleteMessage;
                }
                if (var2 == 5) {
                    return qh.tutorialFailedMessage;
                }
                return null;
            }
            return vd.tutorialShapeMatchMessage;
        }
        var2 = tutorialStepId;
        if (-1 == (var2 ^ -1)) {
            return vh.tutorialRotationMessage;
        }
        if (var2 == 1) {
            return oi.tutorialColourMatchMessage;
        }
        if (!(-3 == (var2 ^ -1))) {
            if (var2 == 3) {
                return li.tutorialCompleteMessage;
            }
            if (var2 == 5) {
                return qh.tutorialFailedMessage;
            }
            return null;
        }
        return vd.tutorialShapeMatchMessage;
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        oj var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != null) {
            var3_int = -35 % ((44 - param1) / 57);
            if (param2 instanceof byte[]) {
              var4 = (byte[]) (param2);
              if (!param0) {
                stackIn_9_0 = (byte[]) (var4);
                decompiledRegionSelector0 = 2;
              } else {
                stackIn_7_0 = nk.a(var4, 0);
                decompiledRegionSelector0 = 1;
              }
            } else {
              if (!(param2 instanceof oj)) {
                throw new IllegalArgumentException();
              } else {
                var5 = (oj) (param2);
                stackIn_12_0 = var5.a((byte) 65);
                decompiledRegionSelector0 = 3;
              }
            }
          } else {
            stackIn_2_0 = null;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3);

          stackIn_16_1 = new StringBuilder().append("uk.G(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, df param3, boolean param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          hl.field_D[0] = bh.field_d.nextInt();
          hl.field_D[1] = bh.field_d.nextInt();
          hl.field_D[2] = (int)(ak.field_a >> -752938848);
          hl.field_D[3] = (int)ak.field_a;
          fc.field_d.field_f = 0;
          fc.field_d.c((byte) 95, hl.field_D[0]);
          fc.field_d.c((byte) 95, hl.field_D[1]);
          fc.field_d.c((byte) 95, hl.field_D[2]);
          fc.field_d.c((byte) 95, hl.field_D[3]);
          SpriteState.a(fc.field_d, true);
          fc.field_d.e(param1, 28695);
          param3.a(124, fc.field_d);
          fj.field_q.field_f = 0;
          if (param2) {
            fj.field_q.d((byte) 121, 18);
          } else {
            fj.field_q.d((byte) -116, 16);
          }
          fj.field_q.field_f = fj.field_q.field_f + 2;
          var5_int = fj.field_q.field_f;
          fj.field_q.c((byte) 95, f.field_ib);
          fj.field_q.b((byte) 116, lb.field_c);
          var6 = 0;
          if (param0 > 20) {
            if (rb.field_c) {
              var6 = var6 | 1;
            }
            if (ll.field_e) {
              var6 = var6 | 4;
            }
            if (param4) {
              var6 = var6 | 8;
            }
            if (null != fl.field_b) {
              var6 = var6 | 16;
            }
            fj.field_q.d((byte) 127, var6);
            var7 = s.a(-1, k.c(111));
            if (var7 == null) {
              var7 = "";
            }
            fj.field_q.a(var7, 0);
            if (null != fl.field_b) {
              fj.field_q.a(fl.field_b, (byte) -126);
            }
            el.a(false, fc.field_d, fj.field_q, ld.field_c, vl.field_l);
            fj.field_q.a(-var5_int + fj.field_q.field_f, true);
            cm.a(-1, -1);
            decompiledRegionSelector0 = 1;
          } else {
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var5);

          stackIn_25_1 = new StringBuilder().append("uk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        sl var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = oe.a((byte) 44, var5);
            if (var3 == null) {
              if (!param1.equals(this.field_k)) {
                var4 = cl.a((byte) 94, param1);
                if (var4 != null) {
                  if (null == var4.field_e) {
                    this.field_k = param1;
                    this.field_n = var4.field_g;
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
              if (param0 != 422) {
                field_j = -0.46423107385635376f;
              }
              if (this.field_n) {
                stackIn_16_0 = ph.field_j;
                decompiledRegionSelector0 = 3;
              } else {
                stackIn_14_0 = rh.field_j;
                decompiledRegionSelector0 = 2;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var3_ref);

          stackIn_19_1 = new StringBuilder().append("uk.A(").append(param0).append(',');

          if (param1 == null) {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    uk(dj param0) {
        super(param0);
        this.field_n = false;
    }

    final lh a(int param0, String param1) {
        sl var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        lh stackIn_4_0 = null;
        lh stackIn_10_0 = null;
        lh stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != -257) {
              var4 = (String) null;
              uk.a(false, (String) null);
            }
            var5 = (CharSequence) ((Object) param1);
            if (hc.a((byte) 82, var5)) {
              L2: {
                if (!param1.equals(this.field_k)) {
                  var3 = cl.a((byte) 108, param1);
                  if (var3 != null) {
                    if (var3.field_e == null) {
                      this.field_n = var3.field_g;
                      this.field_k = param1;
                      break L2;
                    }
                  }
                  stackIn_10_0 = si.field_n;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              if (this.field_n) {
                stackIn_15_0 = kk.field_w;
              } else {
                stackIn_15_0 = si.field_m;
              }
              decompiledRegionSelector0 = 2;
            } else {
              stackIn_4_0 = si.field_m;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = (RuntimeException) (var3_ref);

          stackIn_18_1 = new StringBuilder().append("uk.D(").append(param0).append(',');

          if (param1 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static boolean g(int param0) {
        if (param0 < 29) {
            field_m = (Sprite) null;
            qg.b(9313);
            if (!fh.c(-117)) {
                return hj.field_c ? true : false;
            }
            return true;
        }
        qg.b(9313);
        if (fh.c(-117)) {
            return true;
        }
        if (!hj.field_c) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0, String param1) {
        try {
            if (param0) {
                uk.d((byte) 81);
            }
            v.field_e = param1;
            pc.a(12, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 >= 70) {
            field_m = null;
            field_p = null;
            field_i = null;
            field_l = null;
            return;
        }
        field_m = (Sprite) null;
        field_m = null;
        field_p = null;
        field_i = null;
        field_l = null;
    }

    static {
        field_i = new int[8192];
        field_l = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
