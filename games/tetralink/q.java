/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q implements kg {
    private int field_c;
    private jb field_e;
    static String field_d;
    static String[] field_a;
    private int field_f;
    static ah field_b;

    final static void b(int param0) {
        hm.field_a = af.field_h;
        hd.field_v = param0;
        if (kb.field_t == ed.field_O) {
          return;
        }
        if (qb.a(kb.field_t, (byte) 114)) {
          kk.field_X[kb.field_t].b(param0 ^ 4);
        }
        qe.field_b = nn.field_X;
        if (tb.field_g) {
          ud.field_Qb = null;
          aa.field_bc = null;
          tb.field_g = false;
        }
        kb.field_t = ed.field_O;
        if (!qh.field_k) {
          return;
        }
        qi.b((byte) -98);
        re.e((byte) -33);
        ji.h(0);
        qh.field_k = false;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 <= 83) {
          field_a = (String[]) null;
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          if (param0) {
            field_a = (String[]) null;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ac.a((byte) -103, (char) var3) &&
              !fd.a((char) var3, (byte) 81)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("q.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, long param2) {
        int var5 = 0;
        bc var4 = nd.field_Lb;
        int var5Lifetime1;
        var4.f(param0, (byte) -92);
        if (param1 == -118) {
          var4.field_t = var4.field_t + 1;
          var5 = var4.field_t;
          var4.a(6, false);
          var4.a(-1, param2);
          var4.b(var4.field_t - var5, param1 + 116);
          return;
        }
        q.b(106);
        var4.field_t = var4.field_t + 1;
        var5Lifetime1 = var4.field_t;
        var4.a(6, false);
        var4.a(-1, param2);
        var4.b(var4.field_t - var5Lifetime1, param1 + 116);
    }

    public q() {
        this.field_c = 1;
        this.field_e = od.field_S;
        this.field_f = 1;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        java.applet.Applet var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          var4_int = -1;
          for (var5 = param3; param2 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ bl.field_Ub[255 & (var4_int ^ param0[var5])];
          }
          if (param1 != 2) {
            var7 = (java.applet.Applet) null;
            q.a((java.applet.Applet) null, -67);
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("q.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    q(jb param0, int param1, int param2) {
        try {
          this.field_f = param2;
          this.field_e = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "q.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          if (!param0.field_r &&
            !param0.c(3)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_A + "</u>", param0.field_t + param1, param2 + param0.field_w, param0.field_F, param0.field_u, var6_int, -1, this.field_c, this.field_f, this.field_e.field_K + this.field_e.field_N);
          if (!param3) {
            field_a = (String[]) null;
          }
          if (param0.c(3)) {
            var7 = this.field_e.b(param0.field_A);
            var8 = this.field_e.field_N + this.field_e.field_K;
            var9 = param0.field_t + param1;
            var10 = param0.field_w + param2;
            if (this.field_c != 2) {
              if (this.field_c == 1) {
                var9 = var9 + (-var7 + param0.field_F >> 1);
              }
            } else {
              var9 = var9 + (-var7 + param0.field_F);
            }
            if (this.field_f == 2) {
              var10 = var10 + (param0.field_u - var8);
            } else {
              if (this.field_f == 1) {
                var10 = var10 + (-var8 + param0.field_u >> 1);
              }
            }
            id.a(4 + var7, var10 + 2, 0, var8, var9 - 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("q.L(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var5 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          var4 = 53 / ((-77 - param0) / 34);
          for (var5 = 0; var2_int > var5; var5++) {
            {
              var6 = param1.charAt(var5);
              if ((var6 <= 0 ||
                var6 >= 128) && (var6 < 160 ||
                var6 > 255)) {
                switch (var6) {
                  case 8364:
                    var3[var5] = (byte)-128;
                    break;
                  case 8218:
                    var3[var5] = (byte)-126;
                    break;
                  case 402:
                    var3[var5] = (byte)-125;
                    break;
                  case 8222:
                    var3[var5] = (byte)-124;
                    break;
                  case 8230:
                    var3[var5] = (byte)-123;
                    break;
                  case 8224:
                    var3[var5] = (byte)-122;
                    break;
                  case 8225:
                    var3[var5] = (byte)-121;
                    break;
                  case 710:
                    var3[var5] = (byte)-120;
                    break;
                  case 8240:
                    var3[var5] = (byte)-119;
                    break;
                  case 352:
                    var3[var5] = (byte)-118;
                    break;
                  case 8249:
                    var3[var5] = (byte)-117;
                    break;
                  case 338:
                    var3[var5] = (byte)-116;
                    break;
                  case 381:
                    var3[var5] = (byte)-114;
                    break;
                  case 8216:
                    var3[var5] = (byte)-111;
                    break;
                  case 8217:
                    var3[var5] = (byte)-110;
                    break;
                  case 8220:
                    var3[var5] = (byte)-109;
                    break;
                  case 8221:
                    var3[var5] = (byte)-108;
                    break;
                  case 8226:
                    var3[var5] = (byte)-107;
                    break;
                  case 8211:
                    var3[var5] = (byte)-106;
                    break;
                  case 8212:
                    var3[var5] = (byte)-105;
                    break;
                  case 732:
                    var3[var5] = (byte)-104;
                    break;
                  case 8482:
                    var3[var5] = (byte)-103;
                    break;
                  case 353:
                    var3[var5] = (byte)-102;
                    break;
                  case 8250:
                    var3[var5] = (byte)-101;
                    break;
                  case 339:
                    var3[var5] = (byte)-100;
                    break;
                  case 382:
                    var3[var5] = (byte)-98;
                    break;
                  case 376:
                    var3[var5] = (byte)-97;
                    break;
                  default:
                    var3[var5] = (byte)63;
                    break;
                }
              } else {
                var3[var5] = (byte)var6;
              }
            }
          }
          stackIn_67_0 = var3;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_70_0 = var2;
          stackIn_70_1 = new StringBuilder().append("q.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              if (param1 <= 60) {
                return;
              }
              var3 = ai.a(var4, (byte) -120, param0).getFile();
              ii.a(new Object[]{"home", var3 + "home.ws"}, 6760, "updatelinks", param0);
              ii.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, 6760, "updatelinks", param0);
              ii.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, 6760, "updatelinks", param0);
              ii.a(new Object[]{"options", var3 + "options.ws"}, 6760, "updatelinks", param0);
              ii.a(new Object[]{"terms", var3 + "terms.ws"}, 6760, "updatelinks", param0);
              ii.a(new Object[]{"privacy", var3 + "privacy.ws"}, 6760, "updatelinks", param0);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("q.F(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = "No";
    }
}
