/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClientShell extends GameAppletShell {
    private int field_m;
    String field_z;
    static String field_s;
    private int field_n;
    static BitmapFont field_o;
    private int field_u;
    private boolean field_r;
    private int field_v;
    private static int field_q;
    private long field_w;
    static String field_B;
    private int field_p;
    static he[] field_x;
    private boolean field_y;
    private boolean field_t;
    private int field_A;

    final void a(boolean param0, int param1) {
        int stackIn_25_0 = 0;
        String stackIn_101_0 = null;
        boolean stackIn_102_1 = false;
        boolean stackIn_105_2 = false;
        int stackIn_134_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null != pi.field_V) {
          if (null == df.field_l) {
            var6 = MatchingFieldValidator.b(false);
            var4 = var6.getSize();
            pi.field_V.a(var4.height, var4.width, 2);
          }
          pi.field_V.a((byte) 123);
        }
        GameAppletShell.b((byte) -81);
        ia.a(-116);
        if (!kh.a(false) &&
          af.field_b != 11) {
          lg.a(2);
        }
        if (param1 < 34) {
          this.field_p = -105;
        }
        if (sc.field_e != null) {
          ma.field_sb = sc.field_e.pollRotation(0);
        }
        if (DiskCacheWorker.a(64)) {
          var3 = 1200 * AccountNameAvailabilityValidator.d((byte) 9);
          if (this.field_r ||
            !(MatchingFieldValidator.c(false) <= var3) &&
            !(var3 >= ValidatedTextField.m(12484))) {
            this.field_r = false;
            eg.a((byte) 126);
            MusicPatchPcmStream.e(11);
            dl.a(EmailFormatValidator.field_u, 2, 120);
            fj.e(115);
            dd.field_j = true;
            ab.field_a = la.correctedCurrentTimeMillis(false) + 15000L;
          }
        }
        if (mh.field_d == -1 ||
          mh.field_d == 0) {
          stackIn_25_0 = (-1 != mh.field_d) ? 0 : 1;
          var3Lifetime1 = stackIn_25_0;
          mh.field_d = dm.d(-106);
          if (var3Lifetime1 != 0 &&
            0 == mh.field_d &&
            11 == af.field_b &&
            !sb.b(-11)) {
            wh.b(true);
          }
          if (mh.field_d != -1 &&
            mh.field_d != 0) {
            ab.field_a = 15000L + la.correctedCurrentTimeMillis(false);
          }
        }
        if (mh.field_d != -1 &&
          mh.field_d != 0) {
          if (10 > hj.field_f) {
            if (3 == mh.field_d) {
              this.a(-51, "js5crc");
            } else {
              if (mh.field_d == 4) {
                this.a(-51, "js5io");
              } else {
                if (mh.field_d != 2) {
                  if (mh.field_d == 5) {
                    this.a(-51, "outofdate");
                  } else {
                    this.a(-51, "js5connect");
                  }
                } else {
                  this.a(-51, "js5connect_full");
                }
              }
            }
          } else {
            if (10 <= af.field_b) {
              MusicPatchPcmStream.e(11);
              if (mh.field_d != 3) {
                if (4 == mh.field_d) {
                  dl.a(MidiPcmStream.field_p, 256, 102);
                } else {
                  if (mh.field_d != 2) {
                    if (mh.field_d != 5) {
                      dl.a(db.field_f, 256, 68);
                    } else {
                      dl.a(gm.field_K, 5, 105);
                    }
                  } else {
                    dl.a(ce.field_d, 256, 75);
                  }
                }
              } else {
                dl.a(IntrusiveDeque.field_e, 256, 66);
              }
              dd.field_j = true;
            }
          }
        }
        if ((-1 != mh.field_d &&
          0 != mh.field_d ||
          sb.b(-11)) &&
          la.correctedCurrentTimeMillis(false) >= ab.field_a) {
          dd.field_j = false;
          if (mh.field_d != -1 &&
            mh.field_d != 0) {
            mh.field_d = -1;
            df.a((byte) 112);
          }
        }
        if (mh.field_d == 0 &&
          !sb.b(-11)) {
          EditableTextField.field_S = false;
        }
        if (0 == hj.field_f &&
          jj.b(-98)) {
          hj.field_f = 1;
        }
        if (hj.field_f == 1) {
          if (0 != ob.field_c) {
            DiskArchiveRequest.field_I = al.a(3, md.field_d);
          }
          AccountCreationResultPanel.field_Jb = lk.a(false, true, hb.field_q, 1, 8);
          sb.field_i = lk.a(false, true, field_q, 1, 8);
          ig.field_t = lk.a(false, true, NameSuggestionsPanel.field_O, 1, 8);
          si.field_E = sb.field_i;
          hj.field_f = 2;
          ph.field_b = AccountCreationResultPanel.field_Jb;
        }
        if (hj.field_f == 2) {
          if (null != DiskArchiveRequest.field_I &&
            DiskArchiveRequest.field_I.ensureIndexLoaded(0)) {
            if (DiskArchiveRequest.field_I.hasGroupName((byte) 12, "")) {
              if (DiskArchiveRequest.field_I.tryLoadGroupByName(255, "")) {
                NameSuggestionsPanel.a(7, DiskArchiveRequest.field_I);
                DiskArchiveRequest.field_I = null;
                IterableNodeHashTable.a((byte) 86);
              }
            } else {
              DiskArchiveRequest.field_I = null;
            }
          }
          if (DiskArchiveRequest.field_I == null) {
            hj.field_f = 3;
          }
        }
        if (hj.field_f == 3 &&
          PasswordValidator.a(ig.field_t, (byte) -91, sb.field_i, AccountCreationResultPanel.field_Jb) &&
          pa.a((byte) 64, ig.field_t)) {
          dm.c((byte) 94);
          ue.a(false);
          rh.field_d = ha.field_e;
          gm.field_M = false;
          wh.a(-80, sb.field_i, ig.field_t, AccountCreationResultPanel.field_Jb, bd.field_N);
          if (fm.field_l ||
            null != hb.field_b) {
            stackIn_101_0 = hb.field_b;
            stackIn_102_1 = !(fm.field_l);
            stackIn_105_2 = !(fm.field_l);
            eb.a(stackIn_101_0, stackIn_102_1, stackIn_105_2, 10);
          }
          if (em.field_b) {
            ka.a((byte) -87);
          }
          if (ac.field_b == null) {
            ac.field_b = ai.g(-29132);
            pe.field_j = ac.a(-1);
          }
          ui.a(ac.field_b, (byte) -88, pe.field_j, ig.field_t);
          sb.field_i = null;
          ig.field_t = null;
          AccountCreationResultPanel.field_Jb = null;
          DirectByteStorage.a(79, (java.applet.Applet) (this));
          IterableNodeHashTable.a((byte) 86);
          hj.field_f = 10;
        }
        if (10 == hj.field_f) {
          if (ob.field_c != 0) {
            df.field_m = al.a(3, p.field_f);
          }
          hj.field_f = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (hj.field_f == 11) {
          if (df.field_m != null && (!df.field_m.ensureIndexLoaded(0) ||
            !df.field_m.tryLoadAllGroups((byte) 126))) {
            we.a(EditableTextField.a(mi.field_d, df.field_m, 27867, dh.field_J), -125, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            nd.field_Q = true;
            hj.field_f = 12;
          }
        }
        if (12 == hj.field_f &&
          !nd.field_Q) {
          hj.field_f = 13;
        }
        if (hj.field_f == 13) {
          var3Lifetime2 = 1;
          if (null != jl.field_k) {
            stackIn_134_0 = (!jl.field_k.a(-11255)) ? 0 : 1;
            var3Lifetime2 = stackIn_134_0;
            we.a(jl.field_k.field_h, -111, jl.field_k.field_a);
          }
          if (var3Lifetime2 != 0) {
            hj.field_f = 20;
          }
        }
        if (!param0 &&
          ci.field_U) {
          hb.a(-5, DiskCacheWorker.field_g);
          this.f(118);
          ej.a(DiskCacheWorker.field_g, (byte) 95);
        }
        if (AgeValidator.field_p[8]) {
          vg.b((byte) 75);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ob.field_c = this.field_n;
        NameSuggestionsPanel.a((byte) 119, ob.field_c);
        DelegatingCanvas.a(this.field_t, this.field_A, (byte) 34, this.field_v, 5000, sb.field_d, ob.field_c, 5000, this.field_z, this.field_m, this.field_p, param2, this.field_w, param1);
        wi.a(this.field_v, param1, ob.field_c, this.field_m, this.field_z, this.field_p, sb.field_d, this.field_A, 111);
        rg.a(param3 ^ -11603);
        sc.field_e = vb.createMouseWheelInput((byte) 65);
        ej.a(DiskCacheWorker.field_g, (byte) 71);
        md.field_d = param7;
        p.field_f = param6;
        if (param3 != 7320) {
          this.field_m = -76;
        }
        NameSuggestionsPanel.field_O = param5;
        hb.field_q = param4;
        field_q = param0;
        this.l(param3 ^ -7321);
        bf.b(param3 ^ 7192);
    }

    private final void i(int param0) {
        if (param0 >= -106) {
          field_o = (BitmapFont) null;
        }
        String var2 = ca.b(false);
        hg.a(nb.a(-102), -1, var2);
    }

    private final void n(int param0) {
        if (param0 != -5721) {
          this.c(false);
        }
        AgeValidator.field_p[4] = true;
    }

    final int b(boolean param0) {
        int var2;
        if (this.field_c) {
          return -1;
        }
        if (!sb.b(-11)) {
          return -1;
        }
        if (dd.field_j) {
          return -1;
        }
        var2 = f.a(this.field_u, -50, true, fl.a(false), IntrusiveDeque.f(-61), this.field_y);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!oh.field_a) {
            this.a(-51, "reconnect");
          }
          MusicPatchPcmStream.e(11);
          dl.a(cc.field_p, var2, 105);
          dd.field_j = true;
          ab.field_a = 15000L + la.correctedCurrentTimeMillis(param0);
          return var2;
        }
        if (af.field_b != 11) {
          return var2;
        }
        if (mh.field_d != 0) {
          return var2;
        }
        wh.b(true);
        return var2;
    }

    private final void e(byte param0) {
        if (param0 >= -71) {
          return;
        }
        AgeValidator.field_p[1] = true;
    }

    public static void clearStaticReferences(int param0) {
        field_o = null;
        if (param0 != 26395) {
          return;
        }
        field_x = null;
        field_B = null;
        field_s = null;
    }

    final static BinaryBitmapFont a(byte param0, byte[] param1) {
        BinaryBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        BinaryBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (BinaryBitmapFont) (stackIn_2_0);
          }
          var3 = 42 % ((18 - param0) / 48);
          var2 = new BinaryBitmapFont(param1, kh.field_i, vi.field_b, gf.field_o, qa.field_J, a.field_e);
          Bzip2State.a((byte) -21);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("sl.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void l(int param0) {
        vi.field_a[17] = -1;
        vi.field_a[13] = -1;
        vi.field_a[12] = param0;
        vi.field_a[3] = -1;
        vi.field_a[5] = -1;
        vi.field_a[8] = -2;
        vi.field_a[7] = -1;
        vi.field_a[1] = 16;
        vi.field_a[18] = 1;
        vi.field_a[2] = -2;
        vi.field_a[11] = -1;
        vi.field_a[10] = -1;
        vi.field_a[4] = -1;
        vi.field_a[16] = -1;
        vi.field_a[6] = -2;
        vi.field_a[9] = -1;
    }

    final void c(boolean param0) {
        boolean stackIn_29_0 = false;
        int var2;
        fg var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param0) {
          this.b(true);
        }
        var2 = t.field_b;
        if (var2 < 64 &&
          AgeValidator.field_p[var2]) {
          if (0 == var2) {
            return;
          }
          if (var2 == 1) {
            af.a((byte) 59);
          } else {
            if (var2 != 2) {
              if (3 != var2) {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            MusicPatchPcmStream.g(11);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (13 == var2) {
                                la.a(1);
                                return;
                              }
                              if (var2 == 17) {
                                this.k(28586);
                                return;
                              }
                              if (var2 == 18) {
                                lc.a((byte) -127);
                                return;
                              }
                              gb.a((Throwable) null, "MGS1: " + al.a(-64), 10);
                              eg.a((byte) 126);
                              return;
                            }
                            stackIn_29_0 = (var2 == 12);
                            var3 = dl.a(stackIn_29_0, -120);
                            gk.a(var3, -15980);
                          }
                        } else {
                          hd.a((byte) 109, dh.field_N, sb.field_d, gf.field_C);
                        }
                      } else {
                        this.i(-115);
                      }
                    } else {
                      fm.a((byte) 124);
                    }
                  } else {
                    IsaacRandom.c(4);
                  }
                } else {
                  uk.a(-31114);
                }
              } else {
                dh.k(-3);
              }
            } else {
              sf.a((byte) -4);
            }
          }
          return;
        }
        gb.a((Throwable) null, "MGS2: " + al.a(-77), 10);
        eg.a((byte) 126);
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        try {
          try {
            if (!this.e(-125)) {
              return;
            }
            this.field_z = this.getCodeBase().getHost();
            var6 = this.field_z.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_y = stackIn_8_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_p = Integer.parseInt(this.getParameter("gameport2"));
            if (param3 != -5375) {
              return;
            }
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_A = Integer.parseInt(var7);
            }
            this.field_m = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_t = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_n = Integer.parseInt(var8);
            }
            if (this.field_n >= 5) {
              this.field_n = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_u = Integer.parseInt(var9);
            }
            em.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(-4, param1, this.field_m, 32, param2, param0, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            gb.a((Throwable) ((Object) var6_ref), (String) null, param3 + 5385);
            this.a(param3 ^ 5324, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("sl.H(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int b(int param0, boolean param1) {
        int discarded$0 = 0;
        if (param0 != 5017) {
          discarded$0 = this.a(false, true, 12);
        }
        return this.a(param1, true, 10);
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 111 / ((22 - param0) / 38);
        AgeValidator.field_p[7] = true;
        AgeValidator.field_p[3] = true;
        AgeValidator.field_p[17] = true;
        AgeValidator.field_p[16] = true;
        AgeValidator.field_p[18] = true;
        AgeValidator.field_p[0] = true;
        AgeValidator.field_p[8] = param1;
    }

    final void m(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        boolean stackIn_5_1 = false;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= -111) {
          return;
        }
        if (!bj.a(13)) {
          if (hj.field_f >= 10) {
            if (!s.a((byte) -81)) {
              sa.b(0);
            } else {
              if (af.field_b != 0) {
                ui.a(ma.field_sb, 1);
              } else {
                discarded$0 = this.a(false, false, 10);
              }
            }
          }
        } else {
          stackIn_5_1 = (null != df.field_l);
          discarded$1 = this.a(stackIn_5_1, false, 10);
        }
    }

    final void a(int param0, String param1, byte param2) {
        try {
          this.a(param1, param0, 480, param2 - 5387, 640);
          if (param2 != 12) {
            this.field_r = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "sl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void g(byte param0) {
        AgeValidator.field_p[5] = true;
        int var2 = -91 / ((param0 - 58) / 49);
    }

    private final void f(byte param0) {
        if (param0 != 72) {
          return;
        }
        AgeValidator.field_p[2] = true;
    }

    private final void k(int param0) {
        int var2 = dh.field_N.readUnsignedByte(31760);
        if (param0 != 28586) {
          byte[] var6 = (byte[]) null;
          GameClientShell.a((byte) 74, (byte[]) null);
        }
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = gf.field_C - 1;
        byte[] var5 = new byte[var4];
        dh.field_N.readCipheredBytes(var4, 0, var5, (byte) -118);
        LoginPanel.a(mj.a((byte) 127, var5), var3 != 0, nb.a(89), (byte) 9);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a((byte) 82, false);
        if (param2) {
          this.e((byte) -99);
        }
        if (param3) {
          this.f((byte) 72);
        }
        if (param4 != -6) {
          field_B = (String) null;
        }
        if (param0) {
          this.n(-5721);
        }
        if (param1) {
          this.g((byte) -59);
        }
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var4 = hl.a(ob.field_c, param0, -1980693983, ma.field_sb);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = MouseWheelInput.a(fj.f(36), hg.d((byte) -21), (byte) -85);
            if (var5_int != -1) {
              rb.a(var5_int, td.field_m, cc.field_p, 105);
              cc.field_p = null;
              td.field_m = null;
            }
            var11 = qj.a(-11);
            if (var11 != null) {
              ConfirmedEmailAvailabilityValidator.a(-1, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = hb.a(-60, fl.a(false), this.field_u, MatchingFieldValidator.e((byte) 127), MidiPcmStream.f(109), IntrusiveDeque.f(-51), ImageProducerRasterBuffer.a(true));
            if (var5_intLifetime1 != -1) {
              wh.a(var5_intLifetime1, cc.field_p, (byte) 117, td.field_m);
              cc.field_p = null;
              td.field_m = null;
            }
          }
          if (var4 == 3) {
            if (mh.field_d != -1 &&
              mh.field_d != 0) {
              mh.field_d = -1;
              df.a((byte) 101);
            }
            if (param1) {
              dd.field_j = false;
            } else {
              var5_intLifetime2 = f.a(this.field_u, -73, false, fl.a(false), IntrusiveDeque.f(89), this.field_y);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  dl.a(cc.field_p, var5_intLifetime2, 79);
                  cc.field_p = null;
                } else {
                  sf.field_l = ld.field_b;
                  wh.b(true);
                  gf.field_G = false;
                  af.field_b = 10;
                }
              }
            }
          }
          if (4 == var4) {
            if (!bd.field_N) {
              af.field_b = 10;
              gf.field_G = true;
            } else {
              sg.a(param2 - 6998, nb.a(-71));
            }
          }
          if (var4 == 5) {
            DrPhlogistonSavesTheEarth.a(nb.a(120), param2 ^ -127);
          }
          if (var4 == 6 &&
            gm.field_M) {
            af.field_b = 10;
          }
          if (var4 == 7) {
            TextFieldValidator.a(false, nb.a(param2 ^ 101));
          }
          if (var4 == 8) {
            sg.a(-6988, nb.a(param2 ^ 99));
          }
          if (var4 == 9) {
            al.a(nb.a(param2 + 107), 75);
          }
          if (var4 == 10) {
            nj.field_p.writeCipheredByte(17, -18392);
          }
          if (var4 == 11) {
            bf.a(63, nb.a(param2 - 75));
          }
          if (var4 == 12) {
            ff.a(-76, hm.a(22812), nb.a(param2 ^ 110));
          }
          if (13 == var4) {
            try {
              if (al.field_e == null) {
                al.field_e = new fi(sb.field_d, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (al.field_e.b(1)) {
                var12 = al.field_e.a((byte) 127);
                if (var12 == null) {
                  var9 = (String) null;
                  cb.a((String) null, true);
                } else {
                  var7 = p.decodeCp1252String(var12.position, (byte) 79, var12.payload, 0);
                  cb.a(var7, true);
                }
                al.field_e = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              gb.a((Throwable) ((Object) var5), "S1", param2 ^ 0);
              var10 = (String) null;
              cb.a((String) null, true);
              al.field_e = null;
            }
          }
          if (var4 == 15) {
            af.field_b = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 == var4) {
            return 2;
          }
          if (param2 == 10) {
            return 0;
          }
          field_q = -3;
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected GameClientShell() {
    }

    static {
        field_s = "Unpacking sound effects";
        field_B = "to return to the normal view.";
    }
}
