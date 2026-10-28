/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameAppletShell {
    static SystemTaskService field_r;
    static int field_q;
    private int field_w;
    private int field_u;
    private boolean field_x;
    private int field_y;
    private int field_o;
    private int field_t;
    private boolean field_v;
    private long field_m;
    String field_s;
    private boolean field_n;
    private int field_p;

    private final void g(int param0) {
        if (param0 <= 110) {
          this.h((byte) 65);
        }
        sn.field_b[4] = true;
    }

    final int k(byte param0) {
        int var2 = this.g((byte) 117);
        if (param0 != -67) {
          return 16;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (sn.field_b[1]) {
            di.a(-83, 2);
          }
          if (sn.field_b[2]) {
            ck.a(3, (byte) 105);
          }
          if (sn.field_b[3]) {
            tk.a(26, 4);
          }
          if (sn.field_b[4]) {
            im.a((byte) 88, 5);
          }
          if (sn.field_b[5]) {
            be.a(6, 17205);
          }
          if (sn.field_b[6]) {
            BoundedUrlRequest.a(7, 69);
          }
          if (sn.field_b[8]) {
            LevelObject.d((byte) 27);
          }
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        if (param1 != -556) {
          int[] var4 = (int[]) null;
          NetworkGameClient.a((byte[]) null, 119, (int[]) null, 11, -27);
        }
        return this.a(255, true, param0);
    }

    private final void f(byte param0) {
        wd.field_u[2] = -2;
        wd.field_u[10] = -1;
        wd.field_u[8] = -2;
        wd.field_u[12] = -1;
        wd.field_u[9] = -1;
        wd.field_u[11] = -1;
        wd.field_u[5] = -1;
        if (param0 != -14) {
          this.field_s = (String) null;
        }
        wd.field_u[4] = -1;
        wd.field_u[6] = -2;
        wd.field_u[16] = -1;
        wd.field_u[1] = 16;
        wd.field_u[3] = -1;
        wd.field_u[13] = -1;
        wd.field_u[17] = -1;
        wd.field_u[18] = 1;
        wd.field_u[7] = -1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ff.field_h = this.field_u;
        SpriteState.b(ff.field_h, 15);
        qf.a(5000, 5000, this.field_t, this.field_n, param4, field_r, this.field_p, param6, (byte) 84, this.field_o, this.field_m, this.field_s, ff.field_h, this.field_y);
        DualLinkNode.a(this.field_s, field_r, param4, param5 ^ 22212, ff.field_h, this.field_t, this.field_p, this.field_y, this.field_o);
        ImageProducerRasterBuffer.e(param5 + 213);
        ji.field_b = EscapeVector.n(13);
        rc.a(of.field_d, true);
        vi.field_g = param1;
        ve.field_k = param0;
        gi.field_l = param3;
        if (param5 != -99) {
          this.j(28);
        }
        dn.field_a = param2;
        wc.field_l = param7;
        this.f((byte) -14);
        GameKeyHandler.b(79);
    }

    final void j(int param0) {
        Object stackIn_12_0;
        boolean stackIn_12_3;
        int var3 = EscapeVector.obfuscationControl;
        if (param0 != -9926) {
          this.field_o = 25;
        }
        if (aa.a((byte) 102)) {
          int stackIn_11_1 = param0 ^ -9787;
          boolean stackIn_11_2 = false;
          if (null == IsaacRandom.field_d) {
            stackIn_12_0 = this;
            stackIn_12_3 = false;
          } else {
            stackIn_12_0 = this;
            stackIn_12_3 = true;
          }
          int discarded$1 = this.a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
        } else if (fc.field_a >= 10) {
          if (!jf.l(3)) {
            fc.a(true);
          } else if (ff.field_e == 0) {
            int discarded$2 = this.a(255, false, false);
          } else {
            ac.a(25972, mg.field_f);
          }
        }
    }

    final static Sprite[] e(int param0) {
        int var8 = EscapeVector.obfuscationControl;
        Sprite[] var1 = new Sprite[qk.field_j];
        for (int var2 = 0; qk.field_j > var2; var2++) {
          int var3 = qh.field_k[var2] * bc.field_a[var2];
          byte[] var20 = qe.field_a[var2];
          if (!UiContainer.field_E[var2]) {
            int[] var9 = new int[var3];
            int[] var21 = var9;
            for (int var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = qk.field_f[ae.a((int) var20[var6_int], 255)];
            }
            var1[var2] = new Sprite(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var21);
          } else {
            byte[] var22 = CheckboxPainter.field_b[var2];
            int[] var16 = new int[var3];
            int[] var13 = var16;
            int[] var6 = var13;
            for (int var7 = 0; var7 < var3; var7++) {
              var6[var7] = MatchingTextValidator.a(ae.a(255, (int) var22[var7]) << 24, qk.field_f[ae.a(255, (int) var20[var7])]);
            }
            var1[var2] = (Sprite) ((Object) new uh(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var16));
          }
        }
        if (param0 != 15556) {
          NetworkGameClient.e(126);
        }
        of.a(false);
        return var1;
    }

    private final void a(boolean param0, byte param1) {
        sn.field_b[18] = true;
        sn.field_b[17] = true;
        sn.field_b[0] = true;
        sn.field_b[3] = true;
        sn.field_b[16] = true;
        int var3 = -65 % ((-38 - param1) / 40);
        sn.field_b[8] = param0;
        sn.field_b[7] = true;
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (!this.a(true)) {
              return;
            }
            this.field_s = this.getCodeBase().getHost();
            String var6 = this.field_s.toLowerCase();
            boolean stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_x = stackIn_7_1;
            this.field_o = Integer.parseInt(this.getParameter("gameport1"));
            this.field_y = Integer.parseInt(this.getParameter("gameport2"));
            String var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_t = Integer.parseInt(var7);
            }
            this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_m = Long.parseLong(this.getParameter("instanceid"));
            this.field_n = this.getParameter("member").equals("yes");
            String var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_u = Integer.parseInt(var8);
            }
            if (this.field_u >= 5) {
              this.field_u = 0;
            }
            String var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_w = Integer.parseInt(var9);
            }
            bc.field_e = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_p, param3, 1, param0, param2, param4, param1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var6_ref = (Exception) (Object) decompiledCaughtException;
            String var10 = (String) null;
            pf.a(false, (String) null, (Throwable) ((Object) var6_ref));
            this.a(-1, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_23_0 = var6_ref2;
          StringBuilder stackIn_23_1 = new StringBuilder().append("g.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
          int var8 = EscapeVector.obfuscationControl;
          int var4 = mm.a(param0 ^ 191, param2, mg.field_f, ff.field_h);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            int var5_int = ui.a(kn.b(true), jd.a(false), 55);
            if (var5_int != -1) {
              jk.a(jf.field_I, MouseWheelInput.field_a, param0 ^ -156, var5_int);
              jf.field_I = null;
              MouseWheelInput.field_a = null;
            }
            Boolean var11 = vg.l(-9878);
            if (var11 != null) {
              bh.a(var11.booleanValue(), -19503);
            }
          }
          if (var4 == 2) {
            int var5_intLifetime1 = kh.a(DualLinkNode.e(0), this.field_w, TrackerMusicDefinition.c(31069), uf.a(30519), jh.d(param0 ^ -4157), oi.k(-99), 0);
            if (var5_intLifetime1 != -1) {
              j.a(jf.field_I, MouseWheelInput.field_a, (byte) -72, var5_intLifetime1);
              jf.field_I = null;
              MouseWheelInput.field_a = null;
            }
          }
          if (3 == var4) {
            if (IntKeyLookup.field_b != -1 &&
              0 != IntKeyLookup.field_b) {
              IntKeyLookup.field_b = -1;
              SecondaryIntrusiveDeque.d(0);
            }
            if (param1) {
              q.field_P = false;
            } else {
              int var5_intLifetime2 = mj.a(1, this.field_w, uf.a(30519), DualLinkNode.e(0), false, this.field_x);
              if (var5_intLifetime2 != -1) {
                if (0 == var5_intLifetime2) {
                  eb.field_J = mg.field_d;
                  qd.a(true);
                  ff.field_e = 10;
                  SpriteState.field_u = false;
                } else {
                  EmailSyntaxValidator.a(var5_intLifetime2, (byte) 83, MouseWheelInput.field_a);
                  MouseWheelInput.field_a = null;
                }
              }
            }
          }
          if (var4 == 4) {
            if (ej.field_d) {
              DiskCacheRequest.a(PointCloudEffect.d((byte) -113), 21027);
            } else {
              SpriteState.field_u = true;
              ff.field_e = 10;
            }
          }
          if (var4 == 5) {
            gk.a(param0 - 10042, PointCloudEffect.d((byte) -72));
          }
          if (var4 == 6 &&
            CipherPacketBuffer.field_u) {
            ff.field_e = 10;
          }
          if (var4 == 7) {
            v.a(PointCloudEffect.d((byte) -120), (byte) -99);
          }
          if (var4 == 8) {
            DiskCacheRequest.a(PointCloudEffect.d((byte) -127), param0 ^ 21212);
          }
          if (var4 == 9) {
            dm.a(param0 - 251, PointCloudEffect.d((byte) -89));
          }
          if (var4 == 10) {
            om.field_c.writeCipheredOpcode(17, true);
          }
          if (param0 != 255) {
            this.field_m = -32L;
          }
          if (var4 == 11) {
            IntValueNode.a(false, PointCloudEffect.d((byte) -102));
          }
          if (var4 == 12) {
            md.a(PointCloudEffect.d((byte) -86), (byte) -123, EmailAvailabilityValidator.c((byte) -31));
          }
          if (var4 == 13) {
            try {
              if (ViewportController.field_m == null) {
                ViewportController.field_m = new BoundedUrlRequest(field_r, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ViewportController.field_m.a(17)) {
                PacketBuffer var12 = ViewportController.field_m.c(-43);
                if (var12 != null) {
                  String var7 = qi.a(var12.position, 0, var12.payload, (byte) 117);
                  jk.a(var7, (byte) -6);
                } else {
                  String var9 = (String) null;
                  jk.a((String) null, (byte) -6);
                }
                ViewportController.field_m = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              Exception var5 = (Exception) (Object) decompiledCaughtException;
              pf.a(false, "S1", (Throwable) ((Object) var5));
              String var10 = (String) null;
              jk.a((String) null, (byte) -6);
              ViewportController.field_m = null;
            }
          }
          if (15 == var4) {
            ff.field_e = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) 78);
        if (param0) {
          this.d(true);
        }
        if (param2) {
          this.j((byte) -113);
        }
        int var6 = 84 / ((28 - param1) / 60);
        if (param3) {
          this.g(127);
        }
        if (param4) {
          this.k(125);
        }
    }

    private final void c(boolean param0) {
        int var2 = om.field_g.readUnsignedByte(0);
        boolean var3 = ((1 & var2) != 0);
        int var4 = -1 + EmailSyntaxValidator.field_r;
        byte[] var5 = new byte[var4];
        om.field_g.readCipheredBytes(var5, 19583, var4, 0);
        Bzip2State.a(param0, (var3), PointCloudEffect.d((byte) -122), RasterSnapshot.a(var5, 117));
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.a(param1, param0, 480, param2, 32);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "g.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        bk.field_r = new sf(param1);
        int var2 = 45 / ((param0 - 89) / 35);
    }

    final void f(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = cd.field_v;
        int var3 = 96 % ((80 - param0) / 33);
        if (var2 < 64 &&
          sn.field_b[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            ll.b(false);
          } else if (2 == var2) {
            ja.a((byte) -120);
          } else if (3 == var2) {
            ImageProducerRasterBuffer.c(103);
          } else if (var2 == 4) {
            dk.e(108457410);
          } else if (var2 == 5) {
            AudioService.a((byte) 124);
          } else if (var2 == 6) {
            ri.a((byte) 113);
          } else if (7 == var2) {
            this.h((byte) 108);
          } else if (var2 == 8) {
            km.a(om.field_g, field_r, EmailSyntaxValidator.field_r, -24183);
          } else if (var2 == 16) {
            ll.a(true);
          } else {
            if (11 != var2 &&
              12 != var2) {
              if (13 == var2) {
                bk.g(0);
                return;
              }
              if (var2 == 17) {
                this.c(true);
                return;
              }
              if (var2 == 18) {
                vd.a((byte) -125);
                return;
              }
              pf.a(false, "MGS1: " + hf.b((byte) 107), (Throwable) null);
              nm.a(16);
              return;
            }
            boolean stackIn_25_0 = (12 == var2);
            gi var4 = sl.a(stackIn_25_0, 2);
            DynamicTerrainRenderer.a(19956, var4);
          }
          return;
        }
        pf.a(false, "MGS2: " + hf.b((byte) 49), (Throwable) null);
        nm.a(16);
    }

    final static void a(byte[] param0, int param1, int[] param2, int param3, int param4) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (param3 <= 113) {
            field_r = (SystemTaskService) null;
          }
          int var5_int = 0;
          while (true) {
            if (var5_int >= al.field_f.length) {
              return;
            }
            param4 = al.field_f[var5_int];
            int var6 = var5_int << 4;
            while (true) {
              int incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              int incrementValue$1 = var6;
              var6++;
              param1 = bc.field_f[incrementValue$1];
              byte dupTemp$2 = param0[param1];
              int dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              bc.field_f[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("g.IA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void h(byte param0) {
        String var2 = tf.b((byte) 0);
        SecondaryIntrusiveDeque.a(var2, -112, PointCloudEffect.d((byte) -59));
        int var3 = 59 % ((param0 - 41) / 61);
    }

    public static void releaseStatics(byte guard) {
        field_r = null;
        if (guard != -73) {
          NetworkGameClient.a(-56, 26);
        }
    }

    private final void j(byte param0) {
        if (param0 >= -63) {
          this.field_p = -123;
        }
        sn.field_b[2] = true;
    }

    private final void k(int param0) {
        if (param0 < 99) {
          String var3 = (String) null;
          this.a(69, (String) null, -3, 75, 67);
        }
        sn.field_b[5] = true;
    }

    private final int g(byte param0) {
        if (this.field_b) {
          return -1;
        }
        if (!um.a(17830)) {
          return -1;
        }
        if (q.field_P) {
          return -1;
        }
        int var2 = mj.a(1, this.field_w, uf.a(param0 ^ 30530), DualLinkNode.e(param0 - 117), true, this.field_x);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!fh.field_a) {
            this.a(-1, "reconnect");
          }
          sc.b((byte) -123);
          EmailSyntaxValidator.a(var2, (byte) 83, MouseWheelInput.field_a);
          if (param0 != 117) {
            this.field_s = (String) null;
          }
          q.field_P = true;
          tg.field_mb = td.b(128) + 15000L;
          return var2;
        }
        if (11 == ff.field_e &&
          0 == IntKeyLookup.field_b) {
          qd.a(true);
        }
        return var2;
    }

    final void a(int param0, boolean param1) {
        int var5 = EscapeVector.obfuscationControl;
        if (km.field_n != null) {
          if (null == IsaacRandom.field_d) {
            java.awt.Container var6 = TextLayout.gameContainer(-1);
            java.awt.Dimension var4 = var6.getSize();
            km.field_n.setDesiredSize(var4.height, var4.width, 18705);
          }
          km.field_n.updateViewport(9477);
        }
        ac.a(28087);
        SpriteState.g(-3657);
        if (!ii.b(16836) &&
          11 != ff.field_e) {
          b.a(-103);
        }
        if (null != ji.field_b) {
          mg.field_f = ji.field_b.pollRotation(-126);
        }
        if (HudMessage.a(true)) {
          int var3 = 1200 * se.a(0);
          if (this.field_v ||
            !(mg.a((byte) -12) <= var3) &&
            !(of.a((byte) -127) <= var3)) {
            this.field_v = false;
            nm.a(param0 ^ -17);
            sc.b((byte) -87);
            EmailSyntaxValidator.a(2, (byte) 83, TextFieldValidator.field_g);
            IntrusiveNode.a(12);
            q.field_P = true;
            tg.field_mb = td.b(param0 + 129) + 15000L;
          }
        }
        if (IntKeyLookup.field_b == -1 ||
          IntKeyLookup.field_b == 0) {
          boolean stackIn_24_0 = !(-1 != IntKeyLookup.field_b);
          boolean var3Lifetime1 = stackIn_24_0;
          IntKeyLookup.field_b = ae.b(param0 - 1021831774);
          if (var3Lifetime1 &&
            0 == IntKeyLookup.field_b &&
            ff.field_e == 11 &&
            !um.a(17830)) {
            qd.a(true);
          }
          if (IntKeyLookup.field_b != -1 &&
            IntKeyLookup.field_b != 0) {
            tg.field_mb = 15000L + td.b(128);
          }
        }
        if (IntKeyLookup.field_b != -1 &&
          IntKeyLookup.field_b != 0) {
          if (10 > fc.field_a) {
            if (IntKeyLookup.field_b == 3) {
              this.a(param0 + 0, "js5crc");
            } else if (IntKeyLookup.field_b == 4) {
              this.a(-1, "js5io");
            } else if (2 == IntKeyLookup.field_b) {
              this.a(-1, "js5connect_full");
            } else if (IntKeyLookup.field_b != 5) {
              this.a(-1, "js5connect");
            } else {
              this.a(-1, "outofdate");
            }
          } else if (ff.field_e >= 10) {
            sc.b((byte) -103);
            if (IntKeyLookup.field_b == 3) {
              EmailSyntaxValidator.a(256, (byte) 83, GameKeyHandler.field_b);
            } else if (IntKeyLookup.field_b == 4) {
              EmailSyntaxValidator.a(256, (byte) 83, nn.field_e);
            } else if (IntKeyLookup.field_b == 2) {
              EmailSyntaxValidator.a(256, (byte) 83, km.field_l);
            } else if (IntKeyLookup.field_b != 5) {
              EmailSyntaxValidator.a(256, (byte) 83, gm.field_f);
            } else {
              EmailSyntaxValidator.a(5, (byte) 83, gj.field_a);
            }
            q.field_P = true;
          }
        }
        if ((param0 != IntKeyLookup.field_b &&
          IntKeyLookup.field_b != 0 ||
          um.a(17830)) &&
          tg.field_mb <= td.b(128)) {
          q.field_P = false;
          if (IntKeyLookup.field_b != -1 &&
            IntKeyLookup.field_b != 0) {
            IntKeyLookup.field_b = -1;
            SecondaryIntrusiveDeque.d(~param0);
          }
        }
        if (0 == IntKeyLookup.field_b &&
          !um.a(param0 ^ -17831)) {
          pb.field_d = false;
        }
        if (0 == fc.field_a &&
          tk.a(23403)) {
          fc.field_a = 1;
        }
        if (fc.field_a == 1) {
          if (ff.field_h != 0) {
            PasswordValidator.field_p = mj.a(dn.field_a, param0 - 127);
          }
          ii.field_a = ve.a(ve.field_k, 0, false, 1, true);
          w.field_ab = ve.a(gi.field_l, 0, false, 1, true);
          pl.field_j = ve.a(vi.field_g, 0, false, 1, true);
          ve.field_h = ii.field_a;
          fc.field_a = 2;
          ei.field_m = w.field_ab;
        }
        if (fc.field_a == 2) {
          if (null != PasswordValidator.field_p &&
            PasswordValidator.field_p.b(~param0)) {
            if (!PasswordValidator.field_p.a("", (byte) -119)) {
              PasswordValidator.field_p = null;
            } else if (PasswordValidator.field_p.a(0, "")) {
              DropTargetWidget.a(true, PasswordValidator.field_p);
              PasswordValidator.field_p = null;
              SpriteOffset.a((byte) 62);
            }
          }
          if (PasswordValidator.field_p == null) {
            fc.field_a = 3;
          }
        }
        if (3 == fc.field_a &&
          of.a(ii.field_a, w.field_ab, pl.field_j, (byte) -90) &&
          cf.a(11, pl.field_j)) {
          PasswordValidator.h(-8055);
          on.b(-87);
          CipherPacketBuffer.field_u = false;
          hd.field_e = um.field_a;
          dh.a(ej.field_d, (byte) -124, pl.field_j, ii.field_a, w.field_ab);
          if (jb.field_p ||
            ac.field_d != null) {
            String stackIn_98_0 = ac.field_d;
            boolean stackIn_99_1 = !(jb.field_p);
            int stackIn_101_2 = 64;
            boolean stackIn_102_3 = !(jb.field_p);
            ff.a(stackIn_98_0, stackIn_99_1, stackIn_101_2, stackIn_102_3);
          }
          if (bc.field_e) {
            bm.a(4);
          }
          if (gb.field_b == null) {
            gb.field_b = ld.c((byte) 117);
            sj.field_h = wc.c(-31119);
          }
          je.a(pl.field_j, gb.field_b, sj.field_h, (byte) 103);
          ii.field_a = null;
          pl.field_j = null;
          w.field_ab = null;
          QuickChatPhraseDefinition.a(82, (java.applet.Applet) (this));
          SpriteOffset.a((byte) 126);
          fc.field_a = 10;
        }
        if (fc.field_a == 10) {
          if (ff.field_h != 0) {
            mg.field_c = mj.a(wc.field_l, -127);
          }
          fc.field_a = 11;
        }
        if (fc.field_a == 11) {
          if (mg.field_c != null && (!mg.field_c.b(0) ||
            !mg.field_c.a((byte) -119))) {
            dn.a(vh.a(md.field_H, mg.field_c, gj.field_g, -12920), 17637, 0.0f);
            boolean decompiledFrameRemainder0 = false;
          }
          else {
            of.field_b = true;
            fc.field_a = 12;
          }
        }
        if (fc.field_a == 12 &&
          !of.field_b) {
          fc.field_a = 13;
        }
        if (fc.field_a == 13) {
          boolean var3Lifetime2 = true;
          if (null != DualLinkNode.field_n) {
            boolean stackIn_131_0 = !(!DualLinkNode.field_n.a(7020));
            var3Lifetime2 = stackIn_131_0;
            dn.a(DualLinkNode.field_n.field_b, 17637, DualLinkNode.field_n.field_a);
          }
          if (var3Lifetime2) {
            fc.field_a = 20;
          }
        }
        if (!param1 &&
          PacketBuffer.field_i) {
          bo.a(of.field_d, (byte) -127);
          this.d(-32);
          rc.a(of.field_d, true);
        }
        if (sn.field_b[8]) {
          CipherPacketBuffer.p(11197);
        }
    }

    final static boolean i(int param0) {
        int var1 = 50 % ((param0 - 14) / 40);
        return true;
    }

    final static void h(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          int[] var5 = al.field_f;
          int[] var1 = var5;
          int var2 = 0;
          int var3 = var5.length;
          if (param0 >= -110) {
            return;
          }
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "g.MA(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        sn.field_b[1] = param0;
    }

    protected NetworkGameClient() {
    }

    static {
        field_q = -1;
    }
}
