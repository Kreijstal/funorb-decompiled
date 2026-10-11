/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends ug {
    static int[] field_e;
    static le[] field_i;
    static ai field_k;
    int field_g;
    static int field_h;
    int field_j;
    static fc field_f;

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if ((param1 <= 0 ||
            param1 >= 128) && (param1 < 160 ||
            param1 > 255)) {
            if (param1 == 8364) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (param1 == 402) {
              var2 = -125;
            } else if (param1 == 8222) {
              var2 = -124;
            } else if (param1 == 8230) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (param1 == 710) {
              var2 = -120;
            } else if (8240 == param1) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (338 == param1) {
              var2 = -116;
            } else if (381 == param1) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (param1 == 8217) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (param1 == 8221) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (8211 == param1) {
              var2 = -106;
            } else if (param1 == 8212) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (param1 == 339) {
              var2 = -100;
            } else if (382 == param1) {
              var2 = -98;
            } else if (param1 == 376) {
              var2 = -97;
            } else {
              var2 = 63;
            }
          } else {
            var2 = (byte)param1;
          }
        }
        if (param0 == 1) {
          return (byte) var2;
        }
        return (byte) 57;
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
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              if (param0 > -15) {
                field_h = 14;
              }
              param1.getAppletContext().showDocument(uf.a(param1, (byte) 115, var2), "_top");
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
            stackIn_8_1 = new StringBuilder().append("m.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = ie.field_e.getGraphics();
            if (de.field_o == null) {
              de.field_o = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, ub.field_b, lb.field_z);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (ei.field_b == null) {
                ei.field_b = ie.field_e.createImage(304, 34);
              }
              var10 = ei.field_b.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param2, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param2 + 2, 2, 300 - param2 * 3, 30);
              var10.setFont(de.field_o);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
              var9.drawImage(ei.field_b, -152 + ub.field_b / 2, -18 + lb.field_z / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = ub.field_b / 2 - 152;
              var8 = lb.field_z / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, 3 * param2, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, var8 + 1, 301, 31);
              var9.fillRect(3 * param2 + (var7 + 2), var8 + 2, -(3 * param2) + 300, 30);
              var9.setFont(de.field_o);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, (304 - 6 * param0.length()) / 2 + var7, var8 + 22);
            }
            if (null != rj.field_B) {
              var9.setFont(de.field_o);
              var9.setColor(java.awt.Color.white);
              var9.drawString(rj.field_B, ub.field_b / 2 - 6 * rj.field_B.length() / 2, -26 + lb.field_z / 2);
            }
            if (param4 != -3) {
              field_e = (int[]) null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ie.field_e.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("m.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        m var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hb var13 = null;
        int var14 = 0;
        hb var15 = null;
        int[][] var19 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var13 = MonkeyPuzzle2.field_D;
          var15 = var13;
          var2 = var15.a((byte) 114);
          var3 = (m) (gi.field_l.a((byte) -117));
          while (var3 != null) {
            if (~var3.field_g != ~var2) {
              var3 = (m) (gi.field_l.d((byte) 63));
              continue;
            }
            break;
          }
          if (var3 == null) {
            gk.a(-1);
            return;
          }
          if (param0 != -106) {
            field_k = (ai) null;
          }
          var4 = var15.a((byte) 114);
          if (var4 != 0) {
            var5 = var3.field_j;
            ni.field_d[0] = cl.field_e;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              ni.field_d[var6_int] = var13.f(-1);
            }
            sb.b(2, var5, var4);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              hc.a((byte) 82, var15);
              if (var6_intLifetime1 != 0) {
                hb.a(de.field_m, var6_intLifetime1, qd.field_a, mk.field_i, 1000, lk.field_a);
              } else {
                hb.a(de.field_m, var6_intLifetime1, qd.field_a, mk.field_i, param0 ^ -898, lk.field_a);
              }
            }
            hb.b((byte) 115, var5);
            var6 = new String[2][var5];
            var19 = new int[2][4 * var5];
            var8 = fd.field_n;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = hl.field_f[var9];
              var6[0][var10] = ni.field_d[var11];
              var19[0][4 * var10] = gi.field_e[var11];
              var19[0][1 + var10 * 4] = jc.field_a[var11];
              var19[0][2 + 4 * var10] = hf.field_c[var11];
              var19[0][3 + var10 * 4] = rb.field_fb[var11];
              if (f.a(-15189, ni.field_d[var11]) &&
                0 == jc.field_a[var11] - (-hf.field_c[var11] - rb.field_fb[var11])) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = hl.field_f[var9Lifetime1 + var5];
              var6[1][var14] = ni.field_d[var11Lifetime1];
              var19[1][var14 * 4] = gi.field_e[var11Lifetime1];
              var19[1][1 + 4 * var14] = jc.field_a[var11Lifetime1];
              var19[1][2 + var14 * 4] = hf.field_c[var11Lifetime1];
              var19[1][4 * var14 + 3] = rb.field_fb[var11Lifetime1];
              if (f.a(-15189, ni.field_d[var11Lifetime1]) &&
                hf.field_c[var11Lifetime1] + jc.field_a[var11Lifetime1] + rb.field_fb[var11Lifetime1] == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
            var3.c(-19822);
            return;
          }
          var3.c(-19822);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "m.E(" + param0 + ')');
        }
    }

    private m() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 < 15) {
          return;
        }
        field_e = null;
        field_i = null;
    }

    static {
        field_e = new int[5];
        field_h = 0;
        field_f = null;
    }
}
