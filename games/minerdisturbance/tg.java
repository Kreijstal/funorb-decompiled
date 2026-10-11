/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int field_f;
    private int field_h;
    private pi field_e;
    private pi field_c;
    static int field_g;
    static int field_i;
    static int field_d;
    private int field_a;
    private pi[] field_b;

    final pi a(int param0) {
        this.field_h = 0;
        if (param0 != -16545) {
          this.a(77);
          return this.a(true);
        }
        return this.a(true);
    }

    final pi a(long param0, int param1) {
        pi var5 = null;
        int var6 = MinerDisturbance.field_ab;
        pi var4 = this.field_b[(int)(param0 & (long)(this.field_a - 1))];
        this.field_c = var4.field_f;
        while (this.field_c != var4) {
          if (this.field_c.field_d == param0) {
            var5 = this.field_c;
            this.field_c = this.field_c.field_f;
            return var5;
          }
          this.field_c = this.field_c.field_f;
        }
        this.field_c = null;
        if (param1 != -27109) {
          this.field_e = (pi) null;
          return null;
        }
        return null;
    }

    final static void a(int param0, String param1) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        try {
          if (param0 > -89) {
            field_d = -5;
          }
          pe.field_pb = pe.field_pb + 1;
          if (h.field_b == -1 &&
            vd.field_y == -1) {
            h.field_b = nk.field_w;
            vd.field_y = gb.field_e;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(fa.field_c));
          } else {
            decompiledFrameRemainder0 = (null == fa.field_c);
          }
          if (decompiledFrameRemainder0) {
            if (!il.field_n) {
              if (pe.field_pb >= ch.field_f) {
                stackIn_20_0 = (od.field_o + ch.field_f > pe.field_pb) ? 1 : 0;
              } else {
                stackIn_20_0 = 0;
              }
            } else {
              stackIn_20_0 = 0;
            }
            var2_int = stackIn_20_0;
            if (param1 == null) {
              pe.field_pb = 0;
            } else {
              if (il.field_n) {
                pe.field_pb = ch.field_f;
              } else {
                if (var2_int == 0) {
                  pe.field_pb = 0;
                } else {
                  pe.field_pb = ch.field_f;
                }
              }
            }
            lj.field_q = vd.field_y;
            ng.field_l = h.field_b;
            if (param1 != null) {
              il.field_n = false;
            } else {
              if (var2_int != 0) {
                il.field_n = true;
              }
            }
          }
          if (!il.field_n &&
            ch.field_f > pe.field_pb &&
            k.field_i) {
            lj.field_q = vd.field_y;
            pe.field_pb = 0;
            ng.field_l = h.field_b;
          }
          fa.field_c = param1;
          vd.field_y = -1;
          h.field_b = -1;
          if (il.field_n) {
            if (oh.field_E != pe.field_pb) {
              return;
            }
            il.field_n = false;
            pe.field_pb = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("tg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = MinerDisturbance.field_ab;
        tl.field_m = 0;
        mb.field_c = null;
        if (param1 >= -44) {
          field_f = 31;
          em.field_B = null;
          var2 = kb.field_a;
          kb.field_a = sc.field_c;
          sc.field_c = var2;
          if (param0 == 51) {
            aj.field_c.field_j = 2;
          } else {
            if (param0 == 50) {
              aj.field_c.field_j = 5;
            } else {
              aj.field_c.field_j = 1;
            }
          }
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 <= aj.field_c.field_o &&
            51 == param0) {
            return 2;
          }
          if (aj.field_c.field_o >= 2 &&
            50 == param0) {
            return 5;
          }
          if (aj.field_c.field_o >= 4) {
            return 1;
          }
          return -1;
        }
        em.field_B = null;
        var2Lifetime1 = kb.field_a;
        kb.field_a = sc.field_c;
        sc.field_c = var2Lifetime1;
        if (param0 == 51) {
          aj.field_c.field_j = 2;
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 <= aj.field_c.field_o &&
            51 == param0) {
            return 2;
          }
          if (aj.field_c.field_o >= 2 &&
            50 == param0) {
            return 5;
          }
          if (aj.field_c.field_o < 4) {
            return -1;
          }
          return 1;
        }
        if (param0 != 50) {
          aj.field_c.field_j = 1;
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 <= aj.field_c.field_o &&
            51 == param0) {
            return 2;
          }
        } else {
          aj.field_c.field_j = 5;
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 > aj.field_c.field_o) {
            if (aj.field_c.field_o >= 2 &&
              50 == param0) {
              return 5;
            }
            if (aj.field_c.field_o < 4) {
              return -1;
            }
            return 1;
          }
          if (51 == param0) {
            return 2;
          }
        }
        if (aj.field_c.field_o >= 2 &&
          50 == param0) {
          return 5;
        }
        if (aj.field_c.field_o >= 4) {
          return 1;
        }
        return -1;
    }

    tg(int param0) {
        int var2 = 0;
        pi dupTemp$1 = null;
        pi var3;
        this.field_h = 0;
        this.field_b = new pi[param0];
        this.field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new pi();
          var3 = dupTemp$1;
          this.field_b[var2] = dupTemp$1;
          var3.field_f = var3;
          var3.field_c = var3;
        }
    }

    final pi a(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        pi var4;
        pi var5;
        pi var6;
        pi var18;
        pi var19;
        pi var23;
        pi var32;
        var3 = MinerDisturbance.field_ab;
        if (this.field_h <= 0) {
          if (param0) {
            do {
              if (this.field_a <= this.field_h) {
                return null;
              }
              fieldTemp$2 = this.field_h;
              this.field_h = this.field_h + 1;
              var5 = this.field_b[fieldTemp$2].field_f;
              var18 = var5;
            } while (var5 == this.field_b[this.field_h - 1]);
            this.field_e = var18.field_f;
            return var18;
          }
          var4 = (pi) null;
          this.a(-99, -121L, (pi) null);
          do {
            if (this.field_a <= this.field_h) {
              return null;
            }
            fieldTemp$3 = this.field_h;
            this.field_h = this.field_h + 1;
            var5 = this.field_b[fieldTemp$3].field_f;
            var6 = var5;
          } while (var5 == this.field_b[this.field_h - 1]);
          this.field_e = var6.field_f;
          return var6;
        }
        if (this.field_b[-1 + this.field_h] != this.field_e) {
          var32 = this.field_e;
          this.field_e = var32.field_f;
          return var32;
        }
        if (param0) {
          do {
            if (this.field_a <= this.field_h) {
              return null;
            }
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            var5 = this.field_b[fieldTemp$1].field_f;
            var19 = var5;
          } while (var5 == this.field_b[this.field_h - 1]);
          this.field_e = var19.field_f;
          return var19;
        }
        var4 = (pi) null;
        this.a(-99, -121L, (pi) null);
        do {
          if (this.field_a <= this.field_h) {
            return null;
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          var5 = this.field_b[fieldTemp$0].field_f;
          var23 = var5;
        } while (var5 == this.field_b[this.field_h - 1]);
        this.field_e = var23.field_f;
        return var23;
    }

    final void a(int param0, long param1, pi param2) {
        pi var5 = null;
        try {
          if (param2.field_c != null) {
            param2.b(34);
          }
          var5 = this.field_b[(int)(param1 & (long)(this.field_a - 1))];
          param2.field_c = var5.field_c;
          param2.field_f = var5;
          param2.field_c.field_f = param2;
          if (param0 != 0) {
            this.a(true);
          }
          param2.field_f.field_c = param2;
          param2.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "tg.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param0 > -108) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(nn.a(118, param1, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("tg.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = 0;
        bc.a(50, -20451);
    }
}
