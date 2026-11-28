/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends me {
    static String field_kb;
    static String field_lb;
    static int[] field_mb;
    static RgbSprite field_jb;

    final static boolean p(int param0) {
        if (param0 != 3) {
          field_mb = (int[]) null;
        }
        return DirectByteStorage.field_k;
    }

    final void b(ag param0, byte param1) {
        try {
          super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "ta.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int incrementValue$0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_12_0 = false;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          ng.field_k = false;
          Math.random();
          cg.field_b = 0;
          AccountNameAvailabilityValidator.field_o = false;
          MusicPatchPcmStream.field_l = false;
          ClientLookupTables.field_d = km.field_A;
          pm.field_d = 26;
          nl.field_d = 0;
          qi.field_J = 0;
          dn.field_b = 0;
          PacketBuffer.field_p = null;
          om.field_a = false;
          nh.field_H = 0;
          wk.field_h = false;
          tb.field_N = 0;
          ec.$cfr$intArgs$a$7ffe4b125357(-123, hk.field_q);
          ib.a((byte) -72);
          rl.field_c = param1;
          stackIn_5_0 = (bm.field_c == 0) && (9 == rl.field_c);
          boolean decompiledFrameRemainder0 = true;
          pa.field_d = stackIn_5_0;
          jf.field_d = 0;
          if (bm.field_c == 0 && (3 == rl.field_c ||
            8 == rl.field_c ||
            rl.field_c == 9)) {
            stackIn_12_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_12_0 = false;
          }
          wb.field_Z = stackIn_12_0;
          if (bm.field_c != 0) {
            if (hh.field_d == rl.field_c) {
              VolumeRampingMidiPcmStream.field_Q[0] = true;
              VolumeRampingMidiPcmStream.field_cb[0] = false;
              for (var2_int = 1; var2_int < VolumeRampingMidiPcmStream.field_Q.length; var2_int++) {
                VolumeRampingMidiPcmStream.field_Q[var2_int] = false;
                VolumeRampingMidiPcmStream.field_cb[var2_int] = false;
              }
              pf.a(VolumeRampingMidiPcmStream.field_ib, false);
              VolumeRampingMidiPcmStream.field_U[1] = 0;
              VolumeRampingMidiPcmStream.field_U[0] = 0;
            }
            MusicPatchPcmStream.field_n = new RgbSprite(72, 72);
            MusicPatchPcmStream.field_n.a();
            for (var2_int = 0; var2_int < 3; var2_int++) {
              for (var3 = 0; var3 < 3; var3++) {
                pk.field_d[8 * var3 + (var2_int + 424)].c(24 * var2_int, var3 * 24);
              }
            }
            vj.field_e[0].a(true, 128, 192, 36, 36);
            o.field_n.setAsRasterTarget((byte) 125);
          } else {
            if (rl.field_c == hh.field_d ||
              3 == rl.field_c) {
              for (var2_int = 0; var2_int < VolumeRampingMidiPcmStream.field_Q.length; var2_int++) {
                stackIn_20_0 = VolumeRampingMidiPcmStream.field_Q;
                stackIn_20_1 = var2_int;
                stackIn_21_2 = !(var2_int >= 2);
                stackIn_20_0[stackIn_20_1] = stackIn_21_2;
                VolumeRampingMidiPcmStream.field_cb[var2_int] = false;
              }
              pf.a(VolumeRampingMidiPcmStream.field_ib, false);
              VolumeRampingMidiPcmStream.field_ib[0] = 1200;
              VolumeRampingMidiPcmStream.field_U[0] = 1;
              VolumeRampingMidiPcmStream.field_U[1] = 0;
            }
            if (rl.field_c != 3) {
              MusicPatchPcmStream.field_n = new RgbSprite(72, 72);
              MusicPatchPcmStream.field_n.a();
              for (var2_int = 0; 3 > var2_int; var2_int++) {
                for (var3 = 0; 3 > var3; var3++) {
                  pk.field_d[var3 * 8 + var2_int + 139].c(var2_int * 24, 24 * var3);
                }
              }
              vj.field_e[0].a(true, 128, 192, 36, 36);
              o.field_n.setAsRasterTarget((byte) 127);
            } else {
              jf.field_d = 50;
              MusicPatchPcmStream.field_n = null;
            }
          }
          tg.field_a = false;
          DebouncedFieldValidator.field_a = false;
          if (hh.field_d == rl.field_c) {
            ImageProducerRasterBuffer.field_p = 0;
            kf.clearInts(al.field_U, 0, 6);
            sg.field_i = 0;
          }
          ad.field_a = ng.field_u;
          ng.field_u = 0;
          o.field_n.setAsRasterTarget((byte) -20);
          r.field_a = 1;
          ProxySocketFactory.field_j = 0;
          if (bm.field_c == 0 &&
            rl.field_c == 0) {
            ul.field_L = 0;
          } else {
            ul.field_L = -1;
          }
          ll.field_a = 0;
          ib.field_c = 0;
          DualLinkNode.field_o = 0;
          for (var2_intLifetime1 = 0; 3000 > var2_intLifetime1; var2_intLifetime1++) {
            mm.field_m[var2_intLifetime1] = null;
          }
          var2_intLifetime2 = -118 / ((param0 + 46) / 37);
          for (var3Lifetime1 = 0; var3Lifetime1 < 3000; var3Lifetime1++) {
            vj.field_w[var3Lifetime1] = null;
          }
          ti.field_f.setCoordinates(-1, 8360, -1);
          ln.field_a = null;
          ln.field_a = new id(GridPoint.field_h[bm.field_c][rl.field_c]);
          mm.a(ln.field_a, true);
          if (0 > ti.field_f.field_e) {
            System.err.println("Map failed to set player position.");
            ti.field_f.setCoordinates(100, 8360, 100);
          }
          ti.field_f.field_g = ti.field_f.field_g + 1;
          ti.field_f.field_e = ti.field_f.field_e + 1;
          mm.field_m[0] = new oj(ti.field_f, 0, rl.field_c);
          ki.field_c = null;
          ki.field_c = new RgbSprite(ln.field_a.field_a, ln.field_a.field_d);
          ki.field_c.a();
          var2_intLifetime3 = ln.field_a.field_a;
          var3Lifetime2 = ln.field_a.field_d;
          var4 = 0;
          var5 = ln.field_a.field_B;
          for (var6 = 0; var2_intLifetime3 > var6; var6++) {
            for (var7 = 0; var7 < var3Lifetime2; var7++) {
              if (var5[var4++]) {
                SoftwareRasterizer.addPixel(var7, var6, 16384);
              }
            }
          }
          o.field_n.setAsRasterTarget((byte) -111);
          le.field_D = 0;
          if (!om.field_b) {
            if (bm.field_c == 0 &&
              rl.field_c == 9) {
              le.field_D = 7500;
            } else {
              if (0 == bm.field_c &&
                3 == rl.field_c) {
                le.field_D = 12000;
              }
            }
          } else {
            le.field_D = 100 * ub.field_a[bm.field_c][rl.field_c] + 1500;
          }
          if (om.field_b &&
            0 == bm.field_c) {
            if (rl.field_c == 3) {
              wh.field_b[ll.field_a].field_c = 0.0;
              wh.field_b[ll.field_a].field_j.setCoordinates(55, 8360, 83);
              wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
              wh.field_b[ll.field_a].field_e = 0;
              wh.field_b[ll.field_a].field_h = 1;
              wh.field_b[ll.field_a].field_i = 0;
              ll.field_a = ll.field_a + 1;
            }
            if (rl.field_c == 5) {
              for (var6Lifetime1 = 0; var6Lifetime1 < 3; var6Lifetime1++) {
                for (var7Lifetime1 = 0; var7Lifetime1 < 3; var7Lifetime1++) {
                  wh.field_b[ll.field_a].field_c = 0.0;
                  wh.field_b[ll.field_a].field_j.setCoordinates(var6Lifetime1 + 35, 8360, 36 + var7Lifetime1);
                  wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
                  wh.field_b[ll.field_a].field_e = 0;
                  wh.field_b[ll.field_a].field_h = 3;
                  wh.field_b[ll.field_a].field_i = 1;
                  ll.field_a = ll.field_a + 1;
                }
              }
            }
          }
          ln.field_a.a(-2, 1);
          ha.field_t = -1;
          FullscreenFocusCanvas.field_d = 0;
          if (bm.field_c == 0) {
            if (rl.field_c != 3) {
              if (rl.field_c == 4) {
                CrossfadingMidiPcmStream.a(1, 1);
              } else {
                if (5 != rl.field_c) {
                  if (rl.field_c != 6) {
                    if (rl.field_c == 7) {
                      CrossfadingMidiPcmStream.a(2, 1);
                      r.field_a = 2;
                    } else {
                      if (rl.field_c == 8) {
                        CrossfadingMidiPcmStream.a(3, 1);
                        r.field_a = 2;
                      } else {
                        if (9 == rl.field_c) {
                          CrossfadingMidiPcmStream.a(0, 1);
                          r.field_a = 0;
                        } else {
                          if (rl.field_c == 0) {
                            CrossfadingMidiPcmStream.a(4, 1);
                          } else {
                            if (rl.field_c != 1) {
                              if (rl.field_c == 2) {
                                CrossfadingMidiPcmStream.a(1, 1);
                              } else {
                                CrossfadingMidiPcmStream.a(0, 1);
                              }
                            } else {
                              CrossfadingMidiPcmStream.a(10, 1);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    CrossfadingMidiPcmStream.a(0, 1);
                  }
                } else {
                  CrossfadingMidiPcmStream.a(0, 1);
                }
              }
            } else {
              CrossfadingMidiPcmStream.a(0, 1);
            }
          }
          uj.field_p.field_g = (int)(24.0 * (mm.field_m[0].field_l.field_a + (double)mm.field_m[0].field_j.field_g) - 240.0);
          uj.field_p.field_e = (int)(-320.0 + (mm.field_m[0].field_l.field_f + (double)mm.field_m[0].field_j.field_e) * 24.0);
          if (null != DirectByteStorage.field_g) {
            for (var6Lifetime2 = 0; var6Lifetime2 < DirectByteStorage.field_g.length; var6Lifetime2++) {
              DirectByteStorage.field_g[var6Lifetime2].a(18421);
              DirectByteStorage.field_g[var6Lifetime2] = null;
            }
          }
          var6Lifetime3 = 0;
          var7Lifetime2 = 0;
          for (var8 = 0; var8 < ln.field_a.field_h.length; var8++) {
            var9 = ln.field_a.field_h[var8];
            if (var9 != 0 &&
              (var6Lifetime3 & 1 << var9) == 0) {
              var7Lifetime2++;
              var6Lifetime3 = var6Lifetime3 | 1 << var9;
            }
          }
          if (DirectByteStorage.field_g == null ||
            var7Lifetime2 != DirectByteStorage.field_g.length) {
            DirectByteStorage.field_g = new lf[var7Lifetime2];
          }
          var8Lifetime1 = 0;
          var9Lifetime1 = 1;
          while (var8Lifetime1 < var7Lifetime2) {
            if ((var6Lifetime3 & 1 << var9Lifetime1) != 0) {
              incrementValue$0 = var8Lifetime1;
              var8Lifetime1++;
              DirectByteStorage.field_g[incrementValue$0] = new lf(var9Lifetime1, 0, 640);
            }
            var9Lifetime1++;
          }
          q.field_g = null;
          re.field_l = true;
          if (bm.field_c == 1 &&
            rl.field_c != -1) {
            var9Lifetime2 = rl.field_c;
            if (var9Lifetime2 != 0) {
              if (1 != var9Lifetime2) {
                if (2 == var9Lifetime2) {
                  q.field_g = (ql) ((Object) new an());
                } else {
                  if (var9Lifetime2 == 3) {
                    q.field_g = (ql) ((Object) new pj());
                  } else {
                    if (4 != var9Lifetime2) {
                      if (var9Lifetime2 != 5) {
                        if (var9Lifetime2 != 6) {
                          if (var9Lifetime2 == 7) {
                            q.field_g = (ql) ((Object) new o());
                          } else {
                            if (8 != var9Lifetime2) {
                              if (var9Lifetime2 == 9) {
                                q.field_g = (ql) ((Object) new fb());
                              }
                            } else {
                              q.field_g = (ql) ((Object) new pk());
                            }
                          }
                        } else {
                          q.field_g = (ql) ((Object) new vj());
                        }
                      } else {
                        q.field_g = (ql) ((Object) new ob());
                      }
                    } else {
                      q.field_g = (ql) ((Object) new dd());
                    }
                  }
                }
              } else {
                q.field_g = (ql) ((Object) new pa());
              }
            } else {
              q.field_g = (ql) ((Object) new uf());
            }
          }
          bc.c(-102);
          if (q.field_g != null) {
            q.field_g.e(0);
          }
          mb.field_s.a(500, 8000);
          wh.field_f = true;
          if (!om.field_b) {
            if (VolumeRampingMidiPcmStream.field_ab.a(bm.field_c, -28, rl.field_c)) {
              VolumeRampingMidiPcmStream.field_ab.d(64);
            } else {
              VolumeRampingMidiPcmStream.field_ab.c(-32238);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2), "ta.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static ii a(boolean param0, String param1) {
        RuntimeException var2 = null;
        ii stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_lb = (String) null;
          }
          stackIn_3_0 = new ii(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ta.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_jb = null;
        if (param0 != 24) {
          ta.p(-39);
        }
        field_mb = null;
        field_kb = null;
        field_lb = null;
    }

    ta(gg param0, ag param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          if (param0 != -320) {
            ta.a((byte) 125, -53);
          }
          try {
            var3 = new java.net.URL(param2.getCodeBase(), param1);
            var3 = ByteStorage.a(param2, true, var3);
            ArchiveIndex.a(param2, var3.toString(), (byte) -97, true);
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_lb = "There are five more security locks active on this level. I need to find and deactivate them.";
        field_kb = "The bridge is up this corridor. I'll need to deal with the turrets.";
    }
}
