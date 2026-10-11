/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static boolean[][] field_a;
    static String field_c;
    static int field_d;
    nm field_e;
    private nm field_b;

    final static void a(int param0, int param1) {
        if (param0 <= 11) {
          return;
        }
        hb.field_x = 1000000000L / (long)param1;
    }

    final nm f(int param0) {
        nm var2 = this.field_e.field_b;
        if (this.field_e == var2) {
          this.field_b = null;
          return null;
        }
        if (param0 == 0) {
          this.field_b = var2.field_b;
          return var2;
        }
        return (nm) null;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == param0) {
            stackIn_2_0 = n.field_b;
            return stackIn_2_0;
          }
          if (param0 == 6) {
            stackIn_5_0 = qp.field_b;
            return stackIn_5_0;
          }
          if (param0 == 7) {
            stackIn_9_0 = fp.field_w;
            return stackIn_9_0;
          }
          if (param0 == 8) {
            stackIn_12_0 = vg.field_b;
            return stackIn_12_0;
          }
          if (param0 == 9) {
            stackIn_15_0 = cl.field_s;
            return stackIn_15_0;
          }
          if (param0 == 10) {
            stackIn_18_0 = km.field_n;
            return stackIn_18_0;
          }
          if (param0 == 11) {
            stackIn_21_0 = i.field_o;
            return stackIn_21_0;
          }
          if (param2 != ~param0) {
            return null;
          }
          stackIn_25_0 = rd.a(fm.field_c, new String[]{param1}, (byte) 103);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("vl.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 100) {
          vl.a(false, 28);
          field_c = null;
          field_a = (boolean[][]) null;
          return;
        }
        field_c = null;
        field_a = (boolean[][]) null;
    }

    final void a(boolean param0, nm param1) {
        try {
          if (param1.field_b != null) {
            param1.b((byte) 111);
          }
          param1.field_b = this.field_e;
          param1.field_e = this.field_e.field_e;
          param1.field_b.field_e = param1;
          if (!param0) {
            vl.a(107, 77);
          }
          param1.field_e.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final nm d(int param0) {
        nm var2 = this.field_e.field_e;
        if (var2 == this.field_e) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_e;
        if (param0 < -6) {
          return var2;
        }
        nm var3 = (nm) null;
        this.a((nm) null, (byte) 60);
        return var2;
    }

    final int e(int param0) {
        int var2 = 0;
        nm var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        nm var3Lifetime1;
        int var2Lifetime1;
        if (param0 >= 117) {
          var2 = 0;
          var3 = this.field_e.field_e;
          while (this.field_e != var3) {
            var2++;
            var3 = var3.field_e;
          }
          return var2;
        }
        field_a = (boolean[][]) null;
        var2Lifetime1 = 0;
        var3Lifetime1 = this.field_e.field_e;
        while (this.field_e != var3Lifetime1) {
          var2Lifetime1++;
          var3Lifetime1 = var3Lifetime1.field_e;
        }
        return var2Lifetime1;
    }

    final void a(nm param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_b) {
            param0.b((byte) 111);
          }
          param0.field_b = this.field_e.field_b;
          param0.field_e = this.field_e;
          param0.field_b.field_e = param0;
          param0.field_e.field_b = param0;
          if (param1 == 3) {
            return;
          }
          this.c(-52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vl.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        sb.field_c = !param0 ? new vj(mh.field_Z, ji.field_b) : new vj(ie.field_u, t.field_f);
        qa.field_w = new mh(0L, (mh) null);
        qa.field_w.a(sb.field_c.field_d, 0);
        qa.field_w.a(ij.field_e, 0);
        wi.field_j = new mh(0L, re.field_m);
        de.field_t = new mh(0L, (mh) null);
        wi.field_j.a(pk.field_h, 0);
        wi.field_j.a(de.field_t, 0);
        int var2 = -67 / ((1 - param1) / 63);
        de.field_t.a(vn.field_A, 0);
        de.field_t.a(nd.field_a, 0);
        kj.a(true, param0);
    }

    final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_e == this.field_e.field_e ? true : false;
    }

    final nm a(byte param0) {
        nm var2 = this.field_b;
        if (var2 == this.field_e) {
          this.field_b = null;
          return null;
        }
        if (param0 == 116) {
          this.field_b = var2.field_e;
          return var2;
        }
        return (nm) null;
    }

    final nm a(int param0) {
        nm var2 = this.field_e.field_b;
        if (var2 != this.field_e) {
          int var3 = 107 / ((51 - param0) / 59);
          var2.b((byte) 111);
          return var2;
        }
        return null;
    }

    final void c(byte param0) {
        int var3;
        nm var5;
        nm var4;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 <= -43) {
          while (true) {
            var4 = this.field_e.field_e;
            if (this.field_e != var4) {
              var4.b((byte) 111);
              continue;
            }
            break;
          }
          this.field_b = null;
          return;
        }
        this.e(115);
        while (true) {
          var5 = this.field_e.field_e;
          if (this.field_e != var5) {
            var5.b((byte) 111);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
              if (param1 <= -42) {
                return;
              }
              vl.a(false, -57);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("vl.N(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final nm a(byte param0, nm param1) {
        nm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        nm stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 94) {
            this.field_b = (nm) null;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_e.field_e;
          }
          if (var3 != this.field_e) {
            this.field_b = var3.field_e;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (nm) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vl.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final nm c(int param0) {
        if (param0 != 3) {
          return (nm) null;
        }
        nm var2 = this.field_e.field_e;
        if (this.field_e != var2) {
          var2.b((byte) 111);
          return var2;
        }
        return null;
    }

    final static void a(vm param0, int param1, boolean param2) {
        try {
          vj.a(param2, 256, (byte) 121, param0);
          if (param1 != -27300) {
            field_a = (boolean[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final nm b(int param0) {
        int var2 = 23 % ((param0 + 65) / 45);
        nm var3 = this.field_b;
        if (this.field_e == var3) {
          this.field_b = null;
          return null;
        }
        this.field_b = var3.field_b;
        return var3;
    }

    public vl() {
        this.field_e = new nm();
        this.field_e.field_b = this.field_e;
        this.field_e.field_e = this.field_e;
    }

    static {
        field_c = "Played";
        field_d = 3;
    }
}
