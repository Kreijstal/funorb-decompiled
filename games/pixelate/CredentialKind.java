/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CredentialKind {
    int field_a;
    static Random field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    CredentialKind(int param0) {
        this.field_a = param0;
    }

    static {
        field_b = new Random();
    }
}
