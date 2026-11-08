/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static BufferedRandomAccessFile[] field_b;
    static String field_e;
    static ResourceArchive field_a;
    static am field_c;
    static String field_f;
    static boolean field_h;
    static String field_d;
    static Sprite[] field_g;
    static String[] field_i;

    final static boolean a(String param0, String param1, int param2, ln param3, int param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        String var8 = null;
        ie var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ScreenDisplayMode.field_h != in.field_Gb) {
            return false;
          }
          if (param4 != -30001) {
            var8 = (String) null;
            bb.a((String) null, (String) null, 89, (ln) null, 120, (String) null, false);
          }
          var9 = new ie(ClientException.field_b, param3);
          ClientException.field_b.b(var9, 15637);
          if (ArchiveIndex.b(63)) {
            var9.l(248);
            return true;
          }
          ln.field_Q = param1;
          i.field_i = null;
          UiComponent.field_u = param2;
          in.field_Gb = sk.field_a;
          on.field_d = param5;
          bj.field_mb = param6;
          kf.field_a = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("bb.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int dupTemp$25 = 0;
        byte[][] arrayValue$26 = null;
        int fieldTemp$16 = 0;
        int dupTemp$17 = 0;
        byte[][] arrayValue$18 = null;
        int fieldTemp$22 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$15 = 0;
        int fieldTemp$9 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        int fieldTemp$12 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        byte[][] arrayValue$8 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime6;
        byte[] var2_ref_byte__Lifetime7;
        byte[] var2_ref_byte__Lifetime8;
        byte[] var3Lifetime4;
        byte[] var3Lifetime5;
        byte[] var2_ref_byte__Lifetime2Lifetime1;
        byte[] var3Lifetime1Lifetime1;
        if (param0 != 100) {
          if (param1 < 41) {
            bb.c((byte) -67);
            if (param0 == 5000 &&
              SceneWidget.field_D > 0) {
              fieldTemp$23 = SceneWidget.field_D - 1;
              SceneWidget.field_D = SceneWidget.field_D - 1;
              var2_ref_byte__ = sn.field_F[fieldTemp$23];
              sn.field_F[SceneWidget.field_D] = null;
              return var2_ref_byte__;
            }
            if (param0 == 30000 &&
              0 < sn.field_K) {
              fieldTemp$24 = sn.field_K - 1;
              sn.field_K = sn.field_K - 1;
              var2_ref_byte__ = DelegatingCanvas.field_b[fieldTemp$24];
              DelegatingCanvas.field_b[sn.field_K] = null;
              return var2_ref_byte__;
            }
            if (null == vm.field_a) {
              return new byte[param0];
            }
            for (var2 = 0; NodeHashTable.field_l.length > var2; var2++) {
              if (NodeHashTable.field_l[var2] == param0 &&
                DualLinkNode.field_g[var2] > 0) {
                dupTemp$25 = DualLinkNode.field_g[var2] - 1;
                arrayValue$26 = vm.field_a[var2];
                DualLinkNode.field_g[var2] = dupTemp$25;
                var3 = arrayValue$26[dupTemp$25];
                vm.field_a[var2][DualLinkNode.field_g[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (param0 != 5000) {
            if (param0 == 30000 &&
              0 < sn.field_K) {
              fieldTemp$16 = sn.field_K - 1;
              sn.field_K = sn.field_K - 1;
              var2_ref_byte__Lifetime6 = DelegatingCanvas.field_b[fieldTemp$16];
              DelegatingCanvas.field_b[sn.field_K] = null;
              return var2_ref_byte__Lifetime6;
            }
            if (null == vm.field_a) {
              return new byte[param0];
            }
            for (var2Lifetime4 = 0; NodeHashTable.field_l.length > var2Lifetime4; var2Lifetime4++) {
              if (NodeHashTable.field_l[var2Lifetime4] == param0 &&
                DualLinkNode.field_g[var2Lifetime4] > 0) {
                dupTemp$17 = DualLinkNode.field_g[var2Lifetime4] - 1;
                arrayValue$18 = vm.field_a[var2Lifetime4];
                DualLinkNode.field_g[var2Lifetime4] = dupTemp$17;
                var3Lifetime4 = arrayValue$18[dupTemp$17];
                vm.field_a[var2Lifetime4][DualLinkNode.field_g[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
            return new byte[param0];
          }
          if (SceneWidget.field_D > 0) {
            fieldTemp$22 = SceneWidget.field_D - 1;
            SceneWidget.field_D = SceneWidget.field_D - 1;
            var2_ref_byte__Lifetime7 = sn.field_F[fieldTemp$22];
            sn.field_F[SceneWidget.field_D] = null;
            return var2_ref_byte__Lifetime7;
          }
          if (param0 == 30000 &&
            0 < sn.field_K) {
            fieldTemp$19 = sn.field_K - 1;
            sn.field_K = sn.field_K - 1;
            var2_ref_byte__Lifetime8 = DelegatingCanvas.field_b[fieldTemp$19];
            DelegatingCanvas.field_b[sn.field_K] = null;
            return var2_ref_byte__Lifetime8;
          }
          if (null == vm.field_a) {
            return new byte[param0];
          }
          for (var2Lifetime5 = 0; NodeHashTable.field_l.length > var2Lifetime5; var2Lifetime5++) {
            if (NodeHashTable.field_l[var2Lifetime5] == param0 &&
              DualLinkNode.field_g[var2Lifetime5] > 0) {
              dupTemp$20 = DualLinkNode.field_g[var2Lifetime5] - 1;
              arrayValue$21 = vm.field_a[var2Lifetime5];
              DualLinkNode.field_g[var2Lifetime5] = dupTemp$20;
              var3Lifetime5 = arrayValue$21[dupTemp$20];
              vm.field_a[var2Lifetime5][DualLinkNode.field_g[var2Lifetime5]] = null;
              return var3Lifetime5;
            }
          }
          return new byte[param0];
        }
        if (we.field_b > 0) {
          fieldTemp$15 = we.field_b - 1;
          we.field_b = we.field_b - 1;
          var2_ref_byte__Lifetime1 = cf.field_g[fieldTemp$15];
          cf.field_g[we.field_b] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 < 41) {
          bb.c((byte) -67);
          if (param0 == 5000 &&
            SceneWidget.field_D > 0) {
            fieldTemp$9 = SceneWidget.field_D - 1;
            SceneWidget.field_D = SceneWidget.field_D - 1;
            var2_ref_byte__Lifetime2 = sn.field_F[fieldTemp$9];
            sn.field_F[SceneWidget.field_D] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (param0 != 30000) {
            if (null == vm.field_a) {
              return new byte[param0];
            }
            for (var2Lifetime1 = 0; NodeHashTable.field_l.length > var2Lifetime1; var2Lifetime1++) {
              if (NodeHashTable.field_l[var2Lifetime1] == param0 &&
                DualLinkNode.field_g[var2Lifetime1] > 0) {
                dupTemp$13 = DualLinkNode.field_g[var2Lifetime1] - 1;
                arrayValue$14 = vm.field_a[var2Lifetime1];
                DualLinkNode.field_g[var2Lifetime1] = dupTemp$13;
                var3Lifetime1 = arrayValue$14[dupTemp$13];
                vm.field_a[var2Lifetime1][DualLinkNode.field_g[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (0 < sn.field_K) {
            fieldTemp$12 = sn.field_K - 1;
            sn.field_K = sn.field_K - 1;
            var2_ref_byte__Lifetime2Lifetime1 = DelegatingCanvas.field_b[fieldTemp$12];
            DelegatingCanvas.field_b[sn.field_K] = null;
            return var2_ref_byte__Lifetime2Lifetime1;
          }
          if (null == vm.field_a) {
            return new byte[param0];
          }
          for (var2Lifetime1Lifetime1 = 0; NodeHashTable.field_l.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (NodeHashTable.field_l[var2Lifetime1Lifetime1] == param0 &&
              DualLinkNode.field_g[var2Lifetime1Lifetime1] > 0) {
              dupTemp$10 = DualLinkNode.field_g[var2Lifetime1Lifetime1] - 1;
              arrayValue$11 = vm.field_a[var2Lifetime1Lifetime1];
              DualLinkNode.field_g[var2Lifetime1Lifetime1] = dupTemp$10;
              var3Lifetime1Lifetime1 = arrayValue$11[dupTemp$10];
              vm.field_a[var2Lifetime1Lifetime1][DualLinkNode.field_g[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (param0 != 5000) {
          if (param0 == 30000 &&
            0 < sn.field_K) {
            fieldTemp$2 = sn.field_K - 1;
            sn.field_K = sn.field_K - 1;
            var2_ref_byte__Lifetime3 = DelegatingCanvas.field_b[fieldTemp$2];
            DelegatingCanvas.field_b[sn.field_K] = null;
            return var2_ref_byte__Lifetime3;
          }
          if (null != vm.field_a) {
            for (var2Lifetime2 = 0; NodeHashTable.field_l.length > var2Lifetime2; var2Lifetime2++) {
              if (NodeHashTable.field_l[var2Lifetime2] == param0 &&
                DualLinkNode.field_g[var2Lifetime2] > 0) {
                dupTemp$3 = DualLinkNode.field_g[var2Lifetime2] - 1;
                arrayValue$4 = vm.field_a[var2Lifetime2];
                DualLinkNode.field_g[var2Lifetime2] = dupTemp$3;
                var3Lifetime2 = arrayValue$4[dupTemp$3];
                vm.field_a[var2Lifetime2][DualLinkNode.field_g[var2Lifetime2]] = null;
                return var3Lifetime2;
              }
            }
          }
          return new byte[param0];
        }
        if (SceneWidget.field_D > 0) {
          fieldTemp$5 = SceneWidget.field_D - 1;
          SceneWidget.field_D = SceneWidget.field_D - 1;
          var2_ref_byte__Lifetime4 = sn.field_F[fieldTemp$5];
          sn.field_F[SceneWidget.field_D] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (param0 == 30000 &&
          0 < sn.field_K) {
          fieldTemp$6 = sn.field_K - 1;
          sn.field_K = sn.field_K - 1;
          var2_ref_byte__Lifetime5 = DelegatingCanvas.field_b[fieldTemp$6];
          DelegatingCanvas.field_b[sn.field_K] = null;
          return var2_ref_byte__Lifetime5;
        }
        if (null != vm.field_a) {
          for (var2Lifetime3 = 0; NodeHashTable.field_l.length > var2Lifetime3; var2Lifetime3++) {
            if (NodeHashTable.field_l[var2Lifetime3] == param0 &&
              DualLinkNode.field_g[var2Lifetime3] > 0) {
              dupTemp$7 = DualLinkNode.field_g[var2Lifetime3] - 1;
              arrayValue$8 = vm.field_a[var2Lifetime3];
              DualLinkNode.field_g[var2Lifetime3] = dupTemp$7;
              var3Lifetime3 = arrayValue$8[dupTemp$7];
              vm.field_a[var2Lifetime3][DualLinkNode.field_g[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
        }
        return new byte[param0];
    }

    public static void releaseStatics(byte param0) {
        field_i = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0 > -70) {
          bb.c((byte) -8);
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (jf.field_j < 153 &&
            ad.field_d >= 10) {
            return;
          }
          lc.a((byte) 112);
          he.field_e.writeOpcode((byte) -76, 68);
          if (param0 >= -116) {
            return;
          }
          for (var1_int = 0; var1_int < 16; var1_int++) {
            b.field_f[var1_int] = var1_int;
            if (var1_int >= 6) {
              b.field_f[var1_int] = b.field_f[var1_int] + 6;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "bb.E(" + param0 + ')');
        }
    }

    final static String getLoadingStatusText(byte param0) {
        if (ih.field_f < 2) {
          return field_e;
        }
        if (lh.field_g != null) {
          if (!lh.field_g.c(-10923)) {
            return IntrusiveDeque.field_f;
          }
          return AlternateUsernameCredentials.field_o;
        }
        if (!da.field_b.c(-10923)) {
          return sc.field_Z;
        }
        if (!da.field_b.a("commonui", -24417)) {
          return gd.field_nb + " - " + da.field_b.b("commonui", 100) + "%";
        }
        if (!DiskCacheRequest.field_C.c(-10923)) {
          return wh.field_a;
        }
        if (param0 > -121) {
          return (String) null;
        }
        if (!DiskCacheRequest.field_C.a("commonui", -24417)) {
          return ra.field_d + " - " + DiskCacheRequest.field_C.b("commonui", 104) + "%";
        }
        if (!ho.field_g.c(-10923)) {
          return NodeHashTable.field_c;
        }
        if (!ho.field_g.a(123)) {
          return mm.field_t + " - " + ho.field_g.a((byte) 79) + "%";
        }
        return PatchEnvelopeSet.field_f;
    }

    final static void showLoginPanel(String param0, int param1, String param2) {
        if (param1 != -3) {
          return;
        }
        try {
          if (vf.field_k != null) {
            vf.field_k.h(77);
          }
          wh.field_f = new LoginPanel(param0, param2, false, true, true);
          g.field_e.a((byte) -92, (UiComponent) (wh.field_f));
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "bb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Searching for opponents";
        field_c = new am();
        field_d = "Good luck against the cyclopes. The battle will commence after you press 'Enter'. Try to knock enemies into the water to defeat them quickly.";
        field_i = new String[255];
    }
}
